package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.Event;
import net.sf.freecol.common.model.Limit;
import net.sf.freecol.common.model.Specification;

import java.util.Collection;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import static org.junit.Assert.*;

/**
 * The class <code>EventTest</code> contains tests for the class <code>{@link Event}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:42 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class EventTest {
	/**
	 * Run the Event(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testEvent_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		Event result = new Event(id, specification);

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
	 * Run the Limit getLimit(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testGetLimit_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		String id = "";

		Limit result = fixture.getLimit(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Limit getLimit(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testGetLimit_2()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		String id = "";

		Limit result = fixture.getLimit(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Collection<Limit> getLimits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testGetLimits_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);

		Collection<Limit> result = fixture.getLimits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<Limit> getLimits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testGetLimits_2()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);

		Collection<Limit> result = fixture.getLimits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getScoreValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testGetScoreValue_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);

		int result = fixture.getScoreValue();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Event.getXMLElementTagName();

		// add additional test code here
		assertEquals("event", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("event", result);
	}

	/**
	 * Run the void setScoreValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testSetScoreValue_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		int newScoreValue = 1;

		fixture.setScoreValue(newScoreValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		String newValue = "";

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue((String) null);
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue((String) null);
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(0);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue((String) null);
		fixture.setScoreValue(0);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Event fixture = new Event("", new Specification());
		fixture.setValue("");
		fixture.setScoreValue(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 8:42 PM
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
	 * @generatedBy CodePro at 5/12/18 8:42 PM
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
	 * @generatedBy CodePro at 5/12/18 8:42 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EventTest.class);
	}
}