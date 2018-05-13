package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Ability;
import net.sf.freecol.common.model.AbstractGoods;
import net.sf.freecol.common.model.FeatureContainer;
import net.sf.freecol.common.model.FreeColObject;
import net.sf.freecol.common.model.Modifier;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.Turn;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FeatureContainerTest</code> contains tests for the class <code>{@link FeatureContainer}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:48 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class FeatureContainerTest {
	/**
	 * Run the FeatureContainer() constructor test.
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testFeatureContainer_1()
		throws Exception {
		FeatureContainer result = new FeatureContainer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddAbility_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = null;

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddAbility_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddAbility_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_6()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_7()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_8()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_9()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_10()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_11()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_12()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_13()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_14()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_15()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddFeatures_16()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddModifier_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = null;

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddModifier_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testAddModifier_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testApplyModifiers_1()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = null;

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testApplyModifiers_2()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testApplyModifiers_3()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testApplyModifiers_4()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testApplyModifiers_5()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FeatureContainer.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}


	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testClear_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testClear_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testClear_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the boolean containsAbilityKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testContainsAbilityKey_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String key = "";

		boolean result = fixture.containsAbilityKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsAbilityKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testContainsAbilityKey_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String key = "";

		boolean result = fixture.containsAbilityKey(key);

		// add additional test code here
		assertEquals(false, result);
	}


	
	/**
	 * Run the boolean hasAbility(Set<Ability>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testHasAbility_1()
		throws Exception {
		Set<Ability> abilitySet = new HashSet<Ability>();

		boolean result = FeatureContainer.hasAbility(abilitySet);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(Set<Ability>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testHasAbility_2()
		throws Exception {
		Set<Ability> abilitySet = null;

		boolean result = FeatureContainer.hasAbility(abilitySet);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(Set<Ability>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testHasAbility_3()
		throws Exception {
		Set<Ability> abilitySet = new HashSet<Ability>();

		boolean result = FeatureContainer.hasAbility(abilitySet);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(Set<Ability>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testHasAbility_4()
		throws Exception {
		Set<Ability> abilitySet = new HashSet<Ability>();

		boolean result = FeatureContainer.hasAbility(abilitySet);

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveAbility_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = null;

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveAbility_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveAbility_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveAbility_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveAbility_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}


	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveModifier_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = null;

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveModifier_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveModifier_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveModifier_4()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveModifier_5()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		Modifier modifier = new Modifier(new Specification());

		Modifier result = fixture.removeModifier(modifier);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void removeModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveModifiers_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";

		fixture.removeModifiers(id);

		// add additional test code here
	}

	/**
	 * Run the void removeModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testRemoveModifiers_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();
		String id = "";

		fixture.removeModifiers(id);

		// add additional test code here
	}



	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[FeatureContainer]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[FeatureContainer]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		FeatureContainer fixture = new FeatureContainer();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[FeatureContainer]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 8:48 PM
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
	 * @generatedBy CodePro at 5/12/18 8:48 PM
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
	 * @generatedBy CodePro at 5/12/18 8:48 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FeatureContainerTest.class);
	}
}