/**
 */
package VM_KranthiRekala.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suncard Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.SuncardReceipt#getM_iAccount <em>MiAccount</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.SuncardReceipt#getM_dAmountDeducted <em>MdAmount Deducted</em>}</li>
 * </ul>
 * </p>
 *
 * @see VM_KranthiRekala.vendsys.VendsysPackage#getSuncardReceipt()
 * @model
 * @generated
 */
public interface SuncardReceipt extends EObject {
	/**
	 * Returns the value of the '<em><b>MiAccount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MiAccount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MiAccount</em>' attribute.
	 * @see #setM_iAccount(int)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getSuncardReceipt_M_iAccount()
	 * @model
	 * @generated
	 */
	int getM_iAccount();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.SuncardReceipt#getM_iAccount <em>MiAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MiAccount</em>' attribute.
	 * @see #getM_iAccount()
	 * @generated
	 */
	void setM_iAccount(int value);

	/**
	 * Returns the value of the '<em><b>MdAmount Deducted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MdAmount Deducted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MdAmount Deducted</em>' attribute.
	 * @see #setM_dAmountDeducted(double)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getSuncardReceipt_M_dAmountDeducted()
	 * @model
	 * @generated
	 */
	double getM_dAmountDeducted();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.SuncardReceipt#getM_dAmountDeducted <em>MdAmount Deducted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MdAmount Deducted</em>' attribute.
	 * @see #getM_dAmountDeducted()
	 * @generated
	 */
	void setM_dAmountDeducted(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SuncardReceipt(int iAccount, double dAmountDeducted);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAccount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAmountDeducted();

} // SuncardReceipt
