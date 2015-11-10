/**
 */
package vendingMachine.vendingMachine.vendsys.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vendingMachine.vendingMachine.vendsys.CashRegister;
import vendingMachine.vendingMachine.vendsys.CoinCount;
import vendingMachine.vendingMachine.vendsys.SuncardReceipt;
import vendingMachine.vendingMachine.vendsys.VendsysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cash Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl#getM_iNumQuarters <em>MiNum Quarters</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl#getM_iNumDimes <em>MiNum Dimes</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl#getM_iNumNickels <em>MiNum Nickels</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl#getM_iNumDollars <em>MiNum Dollars</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl#getM_alReceipts <em>Mal Receipts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CashRegisterImpl extends VirtualVendingMachineImpl implements CashRegister {
	/**
	 * The default value of the '{@link #getM_iNumQuarters() <em>MiNum Quarters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumQuarters()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUM_QUARTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iNumQuarters() <em>MiNum Quarters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumQuarters()
	 * @generated
	 * @ordered
	 */
	protected int m_iNumQuarters = MINUM_QUARTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iNumDimes() <em>MiNum Dimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumDimes()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUM_DIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iNumDimes() <em>MiNum Dimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumDimes()
	 * @generated
	 * @ordered
	 */
	protected int m_iNumDimes = MINUM_DIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iNumNickels() <em>MiNum Nickels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumNickels()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUM_NICKELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iNumNickels() <em>MiNum Nickels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumNickels()
	 * @generated
	 * @ordered
	 */
	protected int m_iNumNickels = MINUM_NICKELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iNumDollars() <em>MiNum Dollars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumDollars()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUM_DOLLARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iNumDollars() <em>MiNum Dollars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumDollars()
	 * @generated
	 * @ordered
	 */
	protected int m_iNumDollars = MINUM_DOLLARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_alReceipts() <em>Mal Receipts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_alReceipts()
	 * @generated
	 * @ordered
	 */
	protected SuncardReceipt m_alReceipts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashRegisterImpl() {
		super();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendsysPackage.Literals.CASH_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iNumQuarters() {
		return m_iNumQuarters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iNumQuarters(int newM_iNumQuarters) {
		int oldM_iNumQuarters = m_iNumQuarters;
		m_iNumQuarters = newM_iNumQuarters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.CASH_REGISTER__MINUM_QUARTERS, oldM_iNumQuarters, m_iNumQuarters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iNumDimes() {
		return m_iNumDimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iNumDimes(int newM_iNumDimes) {
		int oldM_iNumDimes = m_iNumDimes;
		m_iNumDimes = newM_iNumDimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.CASH_REGISTER__MINUM_DIMES, oldM_iNumDimes, m_iNumDimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iNumNickels() {
		return m_iNumNickels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iNumNickels(int newM_iNumNickels) {
		int oldM_iNumNickels = m_iNumNickels;
		m_iNumNickels = newM_iNumNickels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.CASH_REGISTER__MINUM_NICKELS, oldM_iNumNickels, m_iNumNickels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iNumDollars() {
		return m_iNumDollars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iNumDollars(int newM_iNumDollars) {
		int oldM_iNumDollars = m_iNumDollars;
		m_iNumDollars = newM_iNumDollars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.CASH_REGISTER__MINUM_DOLLARS, oldM_iNumDollars, m_iNumDollars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuncardReceipt getM_alReceipts() {
		return m_alReceipts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_alReceipts(SuncardReceipt newM_alReceipts, NotificationChain msgs) {
		SuncardReceipt oldM_alReceipts = m_alReceipts;
		m_alReceipts = newM_alReceipts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendsysPackage.CASH_REGISTER__MAL_RECEIPTS, oldM_alReceipts, newM_alReceipts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_alReceipts(SuncardReceipt newM_alReceipts) {
		if (newM_alReceipts != m_alReceipts) {
			NotificationChain msgs = null;
			if (m_alReceipts != null)
				msgs = ((InternalEObject)m_alReceipts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendsysPackage.CASH_REGISTER__MAL_RECEIPTS, null, msgs);
			if (newM_alReceipts != null)
				msgs = ((InternalEObject)newM_alReceipts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendsysPackage.CASH_REGISTER__MAL_RECEIPTS, null, msgs);
			msgs = basicSetM_alReceipts(newM_alReceipts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.CASH_REGISTER__MAL_RECEIPTS, newM_alReceipts, newM_alReceipts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void CashRegister() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_iNumQuarters = 20;
		m_iNumNickels = 20;
		m_iNumDimes = 20;
		m_alReceipts = new ArrayList<SuncardReceipt>();
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double maximumChange() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
double m_dNickelsAndDimes = 0.10*m_iNumDimes + 0.05*m_iNumNickels;
		
		if (m_iNumNickels == 0)
			return 0;
		else if (m_dNickelsAndDimes < 0.20)
			return m_dNickelsAndDimes;
		else
			return 0.25*m_iNumQuarters + m_dNickelsAndDimes;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addDollars(int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_iNumDollars += count;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addQuarters(int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_iNumQuarters += count;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addDimes(int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_iNumDimes += count;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addNickels(int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_iNumNickels += count;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addReceipt() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addReceipt(SuncardReceipt receipt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_alReceipts.add(receipt);
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CoinCount takeOutChange(double dAmount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (dAmount > maximumChange())
		{
			throw new IllegalStateException("Attempted to take out more change than is available.");
		}
		else
		{
			double dAmtSoFar = 0.0;
			int iQCnt = 0;
			int iDCnt = 0;
			int iNCnt = 0;
			
			for (int i=0 ; i<m_iNumQuarters ; i++)
			{
				if (dAmtSoFar + 0.25 > dAmount)
					break;
								
				dAmtSoFar += 0.25;
				iQCnt += 1;
			}
			
			for (int i=0 ; i<m_iNumDimes ; i++)
			{
				if (dAmtSoFar + 0.10 > dAmount)
					break;
				
				dAmtSoFar += 0.10;
				iDCnt += 1;
			}
			
			for (int i=0 ; i<m_iNumNickels ; i++)
			{
				if (dAmtSoFar + 0.05 > dAmount)
					break;
				
				dAmtSoFar += 0.05;
				iNCnt += 1;
			}
			
			CoinCount ccToReturn = vendingMachine.vendingMachine.vendsys.impl.VendsysFactoryImpl.eINSTANCE.createCoinCount();
			//CoinCount ccToReturn = new CoinCount();
			
			ccToReturn.setNUM_QUARTERS(iQCnt);
			ccToReturn.setNUM_DIMES(iDCnt);
			ccToReturn.setNUM_NICKELS(iNCnt);
			
			
			m_iNumQuarters -= iQCnt;
			m_iNumDimes -= iDCnt;
			m_iNumNickels -= iNCnt;
			
			return ccToReturn;
		}
	
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VendsysPackage.CASH_REGISTER__MAL_RECEIPTS:
				return basicSetM_alReceipts(null, msgs);
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
			case VendsysPackage.CASH_REGISTER__MINUM_QUARTERS:
				return getM_iNumQuarters();
			case VendsysPackage.CASH_REGISTER__MINUM_DIMES:
				return getM_iNumDimes();
			case VendsysPackage.CASH_REGISTER__MINUM_NICKELS:
				return getM_iNumNickels();
			case VendsysPackage.CASH_REGISTER__MINUM_DOLLARS:
				return getM_iNumDollars();
			case VendsysPackage.CASH_REGISTER__MAL_RECEIPTS:
				return getM_alReceipts();
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
			case VendsysPackage.CASH_REGISTER__MINUM_QUARTERS:
				setM_iNumQuarters((Integer)newValue);
				return;
			case VendsysPackage.CASH_REGISTER__MINUM_DIMES:
				setM_iNumDimes((Integer)newValue);
				return;
			case VendsysPackage.CASH_REGISTER__MINUM_NICKELS:
				setM_iNumNickels((Integer)newValue);
				return;
			case VendsysPackage.CASH_REGISTER__MINUM_DOLLARS:
				setM_iNumDollars((Integer)newValue);
				return;
			case VendsysPackage.CASH_REGISTER__MAL_RECEIPTS:
				setM_alReceipts((SuncardReceipt)newValue);
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
			case VendsysPackage.CASH_REGISTER__MINUM_QUARTERS:
				setM_iNumQuarters(MINUM_QUARTERS_EDEFAULT);
				return;
			case VendsysPackage.CASH_REGISTER__MINUM_DIMES:
				setM_iNumDimes(MINUM_DIMES_EDEFAULT);
				return;
			case VendsysPackage.CASH_REGISTER__MINUM_NICKELS:
				setM_iNumNickels(MINUM_NICKELS_EDEFAULT);
				return;
			case VendsysPackage.CASH_REGISTER__MINUM_DOLLARS:
				setM_iNumDollars(MINUM_DOLLARS_EDEFAULT);
				return;
			case VendsysPackage.CASH_REGISTER__MAL_RECEIPTS:
				setM_alReceipts((SuncardReceipt)null);
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
			case VendsysPackage.CASH_REGISTER__MINUM_QUARTERS:
				return m_iNumQuarters != MINUM_QUARTERS_EDEFAULT;
			case VendsysPackage.CASH_REGISTER__MINUM_DIMES:
				return m_iNumDimes != MINUM_DIMES_EDEFAULT;
			case VendsysPackage.CASH_REGISTER__MINUM_NICKELS:
				return m_iNumNickels != MINUM_NICKELS_EDEFAULT;
			case VendsysPackage.CASH_REGISTER__MINUM_DOLLARS:
				return m_iNumDollars != MINUM_DOLLARS_EDEFAULT;
			case VendsysPackage.CASH_REGISTER__MAL_RECEIPTS:
				return m_alReceipts != null;
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
			case VendsysPackage.CASH_REGISTER___CASH_REGISTER:
				CashRegister();
				return null;
			case VendsysPackage.CASH_REGISTER___MAXIMUM_CHANGE:
				return maximumChange();
			case VendsysPackage.CASH_REGISTER___ADD_DOLLARS__INT:
				addDollars((Integer)arguments.get(0));
				return null;
			case VendsysPackage.CASH_REGISTER___ADD_QUARTERS__INT:
				addQuarters((Integer)arguments.get(0));
				return null;
			case VendsysPackage.CASH_REGISTER___ADD_DIMES__INT:
				addDimes((Integer)arguments.get(0));
				return null;
			case VendsysPackage.CASH_REGISTER___ADD_NICKELS__INT:
				addNickels((Integer)arguments.get(0));
				return null;
			case VendsysPackage.CASH_REGISTER___ADD_RECEIPT:
				addReceipt();
				return null;
			case VendsysPackage.CASH_REGISTER___TAKE_OUT_CHANGE__DOUBLE:
				return takeOutChange((Double)arguments.get(0));
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
		result.append(" (m_iNumQuarters: ");
		result.append(m_iNumQuarters);
		result.append(", m_iNumDimes: ");
		result.append(m_iNumDimes);
		result.append(", m_iNumNickels: ");
		result.append(m_iNumNickels);
		result.append(", m_iNumDollars: ");
		result.append(m_iNumDollars);
		result.append(')');
		return result.toString();
	}

} //CashRegisterImpl
