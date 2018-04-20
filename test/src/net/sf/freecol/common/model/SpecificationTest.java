/**
 *  Copyright (C) 2002-2015  The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.imageio.metadata.IIOMetadataNode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.sf.freecol.common.io.FreeColModFile;
import net.sf.freecol.common.io.FreeColTcFile;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.Modifier;
import net.sf.freecol.common.model.Modifier.ModifierType;
import net.sf.freecol.common.option.AbstractOption;
import net.sf.freecol.common.option.AbstractUnitOption;
import net.sf.freecol.common.option.BooleanOption;
import net.sf.freecol.common.option.IntegerOption;
import net.sf.freecol.common.option.OptionGroup;
import net.sf.freecol.common.option.RangeOption;
import net.sf.freecol.common.option.StringOption;
import net.sf.freecol.util.test.FreeColTestCase;


public final class SpecificationTest extends FreeColTestCase {

    private static final BuildingType depotType
        = spec().getBuildingType("model.building.depot");

    private static final GoodsType fishType
        = spec().getGoodsType("model.goods.fish");
    private static final GoodsType foodType
        = spec().getPrimaryFoodType();
    private static final GoodsType horsesType
        = spec().getGoodsType("model.goods.horses");
    private static final GoodsType musketsType
        = spec().getGoodsType("model.goods.muskets");
    private static final GoodsType toolsType
        = spec().getGoodsType("model.goods.tools");

    private static final Role armedBraveRole
        = spec().getRole("model.role.armedBrave");
    private static final Role cavalryRole
        = spec().getRole("model.role.cavalry");
    private static final Role dragoonRole
        = spec().getRole("model.role.dragoon");
    private static final Role infantryRole
        = spec().getRole("model.role.infantry");
    private static final Role missionaryRole
        = spec().getRole("model.role.missionary");
    private static final Role nativeDragoonRole
        = spec().getRole("model.role.nativeDragoon");
    private static final Role soldierRole
        = spec().getRole("model.role.soldier");

    private static final UnitType blackSmithType
        = spec().getUnitType("model.unit.masterBlacksmith");
    private static final UnitType braveType
        = spec().getUnitType("model.unit.brave");
    private static final UnitType caravelType
        = spec().getUnitType("model.unit.caravel");
    private static final UnitType freeColonistType
        = spec().getUnitType("model.unit.freeColonist");
    private static final UnitType kingsRegularType
        = spec().getUnitType("model.unit.kingsRegular");
    private static final UnitType privateerType
        = spec().getUnitType("model.unit.privateer");
    private static final UnitType wagonType
        = spec().getUnitType("model.unit.wagonTrain");


    /**
     * Make sure that a specification object can be created without an exception
     * being thrown.
     */
    public void testLoad() {
        Specification spec = null;
        try {
            spec = new FreeColTcFile("freecol").getSpecification();
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        assertNotNull(spec);
    }

    /**
     * Test for some typical abilities.
     */
    public void testUnitAbilities() {
        assertTrue(freeColonistType.hasAbility(Ability.FOUND_COLONY));
        assertFalse(freeColonistType.hasAbility(Ability.BORN_IN_INDIAN_SETTLEMENT));
        assertTrue(freeColonistType.isRecruitable());
        assertFalse(freeColonistType.hasAbility(Ability.NAVAL_UNIT));
        assertFalse(freeColonistType.hasAbility(Ability.CARRY_GOODS));
        assertFalse(freeColonistType.hasAbility(Ability.CARRY_UNITS));
        assertFalse(freeColonistType.hasAbility(Ability.CAPTURE_GOODS));

        assertFalse(wagonType.hasAbility(Ability.FOUND_COLONY));
        assertFalse(wagonType.isRecruitable());
        assertFalse(wagonType.hasAbility(Ability.NAVAL_UNIT));
        assertTrue(wagonType.hasAbility(Ability.CARRY_GOODS));
        assertFalse(wagonType.hasAbility(Ability.CARRY_UNITS));
        assertFalse(wagonType.hasAbility(Ability.CAPTURE_GOODS));

        //assertFalse(brave.hasAbility(Ability.FOUND_COLONY));
        assertTrue(braveType.hasAbility(Ability.BORN_IN_INDIAN_SETTLEMENT));
        assertFalse(braveType.isRecruitable());
        assertFalse(braveType.hasAbility(Ability.NAVAL_UNIT));
        assertTrue(braveType.hasAbility(Ability.CARRY_GOODS));
        assertFalse(braveType.hasAbility(Ability.CARRY_UNITS));
        assertFalse(braveType.hasAbility(Ability.CAPTURE_GOODS));

        assertFalse(caravelType.hasAbility(Ability.FOUND_COLONY));
        assertFalse(caravelType.isRecruitable());
        assertTrue(caravelType.hasAbility(Ability.NAVAL_UNIT));
        assertTrue(caravelType.hasAbility(Ability.CARRY_GOODS));
        assertTrue(caravelType.hasAbility(Ability.CARRY_UNITS));
        assertFalse(caravelType.hasAbility(Ability.CAPTURE_GOODS));

        assertFalse(privateerType.hasAbility(Ability.FOUND_COLONY));
        assertFalse(privateerType.isRecruitable());
        assertTrue(privateerType.hasAbility(Ability.NAVAL_UNIT));
        assertTrue(privateerType.hasAbility(Ability.CARRY_GOODS));
        assertTrue(privateerType.hasAbility(Ability.CARRY_UNITS));
        assertTrue(privateerType.hasAbility(Ability.CAPTURE_GOODS));
    }

    public void testFoundingFathers() {
        final FoundingFather smith
            = spec().getFoundingFather("model.foundingFather.adamSmith");
        assertNotNull(smith);
        assertEquals(FoundingFather.FoundingFatherType.TRADE, smith.getType());
        // weight is some value in [0, 10]
        assertTrue(smith.getWeight(0) >= 0);
        assertTrue(smith.getWeight(1) >= 0);
        assertTrue(smith.getWeight(2) >= 0);
        assertTrue(smith.getWeight(0) <= 10);
        assertTrue(smith.getWeight(1) <= 10);
        assertTrue(smith.getWeight(2) <= 10);

        assertEquals(0, smith.getWeight(-1));
        assertEquals(0, smith.getWeight(34));
        // check for ability
        assertTrue(smith.hasAbility(Ability.BUILD_FACTORY));
    }

    public void testModifiers() {
        // Percentage Modifier
        /*
        BuildingType ironWorks = spec.getBuildingType("model.building.ironWorks");
        Modifier modifier = ironWorks.getModifiers("model.goods.tools").iterator().next();
        assertEquals(Modifier.Type.PERCENTAGE, modifier.getType());
        assertEquals(50f, modifier.getValue());
        */

        // Additive Modifier
        Modifier modifier = depotType
            .getModifiers(Modifier.WAREHOUSE_STORAGE).iterator().next();
        assertEquals(ModifierType.ADDITIVE, modifier.getType());
        assertEquals(100f, modifier.getValue());

        // Multiplicative Modifier
        modifier = blackSmithType.getModifiers("model.goods.tools").iterator().next();
        assertEquals(ModifierType.MULTIPLICATIVE, modifier.getType());
        assertEquals(2f, modifier.getValue());
    }

    public void testNations() {
        // 4 original European nations, 4 in freecol rules
        // The unknown enemy is deliberately absent from the European
        // nations list
        List<Nation> europeanNations = spec().getEuropeanNations();
        assertEquals(8, europeanNations.size());

        // 8 original native nations
        List<Nation> indianNations = spec().getIndianNations();
        assertEquals(8, indianNations.size());

        // Unknown enemy has no REF
        List<Nation> REFNations = spec().getREFNations();
        assertEquals(europeanNations.size(), REFNations.size());
    }

    public void testNationTypes() {
        final Specification spec = spec();

        List<IndianNationType> indianNationTypes = spec.getIndianNationTypes();
        assertEquals(8, indianNationTypes.size());
        List<EuropeanNationType> REFNationTypes = spec.getREFNationTypes();
        assertEquals(1, REFNationTypes.size());

    }

    public void testRequiredAbilitiesForRoles() {
        final Specification spec = spec();
        Map<String, Boolean> abilitiesReq, expectAbilities;
        Map<String, Map<String, Boolean>> roleAbilities = new HashMap<>();

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, false);
        expectAbilities.put(Ability.REF_UNIT, false);
        roleAbilities.put("model.role.scout", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, false);
        expectAbilities.put(Ability.REF_UNIT, false);
        roleAbilities.put("model.role.soldier", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, false);
        expectAbilities.put(Ability.REF_UNIT, false);
        roleAbilities.put("model.role.dragoon", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, false);
        expectAbilities.put(Ability.REF_UNIT, false);
        roleAbilities.put("model.role.pioneer", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.DRESS_MISSIONARY, true);
        expectAbilities.put(Ability.NATIVE, false);
        expectAbilities.put(Ability.REF_UNIT, false);
        roleAbilities.put("model.role.missionary", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, false);
        expectAbilities.put(Ability.REF_UNIT, true);
        expectAbilities.put(Ability.ROYAL_EXPEDITIONARY_FORCE, true);
        roleAbilities.put("model.role.infantry", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, false);
        expectAbilities.put(Ability.REF_UNIT, true);
        expectAbilities.put(Ability.ROYAL_EXPEDITIONARY_FORCE, true);
        roleAbilities.put("model.role.cavalry", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, true);
        expectAbilities.put(Ability.REF_UNIT, false);
        roleAbilities.put("model.role.mountedBrave", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, true);
        expectAbilities.put(Ability.REF_UNIT, false);
        roleAbilities.put("model.role.armedBrave", expectAbilities);

        expectAbilities = new HashMap<>();
        expectAbilities.put(Ability.CAN_BE_EQUIPPED, true);
        expectAbilities.put(Ability.NATIVE, true);
        expectAbilities.put(Ability.REF_UNIT, false);
        roleAbilities.put("model.role.nativeDragoon", expectAbilities);

        // Verify
        for (Entry<String, Map<String, Boolean>> entry
                 : roleAbilities.entrySet()) {
            Role role = spec.getRole(entry.getKey());
            Map<String, Boolean> required = role.getRequiredAbilities();
            expectAbilities = entry.getValue();
            for (String key : required.keySet()) {
                Boolean req = required.get(key);
                Boolean val = expectAbilities.get(key);
                assertNotNull(role.getId() + " missing " + key, val);
                assertEquals(role.getId() + " " + key + " value != " + req,
                    req, val);
                expectAbilities.remove(key);
            }
            assertEquals(role.getId() + " excess abilities", 0,
                expectAbilities.size());
        }

        Role role;
        role = spec.getRole("model.role.default");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods());

        role = spec.getRole("model.role.scout");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(horsesType, 50));

        role = spec.getRole("model.role.soldier");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(musketsType, 50));

        role = spec.getRole("model.role.dragoon");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(horsesType, 50),
            new AbstractGoods(musketsType, 50));

        role = spec.getRole("model.role.pioneer");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(toolsType, 20));

        role = spec.getRole("model.role.missionary");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods());

        role = spec.getRole("model.role.infantry");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(musketsType, 50));

        role = spec.getRole("model.role.cavalry");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(horsesType, 50),
            new AbstractGoods(musketsType, 50));

        role = spec.getRole("model.role.mountedBrave");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(horsesType, 25));

        role = spec.getRole("model.role.armedBrave");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(musketsType, 25));

        role = spec.getRole("model.role.nativeDragoon");
        assertNotNull(role);
        checkGoods(role.getId(), role.getRequiredGoods(),
            new AbstractGoods(horsesType, 25),
            new AbstractGoods(musketsType, 25));
    }

    public void testGoodsTypes() {
        assertTrue(foodType.isFarmed());
        assertTrue(spec().getFarmedGoodsTypeList().contains(foodType));
        assertTrue(foodType.isFoodType());
        assertTrue(spec().getFoodGoodsTypeList().contains(foodType));

        assertTrue(fishType.isFarmed());
        assertTrue(spec().getFarmedGoodsTypeList().contains(fishType));
        assertTrue(fishType.isFoodType());
        assertTrue(spec().getFoodGoodsTypeList().contains(fishType));
    }

    public void testExtends() {
        String specification = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<freecol-specification id=\"test\" extends=\"freecol\">"
            + "<unit-types>"
            + "<unit-type id=\"model.unit.milkmaid\" extends=\"colonist\" "
            + "expert-production=\"model.goods.food\" />"
            + "</unit-types>"
            + "</freecol-specification>";

        Specification spec = new Specification(new ByteArrayInputStream(specification.getBytes()));

        assertNotNull(spec.getUnitType("model.unit.milkmaid"));
        assertNotNull(spec.getUnitType("model.unit.caravel"));

        // restore original values
        try {
            spec = new Specification(new FreeColTcFile("freecol").getSpecificationInputStream());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testExtendsDelete() {
        String specification = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<freecol-specification id=\"test\" extends=\"freecol\">"
            + "<unit-types>"
            + "<delete id=\"model.unit.caravel\" />"
            + "</unit-types>"
            + "</freecol-specification>";

        Specification spec = new Specification(new ByteArrayInputStream(specification.getBytes()));

        try {
            spec.getUnitType("model.unit.caravel");
            fail("Caravel is defined.");
        } catch (IllegalArgumentException e) {
        }

        for (UnitType unitType : spec.getUnitTypeList()) {
            assertFalse("model.unit.caravel".equals(unitType.getId()));
        }

        // restore original values
        try {
            spec = new Specification(new FreeColTcFile("freecol").getSpecificationInputStream());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testGetDefaultUnitType() {
        NationType europeanNationType = null;
        NationType nativeNationType = null;
        NationType refNationType = null;
        for (NationType nt : spec().getNationTypes()) {
            if (nt.isIndian()) {
                if (nativeNationType == null) nativeNationType = nt;
            } else if (nt.isREF()) {
                if (refNationType == null) refNationType = nt;
            } else {
                if (europeanNationType == null) europeanNationType = nt;
            }
        }
        assertNotNull("No European nation type", europeanNationType);
        assertNotNull("No native nation type", nativeNationType);
        assertNotNull("No REF nation type", refNationType);
                
        assertEquals("Should find free colonist", freeColonistType,
                     spec().getDefaultUnitType(europeanNationType));
        assertEquals("Should find brave", braveType,
                     spec().getDefaultUnitType(nativeNationType));
        assertEquals("Should find kings regular", kingsRegularType,
                     spec().getDefaultUnitType(refNationType));
    }        
        
    public void testLoadMods() {
        try {
            Specification specification = new Specification(new FreeColTcFile("freecol").getSpecificationInputStream());
            int numberOfUnitTypes = specification.getUnitTypeList().size();
            List<FreeColModFile> mods = new ArrayList<>();
            mods.add(new FreeColModFile(new File("data/mods/example")));
            specification.loadMods(mods);
            UnitType milkmaid = specification.getUnitType("model.unit.milkmaid");
            assertEquals(numberOfUnitTypes + 1, 
                specification.getUnitTypeList().size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    @Test
	public void testSpecification_1()
		throws Exception {

		Specification result = new Specification();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getDifficultyOptionGroup());
		assertEquals(null, result.getFastestNavalUnitType());
		assertEquals(null, result.getFastestLandUnitType());
		assertEquals(null, result.getDefaultNationType());
		assertEquals(null, result.getMissionaryRole());
		assertEquals(null, result.getDifficultyLevel());
		assertEquals(null, result.getScoutRole());
		assertEquals(null, result.getPioneerRole());
	}

	/**
	 * Run the Specification() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testSpecification_2()
		throws Exception {

		Specification result = new Specification();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getDifficultyOptionGroup());
		assertEquals(null, result.getFastestNavalUnitType());
		assertEquals(null, result.getFastestLandUnitType());
		assertEquals(null, result.getDefaultNationType());
		assertEquals(null, result.getMissionaryRole());
		assertEquals(null, result.getDifficultyLevel());
		assertEquals(null, result.getScoutRole());
		assertEquals(null, result.getPioneerRole());
	}

	/**
	 * Run the void addAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddAbility_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		fixture.addAbility(id);

		// add additional test code here
	}

	/**
	 * Run the void addAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddAbility_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		fixture.addAbility(id);

		// add additional test code here
	}

	/**
	 * Run the void addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddAbility_3()
		throws Exception {
		Specification fixture = new Specification();
		Ability ability = new Ability("");

		fixture.addAbility(ability);

		// add additional test code here
	}

	/**
	 * Run the void addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddModifier_1()
		throws Exception {
		Specification fixture = new Specification();
		Modifier modifier = new Modifier(new Specification());

		fixture.addModifier(modifier);

		// add additional test code here
	}

	/**
	 * Run the void addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddModifier_2()
		throws Exception {
		Specification fixture = new Specification();
		Modifier modifier = new Modifier(new Specification());

		fixture.addModifier(modifier);

		// add additional test code here
	}

	/**
	 * Run the void addOptionGroup(OptionGroup,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddOptionGroup_1()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup optionGroup = new OptionGroup("");
		boolean recursive = true;

		fixture.addOptionGroup(optionGroup, recursive);

		// add additional test code here
	}

	/**
	 * Run the void addOptionGroup(OptionGroup,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddOptionGroup_2()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup optionGroup = new OptionGroup("");
		boolean recursive = true;

		fixture.addOptionGroup(optionGroup, recursive);

		// add additional test code here
	}

	/**
	 * Run the void addOptionGroup(OptionGroup,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddOptionGroup_3()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup optionGroup = new OptionGroup("");
		boolean recursive = false;

		fixture.addOptionGroup(optionGroup, recursive);

		// add additional test code here
	}

	/**
	 * Run the void addOptionGroup(OptionGroup,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testAddOptionGroup_4()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup optionGroup = new OptionGroup("");
		boolean recursive = true;

		fixture.addOptionGroup(optionGroup, recursive);

		// add additional test code here
	}

	/**
	 * Run the void applyDifficultyLevel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testApplyDifficultyLevel_1()
		throws Exception {
		Specification fixture = new Specification();
		String difficulty = "";

		fixture.applyDifficultyLevel(difficulty);

		// add additional test code here
	}

	/**
	 * Run the void applyDifficultyLevel(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testApplyDifficultyLevel_2()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup level = null;

		fixture.applyDifficultyLevel(level);

		// add additional test code here
	}

	/**
	 * Run the void applyDifficultyLevel(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testApplyDifficultyLevel_3()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup level = new OptionGroup("");

		fixture.applyDifficultyLevel(level);

		// add additional test code here
	}

	/**
	 * Run the void clearEuropeanNationalAdvantages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testClearEuropeanNationalAdvantages_1()
		throws Exception {
		Specification fixture = new Specification();

		fixture.clearEuropeanNationalAdvantages();

		// add additional test code here
	}

	/**
	 * Run the void clearEuropeanNationalAdvantages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testClearEuropeanNationalAdvantages_2()
		throws Exception {
		Specification fixture = new Specification();

		fixture.clearEuropeanNationalAdvantages();

		// add additional test code here
	}

	/**
	 * Run the void disableEditing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testDisableEditing_1()
		throws Exception {
		Specification fixture = new Specification();

		fixture.disableEditing();

		// add additional test code here
	}

	/**
	 * Run the void disableEditing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testDisableEditing_2()
		throws Exception {
		Specification fixture = new Specification();

		fixture.disableEditing();

		// add additional test code here
	}

	/**
	 * Run the void disableEditing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testDisableEditing_3()
		throws Exception {
		Specification fixture = new Specification();

		fixture.disableEditing();

		// add additional test code here
	}

	/**
	 * Run the FreeColGameObjectType findType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testFindType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		FreeColGameObjectType result = fixture.findType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType findType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testFindType_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		FreeColGameObjectType result = fixture.findType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Ability> getAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetAbilities_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		List<Ability> result = fixture.getAbilities(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getAge(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetAge_1()
		throws Exception {
		Specification fixture = new Specification();
		Turn turn = new Turn(1);

		int result = fixture.getAge(turn);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getAge(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetAge_2()
		throws Exception {
		Specification fixture = new Specification();
		Turn turn = new Turn(1);

		int result = fixture.getAge(turn);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getAge(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetAge_3()
		throws Exception {
		Specification fixture = new Specification();
		Turn turn = new Turn(1);

		int result = fixture.getAge(turn);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getAge(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetAge_4()
		throws Exception {
		Specification fixture = new Specification();
		Turn turn = new Turn(1);

		int result = fixture.getAge(turn);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the List<UnitType> getBuildableUnitTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetBuildableUnitTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getBuildableUnitTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the BuildingType getBuildingType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetBuildingType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		BuildingType result = fixture.getBuildingType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(800, result.getPriority());
		assertEquals(1, result.getLevel());
		assertEquals(null, result.getProducedGoodsType());
		assertEquals("building-type", result.getXMLTagName());
		assertEquals(true, result.isAutomaticBuild());
		assertEquals(0, result.getUpkeep());
		assertEquals(null, result.getUpgradesFrom());
		assertEquals(null, result.getUpgradesTo());
		assertEquals(3, result.getWorkPlaces());
		assertEquals(false, result.isDefenceType());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<building-type id=\"\" workplaces=\"3\"></building-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<BuildingType> getBuildingTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetBuildingTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<BuildingType> result = fixture.getBuildingTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the NationType getDefaultNationType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDefaultNationType_1()
		throws Exception {
		Specification fixture = new Specification();

		NationType result = fixture.getDefaultNationType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Role getDefaultRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDefaultRole_1()
		throws Exception {
		Specification fixture = new Specification();

		Role result = fixture.getDefaultRole();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isOffensive());
		assertEquals("role", result.getXMLTagName());
		assertEquals("default", result.getRoleSuffix());
		assertEquals(true, result.isDefaultRole());
		assertEquals(null, result.getExpertUnit());
		assertEquals(null, result.getDowngrade());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals("[Role default]", result.toFullString());
		assertEquals(false, result.isDefensive());
		assertEquals(1, result.getMaximumCount());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.role.default", result.toString());
		assertEquals("model.role.default.description", result.getDescriptionKey());
		assertEquals("model.role.default.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.role.default", result.getId());
		assertEquals("default", result.getSuffix());
		assertEquals("<role id=\"model.role.default\"></role>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.role.default", result.getIdType());
	}

	/**
	 * Run the UnitType getDefaultUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDefaultUnitType_1()
		throws Exception {
		Specification fixture = new Specification();

		UnitType result = fixture.getDefaultUnitType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(null, result.getExpertProduction());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(0, result.getScoreValue());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.canCarryGoods());
		assertEquals(0, result.getBaseOffence());
		assertEquals(0, result.getHitPoints());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(false, result.canCarryUnits());
		assertEquals(1, result.getBaseDefence());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.isPerson());
		assertEquals(false, result.hasPrice());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.unit.freeColonist", result.getIdType());
	}

	/**
	 * Run the UnitType getDefaultUnitType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDefaultUnitType_2()
		throws Exception {
		Specification fixture = new Specification();
		NationType nationType = new EuropeanNationType("", new Specification());

		UnitType result = fixture.getDefaultUnitType(nationType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(null, result.getExpertProduction());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(0, result.getScoreValue());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.canCarryGoods());
		assertEquals(0, result.getBaseOffence());
		assertEquals(0, result.getHitPoints());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(false, result.canCarryUnits());
		assertEquals(1, result.getBaseDefence());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.isPerson());
		assertEquals(false, result.hasPrice());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.unit.freeColonist", result.getIdType());
	}

	/**
	 * Run the UnitType getDefaultUnitType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDefaultUnitType_3()
		throws Exception {
		Specification fixture = new Specification();
		NationType nationType = new EuropeanNationType("", new Specification());

		UnitType result = fixture.getDefaultUnitType(nationType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(null, result.getExpertProduction());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(0, result.getScoreValue());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.canCarryGoods());
		assertEquals(0, result.getBaseOffence());
		assertEquals(0, result.getHitPoints());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(false, result.canCarryUnits());
		assertEquals(1, result.getBaseDefence());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.isPerson());
		assertEquals(false, result.hasPrice());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.unit.freeColonist", result.getIdType());
	}

	/**
	 * Run the UnitType getDefaultUnitType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDefaultUnitType_4()
		throws Exception {
		Specification fixture = new Specification();
		NationType nationType = new EuropeanNationType("", new Specification());

		UnitType result = fixture.getDefaultUnitType(nationType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(null, result.getExpertProduction());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(0, result.getScoreValue());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.canCarryGoods());
		assertEquals(0, result.getBaseOffence());
		assertEquals(0, result.getHitPoints());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(false, result.canCarryUnits());
		assertEquals(1, result.getBaseDefence());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.isPerson());
		assertEquals(false, result.hasPrice());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.unit.freeColonist", result.getIdType());
	}

	/**
	 * Run the UnitType getDefaultUnitType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDefaultUnitType_5()
		throws Exception {
		Specification fixture = new Specification();
		NationType nationType = null;

		UnitType result = fixture.getDefaultUnitType(nationType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(null, result.getExpertProduction());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(0, result.getScoreValue());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.canCarryGoods());
		assertEquals(0, result.getBaseOffence());
		assertEquals(0, result.getHitPoints());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(false, result.canCarryUnits());
		assertEquals(1, result.getBaseDefence());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.isPerson());
		assertEquals(false, result.hasPrice());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.unit.freeColonist", result.getIdType());
	}

	/**
	 * Run the UnitType getDefaultUnitType(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDefaultUnitType_7()
		throws Exception {
		Specification fixture = new Specification();
		Player player = null;

		UnitType result = fixture.getDefaultUnitType(player);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.unit.freeColonist", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(null, result.getExpertProduction());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals("model.unit.freeColonist.workingAs", result.getWorkingAsKey());
		assertEquals(0, result.getScoreValue());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.canCarryGoods());
		assertEquals(0, result.getBaseOffence());
		assertEquals(0, result.getHitPoints());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(false, result.canCarryUnits());
		assertEquals(1, result.getBaseDefence());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.isPerson());
		assertEquals(false, result.hasPrice());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("model.unit.freeColonist.description", result.getDescriptionKey());
		assertEquals("model.unit.freeColonist.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.unit.freeColonist", result.getId());
		assertEquals("freeColonist", result.getSuffix());
		assertEquals("<unit-type id=\"model.unit.freeColonist\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.unit.freeColonist", result.getIdType());
	}

	/**
	 * Run the String getDifficultyLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDifficultyLevel_1()
		throws Exception {
		Specification fixture = new Specification();

		String result = fixture.getDifficultyLevel();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<OptionGroup> getDifficultyLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDifficultyLevels_1()
		throws Exception {
		Specification fixture = new Specification();

		List<OptionGroup> result = fixture.getDifficultyLevels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<OptionGroup> getDifficultyLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDifficultyLevels_2()
		throws Exception {
		Specification fixture = new Specification();

		List<OptionGroup> result = fixture.getDifficultyLevels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<OptionGroup> getDifficultyLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDifficultyLevels_3()
		throws Exception {
		Specification fixture = new Specification();

		List<OptionGroup> result = fixture.getDifficultyLevels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<OptionGroup> getDifficultyLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDifficultyLevels_4()
		throws Exception {
		Specification fixture = new Specification();

		List<OptionGroup> result = fixture.getDifficultyLevels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the OptionGroup getDifficultyOptionGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDifficultyOptionGroup_1()
		throws Exception {
		Specification fixture = new Specification();

		OptionGroup result = fixture.getDifficultyOptionGroup();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup getDifficultyOptionGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDifficultyOptionGroup_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		OptionGroup result = fixture.getDifficultyOptionGroup(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Disaster getDisaster(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDisaster_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		Disaster result = fixture.getDisaster(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[]", result.toString());
		assertEquals("disaster", result.getXMLTagName());
		assertEquals(false, result.isNatural());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<disaster id=\"\" natural=\"false\" effects=\"one\"></disaster>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<Disaster> getDisasters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetDisasters_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Disaster> result = fixture.getDisasters();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EquipmentType getEquipmentType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetEquipmentType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		EquipmentType result = fixture.getEquipmentType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRole());
		assertEquals(-1, result.getCombatLossPriority());
		assertEquals(false, result.isMilitaryEquipment());
		assertEquals("equipment-type", result.getXMLTagName());
		assertEquals(false, result.canBeCaptured());
		assertEquals(1, result.getMaximumCount());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<equipment-type id=\"\" maximum-count=\"1\" combat-loss-priority=\"-1\"></equipment-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<EuropeanNationType> getEuropeanNationTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetEuropeanNationTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<EuropeanNationType> result = fixture.getEuropeanNationTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Nation> getEuropeanNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetEuropeanNations_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Nation> result = fixture.getEuropeanNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Event getEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetEvent_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		Event result = fixture.getEvent(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals("event", result.getXMLTagName());
		assertEquals(0, result.getScoreValue());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<event id=\"\"></event>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<Event> getEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetEvents_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Event> result = fixture.getEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the UnitType getExpertForProducing(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetExpertForProducing_1()
		throws Exception {
		Specification fixture = new Specification();
		GoodsType goodsType = new GoodsType("", new Specification());

		UnitType result = fixture.getExpertForProducing(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GoodsType> getFarmedGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetFarmedGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getFarmedGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the UnitType getFastestLandUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetFastestLandUnitType_1()
		throws Exception {
		Specification fixture = new Specification();

		UnitType result = fixture.getFastestLandUnitType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the UnitType getFastestNavalUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetFastestNavalUnitType_1()
		throws Exception {
		Specification fixture = new Specification();

		UnitType result = fixture.getFastestNavalUnitType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GoodsType> getFoodGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetFoodGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getFoodGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FoundingFather getFoundingFather(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetFoundingFather_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		FoundingFather result = fixture.getFoundingFather(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals("founding-father", result.getXMLTagName());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<FoundingFather> getFoundingFathers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetFoundingFathers_1()
		throws Exception {
		Specification fixture = new Specification();

		List<FoundingFather> result = fixture.getFoundingFathers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the GoodsType getGoodsType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetGoodsType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		GoodsType result = fixture.getGoodsType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNewWorldGoodsType());
		assertEquals(false, result.isImmigrationType());
		assertEquals(false, result.isRawBuildingMaterial());
		assertEquals(false, result.isNewWorldLuxuryType());
		assertEquals(Integer.MAX_VALUE, result.getBreedingNumber());
		assertEquals(false, result.isBuildingMaterial());
		assertEquals(1.0f, result.getProductionWeight(), 1.0f);
		assertEquals(0.0f, result.getLowProductionThreshold(), 1.0f);
		assertEquals(1.0f, result.getZeroProductionFactor(), 1.0f);
		assertEquals("goods-type", result.getXMLTagName());
		assertEquals(false, result.isTradeGoods());
		assertEquals(false, result.isRawMaterial());
		assertEquals(false, result.isBreedable());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals(null, result.getOutputType());
		assertEquals(false, result.isMilitaryGoods());
		assertEquals(false, result.isRefined());
		assertEquals(false, result.isStoredAs());
		assertEquals(false, result.limitIgnored());
		assertEquals(null, result.getInputType());
		assertEquals(0, result.getInitialAmount());
		assertEquals(false, result.isFoodType());
		assertEquals(false, result.isStorable());
		assertEquals(false, result.isLibertyType());
		assertEquals(false, result.isFarmed());
		assertEquals(Integer.MAX_VALUE, result.getPrice());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<goods-type id=\"\" is-farmed=\"false\" is-food=\"false\" is-military=\"false\" ignore-limit=\"false\" new-world-goods=\"false\" trade-goods=\"false\" storable=\"false\" production-weight=\"1.0\"></goods-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<GoodsType> getGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Specification fixture = new Specification();

		String result = fixture.getId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GoodsType> getImmigrationGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetImmigrationGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getImmigrationGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<IndianNationType> getIndianNationTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetIndianNationTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<IndianNationType> result = fixture.getIndianNationTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Nation> getIndianNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetIndianNations_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Nation> result = fixture.getIndianNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getInitialPrice(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetInitialPrice_1()
		throws Exception {
		Specification fixture = new Specification();
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getInitialPrice(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInitialPrice(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetInitialPrice_2()
		throws Exception {
		Specification fixture = new Specification();
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getInitialPrice(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInitialPrice(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetInitialPrice_3()
		throws Exception {
		Specification fixture = new Specification();
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getInitialPrice(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the List<GoodsType> getLibertyGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetLibertyGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getLibertyGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Role> getMilitaryRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetMilitaryRoles_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Role> result = fixture.getMilitaryRoles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Role> getMilitaryRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetMilitaryRoles_2()
		throws Exception {
		Specification fixture = new Specification();

		List<Role> result = fixture.getMilitaryRoles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Role getMissionaryRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetMissionaryRole_1()
		throws Exception {
		Specification fixture = new Specification();

		Role result = fixture.getMissionaryRole();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Modifier> getModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetModifiers_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		List<Modifier> result = fixture.getModifiers(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Modifier> getModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetModifiers_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		List<Modifier> result = fixture.getModifiers(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Nation getNation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetNation_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		Nation result = fixture.getNation(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getColor());
		assertEquals(true, result.startsOnEastCoast());
		assertEquals(0, result.getPreferredLatitude());
		assertEquals(null, result.forceDefaultColor());
		assertEquals("nation", result.getXMLTagName());
		assertEquals(null, result.getREFNation());
		assertEquals(null, result.getRebelNation());
		assertEquals(".ruler", result.getRulerName());
		assertEquals(".ruler", result.getRulerNameKey());
		assertEquals(false, result.isUnknownEnemy());
		assertEquals(false, result.isSelectable());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<nation id=\"\" selectable=\"false\" preferred-latitude=\"0\" starts-on-east-coast=\"true\"></nation>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the NationType getNationType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetNationType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		NationType result = fixture.getNationType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<NationType> getNationTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetNationTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<NationType> result = fixture.getNationTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Nation> getNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetNations_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Nation> result = fixture.getNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<GoodsType> getNewWorldGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetNewWorldGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getNewWorldGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<GoodsType> getNewWorldLuxuryGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetNewWorldLuxuryGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getNewWorldLuxuryGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Role getPioneerRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetPioneerRole_1()
		throws Exception {
		Specification fixture = new Specification();

		Role result = fixture.getPioneerRole();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getPrimaryFoodType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetPrimaryFoodType_1()
		throws Exception {
		Specification fixture = new Specification();

		GoodsType result = fixture.getPrimaryFoodType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNewWorldGoodsType());
		assertEquals(false, result.isImmigrationType());
		assertEquals(false, result.isRawBuildingMaterial());
		assertEquals(false, result.isNewWorldLuxuryType());
		assertEquals(Integer.MAX_VALUE, result.getBreedingNumber());
		assertEquals(false, result.isBuildingMaterial());
		assertEquals(1.0f, result.getProductionWeight(), 1.0f);
		assertEquals(0.0f, result.getLowProductionThreshold(), 1.0f);
		assertEquals(1.0f, result.getZeroProductionFactor(), 1.0f);
		assertEquals("goods-type", result.getXMLTagName());
		assertEquals(false, result.isTradeGoods());
		assertEquals(false, result.isRawMaterial());
		assertEquals(false, result.isBreedable());
		assertEquals("model.goods.food.workingAs", result.getWorkingAsKey());
		assertEquals(null, result.getOutputType());
		assertEquals(false, result.isMilitaryGoods());
		assertEquals(false, result.isRefined());
		assertEquals(false, result.isStoredAs());
		assertEquals(false, result.limitIgnored());
		assertEquals(null, result.getInputType());
		assertEquals(0, result.getInitialAmount());
		assertEquals(false, result.isFoodType());
		assertEquals(false, result.isStorable());
		assertEquals(false, result.isLibertyType());
		assertEquals(false, result.isFarmed());
		assertEquals(Integer.MAX_VALUE, result.getPrice());
		assertEquals("model.goods.food", result.toString());
		assertEquals("model.goods.food.description", result.getDescriptionKey());
		assertEquals("model.goods.food.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.goods.food", result.getId());
		assertEquals("food", result.getSuffix());
		assertEquals("<goods-type id=\"model.goods.food\" is-farmed=\"false\" is-food=\"false\" is-military=\"false\" ignore-limit=\"false\" new-world-goods=\"false\" trade-goods=\"false\" storable=\"false\" production-weight=\"1.0\"></goods-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.goods.food", result.getIdType());
	}

	/**
	 * Run the List<EuropeanNationType> getREFNationTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetREFNationTypes_1()
		throws Exception {
		Specification fixture = new Specification();

		List<EuropeanNationType> result = fixture.getREFNationTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Nation> getREFNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetREFNations_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Nation> result = fixture.getREFNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Role> getREFRoles(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetREFRoles_1()
		throws Exception {
		Specification fixture = new Specification();
		boolean naval = false;

		List<Role> result = fixture.getREFRoles(naval);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Role> getREFRoles(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetREFRoles_2()
		throws Exception {
		Specification fixture = new Specification();
		boolean naval = true;

		List<Role> result = fixture.getREFRoles(naval);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<UnitType> getREFUnitTypes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetREFUnitTypes_1()
		throws Exception {
		Specification fixture = new Specification();
		boolean naval = true;

		List<UnitType> result = fixture.getREFUnitTypes(naval);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<GoodsType> getRawBuildingGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetRawBuildingGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getRawBuildingGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ResourceType getResourceType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetResourceType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		ResourceType result = fixture.getResourceType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getMaxValue());
		assertEquals(0, result.getMinValue());
		assertEquals("resource-type", result.getXMLTagName());
		assertEquals(null, result.getBestGoodsType());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<resource-type id=\"\" maximum-value=\"0\" minimum-value=\"0\"></resource-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<ResourceType> getResourceTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetResourceTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<ResourceType> result = fixture.getResourceTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Role getRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		Role result = fixture.getRole(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isOffensive());
		assertEquals("role", result.getXMLTagName());
		assertEquals("", result.getRoleSuffix());
		assertEquals(false, result.isDefaultRole());
		assertEquals(null, result.getExpertUnit());
		assertEquals(null, result.getDowngrade());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals("[Role ]", result.toFullString());
		assertEquals(false, result.isDefensive());
		assertEquals(1, result.getMaximumCount());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<role id=\"\"></role>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the Role getRoleWithAbility(String,List<Role>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetRoleWithAbility_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		List<Role> roles = new ArrayList<Role>();

		Role result = fixture.getRoleWithAbility(id, roles);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Role> getRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetRoles_1()
		throws Exception {
		Specification fixture = new Specification();

		List<Role> result = fixture.getRoles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Role getScoutRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetScoutRole_1()
		throws Exception {
		Specification fixture = new Specification();

		Role result = fixture.getScoutRole();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GoodsType> getStorableGoodsTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetStorableGoodsTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<GoodsType> result = fixture.getStorableGoodsTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the TileImprovementType getTileImprovementType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetTileImprovementType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		TileImprovementType result = fixture.getTileImprovementType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getZIndex());
		assertEquals(0, result.getExposeResourcePercent());
		assertEquals(0, result.getExpendedAmount());
		assertEquals(null, result.getRequiredImprovementType());
		assertEquals("tile-improvement-type", result.getXMLTagName());
		assertEquals(false, result.isNatural());
		assertEquals(0, result.getAddWorkTurns());
		assertEquals(false, result.isChangeType());
		assertEquals(null, result.getRequiredRole());
		assertEquals(0, result.getMagnitude());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<tile-improvement-type id=\"\" natural=\"false\" magnitude=\"0\" add-work-turns=\"0\" movement-cost=\"-1\" zIndex=\"0\" expose-resource-percent=\"0\"></tile-improvement-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<TileImprovementType> getTileImprovementTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetTileImprovementTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<TileImprovementType> result = fixture.getTileImprovementTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the TileType getTileType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetTileType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		TileType result = fixture.getTileType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getIndex());
		assertEquals(false, result.isHighSeasConnected());
		assertEquals(false, result.isDirectlyHighSeasConnected());
		assertEquals(0, result.getBasicWorkTurns());
		assertEquals(false, result.isElevation());
		assertEquals(false, result.isForested());
		assertEquals("tile-type", result.getXMLTagName());
		assertEquals(false, result.isWater());
		assertEquals(0, result.getBasicMoveCost());
		assertEquals(false, result.canSettle());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<tile-type id=\"\" basic-move-cost=\"0\" basic-work-turns=\"0\" is-forest=\"false\" is-water=\"false\" is-elevation=\"false\" is-connected=\"false\" can-settle=\"false\"><gen humidity-minimum=\"0\" humidity-maximum=\"0\" temperature-minimum=\"0\" temperature-maximum=\"0\" altitude-minimum=\"0\" altitude-maximum=\"0\"></gen></tile-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<TileType> getTileTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetTileTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<TileType> result = fixture.getTileTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_3()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_4()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_5()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_6()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_7()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_8()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_9()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetType_10()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(id, type);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<FreeColGameObjectType> getTypesWithAbility(Class<T>,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetTypesWithAbility_1()
		throws Exception {
		Specification fixture = new Specification();
		Class<FreeColGameObjectType> resultType = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.getTypesWithAbility(resultType);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<FreeColGameObjectType> getTypesWithoutAbility(Class<T>,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetTypesWithoutAbility_1()
		throws Exception {
		Specification fixture = new Specification();
		Class<FreeColGameObjectType> resultType = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.getTypesWithoutAbility(resultType);

		// add additional test code here
		assertNotNull(result);
		assertEquals(13, result.size());
	}

	/**
	 * Run the UnitType getUnitType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetUnitType_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		UnitType result = fixture.getUnitType(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(null, result.getExpertProduction());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals(0, result.getScoreValue());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.canCarryGoods());
		assertEquals(0, result.getBaseOffence());
		assertEquals(0, result.getHitPoints());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(false, result.canCarryUnits());
		assertEquals(1, result.getBaseDefence());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.isPerson());
		assertEquals(false, result.hasPrice());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<unit-type id=\"\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<UnitType> getUnitTypeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetUnitTypeList_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypeList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesPurchasedInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetUnitTypesPurchasedInEurope_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypesPurchasedInEurope();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesTrainedInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetUnitTypesTrainedInEurope_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypesTrainedInEurope();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesWithAbility(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetUnitTypesWithAbility_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypesWithAbility();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesWithoutAbility(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetUnitTypesWithoutAbility_1()
		throws Exception {
		Specification fixture = new Specification();

		List<UnitType> result = fixture.getUnitTypesWithoutAbility();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		Specification fixture = new Specification();

		String result = fixture.getVersion();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Specification.getXMLElementTagName();

		// add additional test code here
		assertEquals("freecol-specification", result);
	}

	/**
	 * Run the boolean hasOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testHasOption_1()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		boolean result = fixture.hasOption(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testHasOption_2()
		throws Exception {
		Specification fixture = new Specification();
		String id = null;

		boolean result = fixture.hasOption(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasOption(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testHasOption_3()
		throws Exception {
		Specification fixture = new Specification();
		String id = "";

		boolean result = fixture.hasOption(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean loadMods(List<FreeColModFile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadMods_1()
		throws Exception {
		Specification fixture = new Specification();
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();

		boolean result = fixture.loadMods(mods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean loadMods(List<FreeColModFile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadMods_2()
		throws Exception {
		Specification fixture = new Specification();
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();

		boolean result = fixture.loadMods(mods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean loadMods(List<FreeColModFile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadMods_3()
		throws Exception {
		Specification fixture = new Specification();
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();

		boolean result = fixture.loadMods(mods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean loadMods(List<FreeColModFile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadMods_4()
		throws Exception {
		Specification fixture = new Specification();
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();

		boolean result = fixture.loadMods(mods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadOptionsFile_1()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadOptionsFile_2()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadOptionsFile_3()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadOptionsFile_4()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup loadOptionsFile(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testLoadOptionsFile_5()
		throws Exception {
		Specification fixture = new Specification();
		String optionId = "";
		File file = new File("");

		OptionGroup result = fixture.loadOptionsFile(optionId, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testMergeGroup_1()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testMergeGroup_2()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testMergeGroup_3()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");
		group.add(new AbstractUnitOption(new Specification()));

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testMergeGroup_4()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");
		group.add(new AbstractUnitOption(new Specification()));

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup mergeGroup(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testMergeGroup_5()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup group = new OptionGroup("");
		group.add(new AbstractUnitOption(new Specification()));

		OptionGroup result = fixture.mergeGroup(group);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup saveOptionsFile(OptionGroup,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testSaveOptionsFile_1()
		throws Exception {
		OptionGroup group = new OptionGroup("");
		File file = new File("");

		OptionGroup result = Specification.saveOptionsFile(group, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup saveOptionsFile(OptionGroup,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testSaveOptionsFile_2()
		throws Exception {
		OptionGroup group = new OptionGroup("");
		File file = new File("");

		OptionGroup result = Specification.saveOptionsFile(group, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup saveOptionsFile(OptionGroup,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testSaveOptionsFile_3()
		throws Exception {
		OptionGroup group = new OptionGroup("");
		File file = new File("");

		OptionGroup result = Specification.saveOptionsFile(group, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup saveOptionsFile(OptionGroup,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testSaveOptionsFile_4()
		throws Exception {
		OptionGroup group = null;
		File file = new File("");

		OptionGroup result = Specification.saveOptionsFile(group, file);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setGameOptions(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testSetGameOptions_1()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup go = new OptionGroup("");

		fixture.setGameOptions(go);

		// add additional test code here
	}

	/**
	 * Run the void setMapGeneratorOptions(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Test
	public void testSetMapGeneratorOptions_1()
		throws Exception {
		Specification fixture = new Specification();
		OptionGroup mgo = new OptionGroup("");

		fixture.setMapGeneratorOptions(mgo);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/20/18 5:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SpecificationTest.class);
	}
    
}
