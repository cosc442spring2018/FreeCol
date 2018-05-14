package net.sf.freecol.common.model;

import net.sf.freecol.common.option.Option;
import net.sf.freecol.common.option.OptionGroup;
import net.sf.freecol.server.model.ServerPlayer;
import net.sf.freecol.util.test.FreeColTestCase;

import java.util.ArrayList;
import java.util.List;

public class PlayerFoundingFatherTest extends FreeColTestCase {

    Game game;
    ServerPlayer dutchPlayer; //This player is always creating in standard game

    public PlayerFoundingFatherTest() {
        super();
    }

    protected void setUp() throws Exception {
        super.setUp();
        game = getStandardGame();
        dutchPlayer = (ServerPlayer) game.getPlayerByNationId("model.nation.dutch");
    }

    public void testHasFather() {
        dutchPlayer.addFather(new FoundingFather("father" + 0, getGame().getSpecification()));
        assertEquals(dutchPlayer.getFatherCount(), 1);
    }

    public void testGetSetCurrentFather() {
        FoundingFather father = new FoundingFather("father1", getGame().getSpecification());
        dutchPlayer.addFather(father);
        dutchPlayer.setCurrentFather(father);
        assertEquals(dutchPlayer.getCurrentFather(), father);
    }

    public void testGetSetClearOfferedFathers() {
        FoundingFather father1 = new FoundingFather("father" + 0, getGame().getSpecification());
        FoundingFather father2 = new FoundingFather("father" + 1, getGame().getSpecification());
        List<FoundingFather> foundingFathers = new ArrayList<FoundingFather>();

        foundingFathers.add(father1);
        foundingFathers.add(father2);

        dutchPlayer.setOfferedFathers(foundingFathers);
        assertEquals(dutchPlayer.getOfferedFathers(), foundingFathers);
        dutchPlayer.clearOfferedFathers();
        foundingFathers.clear();
        assertEquals(dutchPlayer.getOfferedFathers(), foundingFathers);
    }

    public void testGetRemainingFoundingFatherCost() {

        FoundingFather father1 = new FoundingFather("father" + 0, getGame().getSpecification());
        dutchPlayer.addFather(father1);

        assertEquals(dutchPlayer.getTotalFoundingFatherCost(),dutchPlayer.getTotalFoundingFatherCost() - dutchPlayer.getLiberty());
    }

    public void testGetTotalFoundingFatherCost() {
        int foundingFatherBaseCost = getGame().getSpecification().getInteger(GameOptions.FOUNDING_FATHER_FACTOR);

        assertEquals(dutchPlayer.getTotalFoundingFatherCost(), foundingFatherBaseCost);

        FoundingFather father1 = new FoundingFather("father" + 0, getGame().getSpecification());
        FoundingFather father2 = new FoundingFather("father" + 1, getGame().getSpecification());

        dutchPlayer.addFather(father1);
        dutchPlayer.addFather(father2);

        int foundingFatherCost = 2 * (dutchPlayer.getFatherCount() + 1) * foundingFatherBaseCost + 1;
        assertEquals(dutchPlayer.getTotalFoundingFatherCost(), foundingFatherCost);
    }
}