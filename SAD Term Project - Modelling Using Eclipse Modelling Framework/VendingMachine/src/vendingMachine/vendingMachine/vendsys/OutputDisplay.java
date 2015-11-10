/**
 */
package vendingMachine.vendingMachine.vendsys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.OutputDisplay#getM_sCurrentOutput <em>MsCurrent Output</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.vendsys.OutputDisplay#getM_odlListener <em>Modl Listener</em>}</li>
 * </ul>
 * </p>
 *
 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getOutputDisplay()
 * @model
 * @generated
 */
public interface OutputDisplay extends EObject {
	/**
	 * Returns the value of the '<em><b>MsCurrent Output</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MsCurrent Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MsCurrent Output</em>' attribute.
	 * @see #setM_sCurrentOutput(String)
	 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getOutputDisplay_M_sCurrentOutput()
	 * @model default="\"\""
	 * @generated
	 */
	String getM_sCurrentOutput();

	/**
	 * Sets the value of the '{@link vendingMachine.vendingMachine.vendsys.OutputDisplay#getM_sCurrentOutput <em>MsCurrent Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MsCurrent Output</em>' attribute.
	 * @see #getM_sCurrentOutput()
	 * @generated
	 */
	void setM_sCurrentOutput(String value);

	/**
	 * Returns the value of the '<em><b>Modl Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modl Listener</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modl Listener</em>' reference.
	 * @see #setM_odlListener(IOutputDisplayListener)
	 * @see vendingMachine.vendingMachine.vendsys.VendsysPackage#getOutputDisplay_M_odlListener()
	 * @model
	 * @generated
	 */
	IOutputDisplayListener getM_odlListener();

	/**
	 * Sets the value of the '{@link vendingMachine.vendingMachine.vendsys.OutputDisplay#getM_odlListener <em>Modl Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modl Listener</em>' reference.
	 * @see #getM_odlListener()
	 * @generated
	 */
	void setM_odlListener(IOutputDisplayListener value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayString(String sData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setOutputDisplayListener(IOutputDisplayListener odlListener);

} // OutputDisplay
