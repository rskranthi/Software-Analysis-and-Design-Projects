/**
 */
package vendingMachine.vendingMachine.vendsys.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vendingMachine.vendingMachine.vendsys.IProductDatabase;
import vendingMachine.vendingMachine.vendsys.IProductInfo;
import vendingMachine.vendingMachine.vendsys.OutputDisplay;
import vendingMachine.vendingMachine.vendsys.PayMachine;
import vendingMachine.vendingMachine.vendsys.ProductDispenser;
import vendingMachine.vendingMachine.vendsys.ProductSelector;
import vendingMachine.vendingMachine.vendsys.VendsysPackage;
import vendingMachine.vendingMachine.vendsys.VirtualVendingMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl#isM_bOutOfOrder <em>MbOut Of Order</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl#getM_pdProducts <em>Mpd Products</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl#getM_odOutputDisplay <em>Mod Output Display</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl#getM_pdDispenser <em>Mpd Dispenser</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl#getM_pmPayMachine <em>Mpm Pay Machine</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl#getM_psProductSelector <em>Mps Product Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualVendingMachineImpl extends MinimalEObjectImpl.Container implements VirtualVendingMachine {
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
	 * The cached value of the '{@link #getM_pdProducts() <em>Mpd Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pdProducts()
	 * @generated
	 * @ordered
	 */
	protected IProductDatabase m_pdProducts;

	/**
	 * The cached value of the '{@link #getM_odOutputDisplay() <em>Mod Output Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_odOutputDisplay()
	 * @generated
	 * @ordered
	 */
	protected OutputDisplay m_odOutputDisplay;

	/**
	 * The cached value of the '{@link #getM_pdDispenser() <em>Mpd Dispenser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pdDispenser()
	 * @generated
	 * @ordered
	 */
	protected ProductDispenser m_pdDispenser;

	/**
	 * The cached value of the '{@link #getM_pmPayMachine() <em>Mpm Pay Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pmPayMachine()
	 * @generated
	 * @ordered
	 */
	protected PayMachine m_pmPayMachine;

	/**
	 * The cached value of the '{@link #getM_psProductSelector() <em>Mps Product Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_psProductSelector()
	 * @generated
	 * @ordered
	 */
	protected ProductSelector m_psProductSelector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualVendingMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendsysPackage.Literals.VIRTUAL_VENDING_MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER, oldM_bOutOfOrder, m_bOutOfOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductDatabase getM_pdProducts() {
		if (m_pdProducts != null && m_pdProducts.eIsProxy()) {
			InternalEObject oldM_pdProducts = (InternalEObject)m_pdProducts;
			m_pdProducts = (IProductDatabase)eResolveProxy(oldM_pdProducts);
			if (m_pdProducts != oldM_pdProducts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS, oldM_pdProducts, m_pdProducts));
			}
		}
		return m_pdProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductDatabase basicGetM_pdProducts() {
		return m_pdProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pdProducts(IProductDatabase newM_pdProducts) {
		IProductDatabase oldM_pdProducts = m_pdProducts;
		m_pdProducts = newM_pdProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS, oldM_pdProducts, m_pdProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDisplay getM_odOutputDisplay() {
		return m_odOutputDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_odOutputDisplay(OutputDisplay newM_odOutputDisplay, NotificationChain msgs) {
		OutputDisplay oldM_odOutputDisplay = m_odOutputDisplay;
		m_odOutputDisplay = newM_odOutputDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY, oldM_odOutputDisplay, newM_odOutputDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_odOutputDisplay(OutputDisplay newM_odOutputDisplay) {
		if (newM_odOutputDisplay != m_odOutputDisplay) {
			NotificationChain msgs = null;
			if (m_odOutputDisplay != null)
				msgs = ((InternalEObject)m_odOutputDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY, null, msgs);
			if (newM_odOutputDisplay != null)
				msgs = ((InternalEObject)newM_odOutputDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY, null, msgs);
			msgs = basicSetM_odOutputDisplay(newM_odOutputDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY, newM_odOutputDisplay, newM_odOutputDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDispenser getM_pdDispenser() {
		if (m_pdDispenser != null && m_pdDispenser.eIsProxy()) {
			InternalEObject oldM_pdDispenser = (InternalEObject)m_pdDispenser;
			m_pdDispenser = (ProductDispenser)eResolveProxy(oldM_pdDispenser);
			if (m_pdDispenser != oldM_pdDispenser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER, oldM_pdDispenser, m_pdDispenser));
			}
		}
		return m_pdDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDispenser basicGetM_pdDispenser() {
		return m_pdDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pdDispenser(ProductDispenser newM_pdDispenser) {
		ProductDispenser oldM_pdDispenser = m_pdDispenser;
		m_pdDispenser = newM_pdDispenser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER, oldM_pdDispenser, m_pdDispenser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayMachine getM_pmPayMachine() {
		if (m_pmPayMachine != null && m_pmPayMachine.eIsProxy()) {
			InternalEObject oldM_pmPayMachine = (InternalEObject)m_pmPayMachine;
			m_pmPayMachine = (PayMachine)eResolveProxy(oldM_pmPayMachine);
			if (m_pmPayMachine != oldM_pmPayMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, oldM_pmPayMachine, m_pmPayMachine));
			}
		}
		return m_pmPayMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayMachine basicGetM_pmPayMachine() {
		return m_pmPayMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_pmPayMachine(PayMachine newM_pmPayMachine, NotificationChain msgs) {
		PayMachine oldM_pmPayMachine = m_pmPayMachine;
		m_pmPayMachine = newM_pmPayMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, oldM_pmPayMachine, newM_pmPayMachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pmPayMachine(PayMachine newM_pmPayMachine) {
		if (newM_pmPayMachine != m_pmPayMachine) {
			NotificationChain msgs = null;
			if (m_pmPayMachine != null)
				msgs = ((InternalEObject)m_pmPayMachine).eInverseRemove(this, VendsysPackage.PAY_MACHINE__MVVM_OWNER, PayMachine.class, msgs);
			if (newM_pmPayMachine != null)
				msgs = ((InternalEObject)newM_pmPayMachine).eInverseAdd(this, VendsysPackage.PAY_MACHINE__MVVM_OWNER, PayMachine.class, msgs);
			msgs = basicSetM_pmPayMachine(newM_pmPayMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, newM_pmPayMachine, newM_pmPayMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSelector getM_psProductSelector() {
		if (m_psProductSelector != null && m_psProductSelector.eIsProxy()) {
			InternalEObject oldM_psProductSelector = (InternalEObject)m_psProductSelector;
			m_psProductSelector = (ProductSelector)eResolveProxy(oldM_psProductSelector);
			if (m_psProductSelector != oldM_psProductSelector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, oldM_psProductSelector, m_psProductSelector));
			}
		}
		return m_psProductSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSelector basicGetM_psProductSelector() {
		return m_psProductSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_psProductSelector(ProductSelector newM_psProductSelector, NotificationChain msgs) {
		ProductSelector oldM_psProductSelector = m_psProductSelector;
		m_psProductSelector = newM_psProductSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, oldM_psProductSelector, newM_psProductSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_psProductSelector(ProductSelector newM_psProductSelector) {
		if (newM_psProductSelector != m_psProductSelector) {
			NotificationChain msgs = null;
			if (m_psProductSelector != null)
				msgs = ((InternalEObject)m_psProductSelector).eInverseRemove(this, VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE, ProductSelector.class, msgs);
			if (newM_psProductSelector != null)
				msgs = ((InternalEObject)newM_psProductSelector).eInverseAdd(this, VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE, ProductSelector.class, msgs);
			msgs = basicSetM_psProductSelector(newM_psProductSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, newM_psProductSelector, newM_psProductSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void VirtualVendingMachine(IProductDatabase pdProducts) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_pdProducts = pdProducts;
		m_psProductSelector = new ProductSelector(this);
		m_odOutputDisplay = new OutputDisplay();
		m_pmPayMachine = new PayMachine(this, 3.00);
		m_pdDispenser = new ProductDispenser();
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IProductInfo[] getProducts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return m_pdProducts.getProducts();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProductSelector getProductSelector() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return m_psProductSelector;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputDisplay getOutputDisplay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return m_odOutputDisplay;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PayMachine getPayMachine() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return m_pmPayMachine;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProductDispenser getProductDispenser() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return m_pdDispenser;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void showProductDesc(IProductInfo piProduct) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (m_bOutOfOrder == false)
			m_odOutputDisplay.displayString(piProduct.getDescription());
	}
	
	
	
	public void buyItem(IProductInfo piProduct) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (m_pmPayMachine.getBalance() >= piProduct.getPrice() &&
				piProduct.getQuantity() > 0)
		{
			m_odOutputDisplay.displayString("Enjoy your " + piProduct.getName());
	
			m_pdProducts.decrementQuantity(piProduct);
			m_pdDispenser.dispenseProduct(piProduct);
			m_pmPayMachine.deductBalance(piProduct.getPrice());
			m_pmPayMachine.returnChange();
			m_psProductSelector.displayProducts();	
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void goOutOfOrder() {
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
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				if (m_pmPayMachine != null)
					msgs = ((InternalEObject)m_pmPayMachine).eInverseRemove(this, VendsysPackage.PAY_MACHINE__MVVM_OWNER, PayMachine.class, msgs);
				return basicSetM_pmPayMachine((PayMachine)otherEnd, msgs);
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				if (m_psProductSelector != null)
					msgs = ((InternalEObject)m_psProductSelector).eInverseRemove(this, VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE, ProductSelector.class, msgs);
				return basicSetM_psProductSelector((ProductSelector)otherEnd, msgs);
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
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				return basicSetM_odOutputDisplay(null, msgs);
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				return basicSetM_pmPayMachine(null, msgs);
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				return basicSetM_psProductSelector(null, msgs);
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
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				return isM_bOutOfOrder();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				if (resolve) return getM_pdProducts();
				return basicGetM_pdProducts();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				return getM_odOutputDisplay();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				if (resolve) return getM_pdDispenser();
				return basicGetM_pdDispenser();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				if (resolve) return getM_pmPayMachine();
				return basicGetM_pmPayMachine();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				if (resolve) return getM_psProductSelector();
				return basicGetM_psProductSelector();
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
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				setM_bOutOfOrder((Boolean)newValue);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				setM_pdProducts((IProductDatabase)newValue);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				setM_odOutputDisplay((OutputDisplay)newValue);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				setM_pdDispenser((ProductDispenser)newValue);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				setM_pmPayMachine((PayMachine)newValue);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				setM_psProductSelector((ProductSelector)newValue);
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
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				setM_bOutOfOrder(MBOUT_OF_ORDER_EDEFAULT);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				setM_pdProducts((IProductDatabase)null);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				setM_odOutputDisplay((OutputDisplay)null);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				setM_pdDispenser((ProductDispenser)null);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				setM_pmPayMachine((PayMachine)null);
				return;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				setM_psProductSelector((ProductSelector)null);
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
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				return m_bOutOfOrder != MBOUT_OF_ORDER_EDEFAULT;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				return m_pdProducts != null;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				return m_odOutputDisplay != null;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				return m_pdDispenser != null;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				return m_pmPayMachine != null;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				return m_psProductSelector != null;
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
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___VIRTUAL_VENDING_MACHINE__IPRODUCTDATABASE:
				VirtualVendingMachine((IProductDatabase)arguments.get(0));
				return null;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___GET_PRODUCTS:
				return getProducts();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___GET_PRODUCT_SELECTOR:
				return getProductSelector();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___GET_OUTPUT_DISPLAY:
				return getOutputDisplay();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___GET_PAY_MACHINE:
				return getPayMachine();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___GET_PRODUCT_DISPENSER:
				return getProductDispenser();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___SHOW_PRODUCT_DESC__IPRODUCTINFO:
				showProductDesc((IProductInfo)arguments.get(0));
				return null;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___BUY_ITEM__IPRODUCTINFO:
				buyItem((IProductInfo)arguments.get(0));
				return null;
			case VendsysPackage.VIRTUAL_VENDING_MACHINE___GO_OUT_OF_ORDER:
				goOutOfOrder();
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
		result.append(" (m_bOutOfOrder: ");
		result.append(m_bOutOfOrder);
		result.append(')');
		return result.toString();
	}

} //VirtualVendingMachineImpl
