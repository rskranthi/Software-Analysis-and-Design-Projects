/**
 */
package vendingMachine.vendingMachine.extern;

import org.eclipse.emf.ecore.EObject;
import vendingMachine.vendingMachine.vendsys.IProductInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Product Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.extern.MyProductDatabase#getPProducts <em>PProducts</em>}</li>
 * </ul>
 * </p>
 *
 * @see vendingMachine.vendingMachine.extern.ExternPackage#getMyProductDatabase()
 * @model
 * @generated
 */
public interface MyProductDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>PProducts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PProducts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PProducts</em>' containment reference.
	 * @see #setPProducts(Product)
	 * @see vendingMachine.vendingMachine.extern.ExternPackage#getMyProductDatabase_PProducts()
	 * @model containment="true"
	 * @generated
	 */
Product getPProducts();

	/**
	 * Sets the value of the '{@link vendingMachine.vendingMachine.extern.MyProductDatabase#getPProducts <em>PProducts</em>}' containment reference.
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
