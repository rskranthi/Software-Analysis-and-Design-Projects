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

import vendingMachine.vendingMachine.vendsys.IProductInfo;
import vendingMachine.vendingMachine.vendsys.IProductSelectorListener;
import vendingMachine.vendingMachine.vendsys.ProductSelector;
import vendingMachine.vendingMachine.vendsys.VendsysPackage;
import vendingMachine.vendingMachine.vendsys.VirtualVendingMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.ProductSelectorImpl#getM_pslListener <em>Mpsl Listener</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.ProductSelectorImpl#getM_piSelectedItem <em>Mpi Selected Item</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.impl.ProductSelectorImpl#getM_vvmMachine <em>Mvvm Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductSelectorImpl extends MinimalEObjectImpl.Container implements ProductSelector {
	/**
	 * The cached value of the '{@link #getM_pslListener() <em>Mpsl Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pslListener()
	 * @generated
	 * @ordered
	 */
	protected IProductSelectorListener m_pslListener;

	/**
	 * The cached value of the '{@link #getM_piSelectedItem() <em>Mpi Selected Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_piSelectedItem()
	 * @generated
	 * @ordered
	 */
	protected IProductInfo m_piSelectedItem;

	/**
	 * The cached value of the '{@link #getM_vvmMachine() <em>Mvvm Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_vvmMachine()
	 * @generated
	 * @ordered
	 */
	protected VirtualVendingMachine m_vvmMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendsysPackage.Literals.PRODUCT_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductSelectorListener getM_pslListener() {
		if (m_pslListener != null && m_pslListener.eIsProxy()) {
			InternalEObject oldM_pslListener = (InternalEObject)m_pslListener;
			m_pslListener = (IProductSelectorListener)eResolveProxy(oldM_pslListener);
			if (m_pslListener != oldM_pslListener) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.PRODUCT_SELECTOR__MPSL_LISTENER, oldM_pslListener, m_pslListener));
			}
		}
		return m_pslListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductSelectorListener basicGetM_pslListener() {
		return m_pslListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pslListener(IProductSelectorListener newM_pslListener) {
		IProductSelectorListener oldM_pslListener = m_pslListener;
		m_pslListener = newM_pslListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PRODUCT_SELECTOR__MPSL_LISTENER, oldM_pslListener, m_pslListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductInfo getM_piSelectedItem() {
		if (m_piSelectedItem != null && m_piSelectedItem.eIsProxy()) {
			InternalEObject oldM_piSelectedItem = (InternalEObject)m_piSelectedItem;
			m_piSelectedItem = (IProductInfo)eResolveProxy(oldM_piSelectedItem);
			if (m_piSelectedItem != oldM_piSelectedItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.PRODUCT_SELECTOR__MPI_SELECTED_ITEM, oldM_piSelectedItem, m_piSelectedItem));
			}
		}
		return m_piSelectedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductInfo basicGetM_piSelectedItem() {
		return m_piSelectedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_piSelectedItem(IProductInfo newM_piSelectedItem) {
		IProductInfo oldM_piSelectedItem = m_piSelectedItem;
		m_piSelectedItem = newM_piSelectedItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PRODUCT_SELECTOR__MPI_SELECTED_ITEM, oldM_piSelectedItem, m_piSelectedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachine getM_vvmMachine() {
		if (m_vvmMachine != null && m_vvmMachine.eIsProxy()) {
			InternalEObject oldM_vvmMachine = (InternalEObject)m_vvmMachine;
			m_vvmMachine = (VirtualVendingMachine)eResolveProxy(oldM_vvmMachine);
			if (m_vvmMachine != oldM_vvmMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE, oldM_vvmMachine, m_vvmMachine));
			}
		}
		return m_vvmMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachine basicGetM_vvmMachine() {
		return m_vvmMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_vvmMachine(VirtualVendingMachine newM_vvmMachine, NotificationChain msgs) {
		VirtualVendingMachine oldM_vvmMachine = m_vvmMachine;
		m_vvmMachine = newM_vvmMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE, oldM_vvmMachine, newM_vvmMachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_vvmMachine(VirtualVendingMachine newM_vvmMachine) {
		if (newM_vvmMachine != m_vvmMachine) {
			NotificationChain msgs = null;
			if (m_vvmMachine != null)
				msgs = ((InternalEObject)m_vvmMachine).eInverseRemove(this, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, VirtualVendingMachine.class, msgs);
			if (newM_vvmMachine != null)
				msgs = ((InternalEObject)newM_vvmMachine).eInverseAdd(this, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, VirtualVendingMachine.class, msgs);
			msgs = basicSetM_vvmMachine(newM_vvmMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE, newM_vvmMachine, newM_vvmMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ProductSelector(VirtualVendingMachine vvmMachine) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_vvmMachine = vvmMachine;
		throw new UnsupportedOperationException();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void displayProducts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (m_pslListener != null)
		{
			m_pslListener.updateDisplay(m_vvmMachine.getProducts());	
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProductSelectorListener(IProductSelectorListener pslListener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_pslListener = pslListener;
		displayProducts();
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void showProductDesc(IProductInfo piProduct) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_vvmMachine.showProductDesc(piProduct);
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void buyItem(IProductInfo piProduct) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_vvmMachine.buyItem(piProduct);
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSelectedItem(IProductInfo piProduct) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_piSelectedItem = piProduct;
		
		if (m_pslListener != null)
		{
			m_pslListener.itemSelected(piProduct);
		}
		else
		{
			m_pslListener.itemDeselected(piProduct);
		}
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
			case VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				if (m_vvmMachine != null)
					msgs = ((InternalEObject)m_vvmMachine).eInverseRemove(this, VendsysPackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, VirtualVendingMachine.class, msgs);
				return basicSetM_vvmMachine((VirtualVendingMachine)otherEnd, msgs);
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
			case VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				return basicSetM_vvmMachine(null, msgs);
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
			case VendsysPackage.PRODUCT_SELECTOR__MPSL_LISTENER:
				if (resolve) return getM_pslListener();
				return basicGetM_pslListener();
			case VendsysPackage.PRODUCT_SELECTOR__MPI_SELECTED_ITEM:
				if (resolve) return getM_piSelectedItem();
				return basicGetM_piSelectedItem();
			case VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				if (resolve) return getM_vvmMachine();
				return basicGetM_vvmMachine();
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
			case VendsysPackage.PRODUCT_SELECTOR__MPSL_LISTENER:
				setM_pslListener((IProductSelectorListener)newValue);
				return;
			case VendsysPackage.PRODUCT_SELECTOR__MPI_SELECTED_ITEM:
				setM_piSelectedItem((IProductInfo)newValue);
				return;
			case VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				setM_vvmMachine((VirtualVendingMachine)newValue);
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
			case VendsysPackage.PRODUCT_SELECTOR__MPSL_LISTENER:
				setM_pslListener((IProductSelectorListener)null);
				return;
			case VendsysPackage.PRODUCT_SELECTOR__MPI_SELECTED_ITEM:
				setM_piSelectedItem((IProductInfo)null);
				return;
			case VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				setM_vvmMachine((VirtualVendingMachine)null);
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
			case VendsysPackage.PRODUCT_SELECTOR__MPSL_LISTENER:
				return m_pslListener != null;
			case VendsysPackage.PRODUCT_SELECTOR__MPI_SELECTED_ITEM:
				return m_piSelectedItem != null;
			case VendsysPackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				return m_vvmMachine != null;
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
			case VendsysPackage.PRODUCT_SELECTOR___PRODUCT_SELECTOR__VIRTUALVENDINGMACHINE:
				ProductSelector((VirtualVendingMachine)arguments.get(0));
				return null;
			case VendsysPackage.PRODUCT_SELECTOR___DISPLAY_PRODUCTS:
				displayProducts();
				return null;
			case VendsysPackage.PRODUCT_SELECTOR___SET_PRODUCT_SELECTOR_LISTENER__IPRODUCTSELECTORLISTENER:
				setProductSelectorListener((IProductSelectorListener)arguments.get(0));
				return null;
			case VendsysPackage.PRODUCT_SELECTOR___SHOW_PRODUCT_DESC__IPRODUCTINFO:
				showProductDesc((IProductInfo)arguments.get(0));
				return null;
			case VendsysPackage.PRODUCT_SELECTOR___BUY_ITEM__IPRODUCTINFO:
				buyItem((IProductInfo)arguments.get(0));
				return null;
			case VendsysPackage.PRODUCT_SELECTOR___SET_SELECTED_ITEM__IPRODUCTINFO:
				setSelectedItem((IProductInfo)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProductSelectorImpl
