/**
 */
package tdt4250.a1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Master Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.a1.A1Package#getMasterType()
 * @model
 * @generated
 */
public enum MasterType implements Enumerator {
	/**
	 * The '<em><b>MASTER 5ÅRIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_5ÅRIG_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_5ÅRIG(0, "MASTER_5ÅRIG", "MASTER_5\u00c5RIG"),

	/**
	 * The '<em><b>MASTER 2ÅRIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_2ÅRIG_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_2ÅRIG(0, "MASTER_2ÅRIG", "MASTER_2\u00c5RIG");

	/**
	 * The '<em><b>MASTER 5ÅRIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_5ÅRIG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_5ÅRIG_VALUE = 0;

	/**
	 * The '<em><b>MASTER 2ÅRIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_2ÅRIG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_2ÅRIG_VALUE = 0;

	/**
	 * An array of all the '<em><b>Master Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MasterType[] VALUES_ARRAY =
		new MasterType[] {
			MASTER_5ÅRIG,
			MASTER_2ÅRIG,
		};

	/**
	 * A public read-only list of all the '<em><b>Master Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MasterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Master Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MasterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MasterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Master Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MasterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MasterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Master Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MasterType get(int value) {
		switch (value) {
			case MASTER_5ÅRIG_VALUE: return MASTER_5ÅRIG;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MasterType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MasterType
