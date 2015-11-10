/**
 */
package VM_KranthiRekala.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Dispenser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.ProductDispenser#getM_pdlListener <em>Mpdl Listener</em>}</li>
 * </ul>
 * </p>
 *
 * @see VM_KranthiRekala.vendsys.VendsysPackage#getProductDispenser()
 * @model
 * @generated
 */
public interface ProductDispenser extends EObject {
	/**
	 * Returns the value of the '<em><b>Mpdl Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpdl Listener</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpdl Listener</em>' reference.
	 * @see #setM_pdlListener(IProductDispenserListener)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getProductDispenser_M_pdlListener()
	 * @model
	 * @generated
	 */
	IProductDispenserListener getM_pdlListener();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.ProductDispenser#getM_pdlListener <em>Mpdl Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpdl Listener</em>' reference.
	 * @see #getM_pdlListener()
	 * @generated
	 */
	void setM_pdlListener(IProductDispenserListener value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispenseProduct(IProductInfo piProduct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setProductDispenserListener(IProductDispenserListener pdlListener);

} // ProductDispenser
