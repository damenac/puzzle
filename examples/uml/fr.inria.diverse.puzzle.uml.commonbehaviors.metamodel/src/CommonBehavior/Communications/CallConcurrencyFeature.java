/**
 */
package CommonBehavior.Communications;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Call Concurrency Feature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CommonBehavior.Communications.CommunicationsPackage#getCallConcurrencyFeature()
 * @model
 * @generated
 */
public enum CallConcurrencyFeature implements Enumerator {
	/**
	 * The '<em><b>Sequential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENTIAL(0, "sequential", "sequential"),

	/**
	 * The '<em><b>Guarded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARDED_VALUE
	 * @generated
	 * @ordered
	 */
	GUARDED(1, "guarded", "guarded"),

	/**
	 * The '<em><b>Concurrent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCURRENT(3, "concurrent", "concurrent");

	/**
	 * The '<em><b>Sequential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL
	 * @model name="sequential"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL_VALUE = 0;

	/**
	 * The '<em><b>Guarded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guarded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARDED
	 * @model name="guarded"
	 * @generated
	 * @ordered
	 */
	public static final int GUARDED_VALUE = 1;

	/**
	 * The '<em><b>Concurrent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concurrent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT
	 * @model name="concurrent"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Call Concurrency Feature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CallConcurrencyFeature[] VALUES_ARRAY =
		new CallConcurrencyFeature[] {
			SEQUENTIAL,
			GUARDED,
			CONCURRENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Call Concurrency Feature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CallConcurrencyFeature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Call Concurrency Feature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CallConcurrencyFeature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallConcurrencyFeature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Concurrency Feature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CallConcurrencyFeature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallConcurrencyFeature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Concurrency Feature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CallConcurrencyFeature get(int value) {
		switch (value) {
			case SEQUENTIAL_VALUE: return SEQUENTIAL;
			case GUARDED_VALUE: return GUARDED;
			case CONCURRENT_VALUE: return CONCURRENT;
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
	private CallConcurrencyFeature(int value, String name, String literal) {
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
	
} //CallConcurrencyFeature
