package net.sf.freecol.common.model;
import net.sf.freecol.server.model.ServerColony;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;
import net.sf.freecol.server.model.ServerPlayer;
import net.sf.freecol.server.ServerTestHelper;
public class PlayerMonetaryTest extends FreeColTestCase {
    Game game;
    ServerPlayer dutchPlayer; //This player is always creating in standard game

    public PlayerMonetaryTest() {
        super();
    }

    protected void setUp() throws Exception {
        super.setUp();
        game = getStandardGame();
        dutchPlayer = (ServerPlayer) game.getPlayerByNationId("model.nation.dutch");
    }

    /**Test setting and getting sales tax*/
    public void testGetSetTax() {
        dutchPlayer.setTax(100);
        assertEquals(dutchPlayer.getTax(), 100);
    }

    /**Test getter for market*/
    public void testGetMarket() {
        GoodsType type = game.getSpecification().getGoodsType("model.goods.food");
        int initialFood = dutchPlayer.getMarket().getAmountInMarket(type);
        dutchPlayer.getMarket().addGoodsToMarket(type, 100);
        assertEquals(dutchPlayer.getMarket().getOwner(), dutchPlayer);
        assertEquals(dutchPlayer.getMarket().getAmountInMarket(type),initialFood+100);
    }

    /**Test restarting market after changing it to make sure it resets to default*/
    public void testReinitializeMarket() {
        GoodsType type = game.getSpecification().getGoodsType("model.goods.food");
        int initialFood = dutchPlayer.getMarket().getAmountInMarket(type);
        dutchPlayer.getMarket().addGoodsToMarket(type, 100);
        assertEquals(dutchPlayer.getMarket().getAmountInMarket(type),initialFood+100);
        dutchPlayer.reinitialiseMarket();
        assertEquals(dutchPlayer.getMarket().getAmountInMarket(type),initialFood);
    }

    /**Test out LastSales functionality including accessors and string representation*/
    public void testGetSetLastSales() {
        game.setMap(getTestMap());
        Colony colony = new ServerColony(game, dutchPlayer, "New Amsterdam", game.getMap().getTile(0,0));
        GoodsType type = game.getSpecification().getGoodsType("model.goods.food");

        dutchPlayer.addLastSale(new LastSale(LastSale.makeKey(colony,type), game.getTurn(), 100));
        assertEquals(dutchPlayer.getLastSale(colony, type).getPrice(), 100);
        assertEquals(dutchPlayer.getLastSaleString(colony,type), "100");
    }

    /**Test ability to check how many arrears (debt) player owes to the market.*/
    public void testGetArrears() {
        GoodsType type = game.getSpecification().getGoodsType("model.goods.food");
        int arrearAmt = 100;

        dutchPlayer.getMarket().setArrears(type, arrearAmt);
        assertEquals(arrearAmt,dutchPlayer.getArrears(type));
    }

    /** Test sales accessor */
    public void testGetSetSales() {
        GoodsType type = game.getSpecification().getGoodsType("model.goods.food");
        int salesAmt = 100;

        assertEquals(dutchPlayer.getSales(type),0);
        dutchPlayer.modifySales(type,salesAmt);
        assertEquals(dutchPlayer.getSales(type),salesAmt);
    }

    /**Test hasTraded accesor*/
    public void testGetTrade() {
        GoodsType type = game.getSpecification().getGoodsType("model.goods.food");
        assertFalse(dutchPlayer.hasTraded(type));
        dutchPlayer.getMarket().getMarketData(type).setTraded(true);
        assertTrue(dutchPlayer.hasTraded(type));
    }

    /**Get the most valuable good that has been traded and we have no debt for*/
    public void testGetMostValuableGoods() {
        ServerPlayer nativeAmericanPlayer = (ServerPlayer)game.getPlayerByNationId("model.nation.inca");
        assertNull(nativeAmericanPlayer.getMostValuableGoods());

        game.setMap(getTestMap());
        Colony colony = new ServerColony(game, dutchPlayer, "New Amsterdam", game.getMap().getTile(0,0));
        dutchPlayer.addSettlement(colony);

        GoodsType type = game.getSpecification().getGoodsType("model.goods.food");

        int goodsAmt = 100;
        colony.addGoods(type, goodsAmt);
        dutchPlayer.getMarket().getMarketData(type).setTraded(true);
        dutchPlayer.getMarket().getMarketData(type).setPaidForSale(100);

        assertEquals(dutchPlayer.getMostValuableGoods().getType(), type);
    }

    /**Test if a good can be traded to Europe*/
    public void testCanTradeEurope() {
        GoodsType type = game.getSpecification().getGoodsType("model.goods.food");
        assertTrue(dutchPlayer.canTrade(type));
        dutchPlayer.getMarket().setArrears(type, 100);
        assertFalse(dutchPlayer.canTrade(type));
    }

    public void testGetClosestPortForEurope() {
        game.setMap(getTestMap(game.getSpecification().getTileType("model.tile.ocean")));
        Tile tile = game.getMap().getTile(0,0);
        tile.setHighSeasCount(100);
        Colony colony = new ServerColony(game, dutchPlayer, "New Amsterdam", tile);
        dutchPlayer.addSettlement(colony);
        assertEquals(dutchPlayer.getClosestPortForEurope(), colony);
    }
}

