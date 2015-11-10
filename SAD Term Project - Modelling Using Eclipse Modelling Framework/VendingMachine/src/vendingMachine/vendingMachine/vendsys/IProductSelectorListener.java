/**
 */
package vendingMachine.vendingMachine.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProduct Selector Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getIProductSelectorListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProductSelectorListener extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateDisplay(IProductInfo piProducts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void itemSelected(IProductInfo piProduct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void itemDeselected(IProductInfo piProduct);

} // IProductSelectorListener
