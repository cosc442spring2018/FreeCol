package towson.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        boolean boolean1 = modifier0.requireNegatedPersonScope();
        boolean boolean3 = modifier0.equals((java.lang.Object) 2147483647);
        float float5 = modifier0.applyTo((float) 200);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        net.sf.freecol.common.model.Specification specification9 = null;
        net.sf.freecol.common.model.GoodsType goodsType10 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification9);
        net.sf.freecol.common.model.Specification specification12 = null;
        net.sf.freecol.common.model.GoodsType goodsType13 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification12);
        net.sf.freecol.common.model.ProductionType productionType15 = new net.sf.freecol.common.model.ProductionType(goodsType10, goodsType13, (int) (short) 100);
        net.sf.freecol.common.model.GoodsType goodsType16 = goodsType10.getStoredAs();
        java.lang.String str18 = net.sf.freecol.common.model.AbstractGoods.toString(goodsType10, 800);
        net.sf.freecol.common.model.AbstractGoods abstractGoods19 = productionType7.getOutput(goodsType10);
        boolean boolean20 = goodsType10.isRefined();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on productionType7 and productionType15", (productionType7.compareTo(productionType15) == 0) == productionType7.equals(productionType15));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        net.sf.freecol.common.model.GoodsType goodsType0 = null;
        net.sf.freecol.common.model.Specification specification2 = null;
        net.sf.freecol.common.model.GoodsType goodsType3 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification2);
        net.sf.freecol.common.model.Specification specification5 = null;
        net.sf.freecol.common.model.GoodsType goodsType6 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification5);
        net.sf.freecol.common.model.ProductionType productionType8 = new net.sf.freecol.common.model.ProductionType(goodsType3, goodsType6, (int) (short) 100);
        net.sf.freecol.common.model.Specification specification10 = null;
        net.sf.freecol.common.model.GoodsType goodsType11 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification10);
        net.sf.freecol.common.model.Specification specification13 = null;
        net.sf.freecol.common.model.GoodsType goodsType14 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification13);
        net.sf.freecol.common.model.ProductionType productionType16 = new net.sf.freecol.common.model.ProductionType(goodsType11, goodsType14, (int) (short) 100);
        net.sf.freecol.common.model.GoodsType goodsType17 = goodsType11.getStoredAs();
        java.lang.String str19 = net.sf.freecol.common.model.AbstractGoods.toString(goodsType11, 800);
        net.sf.freecol.common.model.AbstractGoods abstractGoods20 = productionType8.getOutput(goodsType11);
        net.sf.freecol.common.model.Specification specification21 = null;
        net.sf.freecol.common.model.ProductionType productionType22 = new net.sf.freecol.common.model.ProductionType(specification21);
        boolean boolean24 = productionType22.appliesExactly("model.option.interventionTurns");
        net.sf.freecol.common.model.ProductionType[] productionTypeArray25 = new net.sf.freecol.common.model.ProductionType[] { productionType8, productionType22 };
        java.util.ArrayList<net.sf.freecol.common.model.ProductionType> productionTypeList26 = new java.util.ArrayList<net.sf.freecol.common.model.ProductionType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<net.sf.freecol.common.model.ProductionType>) productionTypeList26, productionTypeArray25);
        net.sf.freecol.common.model.ProductionType productionType28 = net.sf.freecol.common.model.ProductionType.getBestProductionType(goodsType0, (java.util.Collection<net.sf.freecol.common.model.ProductionType>) productionTypeList26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on productionType28 and productionType16", (productionType28.compareTo(productionType16) == 0) == productionType28.equals(productionType16));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        java.lang.String str16 = goodsType9.getIdType();
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on goodsType6 and abstractGoods15.", goodsType6.equals(abstractGoods15) == abstractGoods15.equals(goodsType6));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        boolean boolean1 = modifier0.requireNegatedPersonScope();
        float float4 = modifier0.apply((float) (short) 10, (float) ' ');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        java.util.List<net.sf.freecol.common.model.GoodsType> goodsTypeList8 = goodsType5.getProductionChain();
        net.sf.freecol.common.model.Specification specification10 = null;
        net.sf.freecol.common.model.GoodsType goodsType11 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification10);
        net.sf.freecol.common.model.Specification specification13 = null;
        net.sf.freecol.common.model.GoodsType goodsType14 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification13);
        net.sf.freecol.common.model.ProductionType productionType16 = new net.sf.freecol.common.model.ProductionType(goodsType11, goodsType14, (int) (short) 100);
        java.lang.String str17 = goodsType11.getWorkingAsKey();
        java.lang.String str18 = goodsType11.getXMLTagName();
        int int19 = goodsType11.getIdNumber();
        net.sf.freecol.common.model.ProductionType productionType21 = new net.sf.freecol.common.model.ProductionType(goodsType5, goodsType11, 1100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on productionType7 and productionType16", (productionType7.compareTo(productionType16) == 0) == productionType7.equals(productionType16));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        boolean boolean1 = modifier0.hasTimeLimit();
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on modifier0", modifier0.compareTo(modifier0) == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        net.sf.freecol.common.model.Operand operand0 = new net.sf.freecol.common.model.Operand();
        java.lang.String str1 = operand0.getType();
        java.lang.String str2 = operand0.getMethodValue();
        net.sf.freecol.common.model.Operand.OperandType operandType3 = net.sf.freecol.common.model.Operand.OperandType.SETTLEMENTS;
        operand0.setOperandType(operandType3);
        net.sf.freecol.common.model.Operand.OperandType operandType5 = net.sf.freecol.common.model.Operand.OperandType.SETTLEMENTS;
        net.sf.freecol.common.model.Operand.ScopeLevel scopeLevel6 = net.sf.freecol.common.model.Operand.ScopeLevel.PLAYER;
        net.sf.freecol.common.model.Operand operand7 = new net.sf.freecol.common.model.Operand(operandType5, scopeLevel6);
        net.sf.freecol.common.model.Operand operand8 = new net.sf.freecol.common.model.Operand(operandType3, scopeLevel6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on operand0 and operand7", (operand0.compareTo(operand7) == 0) == operand0.equals(operand7));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        net.sf.freecol.common.model.FeatureContainer featureContainer0 = new net.sf.freecol.common.model.FeatureContainer();
        net.sf.freecol.common.model.Specification.Source source2 = net.sf.freecol.common.model.Specification.COLONY_GOODS_PARTY_SOURCE;
        net.sf.freecol.common.model.Turn turn3 = null;
        java.util.Set<net.sf.freecol.common.model.Ability> abilitySet4 = featureContainer0.getAbilities("model.ability.foundInLostCity", (net.sf.freecol.common.model.FreeColGameObjectType) source2, turn3);
        net.sf.freecol.common.model.Ability ability5 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        boolean boolean6 = featureContainer0.addAbility(ability5);
        net.sf.freecol.common.model.Ability ability7 = net.sf.freecol.common.model.Europe.ABILITY_DRESS_MISSIONARY;
        net.sf.freecol.common.model.Turn turn8 = null;
        ability7.setLastTurn(turn8);
        ability7.setValue(true);
        net.sf.freecol.common.model.Ability ability12 = new net.sf.freecol.common.model.Ability(ability7);
        boolean boolean13 = ability7.getValue();
        boolean boolean14 = featureContainer0.addAbility(ability7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on ability7 and ability12", (ability7.compareTo(ability12) == 0) == ability7.equals(ability12));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        productionType7.setUnattended(true);
        net.sf.freecol.common.model.Specification specification12 = null;
        net.sf.freecol.common.model.GoodsType goodsType13 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification12);
        net.sf.freecol.common.model.Specification specification15 = null;
        net.sf.freecol.common.model.GoodsType goodsType16 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification15);
        net.sf.freecol.common.model.ProductionType productionType18 = new net.sf.freecol.common.model.ProductionType(goodsType13, goodsType16, (int) (short) 100);
        boolean boolean19 = productionType7.hasAbility("event", (net.sf.freecol.common.model.FreeColGameObjectType) goodsType16);
        boolean boolean20 = goodsType16.isNewWorldLuxuryType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on productionType7 and productionType18", (productionType7.compareTo(productionType18) == 0) == productionType7.equals(productionType18));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.EquipmentType equipmentType2 = new net.sf.freecol.common.model.EquipmentType("model.option.independenceTurn", specification1);
        net.sf.freecol.common.model.Specification.Source source4 = new net.sf.freecol.common.model.Specification.Source("model.modifier.immigration");
        net.sf.freecol.common.model.Specification specification6 = null;
        net.sf.freecol.common.model.GoodsType goodsType7 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification6);
        net.sf.freecol.common.model.Specification specification9 = null;
        net.sf.freecol.common.model.GoodsType goodsType10 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification9);
        net.sf.freecol.common.model.ProductionType productionType12 = new net.sf.freecol.common.model.ProductionType(goodsType7, goodsType10, (int) (short) 100);
        productionType12.setUnattended(true);
        net.sf.freecol.common.model.Specification specification17 = null;
        net.sf.freecol.common.model.GoodsType goodsType18 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification17);
        net.sf.freecol.common.model.Specification specification20 = null;
        net.sf.freecol.common.model.GoodsType goodsType21 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification20);
        net.sf.freecol.common.model.ProductionType productionType23 = new net.sf.freecol.common.model.ProductionType(goodsType18, goodsType21, (int) (short) 100);
        boolean boolean24 = productionType12.hasAbility("event", (net.sf.freecol.common.model.FreeColGameObjectType) goodsType21);
        net.sf.freecol.common.model.StringTemplate stringTemplate26 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.StringTemplate stringTemplate28 = stringTemplate26.add("founding-father");
        boolean boolean30 = stringTemplate28.containsAbilityKey("model.option.maximumTax");
        java.util.List<net.sf.freecol.common.model.StringTemplate> stringTemplateList31 = stringTemplate28.getReplacements();
        net.sf.freecol.common.model.Turn turn33 = null;
        float float35 = stringTemplate28.applyModifiers((float) (-1), turn33, "model.ability.speakWithChief");
        net.sf.freecol.common.model.StringTemplate stringTemplate37 = stringTemplate28.add("goToMission");
        net.sf.freecol.common.model.Specification.Source source38 = net.sf.freecol.common.model.Specification.ATTACK_BONUS_SOURCE;
        net.sf.freecol.common.model.FreeColObject[] freeColObjectArray39 = new net.sf.freecol.common.model.FreeColObject[] { source4, goodsType21, stringTemplate37, source38 };
        boolean boolean40 = equipmentType2.isAvailableTo(freeColObjectArray39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on productionType12 and productionType23", (productionType12.compareTo(productionType23) == 0) == productionType12.equals(productionType23));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        boolean boolean1 = modifier0.requireNegatedPersonScope();
        net.sf.freecol.common.model.Modifier modifier2 = new net.sf.freecol.common.model.Modifier(modifier0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on modifier2", modifier2.compareTo(modifier2) == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        net.sf.freecol.common.model.StringTemplate stringTemplate1 = net.sf.freecol.common.model.Turn.getLabel((int) ' ');
        net.sf.freecol.common.model.StringTemplate stringTemplate3 = stringTemplate1.add("founding-father");
        java.util.List<net.sf.freecol.common.model.StringTemplate> stringTemplateList4 = stringTemplate1.getReplacements();
        net.sf.freecol.common.model.StringTemplate stringTemplate6 = stringTemplate1.getReplacement("unit");
        net.sf.freecol.common.model.Specification specification8 = null;
        net.sf.freecol.common.model.EquipmentType equipmentType9 = new net.sf.freecol.common.model.EquipmentType("model.option.independenceTurn", specification8);
        boolean boolean11 = equipmentType9.requiresAbility("model.ability.ambushBonus");
        java.util.Map<java.lang.String, java.lang.Boolean> strMap12 = equipmentType9.getRequiredAbilities();
        net.sf.freecol.common.model.StringTemplate stringTemplate13 = stringTemplate1.addNamed((net.sf.freecol.common.model.Named) equipmentType9);
        net.sf.freecol.common.model.Specification specification15 = null;
        net.sf.freecol.common.model.GoodsType goodsType16 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification15);
        net.sf.freecol.common.model.Specification specification18 = null;
        net.sf.freecol.common.model.GoodsType goodsType19 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification18);
        net.sf.freecol.common.model.ProductionType productionType21 = new net.sf.freecol.common.model.ProductionType(goodsType16, goodsType19, (int) (short) 100);
        productionType21.setUnattended(true);
        net.sf.freecol.common.model.Specification specification26 = null;
        net.sf.freecol.common.model.GoodsType goodsType27 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification26);
        net.sf.freecol.common.model.Specification specification29 = null;
        net.sf.freecol.common.model.GoodsType goodsType30 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification29);
        net.sf.freecol.common.model.ProductionType productionType32 = new net.sf.freecol.common.model.ProductionType(goodsType27, goodsType30, (int) (short) 100);
        boolean boolean33 = productionType21.hasAbility("event", (net.sf.freecol.common.model.FreeColGameObjectType) goodsType30);
        net.sf.freecol.common.model.StringTemplate stringTemplate34 = stringTemplate13.addNamed((net.sf.freecol.common.model.Named) goodsType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on productionType21 and productionType32", (productionType21.compareTo(productionType32) == 0) == productionType21.equals(productionType32));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        productionType7.setUnattended(true);
        net.sf.freecol.common.model.Specification specification12 = null;
        net.sf.freecol.common.model.GoodsType goodsType13 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification12);
        net.sf.freecol.common.model.Specification specification15 = null;
        net.sf.freecol.common.model.GoodsType goodsType16 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification15);
        net.sf.freecol.common.model.ProductionType productionType18 = new net.sf.freecol.common.model.ProductionType(goodsType13, goodsType16, (int) (short) 100);
        boolean boolean19 = productionType7.hasAbility("event", (net.sf.freecol.common.model.FreeColGameObjectType) goodsType16);
        boolean boolean20 = goodsType16.isBreedable();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on productionType7 and productionType18", (productionType7.compareTo(productionType18) == 0) == productionType7.equals(productionType18));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        boolean boolean1 = modifier0.requireNegatedPersonScope();
        boolean boolean3 = modifier0.equals((java.lang.Object) 2147483647);
        float float4 = modifier0.getIncrement();
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on modifier0", modifier0.compareTo(modifier0) == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        net.sf.freecol.common.model.StringTemplate stringTemplate17 = abstractGoods15.getLabel(false);
        java.lang.String str18 = stringTemplate17.getId();
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on goodsType6 and abstractGoods15.", goodsType6.equals(abstractGoods15) == abstractGoods15.equals(goodsType6));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        boolean boolean1 = modifier0.requireNegatedPersonScope();
        boolean boolean2 = modifier0.hasScope();
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on modifier0", modifier0.compareTo(modifier0) == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        net.sf.freecol.common.model.Specification specification1 = null;
        net.sf.freecol.common.model.GoodsType goodsType2 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification1);
        net.sf.freecol.common.model.Specification specification4 = null;
        net.sf.freecol.common.model.GoodsType goodsType5 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification4);
        net.sf.freecol.common.model.ProductionType productionType7 = new net.sf.freecol.common.model.ProductionType(goodsType2, goodsType5, (int) (short) 100);
        net.sf.freecol.common.model.Specification specification9 = null;
        net.sf.freecol.common.model.GoodsType goodsType10 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification9);
        net.sf.freecol.common.model.Specification specification12 = null;
        net.sf.freecol.common.model.GoodsType goodsType13 = new net.sf.freecol.common.model.GoodsType("model.ability.export", specification12);
        net.sf.freecol.common.model.ProductionType productionType15 = new net.sf.freecol.common.model.ProductionType(goodsType10, goodsType13, (int) (short) 100);
        net.sf.freecol.common.model.GoodsType goodsType16 = goodsType10.getStoredAs();
        java.lang.String str18 = net.sf.freecol.common.model.AbstractGoods.toString(goodsType10, 800);
        net.sf.freecol.common.model.AbstractGoods abstractGoods19 = productionType7.getOutput(goodsType10);
        java.util.List<net.sf.freecol.common.model.GoodsType> goodsTypeList20 = goodsType10.getProductionChain();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on productionType7 and productionType15", (productionType7.compareTo(productionType15) == 0) == productionType7.equals(productionType15));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        boolean boolean1 = modifier0.requireNegatedPersonScope();
        java.lang.String str2 = modifier0.getXMLTagName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on modifier0", modifier0.compareTo(modifier0) == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        net.sf.freecol.common.model.Modifier modifier0 = net.sf.freecol.common.model.SimpleCombatModel.UNKNOWN_DEFENCE_MODIFIER;
        boolean boolean1 = modifier0.requireNegatedPersonScope();
        int int2 = modifier0.getModifierIndex();
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on modifier0", modifier0.compareTo(modifier0) == 0);
    }
}

