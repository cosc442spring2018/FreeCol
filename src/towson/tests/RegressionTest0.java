package towson.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = net.sf.freecol.common.model.GameOptions.STARTING_POSITIONS_RANDOM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = net.sf.freecol.common.model.Tile.UNIT_CHANGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TILE_UNIT_CHANGE" + "'", str0.equals("TILE_UNIT_CHANGE"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.SETTLEMENT_ACTIONS_CONTACT_CHIEF;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.settlementActionsContactChief" + "'", str0.equals("model.option.settlementActionsContactChief"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.CAN_BE_EQUIPPED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.canBeEquipped" + "'", str0.equals("model.ability.canBeEquipped"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.REF_UNIT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.refUnit" + "'", str0.equals("model.ability.refUnit"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.CUSTOM_IGNORE_BOYCOTT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.customIgnoreBoycott" + "'", str0.equals("model.option.customIgnoreBoycott"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.HAS_PORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.hasPort" + "'", str0.equals("model.ability.hasPort"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.GAMEOPTIONS_VICTORY_CONDITIONS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "gameOptions.victoryConditions" + "'", str0.equals("gameOptions.victoryConditions"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = net.sf.freecol.common.model.Player.GOLD_NOT_ACCOUNTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        net.sf.freecol.common.model.Player.ColonyValueCategory colonyValueCategory0 = net.sf.freecol.common.model.Player.ColonyValueCategory.A_PROD;
        org.junit.Assert.assertTrue("'" + colonyValueCategory0 + "' != '" + net.sf.freecol.common.model.Player.ColonyValueCategory.A_PROD + "'", colonyValueCategory0.equals(net.sf.freecol.common.model.Player.ColonyValueCategory.A_PROD));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        net.sf.freecol.common.model.Player player0 = null;
        net.sf.freecol.common.model.Player player1 = null;
        try {
            net.sf.freecol.common.model.NationSummary nationSummary2 = new net.sf.freecol.common.model.NationSummary(player0, player1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = net.sf.freecol.common.model.FoundingFather.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "founding-father" + "'", str0.equals("founding-father"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        net.sf.freecol.common.model.Region.RegionType regionType0 = net.sf.freecol.common.model.Region.RegionType.MOUNTAIN;
        org.junit.Assert.assertTrue("'" + regionType0 + "' != '" + net.sf.freecol.common.model.Region.RegionType.MOUNTAIN + "'", regionType0.equals(net.sf.freecol.common.model.Region.RegionType.MOUNTAIN));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str0 = net.sf.freecol.common.model.ResourceType.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "resource-type" + "'", str0.equals("resource-type"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        net.sf.freecol.common.model.Player.PlayerType playerType0 = net.sf.freecol.common.model.Player.PlayerType.REBEL;
        org.junit.Assert.assertTrue("'" + playerType0 + "' != '" + net.sf.freecol.common.model.Player.PlayerType.REBEL + "'", playerType0.equals(net.sf.freecol.common.model.Player.PlayerType.REBEL));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.MAXIMUM_TAX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.maximumTax" + "'", str0.equals("model.option.maximumTax"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        net.sf.freecol.common.model.pathfinding.CostDecider costDecider0 = null;
        net.sf.freecol.common.model.pathfinding.CostDecider[] costDeciderArray1 = new net.sf.freecol.common.model.pathfinding.CostDecider[] { costDecider0 };
        try {
            net.sf.freecol.common.model.pathfinding.CostDecider costDecider2 = net.sf.freecol.common.model.pathfinding.CostDeciders.getComposedCostDecider(costDeciderArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Short CostDecider list");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(costDeciderArray1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Collection<net.sf.freecol.common.model.Ability> abilityCollection0 = null;
        try {
            java.util.List<net.sf.freecol.common.model.Ability> abilityList1 = net.sf.freecol.common.model.FreeColObject.getSortedCopy(abilityCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str0 = net.sf.freecol.common.model.Europe.UNIT_CHANGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "unitChange" + "'", str0.equals("unitChange"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.INTERVENTION_BELLS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.interventionBells" + "'", str0.equals("model.option.interventionBells"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int0 = net.sf.freecol.common.model.FreeColObject.UNDEFINED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        net.sf.freecol.common.model.Player player0 = null;
        net.sf.freecol.common.model.Player player1 = null;
        try {
            net.sf.freecol.common.model.Player.makeContact(player0, player1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.BOMBARD_SHIPS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.bombardShips" + "'", str0.equals("model.ability.bombardShips"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.PILLAGE_UNPROTECTED_COLONY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.pillageUnprotectedColony" + "'", str0.equals("model.ability.pillageUnprotectedColony"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        net.sf.freecol.common.model.Unit.UnitState unitState0 = net.sf.freecol.common.model.Unit.UnitState.FORTIFIED;
        org.junit.Assert.assertTrue("'" + unitState0 + "' != '" + net.sf.freecol.common.model.Unit.UnitState.FORTIFIED + "'", unitState0.equals(net.sf.freecol.common.model.Unit.UnitState.FORTIFIED));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.DISPOSE_ON_COMBAT_LOSS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.disposeOnCombatLoss" + "'", str0.equals("model.ability.disposeOnCombatLoss"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int0 = net.sf.freecol.common.model.Specification.NUMBER_OF_AGES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.ENHANCED_MISSIONARIES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.enhancedMissionaries" + "'", str0.equals("model.option.enhancedMissionaries"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str1 = net.sf.freecol.common.model.Role.fixRoleId("model.ability.pillageUnprotectedColony");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.ability.pillageUnprotectedColony" + "'", str1.equals("model.ability.pillageUnprotectedColony"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        net.sf.freecol.common.model.Monarch monarch0 = null;
        net.sf.freecol.common.option.UnitListOption unitListOption1 = null;
        try {
            net.sf.freecol.common.model.Monarch.Force force3 = monarch0.new Force(unitListOption1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to net.sf.freecol.common.model.Monarch$Force with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int0 = net.sf.freecol.common.model.Modifier.UNIT_NORMAL_COMBAT_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.POISONOUS_PLANT;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.POISONOUS_PLANT + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.POISONOUS_PLANT));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        net.sf.freecol.common.model.AbstractGoods abstractGoods0 = null;
        net.sf.freecol.common.model.AbstractGoods abstractGoods1 = null;
        net.sf.freecol.common.model.AbstractGoods[] abstractGoodsArray2 = new net.sf.freecol.common.model.AbstractGoods[] { abstractGoods1 };
        try {
            net.sf.freecol.common.model.ProductionMap.ProductionTree productionTree3 = new net.sf.freecol.common.model.ProductionMap.ProductionTree(abstractGoods0, abstractGoodsArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(abstractGoodsArray2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.CARGO_PENALTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.cargoPenalty" + "'", str0.equals("model.modifier.cargoPenalty"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        boolean boolean1 = net.sf.freecol.common.model.Europe.MigrationType.validMigrantSlot((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.MOUNTED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.mounted" + "'", str0.equals("model.ability.mounted"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int0 = net.sf.freecol.common.model.Modifier.UNIT_ADDITIVE_COMBAT_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        net.sf.freecol.common.model.Turn.initialize(1, (-1), (int) '#');
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        net.sf.freecol.common.model.Colony.NoBuildReason noBuildReason0 = net.sf.freecol.common.model.Colony.NoBuildReason.COASTAL;
        org.junit.Assert.assertTrue("'" + noBuildReason0 + "' != '" + net.sf.freecol.common.model.Colony.NoBuildReason.COASTAL + "'", noBuildReason0.equals(net.sf.freecol.common.model.Colony.NoBuildReason.COASTAL));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.w3c.dom.Element element0 = null;
        try {
            net.sf.freecol.common.model.NationSummary nationSummary1 = new net.sf.freecol.common.model.NationSummary(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: XML failure");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Map<net.sf.freecol.common.model.UnitTypeChange.ChangeType, java.lang.String> changeTypeMap0 = net.sf.freecol.common.model.UnitTypeChange.compatTags;
        org.junit.Assert.assertNotNull(changeTypeMap0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.MERCENARY_PRICE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.mercenaryPrice" + "'", str0.equals("model.option.mercenaryPrice"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.CAPTURE_UNITS_UNDER_REPAIR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.captureUnitsUnderRepair" + "'", str0.equals("model.option.captureUnitsUnderRepair"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Comparator<net.sf.freecol.common.model.Unit> unitComparator0 = net.sf.freecol.common.model.Unit.locComparator;
        org.junit.Assert.assertNotNull(unitComparator0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.FOUND_IN_LOST_CITY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.foundInLostCity" + "'", str0.equals("model.ability.foundInLostCity"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.PLUNDER_NATIVES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.plunderNatives" + "'", str0.equals("model.ability.plunderNatives"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        net.sf.freecol.common.model.Operand.OperandType operandType0 = net.sf.freecol.common.model.Operand.OperandType.FOUNDING_FATHERS;
        org.junit.Assert.assertTrue("'" + operandType0 + "' != '" + net.sf.freecol.common.model.Operand.OperandType.FOUNDING_FATHERS + "'", operandType0.equals(net.sf.freecol.common.model.Operand.OperandType.FOUNDING_FATHERS));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        net.sf.freecol.common.model.Map.Layer layer0 = net.sf.freecol.common.model.Map.Layer.RESOURCES;
        org.junit.Assert.assertTrue("'" + layer0 + "' != '" + net.sf.freecol.common.model.Map.Layer.RESOURCES + "'", layer0.equals(net.sf.freecol.common.model.Map.Layer.RESOURCES));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        net.sf.freecol.common.model.Region.RegionType regionType0 = net.sf.freecol.common.model.Region.RegionType.LAND;
        org.junit.Assert.assertTrue("'" + regionType0 + "' != '" + net.sf.freecol.common.model.Region.RegionType.LAND + "'", regionType0.equals(net.sf.freecol.common.model.Region.RegionType.LAND));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Comparator<net.sf.freecol.common.model.Tile> tileComparator0 = net.sf.freecol.common.model.Tile.edgeDistanceComparator;
        org.junit.Assert.assertNotNull(tileComparator0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        net.sf.freecol.common.model.Monarch.MonarchAction monarchAction0 = net.sf.freecol.common.model.Monarch.MonarchAction.DISPLEASURE;
        org.junit.Assert.assertTrue("'" + monarchAction0 + "' != '" + net.sf.freecol.common.model.Monarch.MonarchAction.DISPLEASURE + "'", monarchAction0.equals(net.sf.freecol.common.model.Monarch.MonarchAction.DISPLEASURE));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int int0 = net.sf.freecol.common.model.Turn.getStartingYear();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_WATER;
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_WATER + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_WATER));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        net.sf.freecol.common.model.Player.NoClaimReason noClaimReason0 = net.sf.freecol.common.model.Player.NoClaimReason.NATIVES;
        org.junit.Assert.assertTrue("'" + noClaimReason0 + "' != '" + net.sf.freecol.common.model.Player.NoClaimReason.NATIVES + "'", noClaimReason0.equals(net.sf.freecol.common.model.Player.NoClaimReason.NATIVES));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str0 = net.sf.freecol.common.model.TileImprovementType.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tile-improvement-type" + "'", str0.equals("tile-improvement-type"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        net.sf.freecol.common.model.Colony.ColonyChangeEvent colonyChangeEvent0 = net.sf.freecol.common.model.Colony.ColonyChangeEvent.BUILD_QUEUE_CHANGE;
        org.junit.Assert.assertTrue("'" + colonyChangeEvent0 + "' != '" + net.sf.freecol.common.model.Colony.ColonyChangeEvent.BUILD_QUEUE_CHANGE + "'", colonyChangeEvent0.equals(net.sf.freecol.common.model.Colony.ColonyChangeEvent.BUILD_QUEUE_CHANGE));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.StringTemplate stringTemplate3 = stringTemplate1.add("founding-father");
        boolean boolean5 = stringTemplate3.containsAbilityKey("model.option.maximumTax");
        java.util.List<net.sf.freecol.common.model.StringTemplate> stringTemplateList6 = stringTemplate3.getReplacements();
        org.w3c.dom.Document document7 = null;
        net.sf.freecol.common.io.FreeColXMLWriter.WriteScope writeScope8 = null;
        try {
            org.w3c.dom.Element element9 = stringTemplate3.toXMLElement(document7, writeScope8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stringTemplate1);
        org.junit.Assert.assertNotNull(stringTemplate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringTemplateList6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        net.sf.freecol.common.model.Player player0 = null;
        try {
            net.sf.freecol.common.model.MarketWas marketWas1 = new net.sf.freecol.common.model.MarketWas(player0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str0 = net.sf.freecol.common.model.IndianSettlement.OLD_UNITS_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "units" + "'", str0.equals("units"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.RIVER;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.RIVER + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.RIVER));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str0 = net.sf.freecol.common.model.Europe.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "europe" + "'", str0.equals("europe"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int int1 = net.sf.freecol.common.model.Europe.MigrationType.migrantSlotToIndex((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        org.w3c.dom.Document document2 = null;
        net.sf.freecol.common.io.FreeColXMLWriter.WriteScope writeScope3 = null;
        try {
            org.w3c.dom.Element element4 = stringTemplate1.toXMLElement(document2, writeScope3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stringTemplate1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.LIBERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.liberty" + "'", str0.equals("model.modifier.liberty"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        net.sf.freecol.common.model.StringTemplate.TemplateType templateType0 = net.sf.freecol.common.model.StringTemplate.TemplateType.TEMPLATE;
        org.junit.Assert.assertTrue("'" + templateType0 + "' != '" + net.sf.freecol.common.model.StringTemplate.TemplateType.TEMPLATE + "'", templateType0.equals(net.sf.freecol.common.model.StringTemplate.TemplateType.TEMPLATE));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int0 = net.sf.freecol.common.model.Tension.TENSION_ADD_LAND_TAKEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200 + "'", int0 == 200);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.ATTACK_UNIT;
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.ATTACK_UNIT + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.ATTACK_UNIT));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        net.sf.freecol.common.model.Disaster.Effects effects0 = net.sf.freecol.common.model.Disaster.Effects.SEVERAL;
        org.junit.Assert.assertTrue("'" + effects0 + "' != '" + net.sf.freecol.common.model.Disaster.Effects.SEVERAL + "'", effects0.equals(net.sf.freecol.common.model.Disaster.Effects.SEVERAL));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.STREET;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.STREET + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.STREET));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        stringTemplate1.fireIndexedPropertyChange("hi!", (-1), true, false);
        net.sf.freecol.common.model.Modifier modifier7 = null;
        net.sf.freecol.common.model.Modifier modifier8 = stringTemplate1.removeModifier(modifier7);
        org.junit.Assert.assertNotNull(stringTemplate1);
        org.junit.Assert.assertNull(modifier8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.FOUL_SMELLING_PLANT;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.FOUL_SMELLING_PLANT + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.FOUL_SMELLING_PLANT));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.SETTLEMENT_LIMIT_MODIFIER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.settlementLimitModifier" + "'", str0.equals("model.option.settlementLimitModifier"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.PARASITIC_WORM;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.PARASITIC_WORM + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.PARASITIC_WORM));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.INDEPENDENT_NATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.independentNation" + "'", str0.equals("model.ability.independentNation"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ability" + "'", str0.equals("ability"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.BREEDING_DIVISOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.breedingDivisor" + "'", str0.equals("model.modifier.breedingDivisor"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        net.sf.freecol.common.model.TileType.RangeType rangeType0 = net.sf.freecol.common.model.TileType.RangeType.HUMIDITY;
        org.junit.Assert.assertTrue("'" + rangeType0 + "' != '" + net.sf.freecol.common.model.TileType.RangeType.HUMIDITY + "'", rangeType0.equals(net.sf.freecol.common.model.TileType.RangeType.HUMIDITY));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        net.sf.freecol.common.model.Player player0 = null;
        try {
            boolean boolean1 = net.sf.freecol.common.model.HighScore.newHighScore(player0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        net.sf.freecol.common.model.Monarch.MonarchAction monarchAction0 = net.sf.freecol.common.model.Monarch.MonarchAction.RAISE_TAX_WAR;
        org.junit.Assert.assertTrue("'" + monarchAction0 + "' != '" + net.sf.freecol.common.model.Monarch.MonarchAction.RAISE_TAX_WAR + "'", monarchAction0.equals(net.sf.freecol.common.model.Monarch.MonarchAction.RAISE_TAX_WAR));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        net.sf.freecol.common.model.UnitTypeChange.ChangeType changeType0 = net.sf.freecol.common.model.UnitTypeChange.ChangeType.ENTER_COLONY;
        org.junit.Assert.assertTrue("'" + changeType0 + "' != '" + net.sf.freecol.common.model.UnitTypeChange.ChangeType.ENTER_COLONY + "'", changeType0.equals(net.sf.freecol.common.model.UnitTypeChange.ChangeType.ENTER_COLONY));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.mission.GoToMission goToMission2 = new net.sf.freecol.common.model.mission.GoToMission(game0, "unitChange");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=unitChange) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str0 = net.sf.freecol.common.model.IndianSettlement.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "indianSettlement" + "'", str0.equals("indianSettlement"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader1 = null;
        try {
            net.sf.freecol.common.model.Goods goods2 = new net.sf.freecol.common.model.Goods(game0, freeColXMLReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Player player2 = null;
        try {
            net.sf.freecol.common.model.TradeRoute tradeRoute3 = new net.sf.freecol.common.model.TradeRoute(game0, "TILE_UNIT_CHANGE", player2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        net.sf.freecol.common.model.Modifier modifier1 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        net.sf.freecol.common.model.Turn turn2 = null;
        try {
            net.sf.freecol.common.model.Modifier modifier3 = net.sf.freecol.common.model.Modifier.makeTimedModifier("model.option.enhancedMissionaries", modifier1, turn2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(modifier1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int int0 = net.sf.freecol.common.model.ColonyTile.UNIT_CAPACITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.SPEAK_WITH_CHIEF;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.speakWithChief" + "'", str0.equals("model.ability.speakWithChief"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        net.sf.freecol.common.model.pathfinding.CostDecider costDecider0 = net.sf.freecol.common.model.pathfinding.CostDeciders.serverAvoidIllegal();
        org.junit.Assert.assertNotNull(costDecider0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int1 = net.sf.freecol.common.model.Europe.MigrationType.migrantIndexToSlot((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str0 = net.sf.freecol.common.model.TileType.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tile-type" + "'", str0.equals("tile-type"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int int0 = net.sf.freecol.common.model.Location.LOCATION_RANK_EUROPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.CONSUME_ONLY_SURPLUS_PRODUCTION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.consumeOnlySurplusProduction" + "'", str0.equals("model.modifier.consumeOnlySurplusProduction"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        net.sf.freecol.common.model.Player[] playerArray0 = new net.sf.freecol.common.model.Player[] {};
        java.util.ArrayList<net.sf.freecol.common.model.Player> playerList1 = new java.util.ArrayList<net.sf.freecol.common.model.Player>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.Player>) playerList1, playerArray0);
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider3 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getEnemySettlementGoalDecider((java.util.Collection<net.sf.freecol.common.model.Player>) playerList1);
        org.junit.Assert.assertNotNull(playerArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(goalDecider3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.RODENT;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.RODENT + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.RODENT));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int1 = net.sf.freecol.common.model.Turn.getYear((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str0 = net.sf.freecol.common.model.GoodsTradeItem.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "goodsTradeItem" + "'", str0.equals("goodsTradeItem"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str0 = net.sf.freecol.common.model.GoodsContainer.TYPE_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "type" + "'", str0.equals("type"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int int0 = net.sf.freecol.common.model.Tension.WAR_MODIFIER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.EXPOSED_TILES_RADIUS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.exposedTilesRadius" + "'", str0.equals("model.modifier.exposedTilesRadius"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.GAMEOPTIONS_MAP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "gameOptions.map" + "'", str0.equals("gameOptions.map"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        boolean boolean1 = net.sf.freecol.common.model.mission.MissionManager.isMissionTag("resource-type");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        net.sf.freecol.common.model.UnitTypeChange.ChangeType changeType0 = net.sf.freecol.common.model.UnitTypeChange.ChangeType.EXPERIENCE;
        org.junit.Assert.assertTrue("'" + changeType0 + "' != '" + net.sf.freecol.common.model.UnitTypeChange.ChangeType.EXPERIENCE + "'", changeType0.equals(net.sf.freecol.common.model.UnitTypeChange.ChangeType.EXPERIENCE));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int int1 = net.sf.freecol.common.model.Europe.MigrationType.convertToMigrantSlot((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str1 = net.sf.freecol.common.model.Role.getRoleSuffix("resource-type");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "resource-type" + "'", str1.equals("resource-type"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.EXPORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.export" + "'", str0.equals("model.ability.export"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str0 = net.sf.freecol.common.model.StringTemplate.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "stringTemplate" + "'", str0.equals("stringTemplate"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.GOVERNMENT_EFFICIENCY;
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.GOVERNMENT_EFFICIENCY + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.GOVERNMENT_EFFICIENCY));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        net.sf.freecol.common.model.Player player0 = null;
        java.util.Date date1 = null;
        try {
            net.sf.freecol.common.model.HighScore highScore2 = new net.sf.freecol.common.model.HighScore(player0, date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.BUILD_ON_NATIVE_LAND_NEVER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.buildOnNativeLand.never" + "'", str0.equals("model.option.buildOnNativeLand.never"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.DISPOSE_ON_ALL_EQUIPMENT_LOST;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.disposeOnAllEquipLost" + "'", str0.equals("model.ability.disposeOnAllEquipLost"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int int0 = net.sf.freecol.common.model.Modifier.ROLE_COMBAT_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str0 = net.sf.freecol.common.model.Monarch.Force.LAND_UNITS_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "landUnits" + "'", str0.equals("landUnits"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        net.sf.freecol.common.model.pathfinding.CostDecider costDecider0 = net.sf.freecol.common.model.pathfinding.CostDeciders.avoidSettlements();
        org.junit.Assert.assertNotNull(costDecider0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        net.sf.freecol.common.model.Player player0 = null;
        net.sf.freecol.common.model.UnitType unitType1 = null;
        net.sf.freecol.common.model.Role[] roleArray2 = new net.sf.freecol.common.model.Role[] {};
        java.util.ArrayList<net.sf.freecol.common.model.Role> roleList3 = new java.util.ArrayList<net.sf.freecol.common.model.Role>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.Role>) roleList3, roleArray2);
        java.util.List<net.sf.freecol.common.model.Role> roleList5 = net.sf.freecol.common.model.Role.getAvailableRoles(player0, unitType1, (java.util.List<net.sf.freecol.common.model.Role>) roleList3);
        org.junit.Assert.assertNotNull(roleArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(roleList5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int0 = net.sf.freecol.common.model.Settlement.FOOD_PER_COLONIST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200 + "'", int0 == 200);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider0 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getHighSeasGoalDecider();
        org.junit.Assert.assertNotNull(goalDecider0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        net.sf.freecol.common.model.BuildQueue.CompletionAction completionAction0 = net.sf.freecol.common.model.BuildQueue.CompletionAction.SHUFFLE;
        org.junit.Assert.assertTrue("'" + completionAction0 + "' != '" + net.sf.freecol.common.model.BuildQueue.CompletionAction.SHUFFLE + "'", completionAction0.equals(net.sf.freecol.common.model.BuildQueue.CompletionAction.SHUFFLE));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str0 = net.sf.freecol.common.model.Event.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "event" + "'", str0.equals("event"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.EXPERTS_USE_CONNECTIONS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.expertsUseConnections" + "'", str0.equals("model.ability.expertsUseConnections"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        net.sf.freecol.common.model.Modifier.ModifierType modifierType1 = null;
        modifier0.setIncrementType(modifierType1);
        net.sf.freecol.common.model.Modifier.ModifierType modifierType3 = null;
        net.sf.freecol.common.model.Turn turn5 = null;
        net.sf.freecol.common.model.Turn turn6 = null;
        try {
            modifier0.setIncrement(modifierType3, (float) 30, turn5, turn6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null firstTurn");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(modifier0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        boolean boolean1 = net.sf.freecol.common.model.Europe.MigrationType.validMigrantSlot((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        net.sf.freecol.common.model.Game game0 = null;
        java.util.Random random1 = null;
        try {
            java.lang.String str2 = net.sf.freecol.common.model.Nation.getRandomNonPlayerNationNameKey(game0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.DIFFICULTY_CHEAT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.difficulty.cheat" + "'", str0.equals("model.difficulty.cheat"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int int0 = net.sf.freecol.common.model.Modifier.BUILDING_PRODUCTION_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 70 + "'", int0 == 70);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_LOST;
        net.sf.freecol.common.model.FreeColGameObject freeColGameObject2 = null;
        try {
            net.sf.freecol.common.model.ModelMessage modelMessage3 = new net.sf.freecol.common.model.ModelMessage(messageType0, "type", freeColGameObject2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_LOST + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_LOST));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.LostCityRumour lostCityRumour2 = new net.sf.freecol.common.model.LostCityRumour(game0, "model.modifier.breedingDivisor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=model.modifier.breedingDivisor) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.PRODUCE_IN_WATER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.produceInWater" + "'", str0.equals("model.ability.produceInWater"));
    }

//    @Test
//    public void test128() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test128");
//        net.sf.freecol.common.model.Modifier modifier1 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
//        boolean boolean2 = modifier1.requireNegatedPersonScope();
//        net.sf.freecol.common.model.Turn turn3 = null;
//        try {
//            net.sf.freecol.common.model.Modifier modifier4 = net.sf.freecol.common.model.Modifier.makeTimedModifier("model.option.buildOnNativeLand.never", modifier1, turn3);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//        }
//        org.junit.Assert.assertNotNull(modifier1);
//        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
//    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        net.sf.freecol.common.model.UnitTypeChange.ChangeType changeType0 = net.sf.freecol.common.model.UnitTypeChange.ChangeType.UNDEAD;
        org.junit.Assert.assertTrue("'" + changeType0 + "' != '" + net.sf.freecol.common.model.UnitTypeChange.ChangeType.UNDEAD + "'", changeType0.equals(net.sf.freecol.common.model.UnitTypeChange.ChangeType.UNDEAD));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.IMMIGRANTS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.immigrants" + "'", str0.equals("model.option.immigrants"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str0 = net.sf.freecol.common.model.Goods.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "goods" + "'", str0.equals("goods"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String str0 = net.sf.freecol.common.model.mission.GoToMission.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "goToMission" + "'", str0.equals("goToMission"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        net.sf.freecol.common.model.NationOptions.NationState nationState0 = net.sf.freecol.common.model.NationOptions.NationState.AVAILABLE;
        org.junit.Assert.assertTrue("'" + nationState0 + "' != '" + net.sf.freecol.common.model.NationOptions.NationState.AVAILABLE + "'", nationState0.equals(net.sf.freecol.common.model.NationOptions.NationState.AVAILABLE));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        net.sf.freecol.common.model.Tile tile0 = null;
        try {
            net.sf.freecol.common.model.Map.Position position1 = new net.sf.freecol.common.model.Map.Position(tile0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int int0 = net.sf.freecol.common.model.GameOptions.STARTING_POSITIONS_CLASSIC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str0 = net.sf.freecol.common.model.StanceTradeItem.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "stanceTradeItem" + "'", str0.equals("stanceTradeItem"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.MOUNDS;
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.MOUNDS + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.MOUNDS));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.CARRY_UNITS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.carryUnits" + "'", str0.equals("model.ability.carryUnits"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str0 = net.sf.freecol.common.model.FreeColObject.ID_ATTRIBUTE_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "id" + "'", str0.equals("id"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        int int0 = net.sf.freecol.common.model.Tile.OVERLAY_ZINDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.POPULAR_SUPPORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.popularSupport" + "'", str0.equals("model.modifier.popularSupport"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        net.sf.freecol.common.model.Colony.NoBuildReason noBuildReason0 = net.sf.freecol.common.model.Colony.NoBuildReason.MISSING_ABILITY;
        org.junit.Assert.assertTrue("'" + noBuildReason0 + "' != '" + net.sf.freecol.common.model.Colony.NoBuildReason.MISSING_ABILITY + "'", noBuildReason0.equals(net.sf.freecol.common.model.Colony.NoBuildReason.MISSING_ABILITY));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader1 = null;
        try {
            net.sf.freecol.common.model.mission.Mission mission2 = net.sf.freecol.common.model.mission.MissionManager.getMission(game0, freeColXMLReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.FreeColGameObjectType freeColGameObjectType3 = null;
        boolean boolean4 = stringTemplate1.hasAbility("model.option.maximumTax", freeColGameObjectType3);
        java.lang.String str6 = stringTemplate1.getSuffix("resource-type");
        try {
            net.sf.freecol.common.model.StringTemplate stringTemplate9 = stringTemplate1.addName("indianSettlement", "europe");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot add key-name pair to StringTemplate.LABEL");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stringTemplate1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.INDEPENDENCE_TURN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.independenceTurn" + "'", str0.equals("model.option.independenceTurn"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.BAD_GOVERNMENT_LIMIT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.badGovernmentLimit" + "'", str0.equals("model.option.badGovernmentLimit"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        net.sf.freecol.common.model.UnitTypeChange.ChangeType changeType0 = net.sf.freecol.common.model.UnitTypeChange.ChangeType.CONVERSION;
        org.junit.Assert.assertTrue("'" + changeType0 + "' != '" + net.sf.freecol.common.model.UnitTypeChange.ChangeType.CONVERSION + "'", changeType0.equals(net.sf.freecol.common.model.UnitTypeChange.ChangeType.CONVERSION));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String str0 = net.sf.freecol.common.model.Specification.ROLES_COMPAT_FILE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "roles-compat.xml" + "'", str0.equals("roles-compat.xml"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.w3c.dom.Element element0 = null;
        net.sf.freecol.common.model.Specification specification1 = null;
        try {
            net.sf.freecol.common.model.Modifier modifier2 = new net.sf.freecol.common.model.Modifier(element0, specification1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: XML failure");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.MISSION_INFLUENCE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.missionInfluence" + "'", str0.equals("model.option.missionInfluence"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_CONTACT;
        java.lang.String str1 = moveType0.whyIllegal();
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_CONTACT + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_CONTACT));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Attempt to interact with natives before contact" + "'", str1.equals("Attempt to interact with natives before contact"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_EMBARK;
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_EMBARK + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_EMBARK));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int0 = net.sf.freecol.common.model.Tile.FLAG_RECALCULATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        net.sf.freecol.common.model.DiplomaticTrade.TradeStatus tradeStatus0 = net.sf.freecol.common.model.DiplomaticTrade.TradeStatus.REJECT_TRADE;
        org.junit.Assert.assertTrue("'" + tradeStatus0 + "' != '" + net.sf.freecol.common.model.DiplomaticTrade.TradeStatus.REJECT_TRADE + "'", tradeStatus0.equals(net.sf.freecol.common.model.DiplomaticTrade.TradeStatus.REJECT_TRADE));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader0 = null;
        try {
            net.sf.freecol.common.model.Scope scope1 = new net.sf.freecol.common.model.Scope(freeColXMLReader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.OFFENSIVE_LAND_UNIT_CHEAT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.offensiveLandUnitCheat" + "'", str0.equals("model.option.offensiveLandUnitCheat"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.CONVERSION_SKILL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.conversionSkill" + "'", str0.equals("model.modifier.conversionSkill"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        net.sf.freecol.common.model.Map.Layer layer0 = net.sf.freecol.common.model.Map.Layer.NONE;
        org.junit.Assert.assertTrue("'" + layer0 + "' != '" + net.sf.freecol.common.model.Map.Layer.NONE + "'", layer0.equals(net.sf.freecol.common.model.Map.Layer.NONE));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.INTERVENTION_TURNS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.interventionTurns" + "'", str0.equals("model.option.interventionTurns"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.ONLY_NATURAL_IMPROVEMENTS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.onlyNaturalImprovements" + "'", str0.equals("model.option.onlyNaturalImprovements"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.AGES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.ages" + "'", str0.equals("model.option.ages"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        int int0 = net.sf.freecol.common.model.Modifier.IMPROVEMENT_PRODUCTION_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.AMBUSH_BONUS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.ambushBonus" + "'", str0.equals("model.ability.ambushBonus"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.ATTACK_BONUS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.attackBonus" + "'", str0.equals("model.modifier.attackBonus"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        net.sf.freecol.common.model.Europe europe0 = null;
        try {
            net.sf.freecol.common.model.EuropeWas europeWas1 = new net.sf.freecol.common.model.EuropeWas(europe0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.PEACE_PROBABILITY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.peaceProbability" + "'", str0.equals("model.option.peaceProbability"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.Tile tile2 = new net.sf.freecol.common.model.Tile(game0, "roles-compat.xml");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=roles-compat.xml) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.StringTemplate stringTemplate3 = stringTemplate1.add("founding-father");
        boolean boolean5 = stringTemplate3.containsAbilityKey("model.option.maximumTax");
        java.util.List<net.sf.freecol.common.model.StringTemplate> stringTemplateList6 = stringTemplate3.getReplacements();
        net.sf.freecol.common.model.Turn turn8 = null;
        float float10 = stringTemplate3.applyModifiers((float) (-1), turn8, "model.ability.speakWithChief");
        try {
            net.sf.freecol.common.model.StringTemplate stringTemplate13 = stringTemplate3.add("europe", "TILE_UNIT_CHANGE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot add key-value pair to StringTemplate.LABEL");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stringTemplate1);
        org.junit.Assert.assertNotNull(stringTemplate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringTemplateList6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        net.sf.freecol.common.model.Monarch.MonarchAction monarchAction0 = net.sf.freecol.common.model.Monarch.MonarchAction.SUPPORT_LAND;
        org.junit.Assert.assertTrue("'" + monarchAction0 + "' != '" + net.sf.freecol.common.model.Monarch.MonarchAction.SUPPORT_LAND + "'", monarchAction0.equals(net.sf.freecol.common.model.Monarch.MonarchAction.SUPPORT_LAND));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int0 = net.sf.freecol.common.model.IndianSettlement.TALES_RADIUS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        net.sf.freecol.common.model.FeatureContainer featureContainer0 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source2 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn3 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet4 = featureContainer0.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source2, turn3);
        source2.internId("model.option.settlementLimitModifier");
        org.junit.Assert.assertNotNull(source2);
        org.junit.Assert.assertNotNull(abilitySet4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader0 = null;
        try {
            net.sf.freecol.common.model.ExportData exportData1 = new net.sf.freecol.common.model.ExportData(freeColXMLReader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.w3c.dom.Element element0 = null;
        try {
            net.sf.freecol.common.model.ExportData exportData1 = new net.sf.freecol.common.model.ExportData(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: XML failure");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.GAMEOPTIONS_YEARS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "gameOptions.years" + "'", str0.equals("gameOptions.years"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        net.sf.freecol.common.model.Colony colony0 = null;
        net.sf.freecol.common.model.ProductionCache productionCache1 = new net.sf.freecol.common.model.ProductionCache(colony0);
        net.sf.freecol.common.model.GoodsType goodsType2 = null;
        try {
            int int3 = productionCache1.getNetProductionOf(goodsType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        net.sf.freecol.common.model.Tile tile0 = null;
        net.sf.freecol.common.model.Tile tile1 = null;
        try {
            net.sf.freecol.common.model.Direction direction2 = net.sf.freecol.common.model.Map.getRoughDirection(tile0, tile1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_IMPROVED;
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_IMPROVED + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_IMPROVED));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Tile tile1 = null;
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType2 = net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES;
        try {
            net.sf.freecol.common.model.LostCityRumour lostCityRumour4 = new net.sf.freecol.common.model.LostCityRumour(game0, tile1, rumourType2, "model.option.settlementActionsContactChief");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + rumourType2 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES + "'", rumourType2.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_EUROPE;
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_EUROPE + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_EUROPE));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        int int0 = net.sf.freecol.common.model.Tension.TENSION_ADD_MAJOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 300 + "'", int0 == 300);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.FOUND_COLONY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.foundColony" + "'", str0.equals("model.ability.foundColony"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        net.sf.freecol.common.option.OptionGroup optionGroup0 = null;
        java.util.Random random1 = null;
        try {
            net.sf.freecol.common.model.LandMap landMap2 = new net.sf.freecol.common.model.LandMap(optionGroup0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.w3c.dom.Element element0 = null;
        try {
            net.sf.freecol.common.model.HighScore highScore1 = new net.sf.freecol.common.model.HighScore(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: XML failure");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        net.sf.freecol.common.model.pathfinding.CostDeciders costDeciders0 = new net.sf.freecol.common.model.pathfinding.CostDeciders();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        net.sf.freecol.common.model.Stance stance0 = net.sf.freecol.common.model.Stance.PEACE;
        java.lang.String str1 = stance0.getOtherStanceChangeKey();
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType2 = net.sf.freecol.common.model.HistoryEvent.getEventTypeFromStance(stance0);
        org.junit.Assert.assertTrue("'" + stance0 + "' != '" + net.sf.freecol.common.model.Stance.PEACE + "'", stance0.equals(net.sf.freecol.common.model.Stance.PEACE));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.player.stance.peace.others" + "'", str1.equals("model.player.stance.peace.others"));
        org.junit.Assert.assertTrue("'" + historyEventType2 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.MAKE_PEACE + "'", historyEventType2.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.MAKE_PEACE));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.DIFFICULTY_OTHER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.difficulty.other" + "'", str0.equals("model.difficulty.other"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        net.sf.freecol.common.model.FreeColGameObject freeColGameObject1 = null;
        try {
            net.sf.freecol.common.model.ModelMessage modelMessage2 = new net.sf.freecol.common.model.ModelMessage("model.ability.expertsUseConnections", freeColGameObject1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.StringTemplate.name("model.ability.hasPort");
        org.junit.Assert.assertNotNull(stringTemplate1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.RECRUIT_PRICE_INCREASE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.recruitPriceIncrease" + "'", str0.equals("model.option.recruitPriceIncrease"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        net.sf.freecol.common.model.UnitTypeChange.ChangeType changeType0 = net.sf.freecol.common.model.UnitTypeChange.ChangeType.LOST_CITY;
        org.junit.Assert.assertTrue("'" + changeType0 + "' != '" + net.sf.freecol.common.model.UnitTypeChange.ChangeType.LOST_CITY + "'", changeType0.equals(net.sf.freecol.common.model.UnitTypeChange.ChangeType.LOST_CITY));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.CAPTURE_UNITS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.captureUnits" + "'", str0.equals("model.ability.captureUnits"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.REPAIR_UNITS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.repairUnits" + "'", str0.equals("model.ability.repairUnits"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Tile tile1 = null;
        try {
            net.sf.freecol.common.model.LostCityRumour lostCityRumour2 = new net.sf.freecol.common.model.LostCityRumour(game0, tile1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str0 = net.sf.freecol.common.model.Building.UNIT_CHANGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UNIT_CHANGE" + "'", str0.equals("UNIT_CHANGE"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.CUSTOMS_ON_COAST;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.customsOnCoast" + "'", str0.equals("model.option.customsOnCoast"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        net.sf.freecol.common.model.Player.ColonyValueCategory colonyValueCategory0 = net.sf.freecol.common.model.Player.ColonyValueCategory.A_OVERRIDE;
        org.junit.Assert.assertTrue("'" + colonyValueCategory0 + "' != '" + net.sf.freecol.common.model.Player.ColonyValueCategory.A_OVERRIDE + "'", colonyValueCategory0.equals(net.sf.freecol.common.model.Player.ColonyValueCategory.A_OVERRIDE));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.PERSON;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.person" + "'", str0.equals("model.ability.person"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.SAVE_PRODUCTION_OVERFLOW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.saveProductionOverflow" + "'", str0.equals("model.option.saveProductionOverflow"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader0 = null;
        net.sf.freecol.common.model.Specification specification1 = null;
        try {
            net.sf.freecol.common.model.Effect effect2 = new net.sf.freecol.common.model.Effect(freeColXMLReader0, specification1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.PIRACY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.piracy" + "'", str0.equals("model.ability.piracy"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.BETTER_FOREIGN_AFFAIRS_REPORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.betterForeignAffairsReport" + "'", str0.equals("model.ability.betterForeignAffairsReport"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.ALLOW_STUDENT_SELECTION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.allowStudentSelection" + "'", str0.equals("model.option.allowStudentSelection"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.EuropeanNationType europeanNationType2 = new net.sf.freecol.common.model.EuropeanNationType("model.ability.mounted", specification1);
        try {
            java.util.List<net.sf.freecol.common.model.AbstractUnit> abstractUnitList3 = europeanNationType2.getStartingUnits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.String str0 = net.sf.freecol.common.model.ProductionType.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "production" + "'", str0.equals("production"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        net.sf.freecol.common.model.Player.ColonyValueCategory colonyValueCategory0 = net.sf.freecol.common.model.Player.ColonyValueCategory.A_EUROPE;
        org.junit.Assert.assertTrue("'" + colonyValueCategory0 + "' != '" + net.sf.freecol.common.model.Player.ColonyValueCategory.A_EUROPE + "'", colonyValueCategory0.equals(net.sf.freecol.common.model.Player.ColonyValueCategory.A_EUROPE));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.WAREHOUSE_CAPACITY;
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.WAREHOUSE_CAPACITY + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.WAREHOUSE_CAPACITY));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        net.sf.freecol.common.model.Europe.MigrationType migrationType0 = net.sf.freecol.common.model.Europe.MigrationType.NORMAL;
        org.junit.Assert.assertTrue("'" + migrationType0 + "' != '" + net.sf.freecol.common.model.Europe.MigrationType.NORMAL + "'", migrationType0.equals(net.sf.freecol.common.model.Europe.MigrationType.NORMAL));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.LAND_UNIT_CHEAT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.landUnitCheat" + "'", str0.equals("model.option.landUnitCheat"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        net.sf.freecol.common.model.Unit.UnitLabelType unitLabelType0 = net.sf.freecol.common.model.Unit.UnitLabelType.NATIONAL;
        org.junit.Assert.assertTrue("'" + unitLabelType0 + "' != '" + net.sf.freecol.common.model.Unit.UnitLabelType.NATIONAL + "'", unitLabelType0.equals(net.sf.freecol.common.model.Unit.UnitLabelType.NATIONAL));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Player player1 = null;
        net.sf.freecol.common.model.Tile tile2 = null;
        try {
            net.sf.freecol.common.model.PlayerExploredTile playerExploredTile3 = new net.sf.freecol.common.model.PlayerExploredTile(game0, player1, tile2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.EXPERT_PIONEER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.expertPioneer" + "'", str0.equals("model.ability.expertPioneer"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.Resource resource2 = new net.sf.freecol.common.model.Resource(game0, "id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=id) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileType tileType2 = new net.sf.freecol.common.model.TileType("ability", specification1);
        net.sf.freecol.common.model.FeatureContainer featureContainer4 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source6 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn7 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet8 = featureContainer4.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source6, turn7);
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet9 = tileType2.getAbilities("model.difficulty.cheat", (net.sf.freecol.common.model.FreeColGameObjectType) source6);
        net.sf.freecol.common.model.ResourceType resourceType10 = null;
        boolean boolean11 = tileType2.canHaveResourceType(resourceType10);
        net.sf.freecol.common.model.ProductionType productionType12 = null;
        net.sf.freecol.common.model.Specification specification14 = null;
        net.sf.freecol.common.model.GoodsType goodsType15 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification14);
        net.sf.freecol.common.model.UnitType unitType16 = null;
        try {
            int int17 = tileType2.getBaseProduction(productionType12, goodsType15, unitType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(source6);
        org.junit.Assert.assertNotNull(abilitySet8);
        org.junit.Assert.assertNotNull(abilitySet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.INDEPENDENCE;
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.INDEPENDENCE + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.INDEPENDENCE));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.String str0 = net.sf.freecol.common.model.Effect.LOSS_OF_TILE_PRODUCTION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.disaster.effect.lossOfTileProduction" + "'", str0.equals("model.disaster.effect.lossOfTileProduction"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DESTROY_SETTLEMENT;
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DESTROY_SETTLEMENT + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DESTROY_SETTLEMENT));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.String str0 = net.sf.freecol.common.model.Unit.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "unit" + "'", str0.equals("unit"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.String str0 = net.sf.freecol.common.model.Effect.LOSS_OF_UNIT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.disaster.effect.lossOfUnit" + "'", str0.equals("model.disaster.effect.lossOfUnit"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        net.sf.freecol.common.model.pathfinding.CostDecider costDecider0 = net.sf.freecol.common.model.pathfinding.CostDeciders.avoidIllegal();
        org.junit.Assert.assertNotNull(costDecider0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.BURIAL_GROUND;
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.BURIAL_GROUND + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.BURIAL_GROUND));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int int0 = net.sf.freecol.common.model.TileImprovement.LARGE_RIVER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        int int2 = net.sf.freecol.common.model.PathNode.getCost((-1), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider0 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getOurClosestSettlementGoalDecider();
        org.junit.Assert.assertNotNull(goalDecider0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.SOL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.SoL" + "'", str0.equals("model.modifier.SoL"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.EXPERT_SOLDIER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.expertSoldier" + "'", str0.equals("model.ability.expertSoldier"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.EXPLORE_LOST_CITY_RUMOUR;
        boolean boolean1 = moveType0.isProgress();
        boolean boolean2 = moveType0.isProgress();
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.EXPLORE_LOST_CITY_RUMOUR + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.EXPLORE_LOST_CITY_RUMOUR));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.MARKET_PRICES;
        java.lang.String str1 = messageType0.getNameKey();
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.MARKET_PRICES + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.MARKET_PRICES));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.messageType.marketPrices.name" + "'", str1.equals("model.messageType.marketPrices.name"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        net.sf.freecol.common.model.Game game0 = null;
        org.w3c.dom.Element element1 = null;
        try {
            net.sf.freecol.common.model.DiplomaticTrade diplomaticTrade2 = new net.sf.freecol.common.model.DiplomaticTrade(game0, element1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: XML failure");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.MarketData marketData2 = new net.sf.freecol.common.model.MarketData(game0, "model.ability.person");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=model.ability.person) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.STARTING_POSITIONS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.startingPositions" + "'", str0.equals("model.option.startingPositions"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.BAD_RUMOUR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.badRumour" + "'", str0.equals("model.option.badRumour"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.OFFENCE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.offence" + "'", str0.equals("model.modifier.offence"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        boolean boolean1 = net.sf.freecol.common.model.Europe.MigrationType.validMigrantSlot((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.String str0 = net.sf.freecol.common.model.FreeColGameObjectType.PRESERVE_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "preserve" + "'", str0.equals("preserve"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        net.sf.freecol.common.model.Stance stance0 = net.sf.freecol.common.model.Stance.PEACE;
        java.lang.String str1 = stance0.getStanceChangeKey();
        org.junit.Assert.assertTrue("'" + stance0 + "' != '" + net.sf.freecol.common.model.Stance.PEACE + "'", stance0.equals(net.sf.freecol.common.model.Stance.PEACE));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.player.stance.peace.declared" + "'", str1.equals("model.player.stance.peace.declared"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.TileImprovement tileImprovement2 = new net.sf.freecol.common.model.TileImprovement(game0, "model.ability.canBeEquipped");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=model.ability.canBeEquipped) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.GAMEOPTIONS_PRICES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "gameOptions.prices" + "'", str0.equals("gameOptions.prices"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String str0 = net.sf.freecol.common.model.Player.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "player" + "'", str0.equals("player"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        net.sf.freecol.common.model.NationOptions.NationState nationState0 = net.sf.freecol.common.model.NationOptions.NationState.AI_ONLY;
        java.lang.String str1 = nationState0.getShortDescriptionKey();
        org.junit.Assert.assertTrue("'" + nationState0 + "' != '" + net.sf.freecol.common.model.NationOptions.NationState.AI_ONLY + "'", nationState0.equals(net.sf.freecol.common.model.NationOptions.NationState.AI_ONLY));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.nationState.aiOnly.shortDescription" + "'", str1.equals("model.nationState.aiOnly.shortDescription"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String str0 = net.sf.freecol.common.model.FreeColGameObjectType.EXTENDS_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "extends" + "'", str0.equals("extends"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        net.sf.freecol.common.model.TypeCountMap<net.sf.freecol.common.model.NationType> nationTypeTypeCountMap0 = new net.sf.freecol.common.model.TypeCountMap<net.sf.freecol.common.model.NationType>();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int int2 = net.sf.freecol.common.model.PathNode.getCost((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        int int0 = net.sf.freecol.common.model.Colony.FAMINE_TURNS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.IGNORE_EUROPEAN_WARS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.ignoreEuropeanWars" + "'", str0.equals("model.ability.ignoreEuropeanWars"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.Comparator<net.sf.freecol.common.model.Unit> unitComparator0 = net.sf.freecol.common.model.Unit.typeRoleComparator;
        org.junit.Assert.assertNotNull(unitComparator0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.LOST_CITY_RUMOUR;
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.LOST_CITY_RUMOUR + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.LOST_CITY_RUMOUR));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        net.sf.freecol.common.model.Player.ColonyValueCategory colonyValueCategory0 = net.sf.freecol.common.model.Player.ColonyValueCategory.A_NEARBY;
        java.lang.String str1 = colonyValueCategory0.toString();
        org.junit.Assert.assertTrue("'" + colonyValueCategory0 + "' != '" + net.sf.freecol.common.model.Player.ColonyValueCategory.A_NEARBY + "'", colonyValueCategory0.equals(net.sf.freecol.common.model.Player.ColonyValueCategory.A_NEARBY));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "NEARBY" + "'", str1.equals("NEARBY"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.FreeColGameObjectType freeColGameObjectType3 = null;
        boolean boolean4 = stringTemplate1.hasAbility("model.option.maximumTax", freeColGameObjectType3);
        java.lang.String str6 = stringTemplate1.getSuffix("resource-type");
        net.sf.freecol.common.model.StringTemplate.TemplateType templateType7 = stringTemplate1.getTemplateType();
        org.junit.Assert.assertNotNull(stringTemplate1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + templateType7 + "' != '" + net.sf.freecol.common.model.StringTemplate.TemplateType.LABEL + "'", templateType7.equals(net.sf.freecol.common.model.StringTemplate.TemplateType.LABEL));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        net.sf.freecol.common.model.Colony colony0 = null;
        net.sf.freecol.common.model.ProductionCache productionCache1 = new net.sf.freecol.common.model.ProductionCache(colony0);
        net.sf.freecol.common.model.Specification specification3 = null;
        net.sf.freecol.common.model.GoodsType goodsType4 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification3);
        net.sf.freecol.common.model.Specification specification6 = null;
        net.sf.freecol.common.model.GoodsType goodsType7 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification6);
        net.sf.freecol.common.model.ProductionType productionType9 = new net.sf.freecol.common.model.ProductionType(goodsType4, goodsType7, (int) (short) 100);
        java.util.List<net.sf.freecol.common.model.GoodsType> goodsTypeList10 = goodsType7.getProductionChain();
        try {
            boolean boolean11 = productionCache1.isProducing(goodsType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(goodsTypeList10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader1 = null;
        try {
            net.sf.freecol.common.model.mission.ImprovementMission improvementMission2 = new net.sf.freecol.common.model.mission.ImprovementMission(game0, freeColXMLReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=null) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.lang.String str0 = net.sf.freecol.common.model.ColonyTile.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "colonyTile" + "'", str0.equals("colonyTile"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Comparator<net.sf.freecol.common.model.Role> roleComparator0 = net.sf.freecol.common.model.Role.militaryComparator;
        org.junit.Assert.assertNotNull(roleComparator0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.ColonyTile colonyTile2 = new net.sf.freecol.common.model.ColonyTile(game0, "model.modifier.breedingDivisor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=model.modifier.breedingDivisor) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        net.sf.freecol.common.model.Player.PlayerType playerType0 = net.sf.freecol.common.model.Player.PlayerType.COLONIAL;
        org.junit.Assert.assertTrue("'" + playerType0 + "' != '" + net.sf.freecol.common.model.Player.PlayerType.COLONIAL + "'", playerType0.equals(net.sf.freecol.common.model.Player.PlayerType.COLONIAL));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        net.sf.freecol.common.model.Unit unit0 = null;
        net.sf.freecol.common.model.TradeRouteStop tradeRouteStop1 = null;
        try {
            boolean boolean2 = net.sf.freecol.common.model.TradeRoute.isStopValid(unit0, tradeRouteStop1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        net.sf.freecol.common.model.DiplomaticTrade.TradeContext tradeContext0 = net.sf.freecol.common.model.DiplomaticTrade.TradeContext.TRIBUTE;
        org.junit.Assert.assertTrue("'" + tradeContext0 + "' != '" + net.sf.freecol.common.model.DiplomaticTrade.TradeContext.TRIBUTE + "'", tradeContext0.equals(net.sf.freecol.common.model.DiplomaticTrade.TradeContext.TRIBUTE));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.mission.ImprovementMission improvementMission1 = new net.sf.freecol.common.model.mission.ImprovementMission(game0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        net.sf.freecol.common.model.UnitType unitType0 = null;
        try {
            net.sf.freecol.common.model.AbstractUnit abstractUnit3 = new net.sf.freecol.common.model.AbstractUnit(unitType0, "model.direction.N.name", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.DIFFICULTY_IMMIGRATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.difficulty.immigration" + "'", str0.equals("model.difficulty.immigration"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.CONTINUE_FOUNDING_FATHER_RECRUITMENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.continueFoundingFatherRecruitment" + "'", str0.equals("model.option.continueFoundingFatherRecruitment"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.MULTIPLE_ATTACKS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.multipleAttacks" + "'", str0.equals("model.ability.multipleAttacks"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str0 = net.sf.freecol.common.model.Specification.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "freecol-specification" + "'", str0.equals("freecol-specification"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        net.sf.freecol.common.model.Ability ability2 = new net.sf.freecol.common.model.Ability("model.monarch.action.raiseTaxAct.header", false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        net.sf.freecol.common.model.FeatureContainer featureContainer0 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source2 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn3 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet4 = featureContainer0.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source2, turn3);
        java.lang.String str5 = source2.toString();
        org.junit.Assert.assertNotNull(source2);
        org.junit.Assert.assertNotNull(abilitySet4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "model.option.settlementLimitModifier" + "'", str5.equals("model.option.settlementLimitModifier"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.FLOWER;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.FLOWER + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.FLOWER));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int int0 = net.sf.freecol.common.model.Tile.RESOURCE_ZINDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 400 + "'", int0 == 400);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        int int0 = net.sf.freecol.common.model.Tension.TENSION_MAX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1100 + "'", int0 == 1100);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int int2 = net.sf.freecol.common.model.Turn.yearToTurn((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1254 + "'", int2 == 1254);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        net.sf.freecol.common.model.Ability[] abilityArray0 = new net.sf.freecol.common.model.Ability[] {};
        java.util.LinkedHashSet<net.sf.freecol.common.model.Ability> abilitySet1 = new java.util.LinkedHashSet<net.sf.freecol.common.model.Ability>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.Ability>) abilitySet1, abilityArray0);
        boolean boolean3 = net.sf.freecol.common.model.FeatureContainer.hasAbility((java.util.Set<net.sf.freecol.common.model.Ability>) abilitySet1);
        boolean boolean4 = net.sf.freecol.common.model.FeatureContainer.hasAbility((java.util.Set<net.sf.freecol.common.model.Ability>) abilitySet1);
        org.junit.Assert.assertNotNull(abilityArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.SAIL_HIGH_SEAS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.sailHighSeas" + "'", str0.equals("model.modifier.sailHighSeas"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.BUILDING_PRICE_BONUS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.buildingPriceBonus" + "'", str0.equals("model.modifier.buildingPriceBonus"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        net.sf.freecol.common.model.TradeRouteStop tradeRouteStop0 = null;
        try {
            net.sf.freecol.common.model.TradeRouteStop tradeRouteStop1 = new net.sf.freecol.common.model.TradeRouteStop(tradeRouteStop0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DISCOVER_REGION;
        java.lang.String str1 = historyEventType0.getNameKey();
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DISCOVER_REGION + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DISCOVER_REGION));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.historyEventType.discoverRegion.name" + "'", str1.equals("model.historyEventType.discoverRegion.name"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Tile tile1 = null;
        try {
            net.sf.freecol.common.model.TileItemContainer tileItemContainer2 = new net.sf.freecol.common.model.TileItemContainer(game0, tile1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.LEARN;
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.LEARN + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.LEARN));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        int int0 = net.sf.freecol.common.model.TileImprovement.SMALL_RIVER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        net.sf.freecol.common.model.Colony.NoBuildReason noBuildReason0 = net.sf.freecol.common.model.Colony.NoBuildReason.MISSING_BUILD_ABILITY;
        org.junit.Assert.assertTrue("'" + noBuildReason0 + "' != '" + net.sf.freecol.common.model.Colony.NoBuildReason.MISSING_BUILD_ABILITY + "'", noBuildReason0.equals(net.sf.freecol.common.model.Colony.NoBuildReason.MISSING_BUILD_ABILITY));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.COLONIST;
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.COLONIST + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.COLONIST));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider1 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getOurClosestSettlementGoalDecider();
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider2 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getOurClosestSettlementGoalDecider();
        net.sf.freecol.common.model.pathfinding.GoalDecider[] goalDeciderArray3 = new net.sf.freecol.common.model.pathfinding.GoalDecider[] { goalDecider1, goalDecider2 };
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider4 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getComposedGoalDecider(false, goalDeciderArray3);
        org.junit.Assert.assertNotNull(goalDecider1);
        org.junit.Assert.assertNotNull(goalDecider2);
        org.junit.Assert.assertNotNull(goalDeciderArray3);
        org.junit.Assert.assertNotNull(goalDecider4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        net.sf.freecol.common.model.Tile tile0 = null;
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider1 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getDisembarkGoalDecider(tile0);
        org.junit.Assert.assertNotNull(goalDecider1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.BOMBARD_BONUS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.bombardBonus" + "'", str0.equals("model.modifier.bombardBonus"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.Map map2 = new net.sf.freecol.common.model.Map(game0, "model.modifier.attackBonus");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=model.modifier.attackBonus) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.NO_SUCH_RUMOUR;
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.NO_SUCH_RUMOUR + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.NO_SUCH_RUMOUR));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        net.sf.freecol.common.model.Specification.Source source1 = new net.sf.freecol.common.model.Specification.Source("model.ability.ambushBonus");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.Tile tile2 = new net.sf.freecol.common.model.Tile(game0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.MINIMUM_COLONY_SIZE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.minimumColonySize" + "'", str0.equals("model.modifier.minimumColonySize"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int int0 = net.sf.freecol.common.model.Modifier.DISASTER_PRODUCTION_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.String str0 = net.sf.freecol.common.model.IndianSettlement.WANTED_GOODS_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "wantedGoods" + "'", str0.equals("wantedGoods"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        net.sf.freecol.common.model.TileTypeChange tileTypeChange0 = new net.sf.freecol.common.model.TileTypeChange();
        net.sf.freecol.common.model.AbstractGoods abstractGoods1 = null;
        tileTypeChange0.setProduction(abstractGoods1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.mission.ImprovementMission improvementMission2 = new net.sf.freecol.common.model.mission.ImprovementMission(game0, "type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=type) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.PlayerExploredTile playerExploredTile2 = new net.sf.freecol.common.model.PlayerExploredTile(game0, "freecol-specification");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=freecol-specification) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

//    @Test
//    public void test292() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test292");
//        net.sf.freecol.common.model.TileType tileType0 = net.sf.freecol.common.model.TileType.WATER;
//        java.lang.String str1 = tileType0.getDescriptionKey();
//        org.w3c.dom.Document document2 = null;
//        java.lang.String[] strArray9 = new java.lang.String[] { "Attempt to interact with natives before contact", "id", "type", "model.disaster.effect.lossOfUnit", "", "goodsTradeItem" };
//        try {
//            org.w3c.dom.Element element10 = tileType0.toXMLElementPartial(document2, strArray9);
//            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Parse fail");
//        } catch (java.lang.RuntimeException e) {
//        }
//        org.junit.Assert.assertNotNull(tileType0);
//        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "WATER.description" + "'", str1.equals("WATER.description"));
//        org.junit.Assert.assertNotNull(strArray9);
//    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.String str0 = net.sf.freecol.common.model.TileImprovement.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tileImprovement" + "'", str0.equals("tileImprovement"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.w3c.dom.Element element0 = null;
        try {
            net.sf.freecol.common.model.HistoryEvent historyEvent1 = new net.sf.freecol.common.model.HistoryEvent(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: XML failure");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.StringTemplate stringTemplate3 = stringTemplate1.add("founding-father");
        net.sf.freecol.common.model.Specification specification5 = null;
        net.sf.freecol.common.model.GoodsType goodsType6 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification5);
        net.sf.freecol.common.model.Specification specification8 = null;
        net.sf.freecol.common.model.GoodsType goodsType9 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification8);
        net.sf.freecol.common.model.ProductionType productionType11 = new net.sf.freecol.common.model.ProductionType(goodsType6, goodsType9, (int) (short) 100);
        java.util.List<net.sf.freecol.common.model.GoodsType> goodsTypeList12 = goodsType9.getProductionChain();
        int int13 = net.sf.freecol.common.model.FreeColObject.compareIds((net.sf.freecol.common.model.FreeColObject) stringTemplate3, (net.sf.freecol.common.model.FreeColObject) goodsType9);
        net.sf.freecol.common.model.AbstractGoods abstractGoods15 = new net.sf.freecol.common.model.AbstractGoods(goodsType9, (int) (short) 100);
        net.sf.freecol.common.model.Player player16 = null;
        try {
            int int17 = abstractGoods15.evaluateFor(player16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stringTemplate1);
        org.junit.Assert.assertNotNull(stringTemplate3);
        org.junit.Assert.assertNotNull(goodsTypeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-20) + "'", int13 == (-20));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        net.sf.freecol.common.model.Tension.Level level0 = net.sf.freecol.common.model.Tension.Level.ANGRY;
        int int1 = level0.getLimit();
        org.junit.Assert.assertTrue("'" + level0 + "' != '" + net.sf.freecol.common.model.Tension.Level.ANGRY + "'", level0.equals(net.sf.freecol.common.model.Tension.Level.ANGRY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 800 + "'", int1 == 800);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.TREASURE_TRANSPORT_FEE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.treasureTransportFee" + "'", str0.equals("model.option.treasureTransportFee"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String str0 = net.sf.freecol.common.model.TradeRouteStop.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tradeRouteStop" + "'", str0.equals("tradeRouteStop"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        net.sf.freecol.common.model.AbstractUnit abstractUnit0 = new net.sf.freecol.common.model.AbstractUnit();
        net.sf.freecol.common.model.AbstractUnit[] abstractUnitArray1 = new net.sf.freecol.common.model.AbstractUnit[] { abstractUnit0 };
        java.util.ArrayList<net.sf.freecol.common.model.AbstractUnit> abstractUnitList2 = new java.util.ArrayList<net.sf.freecol.common.model.AbstractUnit>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.AbstractUnit>) abstractUnitList2, abstractUnitArray1);
        java.util.List<net.sf.freecol.common.model.AbstractUnit> abstractUnitList4 = net.sf.freecol.common.model.AbstractUnit.deepCopy((java.util.List<net.sf.freecol.common.model.AbstractUnit>) abstractUnitList2);
        org.junit.Assert.assertNotNull(abstractUnitArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(abstractUnitList4);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_DEMOTED;
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_DEMOTED + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_DEMOTED));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.lang.String str0 = net.sf.freecol.common.model.Unit.CARGO_CHANGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CARGO_CHANGE" + "'", str0.equals("CARGO_CHANGE"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        net.sf.freecol.common.model.Specification.Source source0 = net.sf.freecol.common.model.Specification.ARTILLERY_PENALTY_SOURCE;
        org.junit.Assert.assertNotNull(source0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Tile tile1 = null;
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType2 = net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES;
        java.lang.String str4 = rumourType2.getAlternateDescriptionKey("TILE_UNIT_CHANGE");
        java.lang.String str6 = rumourType2.getAlternateDescriptionKey("model.ability.canBeEquipped");
        try {
            net.sf.freecol.common.model.LostCityRumour lostCityRumour8 = new net.sf.freecol.common.model.LostCityRumour(game0, tile1, rumourType2, "europe");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + rumourType2 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES + "'", rumourType2.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "model.lostCityRumour.expeditionVanishes.TILE_UNIT_CHANGE.description" + "'", str4.equals("model.lostCityRumour.expeditionVanishes.TILE_UNIT_CHANGE.description"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "model.lostCityRumour.expeditionVanishes.model.ability.canBeEquipped.description" + "'", str6.equals("model.lostCityRumour.expeditionVanishes.model.ability.canBeEquipped.description"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        boolean boolean1 = net.sf.freecol.common.model.Role.isDefaultRoleId("model.lostCityRumour.expeditionVanishes.model.ability.canBeEquipped.description");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.CONTINENT;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.CONTINENT + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.CONTINENT));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        net.sf.freecol.common.model.Map.Layer layer0 = net.sf.freecol.common.model.Map.Layer.RIVERS;
        org.junit.Assert.assertTrue("'" + layer0 + "' != '" + net.sf.freecol.common.model.Map.Layer.RIVERS + "'", layer0.equals(net.sf.freecol.common.model.Map.Layer.RIVERS));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.BUILD_ON_NATIVE_LAND_FIRST_AND_UNCONTACTED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.buildOnNativeLand.firstAndUncontacted" + "'", str0.equals("model.option.buildOnNativeLand.firstAndUncontacted"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.LOWER_CAP_INCREASE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.lowerCapIncrease" + "'", str0.equals("model.option.lowerCapIncrease"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        net.sf.freecol.common.model.DiplomaticTrade.TradeContext tradeContext0 = net.sf.freecol.common.model.DiplomaticTrade.TradeContext.DIPLOMATIC;
        org.junit.Assert.assertTrue("'" + tradeContext0 + "' != '" + net.sf.freecol.common.model.DiplomaticTrade.TradeContext.DIPLOMATIC + "'", tradeContext0.equals(net.sf.freecol.common.model.DiplomaticTrade.TradeContext.DIPLOMATIC));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_GOODS;
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_GOODS + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_GOODS));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        net.sf.freecol.common.model.Game game0 = null;
        org.w3c.dom.Element element1 = null;
        try {
            net.sf.freecol.common.model.Goods goods2 = new net.sf.freecol.common.model.Goods(game0, element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.LostCityRumour lostCityRumour2 = new net.sf.freecol.common.model.LostCityRumour(game0, "gameOptions.years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=gameOptions.years) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        net.sf.freecol.common.model.Unit.UnitState unitState0 = net.sf.freecol.common.model.Unit.UnitState.IMPROVING;
        org.junit.Assert.assertTrue("'" + unitState0 + "' != '" + net.sf.freecol.common.model.Unit.UnitState.IMPROVING + "'", unitState0.equals(net.sf.freecol.common.model.Unit.UnitState.IMPROVING));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        net.sf.freecol.common.model.Tension.Level level0 = net.sf.freecol.common.model.Tension.Level.DISPLEASED;
        org.junit.Assert.assertTrue("'" + level0 + "' != '" + net.sf.freecol.common.model.Tension.Level.DISPLEASED + "'", level0.equals(net.sf.freecol.common.model.Tension.Level.DISPLEASED));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        net.sf.freecol.common.model.Specification.Source source0 = net.sf.freecol.common.model.Specification.BASE_OFFENCE_SOURCE;
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        source0.addPropertyChangeListener("", propertyChangeListener2);
        org.junit.Assert.assertNotNull(source0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        net.sf.freecol.common.model.Player.NoValueType noValueType0 = net.sf.freecol.common.model.Player.NoValueType.TERRAIN;
        org.junit.Assert.assertTrue("'" + noValueType0 + "' != '" + net.sf.freecol.common.model.Player.NoValueType.TERRAIN + "'", noValueType0.equals(net.sf.freecol.common.model.Player.NoValueType.TERRAIN));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.FORM_ALLIANCE;
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.FORM_ALLIANCE + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.FORM_ALLIANCE));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES;
        java.lang.String str1 = rumourType0.getDescriptionKey();
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.lostCityRumour.expeditionVanishes.description" + "'", str1.equals("model.lostCityRumour.expeditionVanishes.description"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        net.sf.freecol.common.model.Location[] locationArray0 = new net.sf.freecol.common.model.Location[] {};
        java.util.ArrayList<net.sf.freecol.common.model.Location> locationList1 = new java.util.ArrayList<net.sf.freecol.common.model.Location>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.Location>) locationList1, locationArray0);
        net.sf.freecol.common.model.pathfinding.GoalDeciders.MultipleAdjacentDecider multipleAdjacentDecider3 = new net.sf.freecol.common.model.pathfinding.GoalDeciders.MultipleAdjacentDecider((java.util.List<net.sf.freecol.common.model.Location>) locationList1);
        org.junit.Assert.assertNotNull(locationArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.GOOD_RUMOUR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.goodRumour" + "'", str0.equals("model.option.goodRumour"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.DIFFICULTY_MONARCH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.difficulty.monarch" + "'", str0.equals("model.difficulty.monarch"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        net.sf.freecol.common.model.UnitTypeChange.ChangeType changeType0 = net.sf.freecol.common.model.UnitTypeChange.ChangeType.INDEPENDENCE;
        org.junit.Assert.assertTrue("'" + changeType0 + "' != '" + net.sf.freecol.common.model.UnitTypeChange.ChangeType.INDEPENDENCE + "'", changeType0.equals(net.sf.freecol.common.model.UnitTypeChange.ChangeType.INDEPENDENCE));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        net.sf.freecol.common.model.Location location0 = null;
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider1 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getLocationGoalDecider(location0);
        org.junit.Assert.assertNotNull(goalDecider1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        net.sf.freecol.common.model.Operand operand1 = null;
        net.sf.freecol.common.model.Limit.Operator operator2 = net.sf.freecol.common.model.Limit.Operator.GE;
        net.sf.freecol.common.model.Operand operand3 = null;
        net.sf.freecol.common.model.Limit limit4 = new net.sf.freecol.common.model.Limit("model.option.enhancedMissionaries", operand1, operator2, operand3);
        net.sf.freecol.common.model.Settlement settlement5 = null;
        try {
            boolean boolean6 = limit4.evaluate(settlement5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + operator2 + "' != '" + net.sf.freecol.common.model.Limit.Operator.GE + "'", operator2.equals(net.sf.freecol.common.model.Limit.Operator.GE));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Location location1 = null;
        try {
            net.sf.freecol.common.model.TradeRouteStop tradeRouteStop2 = new net.sf.freecol.common.model.TradeRouteStop(game0, location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DECLARE_WAR;
        java.lang.String str1 = historyEventType0.getNameKey();
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DECLARE_WAR + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DECLARE_WAR));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.historyEventType.declareWar.name" + "'", str1.equals("model.historyEventType.declareWar.name"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        int int0 = net.sf.freecol.common.model.Tension.ALLIANCE_MODIFIER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-500) + "'", int0 == (-500));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.awt.Color color0 = net.sf.freecol.common.model.Nation.UNKNOWN_NATION_COLOR;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.IndianSettlement indianSettlement2 = new net.sf.freecol.common.model.IndianSettlement(game0, "[Occupation null]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=[Occupation null]) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        net.sf.freecol.common.model.Direction direction0 = net.sf.freecol.common.model.Direction.NW;
        net.sf.freecol.common.model.Direction direction1 = direction0.getReverseDirection();
        java.lang.String str2 = direction0.getKey();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + net.sf.freecol.common.model.Direction.NW + "'", direction0.equals(net.sf.freecol.common.model.Direction.NW));
        org.junit.Assert.assertTrue("'" + direction1 + "' != '" + net.sf.freecol.common.model.Direction.SE + "'", direction1.equals(net.sf.freecol.common.model.Direction.SE));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "direction.NW" + "'", str2.equals("direction.NW"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileImprovementType tileImprovementType2 = new net.sf.freecol.common.model.TileImprovementType("model.ability.carryUnits", specification1);
        int int3 = tileImprovementType2.getAddWorkTurns();
        net.sf.freecol.common.model.Specification specification5 = null;
        net.sf.freecol.common.model.TileType tileType6 = new net.sf.freecol.common.model.TileType("ability", specification5);
        net.sf.freecol.common.model.FeatureContainer featureContainer8 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source10 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn11 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet12 = featureContainer8.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source10, turn11);
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet13 = tileType6.getAbilities("model.difficulty.cheat", (net.sf.freecol.common.model.FreeColGameObjectType) source10);
        net.sf.freecol.common.model.ResourceType resourceType14 = null;
        boolean boolean15 = tileType6.canHaveResourceType(resourceType14);
        boolean boolean16 = tileType6.isElevation();
        boolean boolean17 = tileImprovementType2.changeContainsTarget(tileType6);
        net.sf.freecol.common.model.Tile tile18 = null;
        net.sf.freecol.common.model.Specification specification20 = null;
        net.sf.freecol.common.model.GoodsType goodsType21 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification20);
        net.sf.freecol.common.model.Specification specification23 = null;
        net.sf.freecol.common.model.GoodsType goodsType24 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification23);
        net.sf.freecol.common.model.ProductionType productionType26 = new net.sf.freecol.common.model.ProductionType(goodsType21, goodsType24, (int) (short) 100);
        try {
            int int27 = tileImprovementType2.getImprovementValue(tile18, goodsType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(source10);
        org.junit.Assert.assertNotNull(abilitySet12);
        org.junit.Assert.assertNotNull(abilitySet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        net.sf.freecol.common.model.Player.NoClaimReason noClaimReason0 = net.sf.freecol.common.model.Player.NoClaimReason.OCCUPIED;
        org.junit.Assert.assertTrue("'" + noClaimReason0 + "' != '" + net.sf.freecol.common.model.Player.NoClaimReason.OCCUPIED + "'", noClaimReason0.equals(net.sf.freecol.common.model.Player.NoClaimReason.OCCUPIED));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        net.sf.freecol.common.model.Operand operand1 = null;
        net.sf.freecol.common.model.Limit.Operator operator2 = net.sf.freecol.common.model.Limit.Operator.GE;
        net.sf.freecol.common.model.Operand operand3 = null;
        net.sf.freecol.common.model.Limit limit4 = new net.sf.freecol.common.model.Limit("model.option.enhancedMissionaries", operand1, operator2, operand3);
        net.sf.freecol.common.model.Game game5 = null;
        try {
            boolean boolean6 = limit4.evaluate(game5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + operator2 + "' != '" + net.sf.freecol.common.model.Limit.Operator.GE + "'", operator2.equals(net.sf.freecol.common.model.Limit.Operator.GE));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        int int0 = net.sf.freecol.common.model.Tile.RUMOUR_ZINDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.CAN_RECRUIT_UNIT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.canRecruitUnit" + "'", str0.equals("model.ability.canRecruitUnit"));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.BOMBARD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.bombard" + "'", str0.equals("model.ability.bombard"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.lang.String str0 = net.sf.freecol.common.model.GoodsType.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "goods-type" + "'", str0.equals("goods-type"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        net.sf.freecol.common.model.Direction direction1 = net.sf.freecol.common.model.Direction.angleToDirection((double) 0.0f);
        java.util.logging.Logger logger3 = null;
        java.util.Random random4 = null;
        try {
            net.sf.freecol.common.model.Direction[] directionArray5 = direction1.getClosestDirections("production", logger3, random4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction1 + "' != '" + net.sf.freecol.common.model.Direction.N + "'", direction1.equals(net.sf.freecol.common.model.Direction.N));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.lang.String str0 = net.sf.freecol.common.model.FreeColObject.getXMLElementTagName();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.BORN_IN_COLONY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.bornInColony" + "'", str0.equals("model.ability.bornInColony"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int int0 = net.sf.freecol.common.model.IndianSettlement.TRADE_MINIMUM_PRICE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        net.sf.freecol.common.model.UnitType unitType0 = null;
        net.sf.freecol.common.model.UnitType unitType1 = null;
        try {
            net.sf.freecol.common.model.UnitType unitType2 = net.sf.freecol.common.model.Unit.getUnitTypeTeaching(unitType0, unitType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        net.sf.freecol.common.model.Player.NoValueType noValueType0 = net.sf.freecol.common.model.Player.NoValueType.INLAND;
        org.junit.Assert.assertTrue("'" + noValueType0 + "' != '" + net.sf.freecol.common.model.Player.NoValueType.INLAND + "'", noValueType0.equals(net.sf.freecol.common.model.Player.NoValueType.INLAND));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        net.sf.freecol.common.model.Monarch.MonarchAction monarchAction0 = net.sf.freecol.common.model.Monarch.MonarchAction.DECLARE_WAR;
        org.junit.Assert.assertTrue("'" + monarchAction0 + "' != '" + net.sf.freecol.common.model.Monarch.MonarchAction.DECLARE_WAR + "'", monarchAction0.equals(net.sf.freecol.common.model.Monarch.MonarchAction.DECLARE_WAR));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileImprovementType tileImprovementType2 = new net.sf.freecol.common.model.TileImprovementType("model.ability.carryUnits", specification1);
        java.lang.String str3 = tileImprovementType2.serialize();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<tile-improvement-type id=\"model.ability.carryUnits\" natural=\"false\" magnitude=\"0\" add-work-turns=\"0\" movement-cost=\"-1\" zIndex=\"0\" expose-resource-percent=\"0\"></tile-improvement-type>" + "'", str3.equals("<tile-improvement-type id=\"model.ability.carryUnits\" natural=\"false\" magnitude=\"0\" add-work-turns=\"0\" movement-cost=\"-1\" zIndex=\"0\" expose-resource-percent=\"0\"></tile-improvement-type>"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        net.sf.freecol.common.model.FeatureContainer featureContainer0 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source2 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn3 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet4 = featureContainer0.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source2, turn3);
        net.sf.freecol.common.model.Ability ability5 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        boolean boolean6 = featureContainer0.addAbility(ability5);
        net.sf.freecol.common.model.StringTemplate stringTemplate8 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.FreeColGameObjectType freeColGameObjectType10 = null;
        boolean boolean11 = stringTemplate8.hasAbility("model.option.maximumTax", freeColGameObjectType10);
        net.sf.freecol.common.model.StringTemplate stringTemplate13 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.FreeColGameObjectType freeColGameObjectType15 = null;
        boolean boolean16 = stringTemplate13.hasAbility("model.option.maximumTax", freeColGameObjectType15);
        int int17 = net.sf.freecol.common.model.FreeColObject.compareIds((net.sf.freecol.common.model.FreeColObject) stringTemplate8, (net.sf.freecol.common.model.FreeColObject) stringTemplate13);
        featureContainer0.removeFeatures((net.sf.freecol.common.model.FreeColObject) stringTemplate13);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray20 = stringTemplate13.getPropertyChangeListeners("model.ability.expertsUseConnections");
        org.junit.Assert.assertNotNull(source2);
        org.junit.Assert.assertNotNull(abilitySet4);
        org.junit.Assert.assertNotNull(ability5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stringTemplate8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringTemplate13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray20);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        net.sf.freecol.common.model.Player.NoClaimReason noClaimReason0 = net.sf.freecol.common.model.Player.NoClaimReason.NONE;
        org.junit.Assert.assertTrue("'" + noClaimReason0 + "' != '" + net.sf.freecol.common.model.Player.NoClaimReason.NONE + "'", noClaimReason0.equals(net.sf.freecol.common.model.Player.NoClaimReason.NONE));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        net.sf.freecol.common.model.Tension.Level level0 = net.sf.freecol.common.model.Tension.Level.HAPPY;
        org.junit.Assert.assertTrue("'" + level0 + "' != '" + net.sf.freecol.common.model.Tension.Level.HAPPY + "'", level0.equals(net.sf.freecol.common.model.Tension.Level.HAPPY));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.MOVEMENT_BONUS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.movementBonus" + "'", str0.equals("model.modifier.movementBonus"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.FOUND_COLONY_DURING_REBELLION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.foundColonyDuringRebellion" + "'", str0.equals("model.option.foundColonyDuringRebellion"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.BUILDING_COMPLETED;
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.BUILDING_COMPLETED + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.BUILDING_COMPLETED));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.CONSUME_ALL_OR_NOTHING;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.consumeAllOrNothing" + "'", str0.equals("model.ability.consumeAllOrNothing"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.INTERVENTION_FORCE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.interventionForce" + "'", str0.equals("model.option.interventionForce"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DECLARE_INDEPENDENCE;
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DECLARE_INDEPENDENCE + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DECLARE_INDEPENDENCE));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader0 = null;
        net.sf.freecol.common.model.Specification specification1 = null;
        try {
            net.sf.freecol.common.model.Modifier modifier2 = new net.sf.freecol.common.model.Modifier(freeColXMLReader0, specification1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.StringTemplate stringTemplate3 = stringTemplate1.add("founding-father");
        java.util.List<net.sf.freecol.common.model.StringTemplate> stringTemplateList4 = stringTemplate1.getReplacements();
        org.w3c.dom.Element element5 = null;
        try {
            stringTemplate1.readFromXMLElement(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: XML failure");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(stringTemplate1);
        org.junit.Assert.assertNotNull(stringTemplate3);
        org.junit.Assert.assertNotNull(stringTemplateList4);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        net.sf.freecol.common.model.Specification.Source source0 = net.sf.freecol.common.model.Specification.ATTACK_BONUS_SOURCE;
        org.junit.Assert.assertNotNull(source0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        int int0 = net.sf.freecol.common.model.Modifier.BASE_COMBAT_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Player player1 = null;
        try {
            net.sf.freecol.common.model.Market market2 = new net.sf.freecol.common.model.Market(game0, player1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.TRADE_VOLUME_PENALTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.tradeVolumePenalty" + "'", str0.equals("model.modifier.tradeVolumePenalty"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.lang.String str0 = net.sf.freecol.common.model.Effect.LOSS_OF_BUILDING;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.disaster.effect.lossOfBuilding" + "'", str0.equals("model.disaster.effect.lossOfBuilding"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.MISSING_GOODS;
        net.sf.freecol.common.model.FreeColGameObject freeColGameObject3 = null;
        try {
            net.sf.freecol.common.model.ModelMessage modelMessage4 = new net.sf.freecol.common.model.ModelMessage(messageType0, "model.option.maximumTax", "gameOptions.map", freeColGameObject3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.MISSING_GOODS + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.MISSING_GOODS));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        net.sf.freecol.common.model.pathfinding.CostDecider costDecider0 = net.sf.freecol.common.model.pathfinding.CostDeciders.avoidSettlementsAndBlockingUnits();
        org.junit.Assert.assertNotNull(costDecider0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader0 = null;
        net.sf.freecol.common.model.Specification specification1 = null;
        try {
            net.sf.freecol.common.model.ProductionType productionType2 = new net.sf.freecol.common.model.ProductionType(freeColXMLReader0, specification1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        net.sf.freecol.common.model.pathfinding.CostDecider costDecider0 = net.sf.freecol.common.model.pathfinding.CostDeciders.numberOfTiles();
        org.junit.Assert.assertNotNull(costDecider0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        int int0 = net.sf.freecol.common.model.Europe.MigrationType.getMigrantCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.RUINS;
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.RUINS + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.RUINS));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        int int0 = net.sf.freecol.common.model.TileImprovement.FJORD_RIVER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        net.sf.freecol.common.model.Player.NoValueType noValueType0 = net.sf.freecol.common.model.Player.NoValueType.POLAR;
        int int1 = noValueType0.getValue();
        org.junit.Assert.assertTrue("'" + noValueType0 + "' != '" + net.sf.freecol.common.model.Player.NoValueType.POLAR + "'", noValueType0.equals(net.sf.freecol.common.model.Player.NoValueType.POLAR));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.EXPLORE_LOST_CITY_RUMOUR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.exploreLostCityRumour" + "'", str0.equals("model.modifier.exploreLostCityRumour"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        net.sf.freecol.common.model.Monarch.MonarchAction monarchAction0 = net.sf.freecol.common.model.Monarch.MonarchAction.RAISE_TAX_ACT;
        java.lang.String str1 = monarchAction0.getHeaderKey();
        java.lang.String str2 = monarchAction0.getNoKey();
        java.lang.String str3 = monarchAction0.getHeaderKey();
        java.lang.String str4 = monarchAction0.getYesKey();
        org.junit.Assert.assertTrue("'" + monarchAction0 + "' != '" + net.sf.freecol.common.model.Monarch.MonarchAction.RAISE_TAX_ACT + "'", monarchAction0.equals(net.sf.freecol.common.model.Monarch.MonarchAction.RAISE_TAX_ACT));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.monarch.action.raiseTaxAct.header" + "'", str1.equals("model.monarch.action.raiseTaxAct.header"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "model.monarch.action.raiseTaxAct.no" + "'", str2.equals("model.monarch.action.raiseTaxAct.no"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "model.monarch.action.raiseTaxAct.header" + "'", str3.equals("model.monarch.action.raiseTaxAct.header"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "model.monarch.action.raiseTaxAct.yes" + "'", str4.equals("model.monarch.action.raiseTaxAct.yes"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        net.sf.freecol.common.model.Ability[] abilityArray0 = new net.sf.freecol.common.model.Ability[] {};
        java.util.LinkedHashSet<net.sf.freecol.common.model.Ability> abilitySet1 = new java.util.LinkedHashSet<net.sf.freecol.common.model.Ability>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.Ability>) abilitySet1, abilityArray0);
        boolean boolean3 = net.sf.freecol.common.model.FeatureContainer.hasAbility((java.util.Set<net.sf.freecol.common.model.Ability>) abilitySet1);
        net.sf.freecol.common.util.LogBuilder logBuilder4 = null;
        try {
            net.sf.freecol.common.model.FreeColObject.logFreeColObjects((java.util.Collection<net.sf.freecol.common.model.Ability>) abilitySet1, logBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(abilityArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.CAPTURE_GOODS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.captureGoods" + "'", str0.equals("model.ability.captureGoods"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        boolean boolean1 = net.sf.freecol.common.model.Europe.MigrationType.specificMigrantSlot((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        int int0 = net.sf.freecol.common.model.UnitType.DEFAULT_OFFENCE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.CONQUER_COLONY;
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.CONQUER_COLONY + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.CONQUER_COLONY));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.lang.String str1 = net.sf.freecol.common.model.Role.getRoleSuffix("preserve");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "preserve" + "'", str1.equals("preserve"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.Region region2 = new net.sf.freecol.common.model.Region(game0, "model.player.stance.peace.others");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=model.player.stance.peace.others) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        net.sf.freecol.common.model.Game game0 = null;
        org.w3c.dom.Element element1 = null;
        try {
            net.sf.freecol.common.model.mission.CompoundMission compoundMission2 = new net.sf.freecol.common.model.mission.CompoundMission(game0, element1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=null) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        net.sf.freecol.common.model.Specification.Source source0 = net.sf.freecol.common.model.Specification.FORTIFICATION_BONUS_SOURCE;
        org.junit.Assert.assertNotNull(source0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        net.sf.freecol.common.model.Limit.Operator operator0 = net.sf.freecol.common.model.Limit.Operator.LT;
        org.junit.Assert.assertTrue("'" + operator0 + "' != '" + net.sf.freecol.common.model.Limit.Operator.LT + "'", operator0.equals(net.sf.freecol.common.model.Limit.Operator.LT));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        net.sf.freecol.common.model.BuildQueue.CompletionAction completionAction0 = net.sf.freecol.common.model.BuildQueue.CompletionAction.ADD_RANDOM;
        org.junit.Assert.assertTrue("'" + completionAction0 + "' != '" + net.sf.freecol.common.model.BuildQueue.CompletionAction.ADD_RANDOM + "'", completionAction0.equals(net.sf.freecol.common.model.BuildQueue.CompletionAction.ADD_RANDOM));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        boolean boolean1 = net.sf.freecol.common.model.Europe.MigrationType.validMigrantSlot((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        boolean boolean1 = net.sf.freecol.common.model.Europe.MigrationType.unspecificMigrantSlot(50);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.SPANISH_SUCCESSION;
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.SPANISH_SUCCESSION + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.SPANISH_SUCCESSION));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Tile tile1 = null;
        net.sf.freecol.common.model.ResourceType resourceType2 = null;
        try {
            net.sf.freecol.common.model.Resource resource3 = new net.sf.freecol.common.model.Resource(game0, tile1, resourceType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.BIG_MOVEMENT_PENALTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.bigMovementPenalty" + "'", str0.equals("model.modifier.bigMovementPenalty"));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        net.sf.freecol.common.model.UnitTypeChange unitTypeChange0 = new net.sf.freecol.common.model.UnitTypeChange();
        unitTypeChange0.setTurnsToLearn(50);
        boolean boolean3 = unitTypeChange0.canBeTaught();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        net.sf.freecol.common.model.Monarch.MonarchAction monarchAction0 = net.sf.freecol.common.model.Monarch.MonarchAction.SUPPORT_SEA;
        org.junit.Assert.assertTrue("'" + monarchAction0 + "' != '" + net.sf.freecol.common.model.Monarch.MonarchAction.SUPPORT_SEA + "'", monarchAction0.equals(net.sf.freecol.common.model.Monarch.MonarchAction.SUPPORT_SEA));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileType tileType2 = new net.sf.freecol.common.model.TileType("model.ability.speakWithChief", specification1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        net.sf.freecol.common.model.Tension.Level level0 = net.sf.freecol.common.model.Tension.Level.HATEFUL;
        org.junit.Assert.assertTrue("'" + level0 + "' != '" + net.sf.freecol.common.model.Tension.Level.HATEFUL + "'", level0.equals(net.sf.freecol.common.model.Tension.Level.HATEFUL));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        int int0 = net.sf.freecol.common.model.Tension.SURRENDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 350 + "'", int0 == 350);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader0 = null;
        try {
            net.sf.freecol.common.model.ModelMessage modelMessage1 = new net.sf.freecol.common.model.ModelMessage(freeColXMLReader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        net.sf.freecol.common.model.TileType.RangeType rangeType0 = net.sf.freecol.common.model.TileType.RangeType.ALTITUDE;
        org.junit.Assert.assertTrue("'" + rangeType0 + "' != '" + net.sf.freecol.common.model.TileType.RangeType.ALTITUDE + "'", rangeType0.equals(net.sf.freecol.common.model.TileType.RangeType.ALTITUDE));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.EuropeanNationType europeanNationType2 = new net.sf.freecol.common.model.EuropeanNationType("model.ability.mounted", specification1);
        net.sf.freecol.common.model.SettlementType settlementType3 = europeanNationType2.getCapitalType();
        java.lang.String str4 = europeanNationType2.getXMLTagName();
        org.junit.Assert.assertNull(settlementType3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "european-nation-type" + "'", str4.equals("european-nation-type"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileImprovementType tileImprovementType2 = new net.sf.freecol.common.model.TileImprovementType("colonyTile", specification1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        net.sf.freecol.common.model.Specification.Source source0 = net.sf.freecol.common.model.Specification.INDIAN_RAID_BONUS_SOURCE;
        org.junit.Assert.assertNotNull(source0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        int int0 = net.sf.freecol.common.model.Unit.MANY_TURNS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000 + "'", int0 == 10000);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.DRESS_MISSIONARY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.dressMissionary" + "'", str0.equals("model.ability.dressMissionary"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileImprovementType tileImprovementType2 = new net.sf.freecol.common.model.TileImprovementType("model.ability.carryUnits", specification1);
        boolean boolean3 = tileImprovementType2.isChangeType();
        net.sf.freecol.common.model.TileType tileType4 = net.sf.freecol.common.model.TileType.WATER;
        java.lang.String str5 = tileType4.getXMLTagName();
        boolean boolean6 = tileImprovementType2.changeContainsTarget(tileType4);
        tileType4.internId("roles-compat.xml");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tileType4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tile-type" + "'", str5.equals("tile-type"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.Role role2 = new net.sf.freecol.common.model.Role("europe", specification1);
        boolean boolean4 = role2.hasModifier("");
        java.util.List<net.sf.freecol.common.model.Limit> limitList5 = role2.getLimits();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(limitList5);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.mission.GoToMission goToMission1 = new net.sf.freecol.common.model.mission.GoToMission(game0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        int int0 = net.sf.freecol.common.model.Tile.FOREST_ZINDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200 + "'", int0 == 200);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.lang.String str0 = net.sf.freecol.common.model.Specification.DEFAULT_ROLE_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.role.default" + "'", str0.equals("model.role.default"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        net.sf.freecol.common.model.Operand operand0 = new net.sf.freecol.common.model.Operand();
        java.lang.String str1 = operand0.getType();
        java.lang.String str2 = operand0.getMethodValue();
        net.sf.freecol.common.model.Settlement settlement3 = null;
        java.lang.Integer int4 = operand0.getValue(settlement3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        net.sf.freecol.common.model.Player player0 = null;
        net.sf.freecol.common.model.Player.UnitPredicate unitPredicate1 = null;
        try {
            net.sf.freecol.common.model.Player.UnitIterator unitIterator2 = new net.sf.freecol.common.model.Player.UnitIterator(player0, unitPredicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.LandMap landMap1 = new net.sf.freecol.common.model.LandMap(game0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        int int0 = net.sf.freecol.common.model.Monarch.MONARCH_MINIMUM_PRICE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200 + "'", int0 == 200);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.Disaster disaster2 = new net.sf.freecol.common.model.Disaster("model.ability.pillageUnprotectedColony", specification1);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.NOTHING;
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.NOTHING + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.NOTHING));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        net.sf.freecol.common.model.FoundingFather.FoundingFatherType foundingFatherType0 = net.sf.freecol.common.model.FoundingFather.FoundingFatherType.MILITARY;
        org.junit.Assert.assertTrue("'" + foundingFatherType0 + "' != '" + net.sf.freecol.common.model.FoundingFather.FoundingFatherType.MILITARY + "'", foundingFatherType0.equals(net.sf.freecol.common.model.FoundingFather.FoundingFatherType.MILITARY));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.TileItemContainer tileItemContainer2 = new net.sf.freecol.common.model.TileItemContainer(game0, "model.modifier.breedingDivisor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=model.modifier.breedingDivisor) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        int int0 = net.sf.freecol.common.model.Turn.getSeasonYear();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.CEASE_FIRE;
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.CEASE_FIRE + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.CEASE_FIRE));
    }
//
//    @Test
//    public void test415() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test415");
//        net.sf.freecol.common.model.Specification specification1 = null;
//        net.sf.freecol.common.model.EquipmentType equipmentType2 = new net.sf.freecol.common.model.EquipmentType("model.option.independenceTurn", specification1);
//        boolean boolean4 = equipmentType2.requiresAbility("model.ability.ambushBonus");
//        java.util.Set<net.sf.freecol.common.model.Modifier> modifierSet5 = equipmentType2.getModifiers();
//        equipmentType2.setRequiredPopulation((int) (short) 100);
//        org.w3c.dom.Document document8 = null;
//        java.lang.String[] strArray11 = new java.lang.String[] { "model.ability.export.workingAs", "model.player.stance.peace.others" };
//        try {
//            org.w3c.dom.Element element12 = equipmentType2.toXMLElementPartial(document8, strArray11);
//            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Parse fail");
//        } catch (java.lang.RuntimeException e) {
//        }
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
//        org.junit.Assert.assertNotNull(modifierSet5);
//        org.junit.Assert.assertNotNull(strArray11);
//    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        java.util.List<net.sf.freecol.common.model.GoodsType> goodsTypeList8 = goodsType5.getProductionChain();
        boolean boolean9 = goodsType5.isStorable();
        goodsType5.dumpObject();
        org.junit.Assert.assertNotNull(goodsTypeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.Player player2 = new net.sf.freecol.common.model.Player(game0, "<tile-improvement-type id=\"model.ability.carryUnits\" natural=\"false\" magnitude=\"0\" add-work-turns=\"0\" movement-cost=\"-1\" zIndex=\"0\" expose-resource-percent=\"0\"></tile-improvement-type>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=<tile-improvement-type id=\"model.ability.carryUnits\" natural=\"false\" magnitude=\"0\" add-work-turns=\"0\" movement-cost=\"-1\" zIndex=\"0\" expose-resource-percent=\"0\"></tile-improvement-type>) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        net.sf.freecol.common.model.FeatureContainer featureContainer0 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source2 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn3 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet4 = featureContainer0.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source2, turn3);
        boolean boolean5 = net.sf.freecol.common.model.FeatureContainer.hasAbility(abilitySet4);
        org.junit.Assert.assertNotNull(source2);
        org.junit.Assert.assertNotNull(abilitySet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        net.sf.freecol.common.model.FeatureContainer featureContainer0 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source2 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn3 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet4 = featureContainer0.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source2, turn3);
        net.sf.freecol.common.model.Ability ability5 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        boolean boolean6 = featureContainer0.addAbility(ability5);
        int int7 = ability5.getDuration();
        net.sf.freecol.common.model.Turn turn8 = ability5.getFirstTurn();
        net.sf.freecol.common.model.FeatureContainer featureContainer9 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source11 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn12 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet13 = featureContainer9.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source11, turn12);
        net.sf.freecol.common.model.Ability ability14 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        boolean boolean15 = featureContainer9.addAbility(ability14);
        net.sf.freecol.common.model.Ability ability16 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        net.sf.freecol.common.model.Turn turn17 = null;
        ability16.setLastTurn(turn17);
        net.sf.freecol.common.model.FeatureContainer featureContainer19 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source21 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn22 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet23 = featureContainer19.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source21, turn22);
        net.sf.freecol.common.model.Ability ability24 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        boolean boolean25 = featureContainer19.addAbility(ability24);
        int int26 = ability24.getDuration();
        net.sf.freecol.common.model.Ability[] abilityArray27 = new net.sf.freecol.common.model.Ability[] { ability5, ability14, ability16, ability24 };
        java.util.ArrayList<net.sf.freecol.common.model.Ability> abilityList28 = new java.util.ArrayList<net.sf.freecol.common.model.Ability>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.Ability>) abilityList28, abilityArray27);
        net.sf.freecol.common.model.FreeColObject.dumpCollection((java.util.Collection<net.sf.freecol.common.model.Ability>) abilityList28);
        org.junit.Assert.assertNotNull(source2);
        org.junit.Assert.assertNotNull(abilitySet4);
        org.junit.Assert.assertNotNull(ability5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(turn8);
        org.junit.Assert.assertNotNull(source11);
        org.junit.Assert.assertNotNull(abilitySet13);
        org.junit.Assert.assertNotNull(ability14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(ability16);
        org.junit.Assert.assertNotNull(source21);
        org.junit.Assert.assertNotNull(abilitySet23);
        org.junit.Assert.assertNotNull(ability24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(abilityArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        net.sf.freecol.common.model.Game game0 = null;
        try {
            net.sf.freecol.common.model.Resource resource2 = new net.sf.freecol.common.model.Resource(game0, "model.modifier.cargoPenalty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=model.modifier.cargoPenalty) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Player player1 = null;
        try {
            net.sf.freecol.common.model.Monarch monarch2 = new net.sf.freecol.common.model.Monarch(game0, player1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        java.lang.String str8 = goodsType2.getWorkingAsKey();
        java.lang.String str9 = goodsType2.getWorkingAsKey();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "model.ability.export.workingAs" + "'", str8.equals("model.ability.export.workingAs"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "model.ability.export.workingAs" + "'", str9.equals("model.ability.export.workingAs"));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.SHIP_TRADE_PENALTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.shipTradePenalty" + "'", str0.equals("model.option.shipTradePenalty"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.BREEDING_FACTOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.breedingFactor" + "'", str0.equals("model.modifier.breedingFactor"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.lang.String str0 = net.sf.freecol.common.model.Effect.DAMAGED_UNIT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.disaster.effect.damagedUnit" + "'", str0.equals("model.disaster.effect.damagedUnit"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        net.sf.freecol.common.model.Region.RegionType regionType0 = net.sf.freecol.common.model.Region.RegionType.LAKE;
        java.lang.String str1 = regionType0.getKey();
        org.junit.Assert.assertTrue("'" + regionType0 + "' != '" + net.sf.freecol.common.model.Region.RegionType.LAKE + "'", regionType0.equals(net.sf.freecol.common.model.Region.RegionType.LAKE));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "regionType.lake" + "'", str1.equals("regionType.lake"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.BUILD_FACTORY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.buildFactory" + "'", str0.equals("model.ability.buildFactory"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        net.sf.freecol.common.model.Unit unit0 = null;
        try {
            boolean boolean1 = net.sf.freecol.common.model.mission.ImprovementMission.isValidFor(unit0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.lang.String str0 = net.sf.freecol.common.model.MarketData.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "marketData" + "'", str0.equals("marketData"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        net.sf.freecol.common.model.StringTemplate.TemplateType templateType0 = net.sf.freecol.common.model.StringTemplate.TemplateType.LABEL;
        org.junit.Assert.assertTrue("'" + templateType0 + "' != '" + net.sf.freecol.common.model.StringTemplate.TemplateType.LABEL + "'", templateType0.equals(net.sf.freecol.common.model.StringTemplate.TemplateType.LABEL));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        net.sf.freecol.common.model.UnitTypeChange.ChangeType changeType0 = net.sf.freecol.common.model.UnitTypeChange.ChangeType.CLEAR_SKILL;
        org.junit.Assert.assertTrue("'" + changeType0 + "' != '" + net.sf.freecol.common.model.UnitTypeChange.ChangeType.CLEAR_SKILL + "'", changeType0.equals(net.sf.freecol.common.model.UnitTypeChange.ChangeType.CLEAR_SKILL));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.BUILD_ON_NATIVE_LAND_FIRST;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.buildOnNativeLand.first" + "'", str0.equals("model.option.buildOnNativeLand.first"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        int int0 = net.sf.freecol.common.model.Market.MINIMUM_AMOUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.ENTER_INDIAN_SETTLEMENT_WITH_FREE_COLONIST;
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.ENTER_INDIAN_SETTLEMENT_WITH_FREE_COLONIST + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.ENTER_INDIAN_SETTLEMENT_WITH_FREE_COLONIST));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.FoundingFather foundingFather2 = new net.sf.freecol.common.model.FoundingFather("model.ability.disposeOnCombatLoss", specification1);
        boolean boolean3 = foundingFather2.isAbstractType();
        net.sf.freecol.common.model.Scope[] scopeArray4 = new net.sf.freecol.common.model.Scope[] {};
        java.util.ArrayList<net.sf.freecol.common.model.Scope> scopeList5 = new java.util.ArrayList<net.sf.freecol.common.model.Scope>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.Scope>) scopeList5, scopeArray4);
        foundingFather2.setScopes((java.util.List<net.sf.freecol.common.model.Scope>) scopeList5);
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet8 = foundingFather2.getAbilities();
        java.util.Map<net.sf.freecol.common.model.UnitType, net.sf.freecol.common.model.UnitType> unitTypeMap9 = foundingFather2.getUpgrades();
        net.sf.freecol.common.model.Operand operand10 = new net.sf.freecol.common.model.Operand();
        java.lang.String str11 = operand10.getType();
        net.sf.freecol.common.model.Operand operand12 = new net.sf.freecol.common.model.Operand();
        boolean boolean14 = operand12.equals((java.lang.Object) "event");
        java.lang.String str15 = operand12.getMethodName();
        net.sf.freecol.common.model.Operand operand16 = new net.sf.freecol.common.model.Operand();
        net.sf.freecol.common.model.Operand operand17 = new net.sf.freecol.common.model.Operand();
        net.sf.freecol.common.model.Operand operand18 = new net.sf.freecol.common.model.Operand();
        net.sf.freecol.common.model.Operand operand19 = new net.sf.freecol.common.model.Operand();
        boolean boolean21 = operand19.equals((java.lang.Object) "event");
        net.sf.freecol.common.model.Game game22 = null;
        java.lang.Integer int23 = operand19.getValue(game22);
        net.sf.freecol.common.model.Operand operand24 = new net.sf.freecol.common.model.Operand();
        net.sf.freecol.common.model.Scope[] scopeArray25 = new net.sf.freecol.common.model.Scope[] { operand10, operand12, operand16, operand17, operand18, operand19, operand24 };
        java.util.ArrayList<net.sf.freecol.common.model.Scope> scopeList26 = new java.util.ArrayList<net.sf.freecol.common.model.Scope>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.Scope>) scopeList26, scopeArray25);
        foundingFather2.setScopes((java.util.List<net.sf.freecol.common.model.Scope>) scopeList26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(scopeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(abilitySet8);
        org.junit.Assert.assertNotNull(unitTypeMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(scopeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        net.sf.freecol.common.model.Location location0 = null;
        net.sf.freecol.common.model.Specification specification2 = null;
        net.sf.freecol.common.model.GoodsType goodsType3 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification2);
        net.sf.freecol.common.model.Specification specification5 = null;
        net.sf.freecol.common.model.GoodsType goodsType6 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification5);
        net.sf.freecol.common.model.ProductionType productionType8 = new net.sf.freecol.common.model.ProductionType(goodsType3, goodsType6, (int) (short) 100);
        net.sf.freecol.common.model.GoodsType goodsType9 = goodsType3.getStoredAs();
        net.sf.freecol.common.model.AbstractGoods abstractGoods11 = new net.sf.freecol.common.model.AbstractGoods(goodsType3, 100);
        net.sf.freecol.common.model.Turn turn12 = null;
        try {
            net.sf.freecol.common.model.LastSale lastSale14 = new net.sf.freecol.common.model.LastSale(location0, goodsType3, turn12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(goodsType9);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        net.sf.freecol.common.model.Location location0 = null;
        net.sf.freecol.common.model.Specification specification2 = null;
        net.sf.freecol.common.model.GoodsType goodsType3 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification2);
        net.sf.freecol.common.model.Specification specification5 = null;
        net.sf.freecol.common.model.GoodsType goodsType6 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification5);
        net.sf.freecol.common.model.ProductionType productionType8 = new net.sf.freecol.common.model.ProductionType(goodsType3, goodsType6, (int) (short) 100);
        net.sf.freecol.common.model.GoodsType goodsType9 = goodsType3.getStoredAs();
        net.sf.freecol.common.model.AbstractGoods abstractGoods11 = new net.sf.freecol.common.model.AbstractGoods(goodsType3, 100);
        try {
            java.lang.String str12 = net.sf.freecol.common.model.LastSale.makeKey(location0, goodsType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(goodsType9);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        net.sf.freecol.common.model.Operand operand1 = new net.sf.freecol.common.model.Operand((int) (byte) -1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.COUNTRY;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.COUNTRY + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.COUNTRY));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES;
        java.lang.String str2 = rumourType0.getAlternateDescriptionKey("TILE_UNIT_CHANGE");
        java.lang.String str4 = rumourType0.getAlternateDescriptionKey("model.ability.canBeEquipped");
        java.lang.String str5 = rumourType0.getDescriptionKey();
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.EXPEDITION_VANISHES));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "model.lostCityRumour.expeditionVanishes.TILE_UNIT_CHANGE.description" + "'", str2.equals("model.lostCityRumour.expeditionVanishes.TILE_UNIT_CHANGE.description"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "model.lostCityRumour.expeditionVanishes.model.ability.canBeEquipped.description" + "'", str4.equals("model.lostCityRumour.expeditionVanishes.model.ability.canBeEquipped.description"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "model.lostCityRumour.expeditionVanishes.description" + "'", str5.equals("model.lostCityRumour.expeditionVanishes.description"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileImprovementType tileImprovementType2 = new net.sf.freecol.common.model.TileImprovementType("model.ability.carryUnits", specification1);
        int int3 = tileImprovementType2.getAddWorkTurns();
        net.sf.freecol.common.model.Unit unit4 = null;
        try {
            boolean boolean5 = tileImprovementType2.isWorkerAllowed(unit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.ROYAL_EXPEDITIONARY_FORCE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.royalExpeditionaryForce" + "'", str0.equals("model.ability.royalExpeditionaryForce"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.util.Comparator<net.sf.freecol.common.model.Player> playerComparator0 = net.sf.freecol.common.model.Player.playerComparator;
        org.junit.Assert.assertNotNull(playerComparator0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.EuropeanNationType europeanNationType2 = new net.sf.freecol.common.model.EuropeanNationType("model.option.saveProductionOverflow", specification1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.lang.String str0 = net.sf.freecol.common.model.FreeColObject.ID_ATTRIBUTE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ID" + "'", str0.equals("ID"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        net.sf.freecol.common.model.Player.ColonyValueCategory colonyValueCategory0 = net.sf.freecol.common.model.Player.ColonyValueCategory.A_RESOURCE;
        java.lang.String str1 = colonyValueCategory0.toString();
        org.junit.Assert.assertTrue("'" + colonyValueCategory0 + "' != '" + net.sf.freecol.common.model.Player.ColonyValueCategory.A_RESOURCE + "'", colonyValueCategory0.equals(net.sf.freecol.common.model.Player.ColonyValueCategory.A_RESOURCE));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RESOURCE" + "'", str1.equals("RESOURCE"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        net.sf.freecol.common.model.Colony colony0 = null;
        try {
            net.sf.freecol.common.model.ColonyWas colonyWas1 = new net.sf.freecol.common.model.ColonyWas(colony0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.EMBARK;
        boolean boolean1 = moveType0.isAttack();
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.EMBARK + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.EMBARK));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.TREE;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.TREE + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.TREE));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        int int0 = net.sf.freecol.common.model.IndianSettlement.GIFT_THRESHOLD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 25 + "'", int0 == 25);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileImprovementType tileImprovementType2 = new net.sf.freecol.common.model.TileImprovementType("model.ability.carryUnits", specification1);
        int int3 = tileImprovementType2.getAddWorkTurns();
        net.sf.freecol.common.model.TileType tileType4 = net.sf.freecol.common.model.TileType.WATER;
        net.sf.freecol.common.model.TileType tileType5 = tileImprovementType2.getChange(tileType4);
        boolean boolean6 = tileImprovementType2.isChangeType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(tileType4);
        org.junit.Assert.assertNull(tileType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileType tileType2 = new net.sf.freecol.common.model.TileType("ability", specification1);
        net.sf.freecol.common.model.FeatureContainer featureContainer4 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source6 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn7 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet8 = featureContainer4.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source6, turn7);
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet9 = tileType2.getAbilities("model.difficulty.cheat", (net.sf.freecol.common.model.FreeColGameObjectType) source6);
        net.sf.freecol.common.model.ResourceType resourceType10 = null;
        boolean boolean11 = tileType2.canHaveResourceType(resourceType10);
        java.util.List<net.sf.freecol.common.model.ResourceType> resourceTypeList12 = tileType2.getResourceTypes();
        org.junit.Assert.assertNotNull(source6);
        org.junit.Assert.assertNotNull(abilitySet8);
        org.junit.Assert.assertNotNull(abilitySet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(resourceTypeList12);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.lang.String str0 = net.sf.freecol.common.model.UnitTypeChange.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "upgrade" + "'", str0.equals("upgrade"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader0 = null;
        net.sf.freecol.common.model.Specification specification1 = null;
        try {
            net.sf.freecol.common.model.UnitTypeChange unitTypeChange2 = new net.sf.freecol.common.model.UnitTypeChange(freeColXMLReader0, specification1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        net.sf.freecol.common.model.Map.Layer layer0 = net.sf.freecol.common.model.Map.Layer.TERRAIN;
        org.junit.Assert.assertTrue("'" + layer0 + "' != '" + net.sf.freecol.common.model.Map.Layer.TERRAIN + "'", layer0.equals(net.sf.freecol.common.model.Map.Layer.TERRAIN));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.lang.String str0 = net.sf.freecol.common.model.Modifier.TRADE_BONUS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.modifier.tradeBonus" + "'", str0.equals("model.modifier.tradeBonus"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.DESTROY_SETTLEMENT_SCORE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.destroySettlementScore" + "'", str0.equals("model.option.destroySettlementScore"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        double double2 = net.sf.freecol.common.model.Player.strengthRatio((double) 800, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9975062344139651d + "'", double2 == 0.9975062344139651d);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.TRANSPORT_NAVAL_UNIT_CHEAT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.transportNavalUnitCheat" + "'", str0.equals("model.option.transportNavalUnitCheat"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        net.sf.freecol.common.model.GoodsType goodsType8 = goodsType2.getStoredAs();
        int int9 = goodsType8.getInitialAmount();
        org.junit.Assert.assertNotNull(goodsType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_LOST;
        java.lang.String str1 = messageType0.getOptionName();
        net.sf.freecol.common.model.FreeColGameObject freeColGameObject3 = null;
        try {
            net.sf.freecol.common.model.ModelMessage modelMessage4 = new net.sf.freecol.common.model.ModelMessage(messageType0, "model.ability.expertsUseConnections", freeColGameObject3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_LOST + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.UNIT_LOST));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.option.guiShowUnitLost" + "'", str1.equals("model.option.guiShowUnitLost"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.EQUIP_PIONEER_CHEAT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.equipPioneerCheat" + "'", str0.equals("model.option.equipPioneerCheat"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader1 = null;
        try {
            net.sf.freecol.common.model.GoodsTradeItem goodsTradeItem2 = new net.sf.freecol.common.model.GoodsTradeItem(game0, freeColXMLReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        net.sf.freecol.common.model.Game game0 = null;
        org.w3c.dom.Element element1 = null;
        try {
            net.sf.freecol.common.model.Unit unit2 = new net.sf.freecol.common.model.Unit(game0, element1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO(id=null) with null game");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.lang.String str0 = net.sf.freecol.common.model.Disaster.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "disaster" + "'", str0.equals("disaster"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.FoundingFather foundingFather2 = new net.sf.freecol.common.model.FoundingFather("model.ability.disposeOnCombatLoss", specification1);
        boolean boolean3 = foundingFather2.isAbstractType();
        foundingFather2.fireIndexedPropertyChange("model.modifier.liberty", (int) (byte) 100, true, true);
        net.sf.freecol.common.model.Specification specification11 = null;
        net.sf.freecol.common.model.TileType tileType12 = new net.sf.freecol.common.model.TileType("ability", specification11);
        net.sf.freecol.common.model.FeatureContainer featureContainer14 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source16 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn17 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet18 = featureContainer14.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source16, turn17);
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet19 = tileType12.getAbilities("model.difficulty.cheat", (net.sf.freecol.common.model.FreeColGameObjectType) source16);
        net.sf.freecol.common.model.Turn turn20 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet21 = foundingFather2.getAbilities("model.option.immigrants", (net.sf.freecol.common.model.FreeColGameObjectType) tileType12, turn20);
        net.sf.freecol.common.model.FreeColObject.dumpCollection((java.util.Collection<net.sf.freecol.common.model.Ability>) abilitySet21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(source16);
        org.junit.Assert.assertNotNull(abilitySet18);
        org.junit.Assert.assertNotNull(abilitySet19);
        org.junit.Assert.assertNotNull(abilitySet21);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.util.Comparator<net.sf.freecol.common.model.AbstractGoods> abstractGoodsComparator0 = net.sf.freecol.common.model.AbstractGoods.abstractGoodsComparator;
        org.junit.Assert.assertNotNull(abstractGoodsComparator0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        net.sf.freecol.common.model.Specification specification0 = null;
        net.sf.freecol.common.model.ProductionType productionType1 = new net.sf.freecol.common.model.ProductionType(specification0);
        boolean boolean3 = productionType1.appliesExactly("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.StringTemplate stringTemplate3 = stringTemplate1.add("founding-father");
        net.sf.freecol.common.model.Specification specification5 = null;
        net.sf.freecol.common.model.GoodsType goodsType6 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification5);
        net.sf.freecol.common.model.Specification specification8 = null;
        net.sf.freecol.common.model.GoodsType goodsType9 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification8);
        net.sf.freecol.common.model.ProductionType productionType11 = new net.sf.freecol.common.model.ProductionType(goodsType6, goodsType9, (int) (short) 100);
        java.util.List<net.sf.freecol.common.model.GoodsType> goodsTypeList12 = goodsType9.getProductionChain();
        int int13 = net.sf.freecol.common.model.FreeColObject.compareIds((net.sf.freecol.common.model.FreeColObject) stringTemplate3, (net.sf.freecol.common.model.FreeColObject) goodsType9);
        net.sf.freecol.common.model.AbstractGoods abstractGoods15 = new net.sf.freecol.common.model.AbstractGoods(goodsType9, (int) (short) 100);
        net.sf.freecol.common.model.StringTemplate stringTemplate17 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.StringTemplate stringTemplate19 = stringTemplate17.add("founding-father");
        java.util.List<net.sf.freecol.common.model.StringTemplate> stringTemplateList20 = stringTemplate17.getReplacements();
        net.sf.freecol.common.model.StringTemplate stringTemplate22 = stringTemplate17.getReplacement("unit");
        net.sf.freecol.common.model.Specification specification24 = null;
        net.sf.freecol.common.model.EquipmentType equipmentType25 = new net.sf.freecol.common.model.EquipmentType("model.option.independenceTurn", specification24);
        boolean boolean27 = equipmentType25.requiresAbility("model.ability.ambushBonus");
        java.util.Map<java.lang.String, java.lang.Boolean> strMap28 = equipmentType25.getRequiredAbilities();
        net.sf.freecol.common.model.StringTemplate stringTemplate29 = stringTemplate17.addNamed((net.sf.freecol.common.model.Named) equipmentType25);
        abstractGoods15.removeFeatures((net.sf.freecol.common.model.FreeColObject) equipmentType25);
        org.junit.Assert.assertNotNull(stringTemplate1);
        org.junit.Assert.assertNotNull(stringTemplate3);
        org.junit.Assert.assertNotNull(goodsTypeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-20) + "'", int13 == (-20));
        org.junit.Assert.assertNotNull(stringTemplate17);
        org.junit.Assert.assertNotNull(stringTemplate19);
        org.junit.Assert.assertNotNull(stringTemplateList20);
        org.junit.Assert.assertNull(stringTemplate22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(stringTemplate29);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.TURNS_TO_SAIL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.turnsToSail" + "'", str0.equals("model.option.turnsToSail"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        net.sf.freecol.common.model.Game game0 = null;
        net.sf.freecol.common.model.Tile tile1 = null;
        net.sf.freecol.common.model.ResourceType resourceType2 = null;
        try {
            net.sf.freecol.common.model.Resource resource4 = new net.sf.freecol.common.model.Resource(game0, tile1, resourceType2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FCGO with null game.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        net.sf.freecol.common.model.Colony.ColonyChangeEvent colonyChangeEvent0 = net.sf.freecol.common.model.Colony.ColonyChangeEvent.BONUS_CHANGE;
        org.junit.Assert.assertTrue("'" + colonyChangeEvent0 + "' != '" + net.sf.freecol.common.model.Colony.ColonyChangeEvent.BONUS_CHANGE + "'", colonyChangeEvent0.equals(net.sf.freecol.common.model.Colony.ColonyChangeEvent.BONUS_CHANGE));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        net.sf.freecol.common.model.Ability ability0 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        net.sf.freecol.common.model.Turn turn1 = null;
        ability0.setLastTurn(turn1);
        ability0.setTemporary(false);
        org.junit.Assert.assertNotNull(ability0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        net.sf.freecol.common.model.Player player0 = null;
        net.sf.freecol.common.model.pathfinding.GoalDecider goalDecider1 = net.sf.freecol.common.model.pathfinding.GoalDeciders.getStealthyGoalDecider(player0);
        org.junit.Assert.assertNotNull(goalDecider1);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        int int0 = net.sf.freecol.common.model.Europe.MigrationType.getDefaultSlot();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        int int1 = net.sf.freecol.common.model.Turn.getYear((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        net.sf.freecol.common.model.TileImprovementStyle tileImprovementStyle1 = net.sf.freecol.common.model.TileImprovementStyle.getInstance("model.option.missionInfluence");
        org.junit.Assert.assertNotNull(tileImprovementStyle1);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.TileType tileType2 = new net.sf.freecol.common.model.TileType("ability", specification1);
        net.sf.freecol.common.model.FeatureContainer featureContainer4 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source6 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn7 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet8 = featureContainer4.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source6, turn7);
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet9 = tileType2.getAbilities("model.difficulty.cheat", (net.sf.freecol.common.model.FreeColGameObjectType) source6);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        source6.addPropertyChangeListener("model.modifier.liberty", propertyChangeListener11);
        java.util.Set<net.sf.freecol.common.model.Modifier> modifierSet13 = source6.getModifiers();
        net.sf.freecol.common.io.FreeColXMLWriter freeColXMLWriter14 = null;
        try {
            source6.toXML(freeColXMLWriter14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Can not happen");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(source6);
        org.junit.Assert.assertNotNull(abilitySet8);
        org.junit.Assert.assertNotNull(abilitySet9);
        org.junit.Assert.assertNotNull(modifierSet13);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.FOUNTAIN_OF_YOUTH;
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.FOUNTAIN_OF_YOUTH + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.FOUNTAIN_OF_YOUTH));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        net.sf.freecol.common.model.Unit.MoveType moveType0 = net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_SKILL;
        org.junit.Assert.assertTrue("'" + moveType0 + "' != '" + net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_SKILL + "'", moveType0.equals(net.sf.freecol.common.model.Unit.MoveType.MOVE_NO_ACCESS_SKILL));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        net.sf.freecol.common.model.ModelMessage.MessageType messageType0 = net.sf.freecol.common.model.ModelMessage.MessageType.FOREIGN_DIPLOMACY;
        java.lang.String str1 = messageType0.getOptionName();
        net.sf.freecol.common.model.FreeColGameObject freeColGameObject4 = null;
        try {
            net.sf.freecol.common.model.ModelMessage modelMessage5 = new net.sf.freecol.common.model.ModelMessage(messageType0, "model.historyEventType.discoverRegion.name", "model.modifier.cargoPenalty", freeColGameObject4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + messageType0 + "' != '" + net.sf.freecol.common.model.ModelMessage.MessageType.FOREIGN_DIPLOMACY + "'", messageType0.equals(net.sf.freecol.common.model.ModelMessage.MessageType.FOREIGN_DIPLOMACY));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "model.option.guiShowForeignDiplomacy" + "'", str1.equals("model.option.guiShowForeignDiplomacy"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        net.sf.freecol.common.model.EquipmentType[] equipmentTypeArray0 = net.sf.freecol.common.model.EquipmentType.NO_EQUIPMENT;
        org.junit.Assert.assertNotNull(equipmentTypeArray0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        int int0 = net.sf.freecol.common.model.Modifier.GENERAL_COMBAT_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        net.sf.freecol.common.model.HistoryEvent.HistoryEventType historyEventType0 = net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DISCOVER_NEW_WORLD;
        org.junit.Assert.assertTrue("'" + historyEventType0 + "' != '" + net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DISCOVER_NEW_WORLD + "'", historyEventType0.equals(net.sf.freecol.common.model.HistoryEvent.HistoryEventType.DISCOVER_NEW_WORLD));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        net.sf.freecol.common.io.FreeColXMLReader freeColXMLReader0 = null;
        net.sf.freecol.common.model.Specification specification1 = null;
        try {
            net.sf.freecol.common.model.Limit limit2 = new net.sf.freecol.common.model.Limit(freeColXMLReader0, specification1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.TEACH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.teach" + "'", str0.equals("model.ability.teach"));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        net.sf.freecol.common.model.AbstractGoods abstractGoods0 = new net.sf.freecol.common.model.AbstractGoods();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        net.sf.freecol.common.model.LostCityRumour.RumourType rumourType0 = net.sf.freecol.common.model.LostCityRumour.RumourType.CIBOLA;
        java.lang.String str2 = rumourType0.getAlternateDescriptionKey("angry");
        org.junit.Assert.assertTrue("'" + rumourType0 + "' != '" + net.sf.freecol.common.model.LostCityRumour.RumourType.CIBOLA + "'", rumourType0.equals(net.sf.freecol.common.model.LostCityRumour.RumourType.CIBOLA));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "model.lostCityRumour.cibola.angry.description" + "'", str2.equals("model.lostCityRumour.cibola.angry.description"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.lang.String str0 = net.sf.freecol.common.model.Scope.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "scope" + "'", str0.equals("scope"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        net.sf.freecol.common.model.FeatureContainer featureContainer0 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source2 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn3 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet4 = featureContainer0.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source2, turn3);
        net.sf.freecol.common.model.Ability ability5 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        boolean boolean6 = featureContainer0.addAbility(ability5);
        int int7 = ability5.getDuration();
        net.sf.freecol.common.model.Turn turn8 = ability5.getFirstTurn();
        ability5.setValue(true);
        org.junit.Assert.assertNotNull(source2);
        org.junit.Assert.assertNotNull(abilitySet4);
        org.junit.Assert.assertNotNull(ability5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(turn8);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        net.sf.freecol.common.model.Location location0 = null;
        net.sf.freecol.common.model.Specification specification2 = null;
        net.sf.freecol.common.model.GoodsType goodsType3 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification2);
        boolean boolean4 = goodsType3.isRawBuildingMaterial();
        net.sf.freecol.common.model.Turn turn5 = null;
        try {
            net.sf.freecol.common.model.LastSale lastSale7 = new net.sf.freecol.common.model.LastSale(location0, goodsType3, turn5, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        productionType7.setUnattended(true);
        java.lang.String str10 = productionType7.getXMLTagName();
        java.lang.String str11 = productionType7.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "production" + "'", str10.equals("production"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null: unattended [inputs: 100 export] [outputs: 100 export]]" + "'", str11.equals("[null: unattended [inputs: 100 export] [outputs: 100 export]]"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        net.sf.freecol.common.model.HighScore.ScoreLevel scoreLevel0 = net.sf.freecol.common.model.HighScore.ScoreLevel.CITY;
        org.junit.Assert.assertTrue("'" + scoreLevel0 + "' != '" + net.sf.freecol.common.model.HighScore.ScoreLevel.CITY + "'", scoreLevel0.equals(net.sf.freecol.common.model.HighScore.ScoreLevel.CITY));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.lang.String str0 = net.sf.freecol.common.model.Ability.CAPTURE_EQUIPMENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.ability.captureEquipment" + "'", str0.equals("model.ability.captureEquipment"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        net.sf.freecol.common.model.Player.PlayerType playerType0 = net.sf.freecol.common.model.Player.PlayerType.NATIVE;
        org.junit.Assert.assertTrue("'" + playerType0 + "' != '" + net.sf.freecol.common.model.Player.PlayerType.NATIVE + "'", playerType0.equals(net.sf.freecol.common.model.Player.PlayerType.NATIVE));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.lang.String str0 = net.sf.freecol.common.model.GoldTradeItem.getXMLElementTagName();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "goldTradeItem" + "'", str0.equals("goldTradeItem"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        net.sf.freecol.common.model.Colony.ColonyChangeEvent colonyChangeEvent0 = net.sf.freecol.common.model.Colony.ColonyChangeEvent.POPULATION_CHANGE;
        org.junit.Assert.assertTrue("'" + colonyChangeEvent0 + "' != '" + net.sf.freecol.common.model.Colony.ColonyChangeEvent.POPULATION_CHANGE + "'", colonyChangeEvent0.equals(net.sf.freecol.common.model.Colony.ColonyChangeEvent.POPULATION_CHANGE));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.lang.String str0 = net.sf.freecol.common.model.GameOptions.LIFT_BOYCOTT_CHEAT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "model.option.liftBoycottCheat" + "'", str0.equals("model.option.liftBoycottCheat"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        net.sf.freecol.common.model.Specification specification0 = null;
        net.sf.freecol.common.model.ProductionType productionType1 = new net.sf.freecol.common.model.ProductionType(specification0);
        boolean boolean3 = productionType1.appliesExactly("model.option.interventionTurns");
        java.lang.String str4 = productionType1.getProductionLevel();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        net.sf.freecol.common.model.Turn turn1 = null;
        net.sf.freecol.common.model.Specification specification3 = null;
        net.sf.freecol.common.model.EquipmentType equipmentType4 = new net.sf.freecol.common.model.EquipmentType("model.option.independenceTurn", specification3);
        boolean boolean6 = equipmentType4.requiresAbility("model.ability.ambushBonus");
        java.util.Set<net.sf.freecol.common.model.Modifier> modifierSet7 = equipmentType4.getModifiers();
        float float8 = net.sf.freecol.common.model.FreeColObject.applyModifiers((float) (byte) 1, turn1, (java.util.Collection<net.sf.freecol.common.model.Modifier>) modifierSet7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(modifierSet7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }
}

