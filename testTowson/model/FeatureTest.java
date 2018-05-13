package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.Ability;
import net.sf.freecol.common.model.AbstractGoods;
import net.sf.freecol.common.model.Feature;
import net.sf.freecol.common.model.FreeColObject;
import net.sf.freecol.common.model.Scope;
import net.sf.freecol.common.model.Turn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FeatureTest</code> contains tests for the class <code>{@link Feature}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:44 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class FeatureTest {
	/**
	 * Run the void addScope(Scope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testAddScope_1()
		throws Exception {
		Feature fixture = new Ability("");
		Scope scope = new Scope();

		fixture.addScope(scope);

		// add additional test code here
	}

	/**
	 * Run the void addScope(Scope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testAddScope_2()
		throws Exception {
		Feature fixture = new Ability("");
		Scope scope = new Scope();

		fixture.addScope(scope);

		// add additional test code here
	}
	
	
	/**
	 * Run the boolean appliesTo(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testAppliesTo_4()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = new Turn(1);

		boolean result = fixture.appliesTo(turn);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testAppliesTo_5()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = new Turn(1);

		boolean result = fixture.appliesTo(turn);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testAppliesTo_6()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = null;

		boolean result = fixture.appliesTo(turn);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testAppliesTo_7()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = new Turn(1);

		boolean result = fixture.appliesTo(turn);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testAppliesTo_8()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = new Turn(1);

		boolean result = fixture.appliesTo(turn);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void copyFrom(Feature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testCopyFrom_1()
		throws Exception {
		Feature fixture = new Ability("");
		Feature other = new Ability("");

		fixture.copyFrom(other);

		// add additional test code here
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Ability("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testEquals_10()
		throws Exception {
		Feature fixture = new Ability("");
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getDuration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testGetDuration_1()
		throws Exception {
		Feature fixture = new Ability("");

		int result = fixture.getDuration();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Turn getFirstTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testGetFirstTurn_1()
		throws Exception {
		Feature fixture = new Ability("");

		Turn result = fixture.getFirstTurn();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Turn getLastTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testGetLastTurn_1()
		throws Exception {
		Feature fixture = new Ability("");

		Turn result = fixture.getLastTurn();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Feature fixture = new Ability("");

		String result = fixture.getNameKey();

		// add additional test code here
		assertEquals(".name", result);
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testGetScopes_1()
		throws Exception {
		Feature fixture = new Ability("");

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
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testGetScopes_2()
		throws Exception {
		Feature fixture = new Ability("");

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FreeColObject getSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testGetSource_1()
		throws Exception {
		Feature fixture = new Ability("");

		FreeColObject result = fixture.getSource();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean hasScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHasScope_1()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.hasScope();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHasScope_2()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.hasScope();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHasScope_3()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.hasScope();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasTimeLimit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHasTimeLimit_1()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.hasTimeLimit();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasTimeLimit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHasTimeLimit_2()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.hasTimeLimit();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasTimeLimit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHasTimeLimit_3()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.hasTimeLimit();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Feature fixture = new Ability("");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1015809, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Feature fixture = new Ability("");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1015809, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		Feature fixture = new Ability("");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1015809, result);
	}

	/**
	 * Run the boolean isIndependent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsIndependent_1()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.isIndependent();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIndependent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsIndependent_2()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.isIndependent();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIndependent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsIndependent_3()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.isIndependent();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIndependent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsIndependent_4()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.isIndependent();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIndependent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsIndependent_5()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.isIndependent();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isOutOfDate(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsOutOfDate_1()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = new Turn(1);

		boolean result = fixture.isOutOfDate(turn);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOutOfDate(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsOutOfDate_2()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = null;

		boolean result = fixture.isOutOfDate(turn);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOutOfDate(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsOutOfDate_3()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = new Turn(1);

		boolean result = fixture.isOutOfDate(turn);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOutOfDate(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsOutOfDate_4()
		throws Exception {
		Feature fixture = new Ability("");
		Turn turn = new Turn(1);

		boolean result = fixture.isOutOfDate(turn);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTemporary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsTemporary_1()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.isTemporary();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTemporary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testIsTemporary_2()
		throws Exception {
		Feature fixture = new Ability("");

		boolean result = fixture.isTemporary();

		// add additional test code here
		assertEquals(false, result);
	}

	


	/**
	 * Run the void setDuration(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testSetDuration_1()
		throws Exception {
		Feature fixture = new Ability("");
		int newDuration = 1;

		fixture.setDuration(newDuration);

		// add additional test code here
	}

	/**
	 * Run the void setFirstTurn(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testSetFirstTurn_1()
		throws Exception {
		Feature fixture = new Ability("");
		Turn newFirstTurn = new Turn(1);

		fixture.setFirstTurn(newFirstTurn);

		// add additional test code here
	}

	/**
	 * Run the void setLastTurn(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testSetLastTurn_1()
		throws Exception {
		Feature fixture = new Ability("");
		Turn newLastTurn = new Turn(1);

		fixture.setLastTurn(newLastTurn);

		// add additional test code here
	}

	/**
	 * Run the void setScopes(List<Scope>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testSetScopes_1()
		throws Exception {
		Feature fixture = new Ability("");
		List<Scope> scopes = new ArrayList<Scope>();

		fixture.setScopes(scopes);

		// add additional test code here
	}

	/**
	 * Run the void setSource(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testSetSource_1()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColObject newSource = new AbstractGoods();

		fixture.setSource(newSource);

		// add additional test code here
	}

	/**
	 * Run the void setTemporary(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testSetTemporary_1()
		throws Exception {
		Feature fixture = new Ability("");
		boolean newTemporary = true;

		fixture.setTemporary(newTemporary);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_12()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_13()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_14()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_15()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_16()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Feature fixture = new Ability("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Feature fixture = new Ability("");
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
	 * @generatedBy CodePro at 5/12/18 8:44 PM
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
	 * @generatedBy CodePro at 5/12/18 8:44 PM
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
	 * @generatedBy CodePro at 5/12/18 8:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FeatureTest.class);
	}
}