/**
 */
package tdt4250.a1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.a1.A1Package;
import tdt4250.a1.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.a1.impl.SpecializationImpl#getFurtherSpecialization <em>Further Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFurtherSpecialization() <em>Further Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final String FURTHER_SPECIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFurtherSpecialization() <em>Further Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherSpecialization()
	 * @generated
	 * @ordered
	 */
	protected String furtherSpecialization = FURTHER_SPECIALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFurtherSpecialization() {
		return furtherSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFurtherSpecialization(String newFurtherSpecialization) {
		String oldFurtherSpecialization = furtherSpecialization;
		furtherSpecialization = newFurtherSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SPECIALIZATION__FURTHER_SPECIALIZATION, oldFurtherSpecialization, furtherSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A1Package.SPECIALIZATION__NAME:
				return getName();
			case A1Package.SPECIALIZATION__FURTHER_SPECIALIZATION:
				return getFurtherSpecialization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A1Package.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case A1Package.SPECIALIZATION__FURTHER_SPECIALIZATION:
				setFurtherSpecialization((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case A1Package.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case A1Package.SPECIALIZATION__FURTHER_SPECIALIZATION:
				setFurtherSpecialization(FURTHER_SPECIALIZATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case A1Package.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case A1Package.SPECIALIZATION__FURTHER_SPECIALIZATION:
				return FURTHER_SPECIALIZATION_EDEFAULT == null ? furtherSpecialization != null : !FURTHER_SPECIALIZATION_EDEFAULT.equals(furtherSpecialization);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", furtherSpecialization: ");
		result.append(furtherSpecialization);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
