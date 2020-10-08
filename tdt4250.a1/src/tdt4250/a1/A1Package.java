/**
 */
package tdt4250.a1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.a1.A1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface A1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "a1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.a1/model/a1.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "a1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A1Package eINSTANCE = tdt4250.a1.impl.A1PackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.a1.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.impl.CourseImpl
	 * @see tdt4250.a1.impl.A1PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.impl.ProgramImpl
	 * @see tdt4250.a1.impl.A1PackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIALIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SEMESTERS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.impl.SpecializationImpl
	 * @see tdt4250.a1.impl.A1PackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Further Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__FURTHER_SPECIALIZATION = 1;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.impl.CourseStatusImpl <em>Course Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.impl.CourseStatusImpl
	 * @see tdt4250.a1.impl.A1PackageImpl#getCourseStatus()
	 * @generated
	 */
	int COURSE_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_STATUS__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_STATUS__STATUS_CODE = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_STATUS__SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>Course Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_STATUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.impl.SemesterImpl
	 * @see tdt4250.a1.impl.A1PackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Course Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSE_STATUSES = 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__YEAR = 4;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.impl.UniversityImpl
	 * @see tdt4250.a1.impl.A1PackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 5;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__PROGRAMS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 2;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link tdt4250.a1.MasterType <em>Master Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.MasterType
	 * @see tdt4250.a1.impl.A1PackageImpl#getMasterType()
	 * @generated
	 */
	int MASTER_TYPE = 6;


	/**
	 * The meta object id for the '{@link tdt4250.a1.StatusCode <em>Status Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.StatusCode
	 * @see tdt4250.a1.impl.A1PackageImpl#getStatusCode()
	 * @generated
	 */
	int STATUS_CODE = 7;

	/**
	 * The meta object id for the '{@link tdt4250.a1.CourseLevel <em>Course Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.CourseLevel
	 * @see tdt4250.a1.impl.A1PackageImpl#getCourseLevel()
	 * @generated
	 */
	int COURSE_LEVEL = 8;


	/**
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tdt4250.a1.impl.A1PackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 9;


	/**
	 * Returns the meta object for class '{@link tdt4250.a1.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250.a1.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.a1.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.a1.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tdt4250.a1.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see tdt4250.a1.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see tdt4250.a1.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.a1.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.Program#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see tdt4250.a1.Program#getSpecializations()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Specializations();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.Program#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see tdt4250.a1.Program#getSemesters()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Program#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tdt4250.a1.Program#getType()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Type();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see tdt4250.a1.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.a1.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Specialization#getFurtherSpecialization <em>Further Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Further Specialization</em>'.
	 * @see tdt4250.a1.Specialization#getFurtherSpecialization()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_FurtherSpecialization();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.CourseStatus <em>Course Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Status</em>'.
	 * @see tdt4250.a1.CourseStatus
	 * @generated
	 */
	EClass getCourseStatus();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.a1.CourseStatus#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see tdt4250.a1.CourseStatus#getCourse()
	 * @see #getCourseStatus()
	 * @generated
	 */
	EReference getCourseStatus_Course();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.CourseStatus#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see tdt4250.a1.CourseStatus#getStatusCode()
	 * @see #getCourseStatus()
	 * @generated
	 */
	EAttribute getCourseStatus_StatusCode();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.a1.CourseStatus#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see tdt4250.a1.CourseStatus#getSemester()
	 * @see #getCourseStatus()
	 * @generated
	 */
	EReference getCourseStatus_Semester();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see tdt4250.a1.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Semester#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see tdt4250.a1.Semester#getNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.Semester#getCourseStatuses <em>Course Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Statuses</em>'.
	 * @see tdt4250.a1.Semester#getCourseStatuses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_CourseStatuses();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.a1.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see tdt4250.a1.Semester#getProgram()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Program();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.a1.Semester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialization</em>'.
	 * @see tdt4250.a1.Semester#getSpecialization()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Specialization();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see tdt4250.a1.Semester#getYear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Year();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see tdt4250.a1.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.University#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see tdt4250.a1.University#getCourses()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.University#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see tdt4250.a1.University#getPrograms()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Programs();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.a1.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for enum '{@link tdt4250.a1.MasterType <em>Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Master Type</em>'.
	 * @see tdt4250.a1.MasterType
	 * @generated
	 */
	EEnum getMasterType();

	/**
	 * Returns the meta object for enum '{@link tdt4250.a1.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Code</em>'.
	 * @see tdt4250.a1.StatusCode
	 * @generated
	 */
	EEnum getStatusCode();

	/**
	 * Returns the meta object for enum '{@link tdt4250.a1.CourseLevel <em>Course Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Level</em>'.
	 * @see tdt4250.a1.CourseLevel
	 * @generated
	 */
	EEnum getCourseLevel();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	A1Factory getA1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.a1.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.impl.CourseImpl
		 * @see tdt4250.a1.impl.A1PackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.impl.ProgramImpl
		 * @see tdt4250.a1.impl.A1PackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPECIALIZATIONS = eINSTANCE.getProgram_Specializations();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SEMESTERS = eINSTANCE.getProgram_Semesters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__TYPE = eINSTANCE.getProgram_Type();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.impl.SpecializationImpl
		 * @see tdt4250.a1.impl.A1PackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Further Specialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__FURTHER_SPECIALIZATION = eINSTANCE.getSpecialization_FurtherSpecialization();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.impl.CourseStatusImpl <em>Course Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.impl.CourseStatusImpl
		 * @see tdt4250.a1.impl.A1PackageImpl#getCourseStatus()
		 * @generated
		 */
		EClass COURSE_STATUS = eINSTANCE.getCourseStatus();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_STATUS__COURSE = eINSTANCE.getCourseStatus_Course();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_STATUS__STATUS_CODE = eINSTANCE.getCourseStatus_StatusCode();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_STATUS__SEMESTER = eINSTANCE.getCourseStatus_Semester();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.impl.SemesterImpl
		 * @see tdt4250.a1.impl.A1PackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NUMBER = eINSTANCE.getSemester_Number();

		/**
		 * The meta object literal for the '<em><b>Course Statuses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSE_STATUSES = eINSTANCE.getSemester_CourseStatuses();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PROGRAM = eINSTANCE.getSemester_Program();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SPECIALIZATION = eINSTANCE.getSemester_Specialization();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__YEAR = eINSTANCE.getSemester_Year();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.impl.UniversityImpl
		 * @see tdt4250.a1.impl.A1PackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSES = eINSTANCE.getUniversity_Courses();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__PROGRAMS = eINSTANCE.getUniversity_Programs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.MasterType <em>Master Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.MasterType
		 * @see tdt4250.a1.impl.A1PackageImpl#getMasterType()
		 * @generated
		 */
		EEnum MASTER_TYPE = eINSTANCE.getMasterType();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.StatusCode <em>Status Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.StatusCode
		 * @see tdt4250.a1.impl.A1PackageImpl#getStatusCode()
		 * @generated
		 */
		EEnum STATUS_CODE = eINSTANCE.getStatusCode();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.CourseLevel <em>Course Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.CourseLevel
		 * @see tdt4250.a1.impl.A1PackageImpl#getCourseLevel()
		 * @generated
		 */
		EEnum COURSE_LEVEL = eINSTANCE.getCourseLevel();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tdt4250.a1.impl.A1PackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

	}

} //A1Package
