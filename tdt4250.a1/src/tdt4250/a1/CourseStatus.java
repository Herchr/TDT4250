/**
 */
package tdt4250.a1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.CourseStatus#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250.a1.CourseStatus#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link tdt4250.a1.CourseStatus#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.A1Package#getCourseStatus()
 * @model
 * @generated
 */
public interface CourseStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see tdt4250.a1.A1Package#getCourseStatus_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250.a1.CourseStatus#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.a1.StatusCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' attribute.
	 * @see tdt4250.a1.StatusCode
	 * @see #setStatusCode(StatusCode)
	 * @see tdt4250.a1.A1Package#getCourseStatus_StatusCode()
	 * @model
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link tdt4250.a1.CourseStatus#getStatusCode <em>Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' attribute.
	 * @see tdt4250.a1.StatusCode
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.Semester#getCourseStatuses <em>Course Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see tdt4250.a1.A1Package#getCourseStatus_Semester()
	 * @see tdt4250.a1.Semester#getCourseStatuses
	 * @model opposite="courseStatuses" transient="false" ordered="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link tdt4250.a1.CourseStatus#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // CourseStatus
