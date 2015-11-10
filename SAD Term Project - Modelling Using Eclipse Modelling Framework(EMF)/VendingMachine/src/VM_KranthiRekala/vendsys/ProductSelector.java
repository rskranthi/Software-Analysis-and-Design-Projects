/**
 */
package VM_KranthiRekala.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.ProductSelector#getM_pslListener <em>Mpsl Listener</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.ProductSelector#getM_piSelectedItem <em>Mpi Selected Item</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.ProductSelector#getM_vvmMachine <em>Mvvm Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see VM_KranthiRekala.vendsys.VendsysPackage#getProductSelector()
 * @model
 * @generated
 */
public interface ProductSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Mpsl Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpsl Listener</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpsl Listener</em>' reference.
	 * @see #setM_pslListener(IProductSelectorListener)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getProductSelector_M_pslListener()
	 * @model
	 * @generated
	 */
	IProductSelectorListener getM_pslListener();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.ProductSelector#getM_pslListener <em>Mpsl Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpsl Listener</em>' reference.
	 * @see #getM_pslListener()
	 * @generated
	 */
	void setM_pslListener(IProductSelectorListener value);

	/**
	 * Returns the value of the '<em><b>Mpi Selected Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpi Selected Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpi Selected Item</em>' reference.
	 * @see #setM_piSelectedItem(IProductInfo)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getProductSelector_M_piSelectedItem()
	 * @model
	 * @generated
	 */
	IProductInfo getM_piSelectedItem();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.ProductSelector#getM_piSelectedItem <em>Mpi Selected Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpi Selected Item</em>' reference.
	 * @see #getM_piSelectedItem()
	 * @generated
	 */
	void setM_piSelectedItem(IProductInfo value);

	/**
	 * Returns the value of the '<em><b>Mvvm Machine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_psProductSelector <em>Mps Product Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mvvm Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mvvm Machine</em>' reference.
	 * @see #setM_vvmMachine(VirtualVendingMachine)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getProductSelector_M_vvmMachine()
	 * @see VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_psProductSelector
	 * @model opposite="m_psProductSelector"
	 * @generated
	 */
	VirtualVendingMachine getM_vvmMachine();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.ProductSelector#getM_vvmMachine <em>Mvvm Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mvvm Machine</em>' reference.
	 * @see #getM_vvmMachine()
	 * @generated
	 */
	void setM_vvmMachine(VirtualVendingMachine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ProductSelector(VirtualVendingMachine vvmMachine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setProductSelectorListener(IProductSelectorListener pslListener);

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
	void setSelectedItem(IProductInfo piProduct);

} // ProductSelector
