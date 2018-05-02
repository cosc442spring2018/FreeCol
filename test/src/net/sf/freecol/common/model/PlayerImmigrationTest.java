package net.sf.freecol.common.model;


import net.sf.freecol.common.i18n.Messages;
import net.sf.freecol.common.networking.Message;
import net.sf.freecol.server.model.ServerPlayer;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;

import java.util.List;

public class PlayerImmigrationTest extends FreeColTestCase {

	Game game;
	ServerPlayer dutchPlayer; //This player is always creating in standard game
	
	public PlayerImmigrationTest() {
		super();
	}

	protected void setUp() throws Exception
	{
		super.setUp();
		game = getStandardGame();
		dutchPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.dutch");
	}
	
	//Only colonists should have immigrants because we're colonizing the americas 
	public void testGetImmigration() {
		ServerPlayer nativeAmericanPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.inca");
		int sampleImmigrationNum = 100;
		
		nativeAmericanPlayer.immigration = sampleImmigrationNum;
		assertEquals(nativeAmericanPlayer.getImmigration(), 0);
		
		dutchPlayer.immigration = sampleImmigrationNum;
		assertEquals(dutchPlayer.getImmigration(), 100);
	}
	
	//Only colonists can have their immigration set as well
	public void testSetImmigration() {
		int sampleImmigrationNum = 100;
		ServerPlayer nativeAmericanPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.inca");
		nativeAmericanPlayer.setImmigration(sampleImmigrationNum);
		assertEquals(nativeAmericanPlayer.getImmigration(),0);
		dutchPlayer.setImmigration(sampleImmigrationNum);
		assertEquals(dutchPlayer.getImmigration(), 100);
	}
	
	/**
	 * This test is used when an immigrant finally leaves from Europe
	 */
	public void testReduceImmigration() {
		dutchPlayer.setImmigration(100);
		assertEquals(dutchPlayer.getImmigration(), 100);

		int immigrationNum = dutchPlayer.getImmigration();
		dutchPlayer.reduceImmigration();

		if(dutchPlayer.getSpecification().getBoolean(GameOptions.SAVE_PRODUCTION_OVERFLOW))
			assertEquals(dutchPlayer.getImmigration(), immigrationNum - dutchPlayer.getImmigrationRequired());
		else
			assertEquals(dutchPlayer.getImmigration(), 0);
	}

	public void testModifyImmigration() {
		int sampleModifyAmount = 50;
		int sampleModifyAmount2 = -100;
		int initialImmigration = dutchPlayer.getImmigration();

		dutchPlayer.modifyImmigration(sampleModifyAmount);
		assertEquals(dutchPlayer.getImmigration(), sampleModifyAmount + initialImmigration);
		dutchPlayer.modifyImmigration(sampleModifyAmount2);
		assertEquals(dutchPlayer.getImmigration(), 0);
	}
		
	/**
	 * Run the void setImmigrationRequired(int) method test
	 */
	public void testSetImmigrationRequired() {
		int newRequiredImmigrationAmt = 100;
		dutchPlayer.setImmigrationRequired(newRequiredImmigrationAmt);
		assertEquals(dutchPlayer.getImmigrationRequired(), newRequiredImmigrationAmt);
	}

	/**
	 * Run the void updateImmigrationRequired() method test
	 */
	public void testUpdateImmigrationRequired() {
		ServerPlayer nativeAmericanPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.inca");
		nativeAmericanPlayer.updateImmigrationRequired();
		assertEquals(nativeAmericanPlayer.getImmigration(), 0);

		int immigrationAmt = 100;
		dutchPlayer.setImmigration(immigrationAmt);

		int oldImmigrationReq = dutchPlayer.getImmigrationRequired();
		int base = getGame().getSpecification().getInteger(GameOptions.CROSSES_INCREMENT);

		dutchPlayer.updateImmigrationRequired();

		int unreduced = Math.round(oldImmigrationReq
				/ dutchPlayer.applyModifiers(1f, getGame().getTurn(), Modifier.RELIGIOUS_UNREST_BONUS));
		assertEquals(dutchPlayer.getImmigrationRequired(), (int)dutchPlayer.applyModifiers(unreduced + base, getGame().getTurn(),
				Modifier.RELIGIOUS_UNREST_BONUS));
	}

	public void testCheckEmigrate() {
		int amtImmigrationReq = 100;
		dutchPlayer.setImmigrationRequired(amtImmigrationReq);
		assertFalse(dutchPlayer.checkEmigrate());
		dutchPlayer.setImmigration(amtImmigrationReq);
		assertTrue(dutchPlayer.checkEmigrate());

		ServerPlayer nativeAmericanPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.inca");
		assertFalse(nativeAmericanPlayer.checkEmigrate());
	}
	
	public void testGetTotalImmigrationProduction() {
		ServerPlayer nativeAmericanPlayer = (ServerPlayer) game.getPlayerByNationId("model.nation.inca");
		assertEquals(0, nativeAmericanPlayer.getTotalImmigrationProduction());

		String colonyName = "AnthonyAsimNoobville";
		int numImmigrationGoods = 100;

		final List<GoodsType> immigrationGoodsTypes = getGame().getSpecification().getImmigrationGoodsTypeList();
		if (immigrationGoodsTypes.size() > 0) {

			Colony newColony = new Colony(getGame(), dutchPlayer, colonyName, getTestMap().getTile(0, 0));
			Building newBuilding = new Building(getGame(), newColony, new BuildingType("model.building.church", getGame().getSpecification()));
			newBuilding.getProductionInfo().addProduction(new AbstractGoods(immigrationGoodsTypes.get(0), 100));

			newColony.addBuilding(newBuilding);
			dutchPlayer.addSettlement(new Colony(getGame(), dutchPlayer, colonyName, getTestMap().getTile(0, 0)));


			Europe eu = dutchPlayer.getEurope();
			if (eu != null) {
				assertEquals(dutchPlayer.getTotalImmigrationProduction(), numImmigrationGoods + eu.getImmigration(20));

			} else {
				assertEquals(dutchPlayer.getTotalImmigrationProduction(), numImmigrationGoods);
				dutchPlayer.setEurope(new Europe(getGame(), dutchPlayer));
			}
		}
		fail("No immigration good types found in this game mode");
	}
	
	public void testGetEmigrationMessage() {
		Unit galleon = new ServerUnit(game, null, dutchPlayer, getGame().getSpecification().getUnitType("model.unit.galleon"));
		assertEquals(Messages.message(dutchPlayer.getEmigrationMessage(galleon)), "In Amsterdam, Galleon has decided to emigrate.");
	}
}
