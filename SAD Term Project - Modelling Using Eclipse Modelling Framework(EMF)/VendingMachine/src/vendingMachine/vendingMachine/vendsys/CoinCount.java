/**
 */
package vendingMachine.vendingMachine.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coin Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_QUARTERS <em>NUM QUARTERS</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_DIMES <em>NUM DIMES</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_NICKELS <em>NUM NICKELS</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.CoinCount#getCoins <em>Coins</em>}</li>
 * </ul>
 * </p>
 *
 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getCoinCount()
 * @model
 * @generated
 */
public interface CoinCount extends EObject {
	/**
	 * Returns the value of the '<em><b>NUM QUARTERS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NUM QUARTERS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NUM QUARTERS</em>' attribute.
	 * @see #setNUM_QUARTERS(int)
	 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getCoinCount_NUM_QUARTERS()
	 * @model
	 * @generated
	 */
	int getNUM_QUARTERS();

	/**
	 * Sets the value of the '{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_QUARTERS <em>NUM QUARTERS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NUM QUARTERS</em>' attribute.
	 * @see #getNUM_QUARTERS()
	 * @generated
	 */
	void setNUM_QUARTERS(int value);

	/**
	 * Returns the value of the '<em><b>NUM DIMES</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NUM DIMES</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NUM DIMES</em>' attribute.
	 * @see #setNUM_DIMES(int)
	 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getCoinCount_NUM_DIMES()
	 * @model
	 * @generated
	 */
	int getNUM_DIMES();

	/**
	 * Sets the value of the '{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_DIMES <em>NUM DIMES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NUM DIMES</em>' attribute.
	 * @see #getNUM_DIMES()
	 * @generated
	 */
	void setNUM_DIMES(int value);

	/**
	 * Returns the value of the '<em><b>NUM NICKELS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NUM NICKELS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NUM NICKELS</em>' attribute.
	 * @see #setNUM_NICKELS(int)
	 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getCoinCount_NUM_NICKELS()
	 * @model
	 * @generated
	 */
	int getNUM_NICKELS();

	/**
	 * Sets the value of the '{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_NICKELS <em>NUM NICKELS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NUM NICKELS</em>' attribute.
	 * @see #getNUM_NICKELS()
	 * @generated
	 */
	void setNUM_NICKELS(int value);

	/**
	 * Returns the value of the '<em><b>Coins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coins</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coins</em>' containment reference.
	 * @see #setCoins(CashRegister)
	 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getCoinCount_Coins()
	 * @model containment="true"
	 * @generated
	 */
	CashRegister getCoins();

	/**
	 * Sets the value of the '{@link vendingMachine.vendingMachine.vendsys.CoinCount#getCoins <em>Coins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coins</em>' containment reference.
	 * @see #getCoins()
	 * @generated
	 */
	void setCoins(CashRegister value);

} // CoinCount
