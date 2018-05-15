package net.sf.freecol.common.model;

import net.sf.freecol.server.model.ServerColony;
import net.sf.freecol.server.model.ServerPlayer;
import net.sf.freecol.util.test.FreeColTestCase;

public class PlayerLibertyTest extends FreeColTestCase{

    Game game;
    ServerPlayer dutchPlayer; //This player is always creating in standard game

    public PlayerLibertyTest() { super(); }

    protected void setUp() throws Exception
    {
        super.setUp();
        game = getStandardGame();
        dutchPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.dutch");
    }

    public void testGetSetLiberty() {
        ServerPlayer nativeAmericanPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.inca");
        int libertyAmt = 100;

        nativeAmericanPlayer.setLiberty(libertyAmt);
        assertEquals(nativeAmericanPlayer.getLiberty(), 0);
        dutchPlayer.setLiberty(libertyAmt);
        assertEquals(dutchPlayer.getLiberty(), 100);
    }

    public void testsModifyLiberty() {
        int libertyAmt = 100;
        dutchPlayer.modifyLiberty(libertyAmt);
        assertEquals(dutchPlayer.getLiberty(), libertyAmt);
        assertEquals(dutchPlayer.interventionBells, 0);
        dutchPlayer.changePlayerType(Player.PlayerType.REBEL);
        dutchPlayer.modifyLiberty(libertyAmt);
        assertEquals(dutchPlayer.getLiberty(), libertyAmt * 2);
        assertEquals(dutchPlayer.interventionBells, libertyAmt);
    }

    public void testGetLibertyProductionNextTurn() {
        game.setMap(getTestMap());
        GoodsType liberty = game.getSpecification().getLibertyGoodsTypeList().get(0);
        assertEquals(0, dutchPlayer.getLibertyProductionNextTurn());

        String colonyName = "AnthonyAsimNoobville";
        int goodsAmt = 100;

        Colony newColony = new ServerColony(getGame(), dutchPlayer, colonyName, getTestMap().getTile(0, 0));
        Building newBuilding = new Building(getGame(), newColony, new BuildingType("model.building.church", getGame().getSpecification()));
        Goods goods = new Goods(game, newColony, liberty, goodsAmt);
        newColony.addBuilding(newBuilding);
        newBuilding.getProductionInfo().addProduction(goods);
        dutchPlayer.addSettlement(newColony);

        assertEquals(dutchPlayer.getLibertyProductionNextTurn(), (int)dutchPlayer.applyModifiers((float)newColony.getTotalProductionOf(liberty), game.getTurn(),
                Modifier.LIBERTY));
    }
}
