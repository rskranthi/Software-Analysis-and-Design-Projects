/**
 */
package vendingMachine.vendingMachine.vendsys.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vendingMachine.vendingMachine.vendsys.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendsysFactoryImpl extends EFactoryImpl implements VendsysFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VendsysFactory init() {
		try {
			VendsysFactory theVendsysFactory = (VendsysFactory)EPackage.Registry.INSTANCE.getEFactory(VendsysPackage.eNS_URI);
			if (theVendsysFactory != null) {
				return theVendsysFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VendsysFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendsysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VendsysPackage.CASH_REGISTER: return createCashRegister();
			case VendsysPackage.OUTPUT_DISPLAY: return createOutputDisplay();
			case VendsysPackage.PAY_MACHINE: return createPayMachine();
			case VendsysPackage.VIRTUAL_VENDING_MACHINE: return createVirtualVendingMachine();
			case VendsysPackage.PRODUCT_DISPENSER: return createProductDispenser();
			case VendsysPackage.PRODUCT_SELECTOR: return createProductSelector();
			case VendsysPackage.SUNCARD_RECEIPT: return createSuncardReceipt();
			case VendsysPackage.COIN_COUNT: return createCoinCount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashRegister createCashRegister() {
		CashRegisterImpl cashRegister = new CashRegisterImpl();
		return cashRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDisplay createOutputDisplay() {
		OutputDisplayImpl outputDisplay = new OutputDisplayImpl();
		return outputDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayMachine createPayMachine() {
		PayMachineImpl payMachine = new PayMachineImpl();
		return payMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachine createVirtualVendingMachine() {
		VirtualVendingMachineImpl virtualVendingMachine = new VirtualVendingMachineImpl();
		return virtualVendingMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDispenser createProductDispenser() {
		ProductDispenserImpl productDispenser = new ProductDispenserImpl();
		return productDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSelector createProductSelector() {
		ProductSelectorImpl productSelector = new ProductSelectorImpl();
		return productSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuncardReceipt createSuncardReceipt() {
		SuncardReceiptImpl suncardReceipt = new SuncardReceiptImpl();
		return suncardReceipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoinCount createCoinCount() {
		CoinCountImpl coinCount = new CoinCountImpl();
		return coinCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendsysPackage getVendsysPackage() {
		return (VendsysPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VendsysPackage getPackage() {
		return VendsysPackage.eINSTANCE;
	}

} //VendsysFactoryImpl
