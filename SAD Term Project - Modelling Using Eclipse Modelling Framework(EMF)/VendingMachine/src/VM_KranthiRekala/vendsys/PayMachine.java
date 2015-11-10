/**
 */
package VM_KranthiRekala.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pay Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.PayMachine#getM_dMaximumBalance <em>MdMaximum Balance</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.PayMachine#getM_dBalance <em>MdBalance</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.PayMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.PayMachine#getM_pmlListener <em>Mpml Listener</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.PayMachine#getM_crRegister <em>Mcr Register</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.PayMachine#getM_vvmOwner <em>Mvvm Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see VM_KranthiRekala.vendsys.VendsysPackage#getPayMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidAge'"
 * @generated
 */
public interface PayMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>MdMaximum Balance</b></em>' attribute.
	 * The default value is <code>"3.00"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MdMaximum Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MdMaximum Balance</em>' attribute.
	 * @see #isSetM_dMaximumBalance()
	 * @see #unsetM_dMaximumBalance()
	 * @see #setM_dMaximumBalance(double)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getPayMachine_M_dMaximumBalance()
	 * @model default="3.00" unsettable="true"
	 * @generated
	 */
	double getM_dMaximumBalance();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.PayMachine#getM_dMaximumBalance <em>MdMaximum Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MdMaximum Balance</em>' attribute.
	 * @see #isSetM_dMaximumBalance()
	 * @see #unsetM_dMaximumBalance()
	 * @see #getM_dMaximumBalance()
	 * @generated
	 */
	void setM_dMaximumBalance(double value);

	/**
	 * Unsets the value of the '{@link VM_KranthiRekala.vendsys.PayMachine#getM_dMaximumBalance <em>MdMaximum Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetM_dMaximumBalance()
	 * @see #getM_dMaximumBalance()
	 * @see #setM_dMaximumBalance(double)
	 * @generated
	 */
	void unsetM_dMaximumBalance();

	/**
	 * Returns whether the value of the '{@link VM_KranthiRekala.vendsys.PayMachine#getM_dMaximumBalance <em>MdMaximum Balance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MdMaximum Balance</em>' attribute is set.
	 * @see #unsetM_dMaximumBalance()
	 * @see #getM_dMaximumBalance()
	 * @see #setM_dMaximumBalance(double)
	 * @generated
	 */
	boolean isSetM_dMaximumBalance();

	/**
	 * Returns the value of the '<em><b>MdBalance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MdBalance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MdBalance</em>' attribute.
	 * @see #setM_dBalance(double)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getPayMachine_M_dBalance()
	 * @model
	 * @generated
	 */
	double getM_dBalance();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.PayMachine#getM_dBalance <em>MdBalance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MdBalance</em>' attribute.
	 * @see #getM_dBalance()
	 * @generated
	 */
	void setM_dBalance(double value);

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
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getPayMachine_M_bOutOfOrder()
	 * @model
	 * @generated
	 */
	boolean isM_bOutOfOrder();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.PayMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbOut Of Order</em>' attribute.
	 * @see #isM_bOutOfOrder()
	 * @generated
	 */
	void setM_bOutOfOrder(boolean value);

	/**
	 * Returns the value of the '<em><b>Mpml Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpml Listener</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpml Listener</em>' reference.
	 * @see #setM_pmlListener(IPayMachineListener)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getPayMachine_M_pmlListener()
	 * @model
	 * @generated
	 */
	IPayMachineListener getM_pmlListener();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.PayMachine#getM_pmlListener <em>Mpml Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpml Listener</em>' reference.
	 * @see #getM_pmlListener()
	 * @generated
	 */
	void setM_pmlListener(IPayMachineListener value);

	/**
	 * Returns the value of the '<em><b>Mcr Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mcr Register</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcr Register</em>' reference.
	 * @see #setM_crRegister(CashRegister)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getPayMachine_M_crRegister()
	 * @model
	 * @generated
	 */
	CashRegister getM_crRegister();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.PayMachine#getM_crRegister <em>Mcr Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcr Register</em>' reference.
	 * @see #getM_crRegister()
	 * @generated
	 */
	void setM_crRegister(CashRegister value);

	/**
	 * Returns the value of the '<em><b>Mvvm Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_pmPayMachine <em>Mpm Pay Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mvvm Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mvvm Owner</em>' reference.
	 * @see #setM_vvmOwner(VirtualVendingMachine)
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#getPayMachine_M_vvmOwner()
	 * @see VM_KranthiRekala.vendsys.VirtualVendingMachine#getM_pmPayMachine
	 * @model opposite="m_pmPayMachine"
	 * @generated
	 */
	VirtualVendingMachine getM_vvmOwner();

	/**
	 * Sets the value of the '{@link VM_KranthiRekala.vendsys.PayMachine#getM_vvmOwner <em>Mvvm Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mvvm Owner</em>' reference.
	 * @see #getM_vvmOwner()
	 * @generated
	 */
	void setM_vvmOwner(VirtualVendingMachine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void PayMachine(VirtualVendingMachine vvmOwner, double dMaximumBalance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPayMachineListener(IPayMachineListener pmlListener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getBalance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void insertQuarter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void insertDime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void insertNickel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void insertDollar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void insertSuncard(int iAccount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void returnChange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deductBalance(double dAmount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearBalance();

} // PayMachine
