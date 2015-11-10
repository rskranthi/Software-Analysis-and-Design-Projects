/**
 */
package VM_KranthiRekala.vendsys;

import VM_KranthiRekala.extern.MyProductDatabase;
import VM_KranthiRekala.extern.Product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProduct Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.IProductDatabase#getProduct <em>Product</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.IProductDatabase#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see VM_KranthiRekala.vendsys.VendsysPackage#getIProductDatabase()
 * @model abstract="true"
 * @generated
 */
public interface IProductDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference list.
	 * The list contents are of type {@link VM_KranthiRekala.extern.MyProductDatabase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference list.
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getIProductDatabase_Product()
	 * @model
	 * @generated
	 */
	EList<MyProductDatabase> getProduct();

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' containment reference.
	 * @see #setRealizes(Product)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getIProductDatabase_Realizes()
	 * @model containment="true"
	 * @generated
	 */
	Product getRealizes();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.IProductDatabase#getRealizes <em>Realizes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' containment reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(Product value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void decrementQuantity();

} // IProductDatabase
