/**
 */
package vendingMachine.vendingMachine.extern.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;



//import app.Utilities;
import vendingMachine.vendingMachine.extern.ExternPackage;
import vendingMachine.vendingMachine.extern.MyProductDatabase;
import vendingMachine.vendingMachine.extern.Product;
import vendingMachine.vendingMachine.vendsys.IProductInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Product Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.extern.impl.MyProductDatabaseImpl#getPProducts <em>PProducts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyProductDatabaseImpl extends MinimalEObjectImpl.Container implements MyProductDatabase {
	/**
	 * The cached value of the '{@link #getPProducts() <em>PProducts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPProducts()
	 * @generated
	 * @ordered
	 */
	protected Product pProducts;
	//protected Product pProducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyProductDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternPackage.Literals.MY_PRODUCT_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getPProducts() {
		return pProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPProducts(Product newPProducts, NotificationChain msgs) {
		Product oldPProducts = pProducts;
		pProducts = newPProducts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS, oldPProducts, newPProducts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPProducts(Product newPProducts) {
		if (newPProducts != pProducts) {
			NotificationChain msgs = null;
			if (pProducts != null)
				msgs = ((InternalEObject)pProducts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS, null, msgs);
			if (newPProducts != null)
				msgs = ((InternalEObject)newPProducts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS, null, msgs);
			msgs = basicSetPProducts(newPProducts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS, newPProducts, newPProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void MyProductDatabase() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductInfo getProducts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void decrementQuantity(IProductInfo piProduct) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductInfo getProduct(int iProductID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumProducts() {
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
			case ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS:
				return basicSetPProducts(null, msgs);
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
			case ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS:
				return getPProducts();
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
			case ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS:
				setPProducts((Product)newValue);
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
			case ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS:
				setPProducts((Product)null);
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
			case ExternPackage.MY_PRODUCT_DATABASE__PPRODUCTS:
				return pProducts != null;
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
			case ExternPackage.MY_PRODUCT_DATABASE___MY_PRODUCT_DATABASE:
				MyProductDatabase();
				return null;
			case ExternPackage.MY_PRODUCT_DATABASE___GET_PRODUCTS:
				return getProducts();
			case ExternPackage.MY_PRODUCT_DATABASE___DECREMENT_QUANTITY__IPRODUCTINFO:
				decrementQuantity((IProductInfo)arguments.get(0));
				return null;
			case ExternPackage.MY_PRODUCT_DATABASE___GET_PRODUCT__INT:
				return getProduct((Integer)arguments.get(0));
			case ExternPackage.MY_PRODUCT_DATABASE___GET_NUM_PRODUCTS:
				return getNumProducts();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MyProductDatabaseImpl
