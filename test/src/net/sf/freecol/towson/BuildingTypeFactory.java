package net.sf.freecol.towson;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import net.sf.freecol.common.model.BuildingType;
import net.sf.freecol.common.model.Specification;


/**
 * The class <code>BuildingTypeFactory</code> implements static methods that return instances of the class <code>{@link BuildingType}</code>.
 *
 * @generatedBy CodePro at 5/12/18 5:44 PM
 * @author Aman
 * @version $Revision: 1.0 $
 */
public class BuildingTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/12/18 5:44 PM
	 */
	private BuildingTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link BuildingType}</code>.
	 *
	 * @generatedBy CodePro at 5/12/18 5:44 PM
	 */
	public static BuildingType createBuildingType() {
		return new BuildingType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link BuildingType}</code>.
	 *
	 * @generatedBy CodePro at 5/12/18 5:44 PM
	 */
	public static BuildingType createBuildingType2() {
		return new BuildingType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}