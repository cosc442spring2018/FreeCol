package net.sf.freecol.towson;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.util.LogBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.Ability;
import net.sf.freecol.common.model.AbstractGoods;
import net.sf.freecol.common.model.FeatureContainer;
import net.sf.freecol.common.model.FreeColObject;
import net.sf.freecol.common.model.Modifier;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.Turn;
import net.sf.freecol.client.gui.plaf.FreeColLabelUI;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * The class <code>FreeColObjectTest</code> contains tests for the class <code>{@link FreeColObject}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:58 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class FreeColObjectTest {
	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddAbility_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddAbility_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddAbility_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Ability ability = new Ability("");

		boolean result = fixture.addAbility(ability);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddFeatures_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void addFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddFeatures_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject fco = new AbstractGoods();

		fixture.addFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddModifier_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddModifier_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddModifier_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Modifier modifier = new Modifier(new Specification());

		boolean result = fixture.addModifier(modifier);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void addPropertyChangeListener(PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddPropertyChangeListener_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.addPropertyChangeListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void addPropertyChangeListener(PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddPropertyChangeListener_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.addPropertyChangeListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void addPropertyChangeListener(String,PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddPropertyChangeListener_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.addPropertyChangeListener(propertyName, listener);

		// add additional test code here
	}

	/**
	 * Run the void addPropertyChangeListener(String,PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testAddPropertyChangeListener_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.addPropertyChangeListener(propertyName, listener);

		// add additional test code here
	}

	/**
	 * Run the float applyModifiers(float,Turn,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testApplyModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		float number = 1.0f;
		Turn turn = new Turn(1);
		String id = "";

		float result = fixture.applyModifiers(number, turn, id);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float applyModifiers(float,Turn,Collection<Modifier>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testApplyModifiers_2()
		throws Exception {
		float number = 1.0f;
		Turn turn = new Turn(1);
		Collection<Modifier> mods = new ArrayList<Modifier>();

		float result = FreeColObject.applyModifiers(number, turn, mods);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}


	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testCompareIds_1()
		throws Exception {
		FreeColObject fco1 = null;
		FreeColObject fco2 = new AbstractGoods();

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testCompareIds_2()
		throws Exception {
		FreeColObject fco1 = null;
		FreeColObject fco2 = null;

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testCompareIds_3()
		throws Exception {
		FreeColObject fco1 = new AbstractGoods();
		FreeColObject fco2 = null;

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testCompareIds_4()
		throws Exception {
		FreeColObject fco1 = new AbstractGoods();
		FreeColObject fco2 = new AbstractGoods();

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testCompareIds_5()
		throws Exception {
		FreeColObject fco1 = new AbstractGoods();
		FreeColObject fco2 = new AbstractGoods();

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareIds(FreeColObject,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testCompareIds_6()
		throws Exception {
		FreeColObject fco1 = new AbstractGoods();
		FreeColObject fco2 = new AbstractGoods();

		int result = FreeColObject.compareIds(fco1, fco2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean containsAbilityKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testContainsAbilityKey_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testContainsAbilityKey_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String key = "";

		boolean result = fixture.containsAbilityKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsModifierKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testContainsModifierKey_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String key = "";

		boolean result = fixture.containsModifierKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsModifierKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testContainsModifierKey_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String key = "";

		boolean result = fixture.containsModifierKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsModifierKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testContainsModifierKey_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String key = "";

		boolean result = fixture.containsModifierKey(key);

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the void dumpObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testDumpObject_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		fixture.dumpObject();

		// add additional test code here
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Object o = new AbstractGoods();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Object o = new AbstractGoods();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Object o = new AbstractGoods();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		int oldValue = 1;
		int newValue = 1;

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		int oldValue = 1;
		int newValue = 1;

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		Object oldValue = new Object();
		Object newValue = new Object();

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		Object oldValue = new Object();
		Object newValue = new Object();

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		boolean oldValue = true;
		boolean newValue = true;

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void fireIndexedPropertyChange(String,int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFireIndexedPropertyChange_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int index = 1;
		boolean oldValue = true;
		boolean newValue = true;

		fixture.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(PropertyChangeEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFirePropertyChange_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeEvent event = new PropertyChangeEvent(new Object(), "", new Object(), new Object());

		fixture.firePropertyChange(event);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(PropertyChangeEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFirePropertyChange_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeEvent event = new PropertyChangeEvent(new Object(), "", new Object(), new Object());

		fixture.firePropertyChange(event);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFirePropertyChange_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int oldValue = 1;
		int newValue = 1;

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFirePropertyChange_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		int oldValue = 1;
		int newValue = 1;

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFirePropertyChange_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		Object oldValue = new Object();
		Object newValue = new Object();

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFirePropertyChange_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		Object oldValue = new Object();
		Object newValue = new Object();

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFirePropertyChange_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		boolean oldValue = true;
		boolean newValue = true;

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the void firePropertyChange(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testFirePropertyChange_8()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		boolean oldValue = true;
		boolean newValue = true;

		fixture.firePropertyChange(propertyName, oldValue, newValue);

		// add additional test code here
	}

	/**
	 * Run the Set<Ability> getAbilities() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetAbilities_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		Set<Ability> result = fixture.getAbilities();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Ability> getAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetAbilities_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		Set<Ability> result = fixture.getAbilities(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	
	/**
	 * Run the Set<Modifier> getDefenceModifiers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetDefenceModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		Set<Modifier> result = fixture.getDefenceModifiers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FeatureContainer getFeatureContainer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetFeatureContainer_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		FeatureContainer result = fixture.getFeatureContainer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.getId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getIdNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetIdNumber_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.getIdNumber();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIdNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetIdNumber_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.getIdNumber();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIdNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetIdNumber_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.getIdNumber();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIdNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetIdNumber_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.getIdNumber();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the String getIdType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetIdType_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.getIdType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getIdType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetIdType_2()
		throws Exception {
		String id = "";

		String result = FreeColObject.getIdType(id);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIdType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetIdType_3()
		throws Exception {
		String id = "";

		String result = FreeColObject.getIdType(id);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIdType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetIdType_4()
		throws Exception {
		String id = null;

		String result = FreeColObject.getIdType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Set<Modifier> getModifiers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		Set<Modifier> result = fixture.getModifiers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Modifier> getModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetModifiers_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		Set<Modifier> result = fixture.getModifiers(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	
	/**
	 * Run the PropertyChangeListener[] getPropertyChangeListeners() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetPropertyChangeListeners_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		PropertyChangeListener[] result = fixture.getPropertyChangeListeners();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the PropertyChangeListener[] getPropertyChangeListeners() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetPropertyChangeListeners_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		PropertyChangeListener[] result = fixture.getPropertyChangeListeners();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the PropertyChangeListener[] getPropertyChangeListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetPropertyChangeListeners_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		PropertyChangeListener[] result = fixture.getPropertyChangeListeners(propertyName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the PropertyChangeListener[] getPropertyChangeListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetPropertyChangeListeners_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		PropertyChangeListener[] result = fixture.getPropertyChangeListeners(propertyName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the List<Ability> getSortedAbilities() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetSortedAbilities_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		List<Ability> result = fixture.getSortedAbilities();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}


	/**
	 * Run the List<Modifier> getSortedModifiers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetSortedModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		List<Modifier> result = fixture.getSortedModifiers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Specification getSpecification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetSpecification_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		Specification result = fixture.getSpecification();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetSuffix_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.getSuffix();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetSuffix_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.getSuffix();

		// add additional test code here
		assertEquals(null, result);
	}


	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = FreeColObject.getXMLElementTagName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean hasAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testHasAbility_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		boolean result = fixture.hasAbility(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testHasAbility_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		boolean result = fixture.hasAbility(id);

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the boolean hasListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testHasListeners_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		boolean result = fixture.hasListeners(propertyName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testHasListeners_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		boolean result = fixture.hasListeners(propertyName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasListeners(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testHasListeners_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";

		boolean result = fixture.hasListeners(propertyName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasModifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testHasModifier_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		boolean result = fixture.hasModifier(id);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasModifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testHasModifier_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		boolean result = fixture.hasModifier(id);

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(30752, result);
	}
	
	
	/**
	 * Run the String readId(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testReadId_1()
		throws Exception {
		Element element = new IIOMetadataNode();

		String result = FreeColObject.readId(element);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String readId(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testReadId_2()
		throws Exception {
		Element element = new IIOMetadataNode();

		String result = FreeColObject.readId(element);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void removeAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveAbilities_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		fixture.removeAbilities(id);

		// add additional test code here
	}

	/**
	 * Run the void removeAbilities(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveAbilities_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		fixture.removeAbilities(id);

		// add additional test code here
	}

	/**
	 * Run the Ability removeAbility(Ability) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveAbility_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveAbility_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Ability ability = new Ability("");

		Ability result = fixture.removeAbility(ability);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveFeatures_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the void removeFeatures(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveFeatures_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColObject fco = new AbstractGoods();

		fixture.removeFeatures(fco);

		// add additional test code here
	}

	/**
	 * Run the Modifier removeModifier(Modifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveModifier_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveModifier_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
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
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveModifiers_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		fixture.removeModifiers(id);

		// add additional test code here
	}

	/**
	 * Run the void removeModifiers(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemoveModifiers_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String id = "";

		fixture.removeModifiers(id);

		// add additional test code here
	}

	/**
	 * Run the void removePropertyChangeListener(PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemovePropertyChangeListener_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.removePropertyChangeListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void removePropertyChangeListener(PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemovePropertyChangeListener_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.removePropertyChangeListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void removePropertyChangeListener(String,PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemovePropertyChangeListener_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.removePropertyChangeListener(propertyName, listener);

		// add additional test code here
	}

	/**
	 * Run the void removePropertyChangeListener(String,PropertyChangeListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testRemovePropertyChangeListener_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String propertyName = "";
		PropertyChangeListener listener = new FreeColLabelUI();

		fixture.removePropertyChangeListener(propertyName, listener);

		// add additional test code here
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSave_10()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSave_11()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSave_12()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSave_13()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean save(OutputStream,WriteScope,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSave_14()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		OutputStream out = new ByteArrayOutputStream();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;
		boolean pretty = true;

		boolean result = fixture.save(out, scope, pretty);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String serialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSerialize_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.serialize();

		// add additional test code here
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result);
	}

	/**
	 * Run the String serialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSerialize_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.serialize();

		// add additional test code here
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result);
	}

	/**
	 * Run the String serialize(WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSerialize_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		String result = fixture.serialize(scope);

		// add additional test code here
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result);
	}

	/**
	 * Run the String serialize(WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSerialize_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope scope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		String result = fixture.serialize(scope);

		// add additional test code here
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result);
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		String newId = "";

		fixture.setId(newId);

		// add additional test code here
	}


	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0 (null)", result);
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXML_1()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXML_2()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXML_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXML_4()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXML_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXML_6()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXML_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	

	
	/**
	 * Run the Element toXMLElement(Document,WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testToXMLElement_3()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Document document = null;
		net.sf.freecol.common.io.FreeColXMLWriter.WriteScope writeScope = net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT;

		Element result = fixture.toXMLElement(document, writeScope);

		// add additional test code here
		assertNotNull(result);
	}


	/**
	 * Run the Element toXMLElement(Document,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testToXMLElement_5()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		Document document = null;
		Player player = null;

		Element result = fixture.toXMLElement(document, player);

		// add additional test code here
		assertNotNull(result);
	}


	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXMLPartial_7()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Run the void toXMLPartial(FreeColXMLWriter,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	@Test
	public void testToXMLPartial_8()
		throws Exception {
		FreeColObject fixture = new AbstractGoods();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String[] fields = new String[] {};

		fixture.toXMLPartial(xw, fields);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
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
	 * @generatedBy CodePro at 5/12/18 8:58 PM
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
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColObjectTest.class);
	}
}