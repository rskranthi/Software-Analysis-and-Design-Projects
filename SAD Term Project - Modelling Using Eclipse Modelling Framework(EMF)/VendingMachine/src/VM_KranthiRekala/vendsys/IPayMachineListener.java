/**
 */
package VM_KranthiRekala.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPay Machine Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see VM_KranthiRekala.vendsys.VendsysPackage#getIPayMachineListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IPayMachineListener extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void returnChange(int iNumQuarters, int iNumDimes, int iNumNickels);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void balanceUpdated(double dBalance);

} // IPayMachineListener
