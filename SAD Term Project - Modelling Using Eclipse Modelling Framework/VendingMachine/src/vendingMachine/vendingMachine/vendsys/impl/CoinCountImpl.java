/**
 */
package vendingMachine.vendingMachine.vendsys.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vendingMachine.vendingMachine.vendsys.CashRegister;
import vendingMachine.vendingMachine.vendsys.CoinCount;
import vendingMachine.vendingMachine.vendsys.VendsysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coin Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CoinCountImpl#getNUM_QUARTERS <em>NUM QUARTERS</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CoinCountImpl#getNUM_DIMES <em>NUM DIMES</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CoinCountImpl#getNUM_NICKELS <em>NUM NICKELS</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CoinCountImpl#getCoins <em>Coins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoinCountImpl extends MinimalEObjectImpl.Container implements CoinCount {
	/**
	 * The default value of the '{@link #getNUM_QUARTERS() <em>NUM QUARTERS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUM_QUARTERS()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_QUARTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNUM_QUARTERS() <em>NUM QUARTERS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUM_QUARTERS()
	 * @generated
	 * @ordered
	 */
	protected int nuM_QUARTERS = NUM_QUARTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNUM_DIMES() <em>NUM DIMES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUM_DIMES()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_DIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNUM_DIMES() <em>NUM DIMES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUM_DIMES()
	 * @generated
	 * @ordered
	 */
	protected int nuM_DIMES = NUM_DIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNUM_NICKELS() <em>NUM NICKELS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUM_NICKELS()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_NICKELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNUM_NICKELS() <em>NUM NICKELS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUM_NICKELS()
	 * @generated
	 * @ordered
	 */
	protected int nuM_NICKELS = NUM_NICKELS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoins() <em>Coins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoins()
	 * @generated
	 * @ordered
	 */
	protected CashRegister coins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoinCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendsysPackage.Literals.COIN_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNUM_QUARTERS() {
		return nuM_QUARTERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNUM_QUARTERS(int newNUM_QUARTERS) {
		int oldNUM_QUARTERS = nuM_QUARTERS;
		nuM_QUARTERS = newNUM_QUARTERS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.COIN_COUNT__NUM_QUARTERS, oldNUM_QUARTERS, nuM_QUARTERS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNUM_DIMES() {
		return nuM_DIMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNUM_DIMES(int newNUM_DIMES) {
		int oldNUM_DIMES = nuM_DIMES;
		nuM_DIMES = newNUM_DIMES;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.COIN_COUNT__NUM_DIMES, oldNUM_DIMES, nuM_DIMES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNUM_NICKELS() {
		return nuM_NICKELS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNUM_NICKELS(int newNUM_NICKELS) {
		int oldNUM_NICKELS = nuM_NICKELS;
		nuM_NICKELS = newNUM_NICKELS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.COIN_COUNT__NUM_NICKELS, oldNUM_NICKELS, nuM_NICKELS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashRegister getCoins() {
		return coins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoins(CashRegister newCoins, NotificationChain msgs) {
		CashRegister oldCoins = coins;
		coins = newCoins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendsysPackage.COIN_COUNT__COINS, oldCoins, newCoins);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoins(CashRegister newCoins) {
		if (newCoins != coins) {
			NotificationChain msgs = null;
			if (coins != null)
				msgs = ((InternalEObject)coins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendsysPackage.COIN_COUNT__COINS, null, msgs);
			if (newCoins != null)
				msgs = ((InternalEObject)newCoins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendsysPackage.COIN_COUNT__COINS, null, msgs);
			msgs = basicSetCoins(newCoins, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.COIN_COUNT__COINS, newCoins, newCoins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VendsysPackage.COIN_COUNT__COINS:
				return basicSetCoins(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VendsysPackage.COIN_COUNT__NUM_QUARTERS:
				return getNUM_QUARTERS();
			case VendsysPackage.COIN_COUNT__NUM_DIMES:
				return getNUM_DIMES();
			case VendsysPackage.COIN_COUNT__NUM_NICKELS:
				return getNUM_NICKELS();
			case VendsysPackage.COIN_COUNT__COINS:
				return getCoins();
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
			case VendsysPackage.COIN_COUNT__NUM_QUARTERS:
				setNUM_QUARTERS((Integer)newValue);
				return;
			case VendsysPackage.COIN_COUNT__NUM_DIMES:
				setNUM_DIMES((Integer)newValue);
				return;
			case VendsysPackage.COIN_COUNT__NUM_NICKELS:
				setNUM_NICKELS((Integer)newValue);
				return;
			case VendsysPackage.COIN_COUNT__COINS:
				setCoins((CashRegister)newValue);
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
			case VendsysPackage.COIN_COUNT__NUM_QUARTERS:
				setNUM_QUARTERS(NUM_QUARTERS_EDEFAULT);
				return;
			case VendsysPackage.COIN_COUNT__NUM_DIMES:
				setNUM_DIMES(NUM_DIMES_EDEFAULT);
				return;
			case VendsysPackage.COIN_COUNT__NUM_NICKELS:
				setNUM_NICKELS(NUM_NICKELS_EDEFAULT);
				return;
			case VendsysPackage.COIN_COUNT__COINS:
				setCoins((CashRegister)null);
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
			case VendsysPackage.COIN_COUNT__NUM_QUARTERS:
				return nuM_QUARTERS != NUM_QUARTERS_EDEFAULT;
			case VendsysPackage.COIN_COUNT__NUM_DIMES:
				return nuM_DIMES != NUM_DIMES_EDEFAULT;
			case VendsysPackage.COIN_COUNT__NUM_NICKELS:
				return nuM_NICKELS != NUM_NICKELS_EDEFAULT;
			case VendsysPackage.COIN_COUNT__COINS:
				return coins != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (NUM_QUARTERS: ");
		result.append(nuM_QUARTERS);
		result.append(", NUM_DIMES: ");
		result.append(nuM_DIMES);
		result.append(", NUM_NICKELS: ");
		result.append(nuM_NICKELS);
		result.append(')');
		return result.toString();
	}

} //CoinCountImpl
