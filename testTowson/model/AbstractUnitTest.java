package net.sf.freecol.common.model;

import java.io.CharArrayWriter;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Writer;
import java.util.LinkedList;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.AbstractUnit;
import net.sf.freecol.common.model.Role;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.StringTemplate;
import net.sf.freecol.common.model.UnitType;

import java.util.List;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractUnitTest</code> contains tests for the class <code>{@link AbstractUnit}</code>.
 *
 * @generatedBy CodePro at 5/12/18 5:09 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class AbstractUnitTest {
	/**
	 * Run the AbstractUnit() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testAbstractUnit_1()
		throws Exception {

		AbstractUnit result = new AbstractUnit();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 null (model.role.default)", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals("", result.getDescription());
		assertEquals("abstractUnit", result.getXMLTagName());
		assertEquals("model.role.default", result.getRoleId());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractUnit role=\"model.role.default\" number=\"1\"></abstractUnit>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getSuffix());
	}

	/**
	 * Run the AbstractUnit(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testAbstractUnit_4()
		throws Exception {
		String id = "";
		String roleId = "";
		int number = 1;

		AbstractUnit result = new AbstractUnit(id, roleId, number);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1  ()", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals("", result.getDescription());
		assertEquals("abstractUnit", result.getXMLTagName());
		assertEquals("", result.getRoleId());
		assertEquals("", result.getId());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractUnit id=\"\" role=\"\" number=\"1\"></abstractUnit>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals("", result.getSuffix());
	}

	/**
	 * Run the AbstractUnit(UnitType,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testAbstractUnit_5()
		throws Exception {
		UnitType unitType = new UnitType("", new Specification());
		String roleId = "";
		int number = 1;

		AbstractUnit result = new AbstractUnit(unitType, roleId, number);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1  ()", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals("", result.getDescription());
		assertEquals("abstractUnit", result.getXMLTagName());
		assertEquals("", result.getRoleId());
		assertEquals("", result.getId());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractUnit id=\"\" role=\"\" number=\"1\"></abstractUnit>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals("", result.getSuffix());
	}

	/**
	 * Run the double calculateStrength(Specification,List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testCalculateStrength_1()
		throws Exception {
		Specification spec = new Specification();
		List<AbstractUnit> units = new LinkedList();

		double result = AbstractUnit.calculateStrength(spec, units);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the List<AbstractUnit> deepCopy(List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testDeepCopy_1()
		throws Exception {
		List<AbstractUnit> units = new LinkedList();

		List<AbstractUnit> result = AbstractUnit.deepCopy(units);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractUnit> deepCopy(List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testDeepCopy_2()
		throws Exception {
		List<AbstractUnit> units = new LinkedList();

		List<AbstractUnit> result = AbstractUnit.deepCopy(units);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: model.abstractUnit.label [[%number%: NAME: 1][%unit%: LABEL: KEY: .nameNAME:  (TEMPLATE: .name [[%number%: NAME: 1]]NAME: )]]", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("model.abstractUnit.label", result.getId());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"model.abstractUnit.label\" templateType=\"template\"><key value=\"%number%\"></key><key value=\"%unit%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate><stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.abstractUnit.label", result.getIdType());
		assertEquals("label", result.getSuffix());
	}

	/**
	 * Run the StringTemplate getListLabel(String,List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetListLabel_1()
		throws Exception {
		String base = "";
		List<AbstractUnit> units = new LinkedList();

		StringTemplate result = AbstractUnit.getListLabel(base, units);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: ", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals("", result.getSuffix());
	}

	/**
	 * Run the StringTemplate getListLabel(String,List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetListLabel_2()
		throws Exception {
		String base = "";
		List<AbstractUnit> units = new LinkedList();

		StringTemplate result = AbstractUnit.getListLabel(base, units);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: ", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals("", result.getSuffix());
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetNumber_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Role getRole(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		Specification spec = new Specification();

		Role result = fixture.getRole(spec);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Role ]", result.toFullString());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals(null, result.getExpertUnit());
		assertEquals(false, result.isDefaultRole());
		assertEquals(null, result.getDowngrade());
		assertEquals("role", result.getXMLTagName());
		assertEquals(1, result.getMaximumCount());
		assertEquals(false, result.isOffensive());
		assertEquals("", result.getRoleSuffix());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("<role id=\"\"></role>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals("", result.getSuffix());
	}

	/**
	 * Run the String getRoleId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetRoleId_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		String result = fixture.getRoleId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the UnitType getType(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		Specification spec = new Specification();

		UnitType result = fixture.getType(spec);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(1, result.getLineOfSight());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.isPerson());
		assertEquals(false, result.hasPrice());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.isNaval());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(0, result.getScoreValue());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(null, result.getExpertProduction());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isOffensive());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.canCarryGoods());
		assertEquals(0, result.getBaseOffence());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getHitPoints());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(false, result.isRecruitable());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(null, result.getSkillTaught());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(false, result.canBuildColony());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("<unit-type id=\"\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals("", result.getSuffix());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = AbstractUnit.getXMLElementTagName();

		// add additional test code here
		assertEquals("abstractUnit", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("abstractUnit", result);
	}

	/**
	 * Run the void setNumber(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testSetNumber_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		int newNumber = 1;

		fixture.setNumber(newNumber);

		assertEquals(newNumber, fixture.getNumber());
	}

	/**
	 * Run the void setRoleId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testSetRoleId_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		String roleId = "";

		fixture.setRoleId(roleId);

		assertEquals(roleId, fixture.getRoleId());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		String result = fixture.toString();

		assertEquals("1  ()", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 5:09 PM
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
	 * @generatedBy CodePro at 5/12/18 5:09 PM
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
	 * @generatedBy CodePro at 5/12/18 5:09 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractUnitTest.class);
	}
}