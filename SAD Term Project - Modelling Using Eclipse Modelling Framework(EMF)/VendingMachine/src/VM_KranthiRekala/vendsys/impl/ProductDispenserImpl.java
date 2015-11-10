/**
 */
package VM_KranthiRekala.vendsys.impl;

import VM_KranthiRekala.vendsys.IProductDispenserListener;
import VM_KranthiRekala.vendsys.IProductInfo;
import VM_KranthiRekala.vendsys.ProductDispenser;
import VM_KranthiRekala.vendsys.VendsysPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Dispenser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.ProductDispenserImpl#getM_pdlListener <em>Mpdl Listener</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductDispenserImpl extends MinimalEObjectImpl.Container implements ProductDispenser {
	/**
	 * The cached value of the '{@link #getM_pdlListener() <em>Mpdl Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pdlListener()
	 * @generated
	 * @ordered
	 */
	protected IProductDispenserListener m_pdlListener;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductDispenserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendsysPackage.Literals.PRODUCT_DISPENSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductDispenserListener getM_pdlListener() {
		if (m_pdlListener != null && m_pdlListener.eIsProxy()) {
			InternalEObject oldM_pdlListener = (InternalEObject)m_pdlListener;
			m_pdlListener = (IProductDispenserListener)eResolveProxy(oldM_pdlListener);
			if (m_pdlListener != oldM_pdlListener) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.PRODUCT_DISPENSER__MPDL_LISTENER, oldM_pdlListener, m_pdlListener));
			}
		}
		return m_pdlListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductDispenserListener basicGetM_pdlListener() {
		return m_pdlListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pdlListener(IProductDispenserListener newM_pdlListener) {
		IProductDispenserListener oldM_pdlListener = m_pdlListener;
		m_pdlListener = newM_pdlListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.PRODUCT_DISPENSER__MPDL_LISTENER, oldM_pdlListener, m_pdlListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispenseProduct(IProductInfo piProduct) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDispenserListener(IProductDispenserListener pdlListener) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VendsysPackage.PRODUCT_DISPENSER__MPDL_LISTENER:
				if (resolve) return getM_pdlListener();
				return basicGetM_pdlListener();
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
			case VendsysPackage.PRODUCT_DISPENSER__MPDL_LISTENER:
				setM_pdlListener((IProductDispenserListener)newValue);
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
			case VendsysPackage.PRODUCT_DISPENSER__MPDL_LISTENER:
				setM_pdlListener((IProductDispenserListener)null);
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
			case VendsysPackage.PRODUCT_DISPENSER__MPDL_LISTENER:
				return m_pdlListener != null;
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
			case VendsysPackage.PRODUCT_DISPENSER___DISPENSE_PRODUCT__IPRODUCTINFO:
				dispenseProduct((IProductInfo)arguments.get(0));
				return null;
			case VendsysPackage.PRODUCT_DISPENSER___SET_PRODUCT_DISPENSER_LISTENER__IPRODUCTDISPENSERLISTENER:
				setProductDispenserListener((IProductDispenserListener)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProductDispenserImpl
