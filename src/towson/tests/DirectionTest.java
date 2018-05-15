package towson.tests;

import java.util.Random;
import java.util.logging.Logger;
import org.junit.*;

import net.sf.freecol.common.model.Direction;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Map.Position;

import static org.junit.Assert.*;

/**
 * The class <code>DirectionTest</code> contains tests for the class <code>{@link Direction}</code>.
 *
 * @generatedBy CodePro at 5/12/18 8:23 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class DirectionTest {

	/**
	 * Run the Direction angleToDirection(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testAngleToDirection_1()
		throws Exception {
		double angle = 1.0;

		Direction result = Direction.angleToDirection(angle);

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.NE", result.getKey());
		assertEquals("model.direction.NE.name", result.getNameKey());
		assertEquals("NE", result.name());
		assertEquals("NE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetEWMirroredDirection_1()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetEWMirroredDirection_2()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetEWMirroredDirection_3()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetEWMirroredDirection_4()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetEWMirroredDirection_5()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetEWMirroredDirection_6()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Direction getEWMirroredDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetEWMirroredDirection_7()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getEWMirroredDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		Direction fixture = Direction.E;

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("direction.E", result);
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Direction fixture = Direction.E;

		String result = fixture.getNameKey();

		// add additional test code here
		assertEquals("model.direction.E.name", result);
	}

	/**
	 * Run the Direction getNextDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetNextDirection_1()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getNextDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.SE", result.getKey());
		assertEquals("model.direction.SE.name", result.getNameKey());
		assertEquals("SE", result.name());
		assertEquals("SE", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the Direction getPreviousDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetPreviousDirection_1()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getPreviousDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.NE", result.getKey());
		assertEquals("model.direction.NE.name", result.getNameKey());
		assertEquals("NE", result.name());
		assertEquals("NE", result.toString());
		assertEquals(1, result.ordinal());
	}

	

	/**
	 * Run the Direction getReverseDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testGetReverseDirection_1()
		throws Exception {
		Direction fixture = Direction.E;

		Direction result = fixture.getReverseDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direction.W", result.getKey());
		assertEquals("model.direction.W.name", result.getNameKey());
		assertEquals("W", result.name());
		assertEquals("W", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Map.Position step(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testStep_1()
		throws Exception {
		Direction fixture = Direction.E;
		int x = 1;
		int y = 1;

		Map.Position result = fixture.step(x, y);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(2, 1)", result.toString());
		assertEquals(2, result.getX());
		assertEquals(1, result.getY());
	}

	/**
	 * Run the Map.Position step(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	@Test
	public void testStep_2()
		throws Exception {
		Direction fixture = Direction.E;
		int x = 1;
		int y = 1;

		Map.Position result = fixture.step(x, y);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(2, 1)", result.toString());
		assertEquals(2, result.getX());
		assertEquals(1, result.getY());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 8:23 PM
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
	 * @generatedBy CodePro at 5/12/18 8:23 PM
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
	 * @generatedBy CodePro at 5/12/18 8:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DirectionTest.class);
	}
}