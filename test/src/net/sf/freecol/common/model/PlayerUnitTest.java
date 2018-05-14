package net.sf.freecol.common.model;

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
}