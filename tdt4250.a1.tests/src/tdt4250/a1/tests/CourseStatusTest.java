/**
 */
package tdt4250.a1.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdt4250.a1.A1Factory;
import tdt4250.a1.CourseStatus;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course Status</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseStatusTest extends TestCase {

	/**
	 * The fixture for this Course Status test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseStatus fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseStatusTest.class);
	}

	/**
	 * Constructs a new Course Status test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseStatusTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course Status test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CourseStatus fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course Status test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseStatus getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(A1Factory.eINSTANCE.createCourseStatus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CourseStatusTest
