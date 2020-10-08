/**
 */
package tdt4250.a1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.a1.A1Package;
import tdt4250.a1.CourseStatus;
import tdt4250.a1.Program;
import tdt4250.a1.Semester;
import tdt4250.a1.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getCourseStatuses <em>Course Statuses</em>}</li>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseStatuses() <em>Course Statuses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseStatuses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseStatus> courseStatuses;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization specialization;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SEMESTER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseStatus> getCourseStatuses() {
		if (courseStatuses == null) {
			courseStatuses = new EObjectContainmentWithInverseEList<CourseStatus>(CourseStatus.class, this, A1Package.SEMESTER__COURSE_STATUSES, A1Package.COURSE_STATUS__SEMESTER);
		}
		return courseStatuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getProgram() {
		if (eContainerFeatureID() != A1Package.SEMESTER__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, A1Package.SEMESTER__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != A1Package.SEMESTER__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, A1Package.PROGRAM__SEMESTERS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SEMESTER__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization getSpecialization() {
		if (specialization != null && specialization.eIsProxy()) {
			InternalEObject oldSpecialization = (InternalEObject)specialization;
			specialization = (Specialization)eResolveProxy(oldSpecialization);
			if (specialization != oldSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, A1Package.SEMESTER__SPECIALIZATION, oldSpecialization, specialization));
			}
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialization(Specialization newSpecialization) {
		Specialization oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SEMESTER__SPECIALIZATION, oldSpecialization, specialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getYear() {
		int year = (int) Math.ceil(this.number / 2.0);
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A1Package.SEMESTER__COURSE_STATUSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseStatuses()).basicAdd(otherEnd, msgs);
			case A1Package.SEMESTER__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A1Package.SEMESTER__COURSE_STATUSES:
				return ((InternalEList<?>)getCourseStatuses()).basicRemove(otherEnd, msgs);
			case A1Package.SEMESTER__PROGRAM:
				return basicSetProgram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case A1Package.SEMESTER__PROGRAM:
				return eInternalContainer().eInverseRemove(this, A1Package.PROGRAM__SEMESTERS, Program.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A1Package.SEMESTER__NUMBER:
				return getNumber();
			case A1Package.SEMESTER__COURSE_STATUSES:
				return getCourseStatuses();
			case A1Package.SEMESTER__PROGRAM:
				return getProgram();
			case A1Package.SEMESTER__SPECIALIZATION:
				if (resolve) return getSpecialization();
				return basicGetSpecialization();
			case A1Package.SEMESTER__YEAR:
				return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A1Package.SEMESTER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case A1Package.SEMESTER__COURSE_STATUSES:
				getCourseStatuses().clear();
				getCourseStatuses().addAll((Collection<? extends CourseStatus>)newValue);
				return;
			case A1Package.SEMESTER__PROGRAM:
				setProgram((Program)newValue);
				return;
			case A1Package.SEMESTER__SPECIALIZATION:
				setSpecialization((Specialization)newValue);
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
			case A1Package.SEMESTER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case A1Package.SEMESTER__COURSE_STATUSES:
				getCourseStatuses().clear();
				return;
			case A1Package.SEMESTER__PROGRAM:
				setProgram((Program)null);
				return;
			case A1Package.SEMESTER__SPECIALIZATION:
				setSpecialization((Specialization)null);
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
			case A1Package.SEMESTER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case A1Package.SEMESTER__COURSE_STATUSES:
				return courseStatuses != null && !courseStatuses.isEmpty();
			case A1Package.SEMESTER__PROGRAM:
				return getProgram() != null;
			case A1Package.SEMESTER__SPECIALIZATION:
				return specialization != null;
			case A1Package.SEMESTER__YEAR:
				return getYear() != YEAR_EDEFAULT;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
