package towson.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/12/18 8:58 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	FeatureTest.class,
	AbstractUnitTest.class,
	AbstractGoodsTest.class,
	FreeColObjectTest.class,
	EquipmentTypeTest.class,
	BuildingTypeTest.class,
	DisasterTest.class,
	EuropeanNationTypeTest.class,
	FeatureContainerTest.class,
	FoundingFatherTest.class,
	DirectionTest.class,
	EventTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/12/18 8:58 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
