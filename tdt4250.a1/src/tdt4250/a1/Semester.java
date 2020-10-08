/**
 */
package tdt4250.a1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link tdt4250.a1.Semester#getCourseStatuses <em>Course Statuses</em>}</li>
 *   <li>{@link tdt4250.a1.Semester#getProgram <em>Program</em>}</li>
 *   <li>{@link tdt4250.a1.Semester#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link tdt4250.a1.Semester#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.A1Package#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsEnoughCredits needsEnoughHigherLevelCourses needsPermissionToChooseSpecialization needsObligatoryCourses needsSemesterNonZero'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 needsSemesterNonZero='self.number &gt; 0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see tdt4250.a1.A1Package#getSemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course Statuses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.CourseStatus}.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.CourseStatus#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Statuses</em>' containment reference list.
	 * @see tdt4250.a1.A1Package#getSemester_CourseStatuses()
	 * @see tdt4250.a1.CourseStatus#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<CourseStatus> getCourseStatuses();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.Program#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see tdt4250.a1.A1Package#getSemester_Program()
	 * @see tdt4250.a1.Program#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Semester#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' reference.
	 * @see #setSpecialization(Specialization)
	 * @see tdt4250.a1.A1Package#getSemester_Specialization()
	 * @model
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Semester#getSpecialization <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see tdt4250.a1.A1Package#getSemester_Year()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getYear();

} // Semester
