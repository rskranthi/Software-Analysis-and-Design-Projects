/**
 */
package VM_KranthiRekala.extern;

import VM_KranthiRekala.vendsys.IProductInfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Product Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VM_KranthiRekala.extern.MyProductDatabase#getPProducts <em>PProducts</em>}</li>
 * </ul>
 * </p>
 *
 * @see VM_KranthiRekala.extern.ExternPackage#getMyProductDatabase()
 * @model
 * @generated
 */
public interface MyProductDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>PProducts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PProducts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PProducts</em>' containment reference.
	 * @see #setPProducts(Product)
	 * @see VM_KranthiRekala.extern.ExternPackage#getMyProductDatabase_PProducts()
	 * @model containment="true"
	 * @generated
	 */
	Product getPProducts();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.extern.MyProductDatabase#getPProducts <em>PProducts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PProducts</em>' containment reference.
	 * @see #getPProducts()
	 * @generated
	 */
	void setPProducts(Product value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void MyProductDatabase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	IProductInfo getProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void decrementQuantity(IProductInfo piProduct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IProductInfo getProduct(int iProductID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNumProducts();

} // MyProductDatabase
