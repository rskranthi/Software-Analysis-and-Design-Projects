/**
 */
package VM_KranthiRekala.vendsys.util;

import VM_KranthiRekala.vendsys.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see VM_KranthiRekala.vendsys.VendsysPackage
 * @generated
 */
public class VendsysValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VendsysValidator INSTANCE = new VendsysValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "VM_KranthiRekala.vendsys";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendsysValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return VendsysPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case VendsysPackage.IPAY_MACHINE_LISTENER:
				return validateIPayMachineListener((IPayMachineListener)value, diagnostics, context);
			case VendsysPackage.IPRODUCT_DATABASE:
				return validateIProductDatabase((IProductDatabase)value, diagnostics, context);
			case VendsysPackage.IPRODUCT_INFO:
				return validateIProductInfo((IProductInfo)value, diagnostics, context);
			case VendsysPackage.IPRODUCT_DISPENSER_LISTENER:
				return validateIProductDispenserListener((IProductDispenserListener)value, diagnostics, context);
			case VendsysPackage.IPRODUCT_SELECTOR_LISTENER:
				return validateIProductSelectorListener((IProductSelectorListener)value, diagnostics, context);
			case VendsysPackage.IOUTPUT_DISPLAY_LISTENER:
				return validateIOutputDisplayListener((IOutputDisplayListener)value, diagnostics, context);
			case VendsysPackage.CASH_REGISTER:
				return validateCashRegister((CashRegister)value, diagnostics, context);
			case VendsysPackage.OUTPUT_DISPLAY:
				return validateOutputDisplay((OutputDisplay)value, diagnostics, context);
			case VendsysPackage.PAY_MACHINE:
				return validatePayMachine((PayMachine)value, diagnostics, context);
			case VendsysPackage.VIRTUAL_VENDING_MACHINE:
				return validateVirtualVendingMachine((VirtualVendingMachine)value, diagnostics, context);
			case VendsysPackage.PRODUCT_DISPENSER:
				return validateProductDispenser((ProductDispenser)value, diagnostics, context);
			case VendsysPackage.PRODUCT_SELECTOR:
				return validateProductSelector((ProductSelector)value, diagnostics, context);
			case VendsysPackage.SUNCARD_RECEIPT:
				return validateSuncardReceipt((SuncardReceipt)value, diagnostics, context);
			case VendsysPackage.COIN_COUNT:
				return validateCoinCount((CoinCount)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPayMachineListener(IPayMachineListener iPayMachineListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iPayMachineListener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIProductDatabase(IProductDatabase iProductDatabase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iProductDatabase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIProductInfo(IProductInfo iProductInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iProductInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIProductDispenserListener(IProductDispenserListener iProductDispenserListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iProductDispenserListener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIProductSelectorListener(IProductSelectorListener iProductSelectorListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iProductSelectorListener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIOutputDisplayListener(IOutputDisplayListener iOutputDisplayListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iOutputDisplayListener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCashRegister(CashRegister cashRegister, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cashRegister, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDisplay(OutputDisplay outputDisplay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputDisplay, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayMachine(PayMachine payMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(payMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(payMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(payMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(payMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(payMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(payMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(payMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(payMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayMachine_hasValidAge(payMachine, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidAge constraint of '<em>Pay Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePayMachine_hasValidAge(PayMachine payMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if ((payMachine.getM_dBalance()< (payMachine.getM_dMaximumBalance()-0.10) && payMachine.isM_bOutOfOrder())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasValidAge", getObjectLabel(payMachine, context) },
						 new Object[] { payMachine },
						 context));
				System.out.println("Crossed Limit");
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualVendingMachine(VirtualVendingMachine virtualVendingMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualVendingMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductDispenser(ProductDispenser productDispenser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productDispenser, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductSelector(ProductSelector productSelector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productSelector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuncardReceipt(SuncardReceipt suncardReceipt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(suncardReceipt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoinCount(CoinCount coinCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coinCount, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //VendsysValidator
