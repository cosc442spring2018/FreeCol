import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.AbstractUnit;
import net.sf.freecol.common.model.Event;
import net.sf.freecol.common.model.FoundingFather;
import net.sf.freecol.common.model.Scope;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.UnitType;
import net.sf.freecol.common.model.FoundingFather.FoundingFatherType;

import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.HashMap;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>FoundingFatherTest</code> contains tests for the class <code>{@link FoundingFather}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:51 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class FoundingFatherTest {
	/**
	 * Run the FoundingFather(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testFoundingFather_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		FoundingFather result = new FoundingFather(id, specification);

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
	 * Run the List<Event> getEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetEvents_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		List<Event> result = fixture.getEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Event> getEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetEvents_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(null);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		List<Event> result = fixture.getEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetScopes_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetScopes_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(null);
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FoundingFather.FoundingFatherType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		FoundingFather.FoundingFatherType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("exploration", result.getKey());
		assertEquals("EXPLORATION", result.name());
		assertEquals("EXPLORATION", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the String getTypeKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetTypeKey_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		String result = fixture.getTypeKey();

		// add additional test code here
		assertEquals("model.foundingFather.exploration", result);
	}

	/**
	 * Run the String getTypeKey(FoundingFatherType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetTypeKey_2()
		throws Exception {
		FoundingFather.FoundingFatherType type = FoundingFather.FoundingFatherType.EXPLORATION;

		String result = FoundingFather.getTypeKey(type);

		// add additional test code here
		assertEquals("model.foundingFather.exploration", result);
	}

	/**
	 * Run the List<AbstractUnit> getUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetUnits_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		List<AbstractUnit> result = fixture.getUnits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractUnit> getUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetUnits_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(null);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		List<AbstractUnit> result = fixture.getUnits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the java.util.Map<UnitType, UnitType> getUpgrades() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetUpgrades_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		java.util.Map<UnitType, UnitType> result = fixture.getUpgrades();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the java.util.Map<UnitType, UnitType> getUpgrades() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetUpgrades_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(null);
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		java.util.Map<UnitType, UnitType> result = fixture.getUpgrades();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getWeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetWeight_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		int age = -1;

		int result = fixture.getWeight(age);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetWeight_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		int age = 1;

		int result = fixture.getWeight(age);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetWeight_3()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		int age = 1;

		int result = fixture.getWeight(age);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = FoundingFather.getXMLElementTagName();

		// add additional test code here
		assertEquals("founding-father", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("founding-father", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 8:51 PM
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
	 * @generatedBy CodePro at 5/12/18 8:51 PM
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
	 * @generatedBy CodePro at 5/12/18 8:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FoundingFatherTest.class);
	}
}