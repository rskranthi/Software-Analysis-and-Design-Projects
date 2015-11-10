/**
 */
package VM_KranthiRekala.vendsys.impl;

import VM_KranthiRekala.vendsys.IOutputDisplayListener;
import VM_KranthiRekala.vendsys.OutputDisplay;
import VM_KranthiRekala.vendsys.VendsysPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.OutputDisplayImpl#getM_sCurrentOutput <em>MsCurrent Output</em>}</li>
 *   <li>{@link VM_KranthiRekala.vendsys.impl.OutputDisplayImpl#getM_odlListener <em>Modl Listener</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputDisplayImpl extends MinimalEObjectImpl.Container implements OutputDisplay {
	/**
	 * The default value of the '{@link #getM_sCurrentOutput() <em>MsCurrent Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sCurrentOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String MSCURRENT_OUTPUT_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getM_sCurrentOutput() <em>MsCurrent Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sCurrentOutput()
	 * @generated
	 * @ordered
	 */
	protected String m_sCurrentOutput = MSCURRENT_OUTPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_odlListener() <em>Modl Listener</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_odlListener()
	 * @generated
	 * @ordered
	 */
	protected IOutputDisplayListener m_odlListener;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendsysPackage.Literals.OUTPUT_DISPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_sCurrentOutput() {
		return m_sCurrentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_sCurrentOutput(String newM_sCurrentOutput) {
		String oldM_sCurrentOutput = m_sCurrentOutput;
		m_sCurrentOutput = newM_sCurrentOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT, oldM_sCurrentOutput, m_sCurrentOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOutputDisplayListener getM_odlListener() {
		if (m_odlListener != null && m_odlListener.eIsProxy()) {
			InternalEObject oldM_odlListener = (InternalEObject)m_odlListener;
			m_odlListener = (IOutputDisplayListener)eResolveProxy(oldM_odlListener);
			if (m_odlListener != oldM_odlListener) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendsysPackage.OUTPUT_DISPLAY__MODL_LISTENER, oldM_odlListener, m_odlListener));
			}
		}
		return m_odlListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOutputDisplayListener basicGetM_odlListener() {
		return m_odlListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_odlListener(IOutputDisplayListener newM_odlListener) {
		IOutputDisplayListener oldM_odlListener = m_odlListener;
		m_odlListener = newM_odlListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendsysPackage.OUTPUT_DISPLAY__MODL_LISTENER, oldM_odlListener, m_odlListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayString(String sData) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDisplayListener(IOutputDisplayListener odlListener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VendsysPackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT:
				return getM_sCurrentOutput();
			case VendsysPackage.OUTPUT_DISPLAY__MODL_LISTENER:
				if (resolve) return getM_odlListener();
				return basicGetM_odlListener();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VendsysPackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT:
				setM_sCurrentOutput((String)newValue);
				return;
			case VendsysPackage.OUTPUT_DISPLAY__MODL_LISTENER:
				setM_odlListener((IOutputDisplayListener)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VendsysPackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT:
				setM_sCurrentOutput(MSCURRENT_OUTPUT_EDEFAULT);
				return;
			case VendsysPackage.OUTPUT_DISPLAY__MODL_LISTENER:
				setM_odlListener((IOutputDisplayListener)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VendsysPackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT:
				return MSCURRENT_OUTPUT_EDEFAULT == null ? m_sCurrentOutput != null : !MSCURRENT_OUTPUT_EDEFAULT.equals(m_sCurrentOutput);
			case VendsysPackage.OUTPUT_DISPLAY__MODL_LISTENER:
				return m_odlListener != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VendsysPackage.OUTPUT_DISPLAY___DISPLAY_STRING__STRING:
				displayString((String)arguments.get(0));
				return null;
			case VendsysPackage.OUTPUT_DISPLAY___SET_OUTPUT_DISPLAY_LISTENER__IOUTPUTDISPLAYLISTENER:
				setOutputDisplayListener((IOutputDisplayListener)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (m_sCurrentOutput: ");
		result.append(m_sCurrentOutput);
		result.append(')');
		return result.toString();
	}

} //OutputDisplayImpl
