/**
 */
package VM_KranthiRekala.vendsys.impl;

import VM_KranthiRekala.extern.ExternPackage;

import VM_KranthiRekala.extern.impl.ExternPackageImpl;

import VM_KranthiRekala.vendsys.CashRegister;
import VM_KranthiRekala.vendsys.CoinCount;
import VM_KranthiRekala.vendsys.IOutputDisplayListener;
import VM_KranthiRekala.vendsys.IPayMachineListener;
import VM_KranthiRekala.vendsys.IProductDatabase;
import VM_KranthiRekala.vendsys.IProductDispenserListener;
import VM_KranthiRekala.vendsys.IProductInfo;
import VM_KranthiRekala.vendsys.IProductSelectorListener;
import VM_KranthiRekala.vendsys.OutputDisplay;
import VM_KranthiRekala.vendsys.PayMachine;
import VM_KranthiRekala.vendsys.ProductDispenser;
import VM_KranthiRekala.vendsys.ProductSelector;
import VM_KranthiRekala.vendsys.SuncardReceipt;
import VM_KranthiRekala.vendsys.VendsysFactory;
import VM_KranthiRekala.vendsys.VendsysPackage;
import VM_KranthiRekala.vendsys.VirtualVendingMachine;

import VM_KranthiRekala.vendsys.util.VendsysValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendsysPackageImpl extends EPackageImpl implements VendsysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPayMachineListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProductDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProductInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProductDispenserListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProductSelectorListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iOutputDisplayListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDisplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualVendingMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDispenserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suncardReceiptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coinCountEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see VM_KranthiRekala.vendsys.VendsysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VendsysPackageImpl() {
		super(eNS_URI, VendsysFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VendsysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VendsysPackage init() {
		if (isInited) return (VendsysPackage)EPackage.Registry.INSTANCE.getEPackage(VendsysPackage.eNS_URI);

		// Obtain or create and register package
		VendsysPackageImpl theVendsysPackage = (VendsysPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VendsysPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VendsysPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExternPackageImpl theExternPackage = (ExternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternPackage.eNS_URI) instanceof ExternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternPackage.eNS_URI) : ExternPackage.eINSTANCE);

		// Create package meta-data objects
		theVendsysPackage.createPackageContents();
		theExternPackage.createPackageContents();

		// Initialize created meta-data
		theVendsysPackage.initializePackageContents();
		theExternPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theVendsysPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return VendsysValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theVendsysPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VendsysPackage.eNS_URI, theVendsysPackage);
		return theVendsysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPayMachineListener() {
		return iPayMachineListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPayMachineListener__ReturnChange__int_int_int() {
		return iPayMachineListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPayMachineListener__BalanceUpdated__double() {
		return iPayMachineListenerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProductDatabase() {
		return iProductDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIProductDatabase_Product() {
		return (EReference)iProductDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIProductDatabase_Realizes() {
		return (EReference)iProductDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductDatabase__GetProducts() {
		return iProductDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductDatabase__DecrementQuantity() {
		return iProductDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProductInfo() {
		return iProductInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductInfo__GetID() {
		return iProductInfoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductInfo__GetName() {
		return iProductInfoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductInfo__GetDescription() {
		return iProductInfoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductInfo__GetIcon() {
		return iProductInfoEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductInfo__GetPrice() {
		return iProductInfoEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductInfo__GetQuantity() {
		return iProductInfoEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProductDispenserListener() {
		return iProductDispenserListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductDispenserListener__DispenseProduct__IProductInfo() {
		return iProductDispenserListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProductSelectorListener() {
		return iProductSelectorListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductSelectorListener__UpdateDisplay__IProductInfo() {
		return iProductSelectorListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductSelectorListener__ItemSelected__IProductInfo() {
		return iProductSelectorListenerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProductSelectorListener__ItemDeselected__IProductInfo() {
		return iProductSelectorListenerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOutputDisplayListener() {
		return iOutputDisplayListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOutputDisplayListener__UpdateDisplay__String() {
		return iOutputDisplayListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCashRegister() {
		return cashRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashRegister_M_iNumQuarters() {
		return (EAttribute)cashRegisterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashRegister_M_iNumDimes() {
		return (EAttribute)cashRegisterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashRegister_M_iNumNickels() {
		return (EAttribute)cashRegisterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashRegister_M_iNumDollars() {
		return (EAttribute)cashRegisterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashRegister_M_alReceipts() {
		return (EReference)cashRegisterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashRegister__CashRegister() {
		return cashRegisterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashRegister__MaximumChange() {
		return cashRegisterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashRegister__AddDollars__int() {
		return cashRegisterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashRegister__AddQuarters__int() {
		return cashRegisterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashRegister__AddDimes__int() {
		return cashRegisterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashRegister__AddNickels__int() {
		return cashRegisterEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashRegister__AddReceipt() {
		return cashRegisterEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCashRegister__TakeOutChange__double() {
		return cashRegisterEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDisplay() {
		return outputDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDisplay_M_sCurrentOutput() {
		return (EAttribute)outputDisplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDisplay_M_odlListener() {
		return (EReference)outputDisplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputDisplay__DisplayString__String() {
		return outputDisplayEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputDisplay__SetOutputDisplayListener__IOutputDisplayListener() {
		return outputDisplayEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayMachine() {
		return payMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayMachine_M_dMaximumBalance() {
		return (EAttribute)payMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayMachine_M_dBalance() {
		return (EAttribute)payMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayMachine_M_bOutOfOrder() {
		return (EAttribute)payMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayMachine_M_pmlListener() {
		return (EReference)payMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayMachine_M_crRegister() {
		return (EReference)payMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayMachine_M_vvmOwner() {
		return (EReference)payMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__PayMachine__VirtualVendingMachine_double() {
		return payMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__SetPayMachineListener__IPayMachineListener() {
		return payMachineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__GetBalance() {
		return payMachineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__InsertQuarter() {
		return payMachineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__InsertDime() {
		return payMachineEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__InsertNickel() {
		return payMachineEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__InsertDollar() {
		return payMachineEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__InsertSuncard__int() {
		return payMachineEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__ReturnChange() {
		return payMachineEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__DeductBalance__double() {
		return payMachineEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayMachine__ClearBalance() {
		return payMachineEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualVendingMachine() {
		return virtualVendingMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualVendingMachine_M_bOutOfOrder() {
		return (EAttribute)virtualVendingMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_pdProducts() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_odOutputDisplay() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_pdDispenser() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_pmPayMachine() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_psProductSelector() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__VirtualVendingMachine__IProductDatabase() {
		return virtualVendingMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__GetProducts() {
		return virtualVendingMachineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__GetProductSelector() {
		return virtualVendingMachineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__GetOutputDisplay() {
		return virtualVendingMachineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__GetPayMachine() {
		return virtualVendingMachineEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__GetProductDispenser() {
		return virtualVendingMachineEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__ShowProductDesc__IProductInfo() {
		return virtualVendingMachineEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__BuyItem__IProductInfo() {
		return virtualVendingMachineEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualVendingMachine__GoOutOfOrder() {
		return virtualVendingMachineEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDispenser() {
		return productDispenserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDispenser_M_pdlListener() {
		return (EReference)productDispenserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductDispenser__DispenseProduct__IProductInfo() {
		return productDispenserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductDispenser__SetProductDispenserListener__IProductDispenserListener() {
		return productDispenserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSelector() {
		return productSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSelector_M_pslListener() {
		return (EReference)productSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSelector_M_piSelectedItem() {
		return (EReference)productSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSelector_M_vvmMachine() {
		return (EReference)productSelectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSelector__ProductSelector__VirtualVendingMachine() {
		return productSelectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSelector__DisplayProducts() {
		return productSelectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSelector__SetProductSelectorListener__IProductSelectorListener() {
		return productSelectorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSelector__ShowProductDesc__IProductInfo() {
		return productSelectorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSelector__BuyItem__IProductInfo() {
		return productSelectorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSelector__SetSelectedItem__IProductInfo() {
		return productSelectorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuncardReceipt() {
		return suncardReceiptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuncardReceipt_M_iAccount() {
		return (EAttribute)suncardReceiptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuncardReceipt_M_dAmountDeducted() {
		return (EAttribute)suncardReceiptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuncardReceipt__SuncardReceipt__int_double() {
		return suncardReceiptEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuncardReceipt__GetAccount() {
		return suncardReceiptEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuncardReceipt__GetAmountDeducted() {
		return suncardReceiptEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoinCount() {
		return coinCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoinCount_NUM_QUARTERS() {
		return (EAttribute)coinCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoinCount_NUM_DIMES() {
		return (EAttribute)coinCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoinCount_NUM_NICKELS() {
		return (EAttribute)coinCountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoinCount_Coins() {
		return (EReference)coinCountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendsysFactory getVendsysFactory() {
		return (VendsysFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iPayMachineListenerEClass = createEClass(IPAY_MACHINE_LISTENER);
		createEOperation(iPayMachineListenerEClass, IPAY_MACHINE_LISTENER___RETURN_CHANGE__INT_INT_INT);
		createEOperation(iPayMachineListenerEClass, IPAY_MACHINE_LISTENER___BALANCE_UPDATED__DOUBLE);

		iProductDatabaseEClass = createEClass(IPRODUCT_DATABASE);
		createEReference(iProductDatabaseEClass, IPRODUCT_DATABASE__PRODUCT);
		createEReference(iProductDatabaseEClass, IPRODUCT_DATABASE__REALIZES);
		createEOperation(iProductDatabaseEClass, IPRODUCT_DATABASE___GET_PRODUCTS);
		createEOperation(iProductDatabaseEClass, IPRODUCT_DATABASE___DECREMENT_QUANTITY);

		iProductInfoEClass = createEClass(IPRODUCT_INFO);
		createEOperation(iProductInfoEClass, IPRODUCT_INFO___GET_ID);
		createEOperation(iProductInfoEClass, IPRODUCT_INFO___GET_NAME);
		createEOperation(iProductInfoEClass, IPRODUCT_INFO___GET_DESCRIPTION);
		createEOperation(iProductInfoEClass, IPRODUCT_INFO___GET_ICON);
		createEOperation(iProductInfoEClass, IPRODUCT_INFO___GET_PRICE);
		createEOperation(iProductInfoEClass, IPRODUCT_INFO___GET_QUANTITY);

		iProductDispenserListenerEClass = createEClass(IPRODUCT_DISPENSER_LISTENER);
		createEOperation(iProductDispenserListenerEClass, IPRODUCT_DISPENSER_LISTENER___DISPENSE_PRODUCT__IPRODUCTINFO);

		iProductSelectorListenerEClass = createEClass(IPRODUCT_SELECTOR_LISTENER);
		createEOperation(iProductSelectorListenerEClass, IPRODUCT_SELECTOR_LISTENER___UPDATE_DISPLAY__IPRODUCTINFO);
		createEOperation(iProductSelectorListenerEClass, IPRODUCT_SELECTOR_LISTENER___ITEM_SELECTED__IPRODUCTINFO);
		createEOperation(iProductSelectorListenerEClass, IPRODUCT_SELECTOR_LISTENER___ITEM_DESELECTED__IPRODUCTINFO);

		iOutputDisplayListenerEClass = createEClass(IOUTPUT_DISPLAY_LISTENER);
		createEOperation(iOutputDisplayListenerEClass, IOUTPUT_DISPLAY_LISTENER___UPDATE_DISPLAY__STRING);

		cashRegisterEClass = createEClass(CASH_REGISTER);
		createEAttribute(cashRegisterEClass, CASH_REGISTER__MINUM_QUARTERS);
		createEAttribute(cashRegisterEClass, CASH_REGISTER__MINUM_DIMES);
		createEAttribute(cashRegisterEClass, CASH_REGISTER__MINUM_NICKELS);
		createEAttribute(cashRegisterEClass, CASH_REGISTER__MINUM_DOLLARS);
		createEReference(cashRegisterEClass, CASH_REGISTER__MAL_RECEIPTS);
		createEOperation(cashRegisterEClass, CASH_REGISTER___CASH_REGISTER);
		createEOperation(cashRegisterEClass, CASH_REGISTER___MAXIMUM_CHANGE);
		createEOperation(cashRegisterEClass, CASH_REGISTER___ADD_DOLLARS__INT);
		createEOperation(cashRegisterEClass, CASH_REGISTER___ADD_QUARTERS__INT);
		createEOperation(cashRegisterEClass, CASH_REGISTER___ADD_DIMES__INT);
		createEOperation(cashRegisterEClass, CASH_REGISTER___ADD_NICKELS__INT);
		createEOperation(cashRegisterEClass, CASH_REGISTER___ADD_RECEIPT);
		createEOperation(cashRegisterEClass, CASH_REGISTER___TAKE_OUT_CHANGE__DOUBLE);

		outputDisplayEClass = createEClass(OUTPUT_DISPLAY);
		createEAttribute(outputDisplayEClass, OUTPUT_DISPLAY__MSCURRENT_OUTPUT);
		createEReference(outputDisplayEClass, OUTPUT_DISPLAY__MODL_LISTENER);
		createEOperation(outputDisplayEClass, OUTPUT_DISPLAY___DISPLAY_STRING__STRING);
		createEOperation(outputDisplayEClass, OUTPUT_DISPLAY___SET_OUTPUT_DISPLAY_LISTENER__IOUTPUTDISPLAYLISTENER);

		payMachineEClass = createEClass(PAY_MACHINE);
		createEAttribute(payMachineEClass, PAY_MACHINE__MDMAXIMUM_BALANCE);
		createEAttribute(payMachineEClass, PAY_MACHINE__MDBALANCE);
		createEAttribute(payMachineEClass, PAY_MACHINE__MBOUT_OF_ORDER);
		createEReference(payMachineEClass, PAY_MACHINE__MPML_LISTENER);
		createEReference(payMachineEClass, PAY_MACHINE__MCR_REGISTER);
		createEReference(payMachineEClass, PAY_MACHINE__MVVM_OWNER);
		createEOperation(payMachineEClass, PAY_MACHINE___PAY_MACHINE__VIRTUALVENDINGMACHINE_DOUBLE);
		createEOperation(payMachineEClass, PAY_MACHINE___SET_PAY_MACHINE_LISTENER__IPAYMACHINELISTENER);
		createEOperation(payMachineEClass, PAY_MACHINE___GET_BALANCE);
		createEOperation(payMachineEClass, PAY_MACHINE___INSERT_QUARTER);
		createEOperation(payMachineEClass, PAY_MACHINE___INSERT_DIME);
		createEOperation(payMachineEClass, PAY_MACHINE___INSERT_NICKEL);
		createEOperation(payMachineEClass, PAY_MACHINE___INSERT_DOLLAR);
		createEOperation(payMachineEClass, PAY_MACHINE___INSERT_SUNCARD__INT);
		createEOperation(payMachineEClass, PAY_MACHINE___RETURN_CHANGE);
		createEOperation(payMachineEClass, PAY_MACHINE___DEDUCT_BALANCE__DOUBLE);
		createEOperation(payMachineEClass, PAY_MACHINE___CLEAR_BALANCE);

		virtualVendingMachineEClass = createEClass(VIRTUAL_VENDING_MACHINE);
		createEAttribute(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MPD_DISPENSER);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___VIRTUAL_VENDING_MACHINE__IPRODUCTDATABASE);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___GET_PRODUCTS);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___GET_PRODUCT_SELECTOR);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___GET_OUTPUT_DISPLAY);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___GET_PAY_MACHINE);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___GET_PRODUCT_DISPENSER);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___SHOW_PRODUCT_DESC__IPRODUCTINFO);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___BUY_ITEM__IPRODUCTINFO);
		createEOperation(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE___GO_OUT_OF_ORDER);

		productDispenserEClass = createEClass(PRODUCT_DISPENSER);
		createEReference(productDispenserEClass, PRODUCT_DISPENSER__MPDL_LISTENER);
		createEOperation(productDispenserEClass, PRODUCT_DISPENSER___DISPENSE_PRODUCT__IPRODUCTINFO);
		createEOperation(productDispenserEClass, PRODUCT_DISPENSER___SET_PRODUCT_DISPENSER_LISTENER__IPRODUCTDISPENSERLISTENER);

		productSelectorEClass = createEClass(PRODUCT_SELECTOR);
		createEReference(productSelectorEClass, PRODUCT_SELECTOR__MPSL_LISTENER);
		createEReference(productSelectorEClass, PRODUCT_SELECTOR__MPI_SELECTED_ITEM);
		createEReference(productSelectorEClass, PRODUCT_SELECTOR__MVVM_MACHINE);
		createEOperation(productSelectorEClass, PRODUCT_SELECTOR___PRODUCT_SELECTOR__VIRTUALVENDINGMACHINE);
		createEOperation(productSelectorEClass, PRODUCT_SELECTOR___DISPLAY_PRODUCTS);
		createEOperation(productSelectorEClass, PRODUCT_SELECTOR___SET_PRODUCT_SELECTOR_LISTENER__IPRODUCTSELECTORLISTENER);
		createEOperation(productSelectorEClass, PRODUCT_SELECTOR___SHOW_PRODUCT_DESC__IPRODUCTINFO);
		createEOperation(productSelectorEClass, PRODUCT_SELECTOR___BUY_ITEM__IPRODUCTINFO);
		createEOperation(productSelectorEClass, PRODUCT_SELECTOR___SET_SELECTED_ITEM__IPRODUCTINFO);

		suncardReceiptEClass = createEClass(SUNCARD_RECEIPT);
		createEAttribute(suncardReceiptEClass, SUNCARD_RECEIPT__MIACCOUNT);
		createEAttribute(suncardReceiptEClass, SUNCARD_RECEIPT__MDAMOUNT_DEDUCTED);
		createEOperation(suncardReceiptEClass, SUNCARD_RECEIPT___SUNCARD_RECEIPT__INT_DOUBLE);
		createEOperation(suncardReceiptEClass, SUNCARD_RECEIPT___GET_ACCOUNT);
		createEOperation(suncardReceiptEClass, SUNCARD_RECEIPT___GET_AMOUNT_DEDUCTED);

		coinCountEClass = createEClass(COIN_COUNT);
		createEAttribute(coinCountEClass, COIN_COUNT__NUM_QUARTERS);
		createEAttribute(coinCountEClass, COIN_COUNT__NUM_DIMES);
		createEAttribute(coinCountEClass, COIN_COUNT__NUM_NICKELS);
		createEReference(coinCountEClass, COIN_COUNT__COINS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExternPackage theExternPackage = (ExternPackage)EPackage.Registry.INSTANCE.getEPackage(ExternPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cashRegisterEClass.getESuperTypes().add(this.getVirtualVendingMachine());

		// Initialize classes, features, and operations; add parameters
		initEClass(iPayMachineListenerEClass, IPayMachineListener.class, "IPayMachineListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIPayMachineListener__ReturnChange__int_int_int(), null, "returnChange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iNumQuarters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iNumDimes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iNumNickels", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIPayMachineListener__BalanceUpdated__double(), null, "balanceUpdated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "dBalance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iProductDatabaseEClass, IProductDatabase.class, "IProductDatabase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIProductDatabase_Product(), theExternPackage.getMyProductDatabase(), null, "product", null, 0, -1, IProductDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIProductDatabase_Realizes(), theExternPackage.getProduct(), null, "realizes", null, 0, 1, IProductDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIProductDatabase__GetProducts(), null, "getProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProductDatabase__DecrementQuantity(), null, "decrementQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iProductInfoEClass, IProductInfo.class, "IProductInfo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIProductInfo__GetID(), ecorePackage.getEInt(), "getID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProductInfo__GetName(), ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProductInfo__GetDescription(), ecorePackage.getEString(), "getDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProductInfo__GetIcon(), null, "getIcon", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProductInfo__GetPrice(), ecorePackage.getEDouble(), "getPrice", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProductInfo__GetQuantity(), ecorePackage.getEInt(), "getQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iProductDispenserListenerEClass, IProductDispenserListener.class, "IProductDispenserListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIProductDispenserListener__DispenseProduct__IProductInfo(), null, "dispenseProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iProductSelectorListenerEClass, IProductSelectorListener.class, "IProductSelectorListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIProductSelectorListener__UpdateDisplay__IProductInfo(), null, "updateDisplay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProductSelectorListener__ItemSelected__IProductInfo(), null, "itemSelected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProductSelectorListener__ItemDeselected__IProductInfo(), null, "itemDeselected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iOutputDisplayListenerEClass, IOutputDisplayListener.class, "IOutputDisplayListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIOutputDisplayListener__UpdateDisplay__String(), null, "updateDisplay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cashRegisterEClass, CashRegister.class, "CashRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCashRegister_M_iNumQuarters(), ecorePackage.getEInt(), "m_iNumQuarters", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashRegister_M_iNumDimes(), ecorePackage.getEInt(), "m_iNumDimes", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashRegister_M_iNumNickels(), ecorePackage.getEInt(), "m_iNumNickels", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashRegister_M_iNumDollars(), ecorePackage.getEInt(), "m_iNumDollars", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCashRegister_M_alReceipts(), this.getSuncardReceipt(), null, "m_alReceipts", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCashRegister__CashRegister(), null, "CashRegister", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCashRegister__MaximumChange(), ecorePackage.getEDouble(), "maximumChange", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashRegister__AddDollars__int(), null, "addDollars", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashRegister__AddQuarters__int(), null, "addQuarters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashRegister__AddDimes__int(), null, "addDimes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashRegister__AddNickels__int(), null, "addNickels", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCashRegister__AddReceipt(), null, "addReceipt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCashRegister__TakeOutChange__double(), this.getCoinCount(), "takeOutChange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "dAmount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputDisplayEClass, OutputDisplay.class, "OutputDisplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputDisplay_M_sCurrentOutput(), ecorePackage.getEString(), "m_sCurrentOutput", "\"\"", 0, 1, OutputDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputDisplay_M_odlListener(), this.getIOutputDisplayListener(), null, "m_odlListener", null, 0, 1, OutputDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOutputDisplay__DisplayString__String(), null, "displayString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOutputDisplay__SetOutputDisplayListener__IOutputDisplayListener(), null, "setOutputDisplayListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOutputDisplayListener(), "odlListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(payMachineEClass, PayMachine.class, "PayMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayMachine_M_dMaximumBalance(), ecorePackage.getEDouble(), "m_dMaximumBalance", "3.00", 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayMachine_M_dBalance(), ecorePackage.getEDouble(), "m_dBalance", null, 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayMachine_M_bOutOfOrder(), ecorePackage.getEBoolean(), "m_bOutOfOrder", null, 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayMachine_M_pmlListener(), this.getIPayMachineListener(), null, "m_pmlListener", null, 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayMachine_M_crRegister(), this.getCashRegister(), null, "m_crRegister", null, 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayMachine_M_vvmOwner(), this.getVirtualVendingMachine(), this.getVirtualVendingMachine_M_pmPayMachine(), "m_vvmOwner", null, 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPayMachine__PayMachine__VirtualVendingMachine_double(), null, "PayMachine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVirtualVendingMachine(), "vvmOwner", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "dMaximumBalance", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPayMachine__SetPayMachineListener__IPayMachineListener(), null, "setPayMachineListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIPayMachineListener(), "pmlListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayMachine__GetBalance(), ecorePackage.getEDouble(), "getBalance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayMachine__InsertQuarter(), null, "insertQuarter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayMachine__InsertDime(), null, "insertDime", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayMachine__InsertNickel(), null, "insertNickel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayMachine__InsertDollar(), null, "insertDollar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPayMachine__InsertSuncard__int(), null, "insertSuncard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iAccount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayMachine__ReturnChange(), null, "returnChange", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPayMachine__DeductBalance__double(), null, "deductBalance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "dAmount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayMachine__ClearBalance(), null, "clearBalance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(virtualVendingMachineEClass, VirtualVendingMachine.class, "VirtualVendingMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualVendingMachine_M_bOutOfOrder(), ecorePackage.getEBoolean(), "m_bOutOfOrder", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_pdProducts(), this.getIProductDatabase(), null, "m_pdProducts", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_odOutputDisplay(), this.getOutputDisplay(), null, "m_odOutputDisplay", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_pdDispenser(), this.getProductDispenser(), null, "m_pdDispenser", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_pmPayMachine(), this.getPayMachine(), this.getPayMachine_M_vvmOwner(), "m_pmPayMachine", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_psProductSelector(), this.getProductSelector(), this.getProductSelector_M_vvmMachine(), "m_psProductSelector", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVirtualVendingMachine__VirtualVendingMachine__IProductDatabase(), null, "VirtualVendingMachine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductDatabase(), "pdProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVirtualVendingMachine__GetProducts(), this.getIProductInfo(), "getProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVirtualVendingMachine__GetProductSelector(), this.getProductSelector(), "getProductSelector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVirtualVendingMachine__GetOutputDisplay(), this.getOutputDisplay(), "getOutputDisplay", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVirtualVendingMachine__GetPayMachine(), this.getPayMachine(), "getPayMachine", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVirtualVendingMachine__GetProductDispenser(), this.getProductDispenser(), "getProductDispenser", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVirtualVendingMachine__ShowProductDesc__IProductInfo(), null, "showProductDesc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVirtualVendingMachine__BuyItem__IProductInfo(), null, "buyItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVirtualVendingMachine__GoOutOfOrder(), null, "goOutOfOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productDispenserEClass, ProductDispenser.class, "ProductDispenser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductDispenser_M_pdlListener(), this.getIProductDispenserListener(), null, "m_pdlListener", null, 0, 1, ProductDispenser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProductDispenser__DispenseProduct__IProductInfo(), null, "dispenseProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProductDispenser__SetProductDispenserListener__IProductDispenserListener(), null, "setProductDispenserListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductDispenserListener(), "pdlListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productSelectorEClass, ProductSelector.class, "ProductSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSelector_M_pslListener(), this.getIProductSelectorListener(), null, "m_pslListener", null, 0, 1, ProductSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSelector_M_piSelectedItem(), this.getIProductInfo(), null, "m_piSelectedItem", null, 0, 1, ProductSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSelector_M_vvmMachine(), this.getVirtualVendingMachine(), this.getVirtualVendingMachine_M_psProductSelector(), "m_vvmMachine", null, 0, 1, ProductSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProductSelector__ProductSelector__VirtualVendingMachine(), null, "ProductSelector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVirtualVendingMachine(), "vvmMachine", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProductSelector__DisplayProducts(), null, "displayProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProductSelector__SetProductSelectorListener__IProductSelectorListener(), null, "setProductSelectorListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductSelectorListener(), "pslListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProductSelector__ShowProductDesc__IProductInfo(), null, "showProductDesc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProductSelector__BuyItem__IProductInfo(), null, "buyItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProductSelector__SetSelectedItem__IProductInfo(), null, "setSelectedItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(suncardReceiptEClass, SuncardReceipt.class, "SuncardReceipt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuncardReceipt_M_iAccount(), ecorePackage.getEInt(), "m_iAccount", null, 0, 1, SuncardReceipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuncardReceipt_M_dAmountDeducted(), ecorePackage.getEDouble(), "m_dAmountDeducted", null, 0, 1, SuncardReceipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSuncardReceipt__SuncardReceipt__int_double(), null, "SuncardReceipt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iAccount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "dAmountDeducted", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSuncardReceipt__GetAccount(), null, "getAccount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSuncardReceipt__GetAmountDeducted(), null, "getAmountDeducted", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coinCountEClass, CoinCount.class, "CoinCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoinCount_NUM_QUARTERS(), ecorePackage.getEInt(), "NUM_QUARTERS", null, 0, 1, CoinCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoinCount_NUM_DIMES(), ecorePackage.getEInt(), "NUM_DIMES", null, 0, 1, CoinCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoinCount_NUM_NICKELS(), ecorePackage.getEInt(), "NUM_NICKELS", null, 0, 1, CoinCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoinCount_Coins(), this.getCashRegister(), null, "coins", null, 0, 1, CoinCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (payMachineEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasValidAge"
		   });
	}

} //VendsysPackageImpl
