package towson.tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.Disaster;
import net.sf.freecol.common.model.Effect;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.Disaster.Effects;

import java.util.List;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import net.sf.freecol.common.util.RandomChoice;
import static org.junit.Assert.*;

/**
 * The class <code>DisasterTest</code> contains tests for the class <code>{@link Disaster}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:29 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class DisasterTest {
	/**
	 * Run the Disaster(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testDisaster_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		Disaster result = new Disaster(id, specification);

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
	 * Run the List<RandomChoice<Effect>> getEffects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testGetEffects_1()
		throws Exception {
		Disaster fixture = new Disaster("", new Specification());

		List<RandomChoice<Effect>> result = fixture.getEffects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<RandomChoice<Effect>> getEffects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testGetEffects_2()
		throws Exception {
		Disaster fixture = new Disaster("", new Specification());

		List<RandomChoice<Effect>> result = fixture.getEffects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Disaster.Effects getNumberOfEffects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testGetNumberOfEffects_1()
		throws Exception {
		Disaster fixture = new Disaster("", new Specification());

		Disaster.Effects result = fixture.getNumberOfEffects();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ONE", result.name());
		assertEquals("ONE", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Disaster.getXMLElementTagName();

		// add additional test code here
		assertEquals("disaster", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Disaster fixture = new Disaster("", new Specification());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("disaster", result);
	}

	/**
	 * Run the boolean isNatural() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testIsNatural_1()
		throws Exception {
		Disaster fixture = new Disaster("", new Specification());

		boolean result = fixture.isNatural();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNatural() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testIsNatural_2()
		throws Exception {
		Disaster fixture = new Disaster("", new Specification());

		boolean result = fixture.isNatural();

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Disaster fixture = new Disaster("", new Specification());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Disaster fixture = new Disaster("", new Specification());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 8:29 PM
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
	 * @generatedBy CodePro at 5/12/18 8:29 PM
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
	 * @generatedBy CodePro at 5/12/18 8:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DisasterTest.class);
	}
}