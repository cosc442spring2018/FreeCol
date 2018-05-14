package towson.tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.AbstractUnit;
import net.sf.freecol.common.model.EuropeanNationType;
import net.sf.freecol.common.model.Specification;

import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import static org.junit.Assert.*;

/**
 * The class <code>EuropeanNationTypeTest</code> contains tests for the class <code>{@link EuropeanNationType}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:37 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class EuropeanNationTypeTest {
	/**
	 * Run the EuropeanNationType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testEuropeanNationType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		EuropeanNationType result = new EuropeanNationType(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEuropean());
		assertEquals(false, result.isIndian());
		assertEquals("european-nation-type", result.getXMLTagName());
		assertEquals(false, result.isREF());
		assertEquals(null, result.getCapitalType());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<european-nation-type id=\"\" number-of-settlements=\"average\" aggression=\"average\" ref=\"false\"></european-nation-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the List<AbstractUnit> getStartingUnits(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testGetStartingUnits_2()
		throws Exception {
		EuropeanNationType fixture = new EuropeanNationType("", new Specification());
		String key = "";

		List<AbstractUnit> result = fixture.getStartingUnits(key);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractUnit> getStartingUnits(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testGetStartingUnits_3()
		throws Exception {
		EuropeanNationType fixture = new EuropeanNationType("", new Specification());
		String key = "";

		List<AbstractUnit> result = fixture.getStartingUnits(key);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = EuropeanNationType.getXMLElementTagName();

		// add additional test code here
		assertEquals("european-nation-type", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		EuropeanNationType fixture = new EuropeanNationType("", new Specification());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("european-nation-type", result);
	}

	/**
	 * Run the boolean isEuropean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testIsEuropean_1()
		throws Exception {
		EuropeanNationType fixture = new EuropeanNationType("", new Specification());

		boolean result = fixture.isEuropean();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIndian() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testIsIndian_1()
		throws Exception {
		EuropeanNationType fixture = new EuropeanNationType("", new Specification());

		boolean result = fixture.isIndian();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isREF() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testIsREF_1()
		throws Exception {
		EuropeanNationType fixture = new EuropeanNationType("", new Specification());

		boolean result = fixture.isREF();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isREF() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	@Test
	public void testIsREF_2()
		throws Exception {
		EuropeanNationType fixture = new EuropeanNationType("", new Specification());

		boolean result = fixture.isREF();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 8:37 PM
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
	 * @generatedBy CodePro at 5/12/18 8:37 PM
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
	 * @generatedBy CodePro at 5/12/18 8:37 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EuropeanNationTypeTest.class);
	}
}