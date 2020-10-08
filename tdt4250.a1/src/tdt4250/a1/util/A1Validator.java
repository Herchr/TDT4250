/**
 */
package tdt4250.a1.util;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.a1.*;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.a1.A1Package
 * @generated
 */
public class A1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final A1Validator INSTANCE = new A1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.a1";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return A1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case A1Package.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case A1Package.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case A1Package.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case A1Package.COURSE_STATUS:
				return validateCourseStatus((CourseStatus)value, diagnostics, context);
			case A1Package.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case A1Package.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case A1Package.MASTER_TYPE:
				return validateMasterType((MasterType)value, diagnostics, context);
			case A1Package.STATUS_CODE:
				return validateStatusCode((StatusCode)value, diagnostics, context);
			case A1Package.COURSE_LEVEL:
				return validateCourseLevel((CourseLevel)value, diagnostics, context);
			case A1Package.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseStatus(CourseStatus courseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_needsEnoughCredits(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_needsEnoughHigherLevelCourses(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_needsPermissionToChooseSpecialization(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_needsSemesterNonZero(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the needsEnoughCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	@SuppressWarnings("unchecked")
	public boolean validateSemester_needsEnoughCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		EList<CourseStatus> courseStatuses = semester.getCourseStatuses();
		EList<Course> courses = (EList<Course>) new ArrayList<Course>(); 
		for(CourseStatus courseStatus : courseStatuses) {
			courses.add(courseStatus.getCourse());
		}
		float totalCredits = 0.0f;
		for(Course course : courses) {
			totalCredits += course.getCredits();
		}
		if (totalCredits < 30.0f) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "needsEnoughCredits", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the needsObligatoryCourses constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	/*
	 * NOT NEEDED AFTER REFACTORING OF SEMESTER CLASS
	public boolean validateSemester_needsObligatoryCourses(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		EList<CourseStatus> courseStatuses = semester.getCourseStatuses();
		@SuppressWarnings("unchecked")
		EList<Course> obligatoryCourses = (EList<Course>) new ArrayList<Course>();
		
		for(CourseStatus courseStatus : courseStatuses) {
			if(courseStatus.getStatusCode().equals("O")) {
				obligatoryCourses.add(courseStatus.getCourse());
			}
		}
		
		EList<Course> semesterCourses = semester.getCourses();
		boolean hasAllObligatoryCourses = semesterCourses.containsAll(obligatoryCourses);
		
		if (!hasAllObligatoryCourses) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "needsObligatoryCourses", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}*/

	/**
	 * The cached validation expression for the needsSemesterNonZero constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__NEEDS_SEMESTER_NON_ZERO__EEXPRESSION = "self.number > 0";

	/**
	 * Validates the needsSemesterNonZero constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_needsSemesterNonZero(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(A1Package.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "needsSemesterNonZero",
				 SEMESTER__NEEDS_SEMESTER_NON_ZERO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the needsEnoughHigherLevelCourses constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public boolean validateSemester_needsEnoughHigherLevelCourses(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		EList<CourseStatus> courseStatuses = semester.getCourseStatuses();
		EList<Course> courses = (EList<Course>) new ArrayList<Course>(); 
		for(CourseStatus courseStatus : courseStatuses) {
			courses.add(courseStatus.getCourse());
		}
		float lowerLevelCredits = 0.0f;
		boolean masterLevel = (semester.getProgram().getType() == MasterType.MASTER_5ÅRIG && semester.getNumber() > 6) || semester.getProgram().getType() == MasterType.MASTER_2ÅRIG;
		if(masterLevel) {
			for(Course course : courses) {
				if(course.getLevel() == CourseLevel.THIRD_YEAR) {
					lowerLevelCredits += course.getCredits();
				}
			}
		}
		
		if (lowerLevelCredits > 22.5f) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "needsEnoughHigherLevelCourses", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the needsPermissionToChooseSpecialization constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_needsPermissionToChooseSpecialization(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		MasterType masterType = semester.getProgram().getType();
		boolean hasPermission = false;
		if(masterType == MasterType.MASTER_5ÅRIG) {
			hasPermission = semester.getNumber() == 7;
			if(semester.getNumber() == 9) {
				boolean hasFurtherSpecialization = semester.getSpecialization().getFurtherSpecialization().length() > 0;
				hasPermission = hasFurtherSpecialization;
			}
		}else if(masterType == MasterType.MASTER_2ÅRIG) {
			hasPermission = semester.getNumber() == 1;
		}
		
		if (!hasPermission) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "needsPermissionToChooseSpecialization", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterType(MasterType masterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusCode(StatusCode statusCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //A1Validator
