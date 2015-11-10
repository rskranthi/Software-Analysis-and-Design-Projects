/**
 */
package VM_KranthiRekala.vendsys.util;

import VM_KranthiRekala.vendsys.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see VM_KranthiRekala.vendsys.VendsysPackage
 * @generated
 */
public class VendsysSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VendsysPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendsysSwitch() {
		if (modelPackage == null) {
			modelPackage = VendsysPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VendsysPackage.IPAY_MACHINE_LISTENER: {
				IPayMachineListener iPayMachineListener = (IPayMachineListener)theEObject;
				T result = caseIPayMachineListener(iPayMachineListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.IPRODUCT_DATABASE: {
				IProductDatabase iProductDatabase = (IProductDatabase)theEObject;
				T result = caseIProductDatabase(iProductDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.IPRODUCT_INFO: {
				IProductInfo iProductInfo = (IProductInfo)theEObject;
				T result = caseIProductInfo(iProductInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.IPRODUCT_DISPENSER_LISTENER: {
				IProductDispenserListener iProductDispenserListener = (IProductDispenserListener)theEObject;
				T result = caseIProductDispenserListener(iProductDispenserListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.IPRODUCT_SELECTOR_LISTENER: {
				IProductSelectorListener iProductSelectorListener = (IProductSelectorListener)theEObject;
				T result = caseIProductSelectorListener(iProductSelectorListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.IOUTPUT_DISPLAY_LISTENER: {
				IOutputDisplayListener iOutputDisplayListener = (IOutputDisplayListener)theEObject;
				T result = caseIOutputDisplayListener(iOutputDisplayListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.CASH_REGISTER: {
				CashRegister cashRegister = (CashRegister)theEObject;
				T result = caseCashRegister(cashRegister);
				if (result == null) result = caseVirtualVendingMachine(cashRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.OUTPUT_DISPLAY: {
				OutputDisplay outputDisplay = (OutputDisplay)theEObject;
				T result = caseOutputDisplay(outputDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.PAY_MACHINE: {
				PayMachine payMachine = (PayMachine)theEObject;
				T result = casePayMachine(payMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.VIRTUAL_VENDING_MACHINE: {
				VirtualVendingMachine virtualVendingMachine = (VirtualVendingMachine)theEObject;
				T result = caseVirtualVendingMachine(virtualVendingMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.PRODUCT_DISPENSER: {
				ProductDispenser productDispenser = (ProductDispenser)theEObject;
				T result = caseProductDispenser(productDispenser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.PRODUCT_SELECTOR: {
				ProductSelector productSelector = (ProductSelector)theEObject;
				T result = caseProductSelector(productSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.SUNCARD_RECEIPT: {
				SuncardReceipt suncardReceipt = (SuncardReceipt)theEObject;
				T result = caseSuncardReceipt(suncardReceipt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VendsysPackage.COIN_COUNT: {
				CoinCount coinCount = (CoinCount)theEObject;
				T result = caseCoinCount(coinCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPay Machine Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPay Machine Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPayMachineListener(IPayMachineListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProduct Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProduct Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProductDatabase(IProductDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProduct Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProduct Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProductInfo(IProductInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProduct Dispenser Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProduct Dispenser Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProductDispenserListener(IProductDispenserListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProduct Selector Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProduct Selector Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProductSelectorListener(IProductSelectorListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOutput Display Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOutput Display Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOutputDisplayListener(IOutputDisplayListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cash Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cash Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCashRegister(CashRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDisplay(OutputDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pay Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pay Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayMachine(PayMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Vending Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Vending Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualVendingMachine(VirtualVendingMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Dispenser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDispenser(ProductDispenser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSelector(ProductSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suncard Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suncard Receipt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuncardReceipt(SuncardReceipt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coin Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coin Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoinCount(CoinCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VendsysSwitch
