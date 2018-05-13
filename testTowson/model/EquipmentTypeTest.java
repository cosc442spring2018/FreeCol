import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.EquipmentType;
import net.sf.freecol.common.model.Role;
import net.sf.freecol.common.model.Specification;

import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import static org.junit.Assert.*;

/**
 * The class <code>EquipmentTypeTest</code> contains tests for the class <code>{@link EquipmentType}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:33 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class EquipmentTypeTest {
	/**
	 * Run the EquipmentType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testEquipmentType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		EquipmentType result = new EquipmentType(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRole());
		assertEquals(false, result.canBeCaptured());
		assertEquals(1, result.getMaximumCount());
		assertEquals("equipment-type", result.getXMLTagName());
		assertEquals(false, result.isMilitaryEquipment());
		assertEquals(-1, result.getCombatLossPriority());
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
	 * Run the boolean canBeCaptured() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testCanBeCaptured_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		boolean result = fixture.canBeCaptured();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canBeCaptured() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testCanBeCaptured_2()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		boolean result = fixture.canBeCaptured();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		EquipmentType obj = new EquipmentType("", new Specification());
		obj.setRole(new Role("", new Specification()));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		Object obj = new EquipmentType("", new Specification());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		Object obj = new EquipmentType("", new Specification());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		Object obj = new EquipmentType("", new Specification());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		Object obj = new EquipmentType("", new Specification());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the EquipmentType getCaptureEquipment(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testGetCaptureEquipment_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		boolean byIndians = true;

		EquipmentType result = fixture.getCaptureEquipment(byIndians);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.canBeCaptured());
		assertEquals(1, result.getMaximumCount());
		assertEquals("equipment-type", result.getXMLTagName());
		assertEquals(false, result.isMilitaryEquipment());
		assertEquals(-1, result.getCombatLossPriority());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<equipment-type id=\"\" maximum-count=\"1\" combat-loss-priority=\"-1\" role=\"\"></equipment-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the EquipmentType getCaptureEquipment(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testGetCaptureEquipment_2()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		boolean byIndians = true;

		EquipmentType result = fixture.getCaptureEquipment(byIndians);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.canBeCaptured());
		assertEquals(1, result.getMaximumCount());
		assertEquals("equipment-type", result.getXMLTagName());
		assertEquals(false, result.isMilitaryEquipment());
		assertEquals(-1, result.getCombatLossPriority());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<equipment-type id=\"\" maximum-count=\"1\" combat-loss-priority=\"-1\" role=\"\"></equipment-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the EquipmentType getCaptureEquipment(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testGetCaptureEquipment_3()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		boolean byIndians = true;

		EquipmentType result = fixture.getCaptureEquipment(byIndians);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.canBeCaptured());
		assertEquals(1, result.getMaximumCount());
		assertEquals("equipment-type", result.getXMLTagName());
		assertEquals(false, result.isMilitaryEquipment());
		assertEquals(-1, result.getCombatLossPriority());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<equipment-type id=\"\" maximum-count=\"1\" combat-loss-priority=\"-1\" role=\"\"></equipment-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the int getCombatLossPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testGetCombatLossPriority_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		int result = fixture.getCombatLossPriority();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getMaximumCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testGetMaximumCount_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		int result = fixture.getMaximumCount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Role getRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		Role result = fixture.getRole();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Role ]", result.toFullString());
		assertEquals(1, result.getMaximumCount());
		assertEquals("role", result.getXMLTagName());
		assertEquals(false, result.isOffensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(null, result.getDowngrade());
		assertEquals(false, result.isDefaultRole());
		assertEquals("", result.getRoleSuffix());
		assertEquals(false, result.isDefensive());
		assertEquals(null, result.getExpertUnit());
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
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = EquipmentType.getXMLElementTagName();

		// add additional test code here
		assertEquals("equipment-type", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("equipment-type", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1369, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1369, result);
	}

	/**
	 * Run the boolean isCompatibleWith(EquipmentType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testIsCompatibleWith_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		EquipmentType otherType = new EquipmentType("", new Specification());

		boolean result = fixture.isCompatibleWith(otherType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCompatibleWith(EquipmentType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testIsCompatibleWith_2()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		EquipmentType otherType = new EquipmentType("", new Specification());

		boolean result = fixture.isCompatibleWith(otherType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCompatibleWith(EquipmentType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testIsCompatibleWith_3()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		EquipmentType otherType = new EquipmentType("", new Specification());

		boolean result = fixture.isCompatibleWith(otherType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCompatibleWith(EquipmentType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testIsCompatibleWith_4()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		EquipmentType otherType = new EquipmentType("", new Specification());

		boolean result = fixture.isCompatibleWith(otherType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCompatibleWith(EquipmentType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testIsCompatibleWith_5()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		EquipmentType otherType = new EquipmentType("", new Specification());

		boolean result = fixture.isCompatibleWith(otherType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isMilitaryEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testIsMilitaryEquipment_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		boolean result = fixture.isMilitaryEquipment();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isMilitaryEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testIsMilitaryEquipment_2()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));

		boolean result = fixture.isMilitaryEquipment();

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the void setRole(Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	@Test
	public void testSetRole_1()
		throws Exception {
		EquipmentType fixture = new EquipmentType("", new Specification());
		fixture.setRole(new Role("", new Specification()));
		Role role = new Role("", new Specification());

		fixture.setRole(role);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 8:33 PM
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
	 * @generatedBy CodePro at 5/12/18 8:33 PM
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
	 * @generatedBy CodePro at 5/12/18 8:33 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EquipmentTypeTest.class);
	}
}