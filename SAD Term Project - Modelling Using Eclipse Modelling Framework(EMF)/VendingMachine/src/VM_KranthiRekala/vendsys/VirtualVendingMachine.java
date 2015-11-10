/**
 */
package VM_KranthiRekala.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_pdProducts <em>Mpd Products</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_odOutputDisplay <em>Mod Output Display</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_pdDispenser <em>Mpd Dispenser</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_pmPayMachine <em>Mpm Pay Machine</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_psProductSelector <em>Mps Product Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see VM_KranthiRekala.vendsys.VendsysPackage#getVirtualVendingMachine()
 * @model
 * @generated
 */
public interface VirtualVendingMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>MbOut Of Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MbOut Of Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MbOut Of Order</em>' attribute.
	 * @see #setM_bOutOfOrder(boolean)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getVirtualVendingMachine_M_bOutOfOrder()
	 * @model
	 * @generated
	 */
	boolean isM_bOutOfOrder();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbOut Of Order</em>' attribute.
	 * @see #isM_bOutOfOrder()
	 * @generated
	 */
	void setM_bOutOfOrder(boolean value);

	/**
	 * Returns the value of the '<em><b>Mpd Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpd Products</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpd Products</em>' reference.
	 * @see #setM_pdProducts(IProductDatabase)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getVirtualVendingMachine_M_pdProducts()
	 * @model
	 * @generated
	 */
	IProductDatabase getM_pdProducts();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_pdProducts <em>Mpd Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd Products</em>' reference.
	 * @see #getM_pdProducts()
	 * @generated
	 */
	void setM_pdProducts(IProductDatabase value);

	/**
	 * Returns the value of the '<em><b>Mod Output Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Output Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Output Display</em>' containment reference.
	 * @see #setM_odOutputDisplay(OutputDisplay)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getVirtualVendingMachine_M_odOutputDisplay()
	 * @model containment="true"
	 * @generated
	 */
	OutputDisplay getM_odOutputDisplay();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_odOutputDisplay <em>Mod Output Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Output Display</em>' containment reference.
	 * @see #getM_odOutputDisplay()
	 * @generated
	 */
	void setM_odOutputDisplay(OutputDisplay value);

	/**
	 * Returns the value of the '<em><b>Mpd Dispenser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpd Dispenser</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpd Dispenser</em>' reference.
	 * @see #setM_pdDispenser(ProductDispenser)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getVirtualVendingMachine_M_pdDispenser()
	 * @model
	 * @generated
	 */
	ProductDispenser getM_pdDispenser();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_pdDispenser <em>Mpd Dispenser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd Dispenser</em>' reference.
	 * @see #getM_pdDispenser()
	 * @generated
	 */
	void setM_pdDispenser(ProductDispenser value);

	/**
	 * Returns the value of the '<em><b>Mpm Pay Machine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link VM_KranthiRekala.vendsys.PayMachine#getM_vvmOwner <em>Mvvm Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpm Pay Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpm Pay Machine</em>' reference.
	 * @see #setM_pmPayMachine(PayMachine)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getVirtualVendingMachine_M_pmPayMachine()
	 * @see VM_KranthiRekala.vendsys.PayMachine#getM_vvmOwner
	 * @model opposite="m_vvmOwner"
	 * @generated
	 */
	PayMachine getM_pmPayMachine();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_pmPayMachine <em>Mpm Pay Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpm Pay Machine</em>' reference.
	 * @see #getM_pmPayMachine()
	 * @generated
	 */
	void setM_pmPayMachine(PayMachine value);

	/**
	 * Returns the value of the '<em><b>Mps Product Selector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link VM_KranthiRekala.vendsys.ProductSelector#getM_vvmMachine <em>Mvvm Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mps Product Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mps Product Selector</em>' reference.
	 * @see #setM_psProductSelector(ProductSelector)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getVirtualVendingMachine_M_psProductSelector()
	 * @see VM_KranthiRekala.vendsys.ProductSelector#getM_vvmMachine
	 * @model opposite="m_vvmMachine"
	 * @generated
	 */
	ProductSelector getM_psProductSelector();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_psProductSelector <em>Mps Product Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mps Product Selector</em>' reference.
	 * @see #getM_psProductSelector()
	 * @generated
	 */
	void setM_psProductSelector(ProductSelector value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void VirtualVendingMachine(IProductDatabase pdProducts);

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
	 * @model kind="operation"
	 * @generated
	 */
	ProductSelector getProductSelector();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OutputDisplay getOutputDisplay();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	PayMachine getPayMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ProductDispenser getProductDispenser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void showProductDesc(IProductInfo piProduct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buyItem(IProductInfo piProduct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void goOutOfOrder();

} // VirtualVendingMachine
