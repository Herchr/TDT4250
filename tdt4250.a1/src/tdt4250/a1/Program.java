/**
 */
package tdt4250.a1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.Program#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.a1.Program#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link tdt4250.a1.Program#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.a1.Program#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.A1Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.a1.A1Package#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see tdt4250.a1.A1Package#getProgram_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.Semester}.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.a1.A1Package#getProgram_Semesters()
	 * @see tdt4250.a1.Semester#getProgram
	 * @model opposite="program" containment="true" upper="10"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.a1.MasterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tdt4250.a1.MasterType
	 * @see #setType(MasterType)
	 * @see tdt4250.a1.A1Package#getProgram_Type()
	 * @model
	 * @generated
	 */
	MasterType getType();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Program#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tdt4250.a1.MasterType
	 * @see #getType()
	 * @generated
	 */
	void setType(MasterType value);

} // Program
