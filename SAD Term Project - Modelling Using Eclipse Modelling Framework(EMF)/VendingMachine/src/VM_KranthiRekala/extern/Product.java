/**
 */
package VM_KranthiRekala.extern;

import VM_KranthiRekala.vendsys.IProductInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VM_KranthiRekala.extern.Product#getM_iID <em>MiID</em>}</li>
 *   <li>{@link VM_KranthiRekala.extern.Product#getM_sName <em>MsName</em>}</li>
 *   <li>{@link VM_KranthiRekala.extern.Product#getM_sDescription <em>MsDescription</em>}</li>
 *   <li>{@link VM_KranthiRekala.extern.Product#getM_dPrice <em>MdPrice</em>}</li>
 *   <li>{@link VM_KranthiRekala.extern.Product#getM_iQuantity <em>MiQuantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see VM_KranthiRekala.extern.ExternPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends IProductInfo {
	/**
	 * Returns the value of the '<em><b>MiID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MiID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MiID</em>' attribute.
	 * @see #setM_iID(int)
	 * @see VM_KranthiRekala.extern.ExternPackage#getProduct_M_iID()
	 * @model
	 * @generated
	 */
	int getM_iID();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.extern.Product#getM_iID <em>MiID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MiID</em>' attribute.
	 * @see #getM_iID()
	 * @generated
	 */
	void setM_iID(int value);

	/**
	 * Returns the value of the '<em><b>MsName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MsName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MsName</em>' attribute.
	 * @see #setM_sName(String)
	 * @see VM_KranthiRekala.extern.ExternPackage#getProduct_M_sName()
	 * @model
	 * @generated
	 */
	String getM_sName();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.extern.Product#getM_sName <em>MsName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MsName</em>' attribute.
	 * @see #getM_sName()
	 * @generated
	 */
	void setM_sName(String value);

	/**
	 * Returns the value of the '<em><b>MsDescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MsDescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MsDescription</em>' attribute.
	 * @see #setM_sDescription(String)
	 * @see VM_KranthiRekala.extern.ExternPackage#getProduct_M_sDescription()
	 * @model
	 * @generated
	 */
	String getM_sDescription();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.extern.Product#getM_sDescription <em>MsDescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MsDescription</em>' attribute.
	 * @see #getM_sDescription()
	 * @generated
	 */
	void setM_sDescription(String value);

	/**
	 * Returns the value of the '<em><b>MdPrice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MdPrice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MdPrice</em>' attribute.
	 * @see #setM_dPrice(double)
	 * @see VM_KranthiRekala.extern.ExternPackage#getProduct_M_dPrice()
	 * @model
	 * @generated
	 */
	double getM_dPrice();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.extern.Product#getM_dPrice <em>MdPrice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MdPrice</em>' attribute.
	 * @see #getM_dPrice()
	 * @generated
	 */
	void setM_dPrice(double value);

	/**
	 * Returns the value of the '<em><b>MiQuantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MiQuantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MiQuantity</em>' attribute.
	 * @see #setM_iQuantity(int)
	 * @see VM_KranthiRekala.extern.ExternPackage#getProduct_M_iQuantity()
	 * @model
	 * @generated
	 */
	int getM_iQuantity();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.extern.Product#getM_iQuantity <em>MiQuantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MiQuantity</em>' attribute.
	 * @see #getM_iQuantity()
	 * @generated
	 */
	void setM_iQuantity(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Product(int iID, String sName, String sDescription, int iICon, double dPrice, int iQuantity);

} // Product
