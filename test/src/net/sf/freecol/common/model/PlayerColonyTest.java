package net.sf.freecol.common.model;

import net.sf.freecol.client.ClientOptions;
import net.sf.freecol.server.model.ServerColony;
import net.sf.freecol.server.model.ServerPlayer;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;

import java.util.Comparator;

/**Continuation of UnitTests (not a unit test but a test of unit class)*/
public class PlayerColonyTest extends FreeColTestCase {

    Game game;
    ServerPlayer dutchPlayer; //This player is always creating in standard game

    public PlayerColonyTest() {
        super();
    }

    protected void setUp() throws Exception {
        super.setUp();
        game = getStandardGame();
        dutchPlayer = (ServerPlayer) game.getPlayerByNationId("model.nation.dutch");
    }

    /**Testing adding new settlement function since it isn't completely covered*/
    public void testAddSettlement() {
        game.setMap(getTestMap());
        Colony dutchColony = new ServerColony(game, dutchPlayer, "New Amsterdam", game.getMap().getTile(0,0));
        Colony nullColony = null;
        ServerPlayer frenchPlayer = (ServerPlayer) game.getPlayerByNationId("model.nation.french");
        try {
            assertFalse(frenchPlayer.addSettlement(dutchColony));
        }
        catch(Exception e)
        {
            assertEquals(e.getMessage(), "Does not own: " + dutchColony);
        }
        assertFalse(frenchPlayer.addSettlement(nullColony));
        assertTrue(dutchPlayer.addSettlement(dutchColony));
        assertFalse(dutchPlayer.addSettlement(dutchColony));
    }

    public void testGetColonyByName() {
        game.setMap(getTestMap());
        Colony dutchColony = new ServerColony(game, dutchPlayer, "New Amsterdam", game.getMap().getTile(0,0));
        dutchPlayer.addSettlement(dutchColony);
        assertEquals(dutchPlayer.getColonyByName("New Amsterdam"), dutchColony);
    }

    /**Tested function has partial coverage.  This test is to complete the coverage*/
    public void testGetColonies() {
        game.setMap(getTestMap());
        Colony dutchColony = new ServerColony(game, dutchPlayer, "New Amsterdam", game.getMap().getTile(0,0));
        dutchPlayer.addSettlement(dutchColony);
        assertEquals(dutchPlayer.getColonies().size(),1);
        IndianSettlement indianSettlement = new IndianSettlement(game, dutchPlayer, "Poppyseed", game.getMap().getTile(0,0));
        dutchPlayer.addSettlement(indianSettlement);
        try {
            assertEquals(dutchPlayer.getColonies().size(),2);
        }
        catch(Exception e)
        {
            assertEquals(e.getMessage(), "getColonies found: " + indianSettlement);
        }
    }

    public void testGetSortedColonies() {
        game.setMap(getTestMap());
        Comparator<Colony> comparator = ClientOptions.getColonyComparator(ClientOptions.COLONY_COMPARATOR_NAME);
        Colony dutchColony = new ServerColony(game, dutchPlayer, "New Amsterdam", game.getMap().getTile(0,0));
        Colony dutchColony2 = new ServerColony(game, dutchPlayer, "Amsterwam", game.getMap().getTile(0,1));
        dutchPlayer.addSettlement(dutchColony);
        dutchPlayer.addSettlement(dutchColony2);
        assertEquals(dutchPlayer.getSortedColonies(comparator).get(0), dutchColony2);
        assertEquals(dutchPlayer.getSortedColonies(comparator).get(1), dutchColony);
    }

    public void testGetSettlementByName()
    {
        game.setMap(getTestMap());
        ServerPlayer nativeAmericanPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.inca");

        String dutchColonyName = "New Amsterdam";
        String indianSettlementName = "Poppyseed";

        Colony dutchColony = new ServerColony(game, dutchPlayer, dutchColonyName, game.getMap().getTile(0,0));
        dutchPlayer.addSettlement(dutchColony);
        assertEquals(dutchPlayer.getColonies().size(),1);
        IndianSettlement indianSettlement = new IndianSettlement(game, nativeAmericanPlayer, indianSettlementName, game.getMap().getTile(0,1));
        nativeAmericanPlayer.addSettlement(indianSettlement);

        assertEquals(dutchPlayer.getSettlementByName(dutchColonyName), dutchPlayer.getColonyByName(dutchColonyName));
        assertEquals(nativeAmericanPlayer.getSettlementByName(indianSettlementName), nativeAmericanPlayer.getIndianSettlementByName(indianSettlementName));
    }

}