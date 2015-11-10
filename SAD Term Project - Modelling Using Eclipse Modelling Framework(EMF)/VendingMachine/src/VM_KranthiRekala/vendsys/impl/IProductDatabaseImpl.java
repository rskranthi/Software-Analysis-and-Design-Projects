/**
 */
package VM_KranthiRekala.vendsys.impl;

import VM_KranthiRekala.extern.MyProductDatabase;
import VM_KranthiRekala.extern.Product;

import VM_KranthiRekala.vendsys.IProductDatabase;
import VM_KranthiRekala.vendsys.VendsysPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IProduct Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.IProductDatabaseImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.IProductDatabaseImpl#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IProductDatabaseImpl extends MinimalEObjectImpl.Container implements IProductDatabase {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<MyProductDatabase> product;

	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected Product realizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IProductDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendsysPackage.Literals.IPRODUCT_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MyProductDatabase> getProduct() {
		if (product == null) {
			product = new EObjectResolvingEList<MyProductDatabase>(MyProductDatabase.class, this, VendsysPackage.IPRODUCT_DATABASE__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizes(Product newRealizes, NotificationChain msgs) {
		Product oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VendsysPackage.IPRODUCT_DATABASE__REALIZES, oldRealizes, newRealizes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizes(Product newRealizes) {
		if (newRealizes != realizes) {
			NotificationChain msgs = null;
			if (realizes != null)
				msgs = ((InternalEObject)realizes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VendsysPackage.IPRODUCT_DATABASE__REALIZES, null, msgs);
			if (newRealizes != null)
				msgs = ((InternalEObject)newRealizes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VendsysPackage.IPRODUCT_DATABASE__REALIZES, null, msgs);
			msgs = basicSetRealizes(newRealizes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.IPRODUCT_DATABASE__REALIZES, newRealizes, newRealizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getProducts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void decrementQuantity() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VendsysPackage.IPRODUCT_DATABASE__REALIZES:
				return basicSetRealizes(null, msgs);
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
			case VendsysPackage.IPRODUCT_DATABASE__PRODUCT:
				return getProduct();
			case VendsysPackage.IPRODUCT_DATABASE__REALIZES:
				return getRealizes();
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
			case VendsysPackage.IPRODUCT_DATABASE__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends MyProductDatabase>)newValue);
				return;
			case VendsysPackage.IPRODUCT_DATABASE__REALIZES:
				setRealizes((Product)newValue);
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
			case VendsysPackage.IPRODUCT_DATABASE__PRODUCT:
				getProduct().clear();
				return;
			case VendsysPackage.IPRODUCT_DATABASE__REALIZES:
				setRealizes((Product)null);
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
			case VendsysPackage.IPRODUCT_DATABASE__PRODUCT:
				return product != null && !product.isEmpty();
			case VendsysPackage.IPRODUCT_DATABASE__REALIZES:
				return realizes != null;
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
			case VendsysPackage.IPRODUCT_DATABASE___GET_PRODUCTS:
				getProducts();
				return null;
			case VendsysPackage.IPRODUCT_DATABASE___DECREMENT_QUANTITY:
				decrementQuantity();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //IProductDatabaseImpl
