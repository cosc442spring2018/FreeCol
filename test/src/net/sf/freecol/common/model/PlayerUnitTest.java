package net.sf.freecol.common.model;

import net.sf.freecol.server.ServerTestHelper;
import net.sf.freecol.server.control.InGameController;
import net.sf.freecol.server.model.ServerPlayer;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;

import java.util.ArrayList;
import java.util.List;

/**Continuation of UnitTests (not a unit test but a test of unit class)*/
public class PlayerUnitTest extends FreeColTestCase {

    Game game;
    ServerPlayer dutchPlayer; //This player is always creating in standard game

    public PlayerUnitTest() {
        super();
    }

    protected void setUp() throws Exception {
        super.setUp();
        game = getStandardGame();
        dutchPlayer = (ServerPlayer) game.getPlayerByNationId("model.nation.dutch");
    }

    public void testNumKingLandUnits() {
        game.setMap(getTestMap());
        Tile tile = getTestMap().getTile(0,0);
        Unit unit = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.kingsRegular"));
        assertEquals(dutchPlayer.getNumberOfKingLandUnits(), 1);
    }

    public void testHasUnitType() {
        game.setMap(getTestMap());
        Tile tile = getTestMap().getTile(0,0);
        Unit unit = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.kingsRegular"));
        assertTrue(dutchPlayer.hasUnitType("model.unit.kingsRegular"));
    }

    public void testGetNextActiveUnit() {
        game.setMap(getTestMap());
        Tile tile = getTestMap().getTile(0,0);
        Unit unit = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.kingsRegular"));
        assertTrue(unit.couldMove() && unit.getState() != Unit.UnitState.SKIPPED);
        assertEquals(dutchPlayer.getNextActiveUnit().getType(), game.getSpecification().getUnitType("model.unit.kingsRegular"));
    }

    public void testSetNextActiveUnit() {
        game.setMap(getTestMap());
        Tile tile = getTestMap().getTile(0,0);
        Unit unit = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.kingsRegular"));
        Unit unit2 = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.veteranSoldier"));
        dutchPlayer.setNextActiveUnit(unit2);
        assertEquals(dutchPlayer.getNextActiveUnit().getType(), game.getSpecification().getUnitType("model.unit.veteranSoldier"));
    }

    public void testGetNextGoingToUnit() {
        game.setMap(getTestMap());
        Tile tile = game.getMap().getTile(0,0);
        ServerUnit unit = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.kingsRegular"));
        assertEquals(dutchPlayer.getNextGoingToUnit(), null);
        unit.setDestination(tile);
        assertEquals(dutchPlayer.getNextGoingToUnit().getType(), game.getSpecification().getUnitType("model.unit.kingsRegular"));
    }

    public void testSetNextGoingToUnit() {
        game.setMap(getTestMap());
        Tile tile = game.getMap().getTile(0,0);
        Unit unit = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.kingsRegular"));
        Unit unit2 = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.veteranSoldier"));
        assertEquals(dutchPlayer.getNextGoingToUnit(), null);
        unit.setDestination(tile);
        unit2.setDestination(tile);
        assertEquals(dutchPlayer.getNextGoingToUnit().getType(), game.getSpecification().getUnitType("model.unit.kingsRegular"));
        dutchPlayer.setNextGoingToUnit(unit2);
        assertEquals(dutchPlayer.getNextGoingToUnit().getType(), game.getSpecification().getUnitType("model.unit.veteranSoldier"));
    }

    public void testHasNextGoingToUnit() {
        game.setMap(getTestMap());
        Tile tile = game.getMap().getTile(0,0);
        Unit unit = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.kingsRegular"));
        assertFalse(dutchPlayer.hasNextGoingToUnit());
        unit.setDestination(tile);
        assertTrue(dutchPlayer.hasNextGoingToUnit());
    }

    public void testGetHasNextTradeRouteUnit() {
        game.setMap(getTestMap());
        Tile tile = game.getMap().getTile(0,0);
        Unit unit = new ServerUnit(game, tile, dutchPlayer, game.getSpecification().getUnitType("model.unit.wagonTrain"));

        assertFalse(dutchPlayer.hasNextTradeRouteUnit());

        TradeRoute tr = new TradeRoute(game, "TR", dutchPlayer);
        unit.tradeRoute = tr;

        assertTrue(dutchPlayer.hasNextTradeRouteUnit());
        assertEquals(dutchPlayer.getNextTradeRouteUnit().getType(), game.getSpecification().getUnitType("model.unit.wagonTrain"));
    }
}