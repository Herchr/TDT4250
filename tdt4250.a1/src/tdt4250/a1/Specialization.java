/**
 */
package tdt4250.a1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.a1.Specialization#getFurtherSpecialization <em>Further Specialization</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.A1Package#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.a1.A1Package#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Further Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Further Specialization</em>' attribute.
	 * @see #setFurtherSpecialization(String)
	 * @see tdt4250.a1.A1Package#getSpecialization_FurtherSpecialization()
	 * @model
	 * @generated
	 */
	String getFurtherSpecialization();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Specialization#getFurtherSpecialization <em>Further Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Further Specialization</em>' attribute.
	 * @see #getFurtherSpecialization()
	 * @generated
	 */
	void setFurtherSpecialization(String value);

} // Specialization
