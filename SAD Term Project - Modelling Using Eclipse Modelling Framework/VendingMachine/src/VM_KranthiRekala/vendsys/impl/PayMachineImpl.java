/**
 */
package VM_KranthiRekala.vendsys.impl;

import VM_KranthiRekala.vendsys.CashRegister;
import VM_KranthiRekala.vendsys.IPayMachineListener;
import VM_KranthiRekala.vendsys.PayMachine;
import VM_KranthiRekala.vendsys.VendsysPackage;
import VM_KranthiRekala.vendsys.VirtualVendingMachine;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pay Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.PayMachineImpl#getM_dMaximumBalance <em>MdMaximum Balance</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.PayMachineImpl#getM_dBalance <em>MdBalance</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.PayMachineImpl#isM_bOutOfOrder <em>MbOut Of Order</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.PayMachineImpl#getM_pmlListener <em>Mpml Listener</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.PayMachineImpl#getM_crRegister <em>Mcr Register</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.PayMachineImpl#getM_vvmOwner <em>Mvvm Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayMachineImpl extends MinimalEObjectImpl.Container implements PayMachine {
	/**
	 * The default value of the '{@link #getM_dMaximumBalance() <em>MdMaximum Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dMaximumBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double MDMAXIMUM_BALANCE_EDEFAULT = 3.0;

	/**
	 * The cached value of the '{@link #getM_dMaximumBalance() <em>MdMaximum Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dMaximumBalance()
	 * @generated
	 * @ordered
	 */
	protected double m_dMaximumBalance = MDMAXIMUM_BALANCE_EDEFAULT;

	/**
	 * This is true if the MdMaximum Balance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean m_dMaximumBalanceESet;

	/**
	 * The default value of the '{@link #getM_dBalance() <em>MdBalance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double MDBALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM_dBalance() <em>MdBalance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dBalance()
	 * @generated
	 * @ordered
	 */
	protected double m_dBalance = MDBALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isM_bOutOfOrder() <em>MbOut Of Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isM_bOutOfOrder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MBOUT_OF_ORDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isM_bOutOfOrder() <em>MbOut Of Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isM_bOutOfOrder()
	 * @generated
	 * @ordered
	 */
	protected boolean m_bOutOfOrder = MBOUT_OF_ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_pmlListener() <em>Mpml Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pmlListener()
	 * @generated
	 * @ordered
	 */
	protected IPayMachineListener m_pmlListener;

	/**
	 * The cached value of the '{@link #getM_crRegister() <em>Mcr Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_crRegister()
	 * @generated
	 * @ordered
	 */
	protected CashRegister m_crRegister;

	/**
	 * The cached value of the '{@link #getM_vvmOwner() <em>Mvvm Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_vvmOwner()
	 * @generated
	 * @ordered
	 */
	protected VirtualVendingMachine m_vvmOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendsysPackage.Literals.PAY_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getM_dMaximumBalance() {
		return m_dMaximumBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_dMaximumBalance(double newM_dMaximumBalance) {
		double oldM_dMaximumBalance = m_dMaximumBalance;
		m_dMaximumBalance = newM_dMaximumBalance;
		boolean oldM_dMaximumBalanceESet = m_dMaximumBalanceESet;
		m_dMaximumBalanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PAY_MACHINE__MDMAXIMUM_BALANCE, oldM_dMaximumBalance, m_dMaximumBalance, !oldM_dMaximumBalanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetM_dMaximumBalance() {
		double oldM_dMaximumBalance = m_dMaximumBalance;
		boolean oldM_dMaximumBalanceESet = m_dMaximumBalanceESet;
		m_dMaximumBalance = MDMAXIMUM_BALANCE_EDEFAULT;
		m_dMaximumBalanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VendsysPackage.PAY_MACHINE__MDMAXIMUM_BALANCE, oldM_dMaximumBalance, MDMAXIMUM_BALANCE_EDEFAULT, oldM_dMaximumBalanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetM_dMaximumBalance() {
		return m_dMaximumBalanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getM_dBalance() {
		return m_dBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_dBalance(double newM_dBalance) {
		double oldM_dBalance = m_dBalance;
		m_dBalance = newM_dBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PAY_MACHINE__MDBALANCE, oldM_dBalance, m_dBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isM_bOutOfOrder() {
		return m_bOutOfOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_bOutOfOrder(boolean newM_bOutOfOrder) {
		boolean oldM_bOutOfOrder = m_bOutOfOrder;
		m_bOutOfOrder = newM_bOutOfOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PAY_MACHINE__MBOUT_OF_ORDER, oldM_bOutOfOrder, m_bOutOfOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayMachineListener getM_pmlListener() {
		if (m_pmlListener != null && m_pmlListener.eIsProxy()) {
			InternalEObject oldM_pmlListener = (InternalEObject)m_pmlListener;
			m_pmlListener = (IPayMachineListener)eResolveProxy(oldM_pmlListener);
			if (m_pmlListener != oldM_pmlListener) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.PAY_MACHINE__MPML_LISTENER, oldM_pmlListener, m_pmlListener));
			}
		}
		return m_pmlListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayMachineListener basicGetM_pmlListener() {
		return m_pmlListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pmlListener(IPayMachineListener newM_pmlListener) {
		IPayMachineListener oldM_pmlListener = m_pmlListener;
		m_pmlListener = newM_pmlListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PAY_MACHINE__MPML_LISTENER, oldM_pmlListener, m_pmlListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashRegister getM_crRegister() {
		if (m_crRegister != null && m_crRegister.eIsProxy()) {
			InternalEObject oldM_crRegister = (InternalEObject)m_crRegister;
			m_crRegister = (CashRegister)eResolveProxy(oldM_crRegister);
			if (m_crRegister != oldM_crRegister) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.PAY_MACHINE__MCR_REGISTER, oldM_crRegister, m_crRegister));
			}
		}
		return m_crRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashRegister basicGetM_crRegister() {
		return m_crRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_crRegister(CashRegister newM_crRegister) {
		CashRegister oldM_crRegister = m_crRegister;
		m_crRegister = newM_crRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PAY_MACHINE__MCR_REGISTER, oldM_crRegister, m_crRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachine getM_vvmOwner() {
		if (m_vvmOwner != null && m_vvmOwner.eIsProxy()) {
			InternalEObject oldM_vvmOwner = (InternalEObject)m_vvmOwner;
			m_vvmOwner = (VirtualVendingMachine)eResolveProxy(oldM_vvmOwner);
			if (m_vvmOwner != oldM_vvmOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.PAY_MACHINE__MVVM_OWNER, oldM_vvmOwner, m_vvmOwner));
			}
		}
		return m_vvmOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachine basicGetM_vvmOwner() {
		return m_vvmOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_vvmOwner(VirtualVendingMachine newM_vvmOwner, NotificationChain msgs) {
		VirtualVendingMachine oldM_vvmOwner = m_vvmOwner;
		m_vvmOwner = newM_vvmOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendsysPackage.PAY_MACHINE__MVVM_OWNER, oldM_vvmOwner, newM_vvmOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_vvmOwner(VirtualVendingMachine newM_vvmOwner) {
		if (newM_vvmOwner != m_vvmOwner) {
			NotificationChain msgs = null;
			if (m_vvmOwner != null)
				msgs = ((InternalEObject)m_vvmOwner).eInverseRemove(this, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, VirtualVendingMachine.class, msgs);
			if (newM_vvmOwner != null)
				msgs = ((InternalEObject)newM_vvmOwner).eInverseAdd(this, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, VirtualVendingMachine.class, msgs);
			msgs = basicSetM_vvmOwner(newM_vvmOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PAY_MACHINE__MVVM_OWNER, newM_vvmOwner, newM_vvmOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void PayMachine(VirtualVendingMachine vvmOwner, double dMaximumBalance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayMachineListener(IPayMachineListener pmlListener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBalance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insertQuarter() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insertDime() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insertNickel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insertDollar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insertSuncard(int iAccount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void returnChange() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deductBalance(double dAmount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearBalance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VendsysPackage.PAY_MACHINE__MVVM_OWNER:
				if (m_vvmOwner != null)
					msgs = ((InternalEObject)m_vvmOwner).eInverseRemove(this, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, VirtualVendingMachine.class, msgs);
				return basicSetM_vvmOwner((VirtualVendingMachine)otherEnd, msgs);
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
			case VendsysPackage.PAY_MACHINE__MVVM_OWNER:
				return basicSetM_vvmOwner(null, msgs);
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
			case VendsysPackage.PAY_MACHINE__MDMAXIMUM_BALANCE:
				return getM_dMaximumBalance();
			case VendsysPackage.PAY_MACHINE__MDBALANCE:
				return getM_dBalance();
			case VendsysPackage.PAY_MACHINE__MBOUT_OF_ORDER:
				return isM_bOutOfOrder();
			case VendsysPackage.PAY_MACHINE__MPML_LISTENER:
				if (resolve) return getM_pmlListener();
				return basicGetM_pmlListener();
			case VendsysPackage.PAY_MACHINE__MCR_REGISTER:
				if (resolve) return getM_crRegister();
				return basicGetM_crRegister();
			case VendsysPackage.PAY_MACHINE__MVVM_OWNER:
				if (resolve) return getM_vvmOwner();
				return basicGetM_vvmOwner();
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
			case VendsysPackage.PAY_MACHINE__MDMAXIMUM_BALANCE:
				setM_dMaximumBalance((Double)newValue);
				return;
			case VendsysPackage.PAY_MACHINE__MDBALANCE:
				setM_dBalance((Double)newValue);
				return;
			case VendsysPackage.PAY_MACHINE__MBOUT_OF_ORDER:
				setM_bOutOfOrder((Boolean)newValue);
				return;
			case VendsysPackage.PAY_MACHINE__MPML_LISTENER:
				setM_pmlListener((IPayMachineListener)newValue);
				return;
			case VendsysPackage.PAY_MACHINE__MCR_REGISTER:
				setM_crRegister((CashRegister)newValue);
				return;
			case VendsysPackage.PAY_MACHINE__MVVM_OWNER:
				setM_vvmOwner((VirtualVendingMachine)newValue);
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
			case VendsysPackage.PAY_MACHINE__MDMAXIMUM_BALANCE:
				unsetM_dMaximumBalance();
				return;
			case VendsysPackage.PAY_MACHINE__MDBALANCE:
				setM_dBalance(MDBALANCE_EDEFAULT);
				return;
			case VendsysPackage.PAY_MACHINE__MBOUT_OF_ORDER:
				setM_bOutOfOrder(MBOUT_OF_ORDER_EDEFAULT);
				return;
			case VendsysPackage.PAY_MACHINE__MPML_LISTENER:
				setM_pmlListener((IPayMachineListener)null);
				return;
			case VendsysPackage.PAY_MACHINE__MCR_REGISTER:
				setM_crRegister((CashRegister)null);
				return;
			case VendsysPackage.PAY_MACHINE__MVVM_OWNER:
				setM_vvmOwner((VirtualVendingMachine)null);
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
			case VendsysPackage.PAY_MACHINE__MDMAXIMUM_BALANCE:
				return isSetM_dMaximumBalance();
			case VendsysPackage.PAY_MACHINE__MDBALANCE:
				return m_dBalance != MDBALANCE_EDEFAULT;
			case VendsysPackage.PAY_MACHINE__MBOUT_OF_ORDER:
				return m_bOutOfOrder != MBOUT_OF_ORDER_EDEFAULT;
			case VendsysPackage.PAY_MACHINE__MPML_LISTENER:
				return m_pmlListener != null;
			case VendsysPackage.PAY_MACHINE__MCR_REGISTER:
				return m_crRegister != null;
			case VendsysPackage.PAY_MACHINE__MVVM_OWNER:
				return m_vvmOwner != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VendsysPackage.PAY_MACHINE___PAY_MACHINE__VIRTUALVENDINGMACHINE_DOUBLE:
				PayMachine((VirtualVendingMachine)arguments.get(0), (Double)arguments.get(1));
				return null;
			case VendsysPackage.PAY_MACHINE___SET_PAY_MACHINE_LISTENER__IPAYMACHINELISTENER:
				setPayMachineListener((IPayMachineListener)arguments.get(0));
				return null;
			case VendsysPackage.PAY_MACHINE___GET_BALANCE:
				return getBalance();
			case VendsysPackage.PAY_MACHINE___INSERT_QUARTER:
				insertQuarter();
				return null;
			case VendsysPackage.PAY_MACHINE___INSERT_DIME:
				insertDime();
				return null;
			case VendsysPackage.PAY_MACHINE___INSERT_NICKEL:
				insertNickel();
				return null;
			case VendsysPackage.PAY_MACHINE___INSERT_DOLLAR:
				insertDollar();
				return null;
			case VendsysPackage.PAY_MACHINE___INSERT_SUNCARD__INT:
				insertSuncard((Integer)arguments.get(0));
				return null;
			case VendsysPackage.PAY_MACHINE___RETURN_CHANGE:
				returnChange();
				return null;
			case VendsysPackage.PAY_MACHINE___DEDUCT_BALANCE__DOUBLE:
				deductBalance((Double)arguments.get(0));
				return null;
			case VendsysPackage.PAY_MACHINE___CLEAR_BALANCE:
				clearBalance();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (m_dMaximumBalance: ");
		if (m_dMaximumBalanceESet) result.append(m_dMaximumBalance); else result.append("<unset>");
		result.append(", m_dBalance: ");
		result.append(m_dBalance);
		result.append(", m_bOutOfOrder: ");
		result.append(m_bOutOfOrder);
		result.append(')');
		return result.toString();
	}

} //PayMachineImpl
