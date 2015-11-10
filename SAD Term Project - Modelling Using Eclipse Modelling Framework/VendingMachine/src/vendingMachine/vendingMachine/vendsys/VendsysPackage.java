/**
 */
package vendingMachine.vendingMachine.vendsys;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vendingMachine.vendingMachine.vendsys.VendsysFactory
 * @model kind="package"
 * @generated
 */
public interface VendsysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vendsys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://vendsys";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vendsys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendsysPackage eINSTANCE = vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl.init();

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.IPayMachineListener <em>IPay Machine Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.IPayMachineListener
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIPayMachineListener()
	 * @generated
	 */
	int IPAY_MACHINE_LISTENER = 0;

	/**
	 * The number of structural features of the '<em>IPay Machine Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAY_MACHINE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Return Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAY_MACHINE_LISTENER___RETURN_CHANGE__INT_INT_INT = 0;

	/**
	 * The operation id for the '<em>Balance Updated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAY_MACHINE_LISTENER___BALANCE_UPDATED__DOUBLE = 1;

	/**
	 * The number of operations of the '<em>IPay Machine Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAY_MACHINE_LISTENER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.IProductDatabaseImpl <em>IProduct Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.IProductDatabaseImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIProductDatabase()
	 * @generated
	 */
	int IPRODUCT_DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DATABASE__PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DATABASE__REALIZES = 1;

	/**
	 * The number of structural features of the '<em>IProduct Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DATABASE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DATABASE___GET_PRODUCTS = 0;

	/**
	 * The operation id for the '<em>Decrement Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DATABASE___DECREMENT_QUANTITY = 1;

	/**
	 * The number of operations of the '<em>IProduct Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DATABASE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.IProductInfo <em>IProduct Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.IProductInfo
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIProductInfo()
	 * @generated
	 */
	int IPRODUCT_INFO = 2;

	/**
	 * The number of structural features of the '<em>IProduct Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_INFO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_INFO___GET_ID = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_INFO___GET_NAME = 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_INFO___GET_DESCRIPTION = 2;

	/**
	 * The operation id for the '<em>Get Icon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_INFO___GET_ICON = 3;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_INFO___GET_PRICE = 4;

	/**
	 * The operation id for the '<em>Get Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_INFO___GET_QUANTITY = 5;

	/**
	 * The number of operations of the '<em>IProduct Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_INFO_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.IProductDispenserListener <em>IProduct Dispenser Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.IProductDispenserListener
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIProductDispenserListener()
	 * @generated
	 */
	int IPRODUCT_DISPENSER_LISTENER = 3;

	/**
	 * The number of structural features of the '<em>IProduct Dispenser Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DISPENSER_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Dispense Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DISPENSER_LISTENER___DISPENSE_PRODUCT__IPRODUCTINFO = 0;

	/**
	 * The number of operations of the '<em>IProduct Dispenser Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_DISPENSER_LISTENER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.IProductSelectorListener <em>IProduct Selector Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.IProductSelectorListener
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIProductSelectorListener()
	 * @generated
	 */
	int IPRODUCT_SELECTOR_LISTENER = 4;

	/**
	 * The number of structural features of the '<em>IProduct Selector Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_SELECTOR_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Update Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_SELECTOR_LISTENER___UPDATE_DISPLAY__IPRODUCTINFO = 0;

	/**
	 * The operation id for the '<em>Item Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_SELECTOR_LISTENER___ITEM_SELECTED__IPRODUCTINFO = 1;

	/**
	 * The operation id for the '<em>Item Deselected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_SELECTOR_LISTENER___ITEM_DESELECTED__IPRODUCTINFO = 2;

	/**
	 * The number of operations of the '<em>IProduct Selector Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRODUCT_SELECTOR_LISTENER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.IOutputDisplayListener <em>IOutput Display Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.IOutputDisplayListener
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIOutputDisplayListener()
	 * @generated
	 */
	int IOUTPUT_DISPLAY_LISTENER = 5;

	/**
	 * The number of structural features of the '<em>IOutput Display Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT_DISPLAY_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Update Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT_DISPLAY_LISTENER___UPDATE_DISPLAY__STRING = 0;

	/**
	 * The number of operations of the '<em>IOutput Display Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT_DISPLAY_LISTENER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl <em>Cash Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getCashRegister()
	 * @generated
	 */
	int CASH_REGISTER = 6;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.OutputDisplayImpl <em>Output Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.OutputDisplayImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getOutputDisplay()
	 * @generated
	 */
	int OUTPUT_DISPLAY = 7;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.PayMachineImpl <em>Pay Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.PayMachineImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getPayMachine()
	 * @generated
	 */
	int PAY_MACHINE = 8;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl <em>Virtual Vending Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getVirtualVendingMachine()
	 * @generated
	 */
	int VIRTUAL_VENDING_MACHINE = 9;

	/**
	 * The feature id for the '<em><b>MbOut Of Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Mpd Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Mod Output Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Mpd Dispenser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MPD_DISPENSER = 3;

	/**
	 * The feature id for the '<em><b>Mpm Pay Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Mps Product Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR = 5;

	/**
	 * The number of structural features of the '<em>Virtual Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Virtual Vending Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___VIRTUAL_VENDING_MACHINE__IPRODUCTDATABASE = 0;

	/**
	 * The operation id for the '<em>Get Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___GET_PRODUCTS = 1;

	/**
	 * The operation id for the '<em>Get Product Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___GET_PRODUCT_SELECTOR = 2;

	/**
	 * The operation id for the '<em>Get Output Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___GET_OUTPUT_DISPLAY = 3;

	/**
	 * The operation id for the '<em>Get Pay Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___GET_PAY_MACHINE = 4;

	/**
	 * The operation id for the '<em>Get Product Dispenser</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___GET_PRODUCT_DISPENSER = 5;

	/**
	 * The operation id for the '<em>Show Product Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___SHOW_PRODUCT_DESC__IPRODUCTINFO = 6;

	/**
	 * The operation id for the '<em>Buy Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___BUY_ITEM__IPRODUCTINFO = 7;

	/**
	 * The operation id for the '<em>Go Out Of Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE___GO_OUT_OF_ORDER = 8;

	/**
	 * The number of operations of the '<em>Virtual Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE_OPERATION_COUNT = 9;

	/**
	 * The feature id for the '<em><b>MbOut Of Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MBOUT_OF_ORDER = VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER;

	/**
	 * The feature id for the '<em><b>Mpd Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MPD_PRODUCTS = VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Mod Output Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MOD_OUTPUT_DISPLAY = VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY;

	/**
	 * The feature id for the '<em><b>Mpd Dispenser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MPD_DISPENSER = VIRTUAL_VENDING_MACHINE__MPD_DISPENSER;

	/**
	 * The feature id for the '<em><b>Mpm Pay Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MPM_PAY_MACHINE = VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE;

	/**
	 * The feature id for the '<em><b>Mps Product Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MPS_PRODUCT_SELECTOR = VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR;

	/**
	 * The feature id for the '<em><b>MiNum Quarters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MINUM_QUARTERS = VIRTUAL_VENDING_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MiNum Dimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MINUM_DIMES = VIRTUAL_VENDING_MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MiNum Nickels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MINUM_NICKELS = VIRTUAL_VENDING_MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MiNum Dollars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MINUM_DOLLARS = VIRTUAL_VENDING_MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mal Receipts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MAL_RECEIPTS = VIRTUAL_VENDING_MACHINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cash Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER_FEATURE_COUNT = VIRTUAL_VENDING_MACHINE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Virtual Vending Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___VIRTUAL_VENDING_MACHINE__IPRODUCTDATABASE = VIRTUAL_VENDING_MACHINE___VIRTUAL_VENDING_MACHINE__IPRODUCTDATABASE;

	/**
	 * The operation id for the '<em>Get Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___GET_PRODUCTS = VIRTUAL_VENDING_MACHINE___GET_PRODUCTS;

	/**
	 * The operation id for the '<em>Get Product Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___GET_PRODUCT_SELECTOR = VIRTUAL_VENDING_MACHINE___GET_PRODUCT_SELECTOR;

	/**
	 * The operation id for the '<em>Get Output Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___GET_OUTPUT_DISPLAY = VIRTUAL_VENDING_MACHINE___GET_OUTPUT_DISPLAY;

	/**
	 * The operation id for the '<em>Get Pay Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___GET_PAY_MACHINE = VIRTUAL_VENDING_MACHINE___GET_PAY_MACHINE;

	/**
	 * The operation id for the '<em>Get Product Dispenser</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___GET_PRODUCT_DISPENSER = VIRTUAL_VENDING_MACHINE___GET_PRODUCT_DISPENSER;

	/**
	 * The operation id for the '<em>Show Product Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___SHOW_PRODUCT_DESC__IPRODUCTINFO = VIRTUAL_VENDING_MACHINE___SHOW_PRODUCT_DESC__IPRODUCTINFO;

	/**
	 * The operation id for the '<em>Buy Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___BUY_ITEM__IPRODUCTINFO = VIRTUAL_VENDING_MACHINE___BUY_ITEM__IPRODUCTINFO;

	/**
	 * The operation id for the '<em>Go Out Of Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___GO_OUT_OF_ORDER = VIRTUAL_VENDING_MACHINE___GO_OUT_OF_ORDER;

	/**
	 * The operation id for the '<em>Cash Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___CASH_REGISTER = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Maximum Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___MAXIMUM_CHANGE = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Dollars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___ADD_DOLLARS__INT = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Quarters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___ADD_QUARTERS__INT = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Dimes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___ADD_DIMES__INT = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Nickels</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___ADD_NICKELS__INT = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___ADD_RECEIPT = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Take Out Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER___TAKE_OUT_CHANGE__DOUBLE = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Cash Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER_OPERATION_COUNT = VIRTUAL_VENDING_MACHINE_OPERATION_COUNT + 8;

	/**
	 * The feature id for the '<em><b>MsCurrent Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY__MSCURRENT_OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Modl Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY__MODL_LISTENER = 1;

	/**
	 * The number of structural features of the '<em>Output Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Display String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY___DISPLAY_STRING__STRING = 0;

	/**
	 * The operation id for the '<em>Set Output Display Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY___SET_OUTPUT_DISPLAY_LISTENER__IOUTPUTDISPLAYLISTENER = 1;

	/**
	 * The number of operations of the '<em>Output Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>MdMaximum Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MDMAXIMUM_BALANCE = 0;

	/**
	 * The feature id for the '<em><b>MdBalance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MDBALANCE = 1;

	/**
	 * The feature id for the '<em><b>MbOut Of Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MBOUT_OF_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Mpml Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MPML_LISTENER = 3;

	/**
	 * The feature id for the '<em><b>Mcr Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MCR_REGISTER = 4;

	/**
	 * The feature id for the '<em><b>Mvvm Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MVVM_OWNER = 5;

	/**
	 * The number of structural features of the '<em>Pay Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Pay Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___PAY_MACHINE__VIRTUALVENDINGMACHINE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Set Pay Machine Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___SET_PAY_MACHINE_LISTENER__IPAYMACHINELISTENER = 1;

	/**
	 * The operation id for the '<em>Get Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___GET_BALANCE = 2;

	/**
	 * The operation id for the '<em>Insert Quarter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___INSERT_QUARTER = 3;

	/**
	 * The operation id for the '<em>Insert Dime</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___INSERT_DIME = 4;

	/**
	 * The operation id for the '<em>Insert Nickel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___INSERT_NICKEL = 5;

	/**
	 * The operation id for the '<em>Insert Dollar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___INSERT_DOLLAR = 6;

	/**
	 * The operation id for the '<em>Insert Suncard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___INSERT_SUNCARD__INT = 7;

	/**
	 * The operation id for the '<em>Return Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___RETURN_CHANGE = 8;

	/**
	 * The operation id for the '<em>Deduct Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___DEDUCT_BALANCE__DOUBLE = 9;

	/**
	 * The operation id for the '<em>Clear Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE___CLEAR_BALANCE = 10;

	/**
	 * The number of operations of the '<em>Pay Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.ProductDispenserImpl <em>Product Dispenser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.ProductDispenserImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getProductDispenser()
	 * @generated
	 */
	int PRODUCT_DISPENSER = 10;

	/**
	 * The feature id for the '<em><b>Mpdl Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISPENSER__MPDL_LISTENER = 0;

	/**
	 * The number of structural features of the '<em>Product Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISPENSER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Dispense Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISPENSER___DISPENSE_PRODUCT__IPRODUCTINFO = 0;

	/**
	 * The operation id for the '<em>Set Product Dispenser Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISPENSER___SET_PRODUCT_DISPENSER_LISTENER__IPRODUCTDISPENSERLISTENER = 1;

	/**
	 * The number of operations of the '<em>Product Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISPENSER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.ProductSelectorImpl <em>Product Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.ProductSelectorImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getProductSelector()
	 * @generated
	 */
	int PRODUCT_SELECTOR = 11;

	/**
	 * The feature id for the '<em><b>Mpsl Listener</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR__MPSL_LISTENER = 0;

	/**
	 * The feature id for the '<em><b>Mpi Selected Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR__MPI_SELECTED_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Mvvm Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR__MVVM_MACHINE = 2;

	/**
	 * The number of structural features of the '<em>Product Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Product Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR___PRODUCT_SELECTOR__VIRTUALVENDINGMACHINE = 0;

	/**
	 * The operation id for the '<em>Display Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR___DISPLAY_PRODUCTS = 1;

	/**
	 * The operation id for the '<em>Set Product Selector Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR___SET_PRODUCT_SELECTOR_LISTENER__IPRODUCTSELECTORLISTENER = 2;

	/**
	 * The operation id for the '<em>Show Product Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR___SHOW_PRODUCT_DESC__IPRODUCTINFO = 3;

	/**
	 * The operation id for the '<em>Buy Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR___BUY_ITEM__IPRODUCTINFO = 4;

	/**
	 * The operation id for the '<em>Set Selected Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR___SET_SELECTED_ITEM__IPRODUCTINFO = 5;

	/**
	 * The number of operations of the '<em>Product Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.SuncardReceiptImpl <em>Suncard Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.SuncardReceiptImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getSuncardReceipt()
	 * @generated
	 */
	int SUNCARD_RECEIPT = 12;

	/**
	 * The feature id for the '<em><b>MiAccount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUNCARD_RECEIPT__MIACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>MdAmount Deducted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUNCARD_RECEIPT__MDAMOUNT_DEDUCTED = 1;

	/**
	 * The number of structural features of the '<em>Suncard Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUNCARD_RECEIPT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Suncard Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUNCARD_RECEIPT___SUNCARD_RECEIPT__INT_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Get Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUNCARD_RECEIPT___GET_ACCOUNT = 1;

	/**
	 * The operation id for the '<em>Get Amount Deducted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUNCARD_RECEIPT___GET_AMOUNT_DEDUCTED = 2;

	/**
	 * The number of operations of the '<em>Suncard Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUNCARD_RECEIPT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link vendingMachine.vendingMachine.vendsys.impl.CoinCountImpl <em>Coin Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachine.vendingMachine.vendsys.impl.CoinCountImpl
	 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getCoinCount()
	 * @generated
	 */
	int COIN_COUNT = 13;

	/**
	 * The feature id for the '<em><b>NUM QUARTERS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIN_COUNT__NUM_QUARTERS = 0;

	/**
	 * The feature id for the '<em><b>NUM DIMES</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIN_COUNT__NUM_DIMES = 1;

	/**
	 * The feature id for the '<em><b>NUM NICKELS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIN_COUNT__NUM_NICKELS = 2;

	/**
	 * The feature id for the '<em><b>Coins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIN_COUNT__COINS = 3;

	/**
	 * The number of structural features of the '<em>Coin Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIN_COUNT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Coin Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIN_COUNT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.IPayMachineListener <em>IPay Machine Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPay Machine Listener</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.IPayMachineListener
	 * @generated
	 */
	EClass getIPayMachineListener();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IPayMachineListener#returnChange(int, int, int) <em>Return Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Change</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IPayMachineListener#returnChange(int, int, int)
	 * @generated
	 */
	EOperation getIPayMachineListener__ReturnChange__int_int_int();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IPayMachineListener#balanceUpdated(double) <em>Balance Updated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Balance Updated</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IPayMachineListener#balanceUpdated(double)
	 * @generated
	 */
	EOperation getIPayMachineListener__BalanceUpdated__double();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.IProductDatabase <em>IProduct Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProduct Database</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.IProductDatabase
	 * @generated
	 */
	EClass getIProductDatabase();

	/**
	 * Returns the meta object for the reference list '{@link vendingMachine.vendingMachine.vendsys.IProductDatabase#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.IProductDatabase#getProduct()
	 * @see #getIProductDatabase()
	 * @generated
	 */
	EReference getIProductDatabase_Product();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachine.vendingMachine.vendsys.IProductDatabase#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realizes</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.IProductDatabase#getRealizes()
	 * @see #getIProductDatabase()
	 * @generated
	 */
	EReference getIProductDatabase_Realizes();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductDatabase#getProducts() <em>Get Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Products</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductDatabase#getProducts()
	 * @generated
	 */
	EOperation getIProductDatabase__GetProducts();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductDatabase#decrementQuantity() <em>Decrement Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decrement Quantity</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductDatabase#decrementQuantity()
	 * @generated
	 */
	EOperation getIProductDatabase__DecrementQuantity();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.IProductInfo <em>IProduct Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProduct Info</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.IProductInfo
	 * @generated
	 */
	EClass getIProductInfo();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductInfo#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductInfo#getID()
	 * @generated
	 */
	EOperation getIProductInfo__GetID();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductInfo#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductInfo#getName()
	 * @generated
	 */
	EOperation getIProductInfo__GetName();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductInfo#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductInfo#getDescription()
	 * @generated
	 */
	EOperation getIProductInfo__GetDescription();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductInfo#getIcon() <em>Get Icon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Icon</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductInfo#getIcon()
	 * @generated
	 */
	EOperation getIProductInfo__GetIcon();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductInfo#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductInfo#getPrice()
	 * @generated
	 */
	EOperation getIProductInfo__GetPrice();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductInfo#getQuantity() <em>Get Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Quantity</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductInfo#getQuantity()
	 * @generated
	 */
	EOperation getIProductInfo__GetQuantity();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.IProductDispenserListener <em>IProduct Dispenser Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProduct Dispenser Listener</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.IProductDispenserListener
	 * @generated
	 */
	EClass getIProductDispenserListener();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductDispenserListener#dispenseProduct(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Dispense Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispense Product</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductDispenserListener#dispenseProduct(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getIProductDispenserListener__DispenseProduct__IProductInfo();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.IProductSelectorListener <em>IProduct Selector Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProduct Selector Listener</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.IProductSelectorListener
	 * @generated
	 */
	EClass getIProductSelectorListener();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductSelectorListener#updateDisplay(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Update Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Display</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductSelectorListener#updateDisplay(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getIProductSelectorListener__UpdateDisplay__IProductInfo();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductSelectorListener#itemSelected(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Item Selected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Item Selected</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductSelectorListener#itemSelected(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getIProductSelectorListener__ItemSelected__IProductInfo();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IProductSelectorListener#itemDeselected(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Item Deselected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Item Deselected</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IProductSelectorListener#itemDeselected(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getIProductSelectorListener__ItemDeselected__IProductInfo();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.IOutputDisplayListener <em>IOutput Display Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOutput Display Listener</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.IOutputDisplayListener
	 * @generated
	 */
	EClass getIOutputDisplayListener();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.IOutputDisplayListener#updateDisplay(java.lang.String) <em>Update Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Display</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.IOutputDisplayListener#updateDisplay(java.lang.String)
	 * @generated
	 */
	EOperation getIOutputDisplayListener__UpdateDisplay__String();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.CashRegister <em>Cash Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash Register</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister
	 * @generated
	 */
	EClass getCashRegister();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.CashRegister#getM_iNumQuarters <em>MiNum Quarters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiNum Quarters</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#getM_iNumQuarters()
	 * @see #getCashRegister()
	 * @generated
	 */
	EAttribute getCashRegister_M_iNumQuarters();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.CashRegister#getM_iNumDimes <em>MiNum Dimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiNum Dimes</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#getM_iNumDimes()
	 * @see #getCashRegister()
	 * @generated
	 */
	EAttribute getCashRegister_M_iNumDimes();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.CashRegister#getM_iNumNickels <em>MiNum Nickels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiNum Nickels</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#getM_iNumNickels()
	 * @see #getCashRegister()
	 * @generated
	 */
	EAttribute getCashRegister_M_iNumNickels();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.CashRegister#getM_iNumDollars <em>MiNum Dollars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiNum Dollars</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#getM_iNumDollars()
	 * @see #getCashRegister()
	 * @generated
	 */
	EAttribute getCashRegister_M_iNumDollars();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachine.vendingMachine.vendsys.CashRegister#getM_alReceipts <em>Mal Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mal Receipts</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#getM_alReceipts()
	 * @see #getCashRegister()
	 * @generated
	 */
	EReference getCashRegister_M_alReceipts();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.CashRegister#CashRegister() <em>Cash Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cash Register</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#CashRegister()
	 * @generated
	 */
	EOperation getCashRegister__CashRegister();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.CashRegister#maximumChange() <em>Maximum Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Maximum Change</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#maximumChange()
	 * @generated
	 */
	EOperation getCashRegister__MaximumChange();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.CashRegister#addDollars(int) <em>Add Dollars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Dollars</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#addDollars(int)
	 * @generated
	 */
	EOperation getCashRegister__AddDollars__int();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.CashRegister#addQuarters(int) <em>Add Quarters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Quarters</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#addQuarters(int)
	 * @generated
	 */
	EOperation getCashRegister__AddQuarters__int();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.CashRegister#addDimes(int) <em>Add Dimes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Dimes</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#addDimes(int)
	 * @generated
	 */
	EOperation getCashRegister__AddDimes__int();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.CashRegister#addNickels(int) <em>Add Nickels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Nickels</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#addNickels(int)
	 * @generated
	 */
	EOperation getCashRegister__AddNickels__int();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.CashRegister#addReceipt() <em>Add Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Receipt</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#addReceipt()
	 * @generated
	 */
	EOperation getCashRegister__AddReceipt();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.CashRegister#takeOutChange(double) <em>Take Out Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Out Change</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.CashRegister#takeOutChange(double)
	 * @generated
	 */
	EOperation getCashRegister__TakeOutChange__double();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.OutputDisplay <em>Output Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Display</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.OutputDisplay
	 * @generated
	 */
	EClass getOutputDisplay();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.OutputDisplay#getM_sCurrentOutput <em>MsCurrent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MsCurrent Output</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.OutputDisplay#getM_sCurrentOutput()
	 * @see #getOutputDisplay()
	 * @generated
	 */
	EAttribute getOutputDisplay_M_sCurrentOutput();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.OutputDisplay#getM_odlListener <em>Modl Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modl Listener</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.OutputDisplay#getM_odlListener()
	 * @see #getOutputDisplay()
	 * @generated
	 */
	EReference getOutputDisplay_M_odlListener();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.OutputDisplay#displayString(java.lang.String) <em>Display String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display String</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.OutputDisplay#displayString(java.lang.String)
	 * @generated
	 */
	EOperation getOutputDisplay__DisplayString__String();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.OutputDisplay#setOutputDisplayListener(vendingMachine.vendingMachine.vendsys.IOutputDisplayListener) <em>Set Output Display Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Output Display Listener</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.OutputDisplay#setOutputDisplayListener(vendingMachine.vendingMachine.vendsys.IOutputDisplayListener)
	 * @generated
	 */
	EOperation getOutputDisplay__SetOutputDisplayListener__IOutputDisplayListener();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.PayMachine <em>Pay Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pay Machine</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine
	 * @generated
	 */
	EClass getPayMachine();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.PayMachine#getM_dMaximumBalance <em>MdMaximum Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MdMaximum Balance</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#getM_dMaximumBalance()
	 * @see #getPayMachine()
	 * @generated
	 */
	EAttribute getPayMachine_M_dMaximumBalance();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.PayMachine#getM_dBalance <em>MdBalance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MdBalance</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#getM_dBalance()
	 * @see #getPayMachine()
	 * @generated
	 */
	EAttribute getPayMachine_M_dBalance();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.PayMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MbOut Of Order</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#isM_bOutOfOrder()
	 * @see #getPayMachine()
	 * @generated
	 */
	EAttribute getPayMachine_M_bOutOfOrder();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.PayMachine#getM_pmlListener <em>Mpml Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mpml Listener</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#getM_pmlListener()
	 * @see #getPayMachine()
	 * @generated
	 */
	EReference getPayMachine_M_pmlListener();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.PayMachine#getM_crRegister <em>Mcr Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mcr Register</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#getM_crRegister()
	 * @see #getPayMachine()
	 * @generated
	 */
	EReference getPayMachine_M_crRegister();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.PayMachine#getM_vvmOwner <em>Mvvm Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mvvm Owner</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#getM_vvmOwner()
	 * @see #getPayMachine()
	 * @generated
	 */
	EReference getPayMachine_M_vvmOwner();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#PayMachine(vendingMachine.vendingMachine.vendsys.VirtualVendingMachine, double) <em>Pay Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Machine</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#PayMachine(vendingMachine.vendingMachine.vendsys.VirtualVendingMachine, double)
	 * @generated
	 */
	EOperation getPayMachine__PayMachine__VirtualVendingMachine_double();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#setPayMachineListener(vendingMachine.vendingMachine.vendsys.IPayMachineListener) <em>Set Pay Machine Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Pay Machine Listener</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#setPayMachineListener(vendingMachine.vendingMachine.vendsys.IPayMachineListener)
	 * @generated
	 */
	EOperation getPayMachine__SetPayMachineListener__IPayMachineListener();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#getBalance() <em>Get Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Balance</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#getBalance()
	 * @generated
	 */
	EOperation getPayMachine__GetBalance();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#insertQuarter() <em>Insert Quarter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Insert Quarter</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#insertQuarter()
	 * @generated
	 */
	EOperation getPayMachine__InsertQuarter();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#insertDime() <em>Insert Dime</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Insert Dime</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#insertDime()
	 * @generated
	 */
	EOperation getPayMachine__InsertDime();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#insertNickel() <em>Insert Nickel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Insert Nickel</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#insertNickel()
	 * @generated
	 */
	EOperation getPayMachine__InsertNickel();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#insertDollar() <em>Insert Dollar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Insert Dollar</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#insertDollar()
	 * @generated
	 */
	EOperation getPayMachine__InsertDollar();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#insertSuncard(int) <em>Insert Suncard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Insert Suncard</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#insertSuncard(int)
	 * @generated
	 */
	EOperation getPayMachine__InsertSuncard__int();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#returnChange() <em>Return Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Change</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#returnChange()
	 * @generated
	 */
	EOperation getPayMachine__ReturnChange();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#deductBalance(double) <em>Deduct Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deduct Balance</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#deductBalance(double)
	 * @generated
	 */
	EOperation getPayMachine__DeductBalance__double();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.PayMachine#clearBalance() <em>Clear Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Balance</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.PayMachine#clearBalance()
	 * @generated
	 */
	EOperation getPayMachine__ClearBalance();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine <em>Virtual Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Vending Machine</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine
	 * @generated
	 */
	EClass getVirtualVendingMachine();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MbOut Of Order</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#isM_bOutOfOrder()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EAttribute getVirtualVendingMachine_M_bOutOfOrder();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_pdProducts <em>Mpd Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mpd Products</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_pdProducts()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_pdProducts();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_odOutputDisplay <em>Mod Output Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mod Output Display</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_odOutputDisplay()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_odOutputDisplay();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_pdDispenser <em>Mpd Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mpd Dispenser</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_pdDispenser()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_pdDispenser();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_pmPayMachine <em>Mpm Pay Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mpm Pay Machine</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_pmPayMachine()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_pmPayMachine();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_psProductSelector <em>Mps Product Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mps Product Selector</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getM_psProductSelector()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_psProductSelector();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#VirtualVendingMachine(vendingMachine.vendingMachine.vendsys.IProductDatabase) <em>Virtual Vending Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Virtual Vending Machine</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#VirtualVendingMachine(vendingMachine.vendingMachine.vendsys.IProductDatabase)
	 * @generated
	 */
	EOperation getVirtualVendingMachine__VirtualVendingMachine__IProductDatabase();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getProducts() <em>Get Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Products</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getProducts()
	 * @generated
	 */
	EOperation getVirtualVendingMachine__GetProducts();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getProductSelector() <em>Get Product Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product Selector</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getProductSelector()
	 * @generated
	 */
	EOperation getVirtualVendingMachine__GetProductSelector();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getOutputDisplay() <em>Get Output Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output Display</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getOutputDisplay()
	 * @generated
	 */
	EOperation getVirtualVendingMachine__GetOutputDisplay();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getPayMachine() <em>Get Pay Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pay Machine</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getPayMachine()
	 * @generated
	 */
	EOperation getVirtualVendingMachine__GetPayMachine();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getProductDispenser() <em>Get Product Dispenser</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product Dispenser</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#getProductDispenser()
	 * @generated
	 */
	EOperation getVirtualVendingMachine__GetProductDispenser();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#showProductDesc(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Show Product Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Product Desc</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#showProductDesc(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getVirtualVendingMachine__ShowProductDesc__IProductInfo();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#buyItem(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Buy Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buy Item</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#buyItem(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getVirtualVendingMachine__BuyItem__IProductInfo();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#goOutOfOrder() <em>Go Out Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Go Out Of Order</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.VirtualVendingMachine#goOutOfOrder()
	 * @generated
	 */
	EOperation getVirtualVendingMachine__GoOutOfOrder();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.ProductDispenser <em>Product Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Dispenser</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.ProductDispenser
	 * @generated
	 */
	EClass getProductDispenser();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.ProductDispenser#getM_pdlListener <em>Mpdl Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mpdl Listener</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.ProductDispenser#getM_pdlListener()
	 * @see #getProductDispenser()
	 * @generated
	 */
	EReference getProductDispenser_M_pdlListener();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.ProductDispenser#dispenseProduct(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Dispense Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispense Product</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.ProductDispenser#dispenseProduct(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getProductDispenser__DispenseProduct__IProductInfo();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.ProductDispenser#setProductDispenserListener(vendingMachine.vendingMachine.vendsys.IProductDispenserListener) <em>Set Product Dispenser Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Product Dispenser Listener</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.ProductDispenser#setProductDispenserListener(vendingMachine.vendingMachine.vendsys.IProductDispenserListener)
	 * @generated
	 */
	EOperation getProductDispenser__SetProductDispenserListener__IProductDispenserListener();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.ProductSelector <em>Product Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Selector</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector
	 * @generated
	 */
	EClass getProductSelector();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#getM_pslListener <em>Mpsl Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mpsl Listener</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#getM_pslListener()
	 * @see #getProductSelector()
	 * @generated
	 */
	EReference getProductSelector_M_pslListener();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#getM_piSelectedItem <em>Mpi Selected Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mpi Selected Item</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#getM_piSelectedItem()
	 * @see #getProductSelector()
	 * @generated
	 */
	EReference getProductSelector_M_piSelectedItem();

	/**
	 * Returns the meta object for the reference '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#getM_vvmMachine <em>Mvvm Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mvvm Machine</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#getM_vvmMachine()
	 * @see #getProductSelector()
	 * @generated
	 */
	EReference getProductSelector_M_vvmMachine();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#ProductSelector(vendingMachine.vendingMachine.vendsys.VirtualVendingMachine) <em>Product Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Selector</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#ProductSelector(vendingMachine.vendingMachine.vendsys.VirtualVendingMachine)
	 * @generated
	 */
	EOperation getProductSelector__ProductSelector__VirtualVendingMachine();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#displayProducts() <em>Display Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Products</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#displayProducts()
	 * @generated
	 */
	EOperation getProductSelector__DisplayProducts();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#setProductSelectorListener(vendingMachine.vendingMachine.vendsys.IProductSelectorListener) <em>Set Product Selector Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Product Selector Listener</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#setProductSelectorListener(vendingMachine.vendingMachine.vendsys.IProductSelectorListener)
	 * @generated
	 */
	EOperation getProductSelector__SetProductSelectorListener__IProductSelectorListener();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#showProductDesc(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Show Product Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Product Desc</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#showProductDesc(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getProductSelector__ShowProductDesc__IProductInfo();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#buyItem(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Buy Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buy Item</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#buyItem(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getProductSelector__BuyItem__IProductInfo();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.ProductSelector#setSelectedItem(vendingMachine.vendingMachine.vendsys.IProductInfo) <em>Set Selected Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selected Item</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.ProductSelector#setSelectedItem(vendingMachine.vendingMachine.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getProductSelector__SetSelectedItem__IProductInfo();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.SuncardReceipt <em>Suncard Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suncard Receipt</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.SuncardReceipt
	 * @generated
	 */
	EClass getSuncardReceipt();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.SuncardReceipt#getM_iAccount <em>MiAccount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiAccount</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.SuncardReceipt#getM_iAccount()
	 * @see #getSuncardReceipt()
	 * @generated
	 */
	EAttribute getSuncardReceipt_M_iAccount();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.SuncardReceipt#getM_dAmountDeducted <em>MdAmount Deducted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MdAmount Deducted</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.SuncardReceipt#getM_dAmountDeducted()
	 * @see #getSuncardReceipt()
	 * @generated
	 */
	EAttribute getSuncardReceipt_M_dAmountDeducted();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.SuncardReceipt#SuncardReceipt(int, double) <em>Suncard Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suncard Receipt</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.SuncardReceipt#SuncardReceipt(int, double)
	 * @generated
	 */
	EOperation getSuncardReceipt__SuncardReceipt__int_double();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.SuncardReceipt#getAccount() <em>Get Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Account</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.SuncardReceipt#getAccount()
	 * @generated
	 */
	EOperation getSuncardReceipt__GetAccount();

	/**
	 * Returns the meta object for the '{@link vendingMachine.vendingMachine.vendsys.SuncardReceipt#getAmountDeducted() <em>Get Amount Deducted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount Deducted</em>' operation.
	 * @see vendingMachine.vendingMachine.vendsys.SuncardReceipt#getAmountDeducted()
	 * @generated
	 */
	EOperation getSuncardReceipt__GetAmountDeducted();

	/**
	 * Returns the meta object for class '{@link vendingMachine.vendingMachine.vendsys.CoinCount <em>Coin Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coin Count</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CoinCount
	 * @generated
	 */
	EClass getCoinCount();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_QUARTERS <em>NUM QUARTERS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NUM QUARTERS</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_QUARTERS()
	 * @see #getCoinCount()
	 * @generated
	 */
	EAttribute getCoinCount_NUM_QUARTERS();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_DIMES <em>NUM DIMES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NUM DIMES</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_DIMES()
	 * @see #getCoinCount()
	 * @generated
	 */
	EAttribute getCoinCount_NUM_DIMES();

	/**
	 * Returns the meta object for the attribute '{@link vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_NICKELS <em>NUM NICKELS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NUM NICKELS</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CoinCount#getNUM_NICKELS()
	 * @see #getCoinCount()
	 * @generated
	 */
	EAttribute getCoinCount_NUM_NICKELS();

	/**
	 * Returns the meta object for the containment reference '{@link vendingMachine.vendingMachine.vendsys.CoinCount#getCoins <em>Coins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coins</em>'.
	 * @see vendingMachine.vendingMachine.vendsys.CoinCount#getCoins()
	 * @see #getCoinCount()
	 * @generated
	 */
	EReference getCoinCount_Coins();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VendsysFactory getVendsysFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.IPayMachineListener <em>IPay Machine Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.IPayMachineListener
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIPayMachineListener()
		 * @generated
		 */
		EClass IPAY_MACHINE_LISTENER = eINSTANCE.getIPayMachineListener();

		/**
		 * The meta object literal for the '<em><b>Return Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPAY_MACHINE_LISTENER___RETURN_CHANGE__INT_INT_INT = eINSTANCE.getIPayMachineListener__ReturnChange__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Balance Updated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPAY_MACHINE_LISTENER___BALANCE_UPDATED__DOUBLE = eINSTANCE.getIPayMachineListener__BalanceUpdated__double();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.IProductDatabaseImpl <em>IProduct Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.IProductDatabaseImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIProductDatabase()
		 * @generated
		 */
		EClass IPRODUCT_DATABASE = eINSTANCE.getIProductDatabase();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPRODUCT_DATABASE__PRODUCT = eINSTANCE.getIProductDatabase_Product();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPRODUCT_DATABASE__REALIZES = eINSTANCE.getIProductDatabase_Realizes();

		/**
		 * The meta object literal for the '<em><b>Get Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_DATABASE___GET_PRODUCTS = eINSTANCE.getIProductDatabase__GetProducts();

		/**
		 * The meta object literal for the '<em><b>Decrement Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_DATABASE___DECREMENT_QUANTITY = eINSTANCE.getIProductDatabase__DecrementQuantity();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.IProductInfo <em>IProduct Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.IProductInfo
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIProductInfo()
		 * @generated
		 */
		EClass IPRODUCT_INFO = eINSTANCE.getIProductInfo();

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_INFO___GET_ID = eINSTANCE.getIProductInfo__GetID();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_INFO___GET_NAME = eINSTANCE.getIProductInfo__GetName();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_INFO___GET_DESCRIPTION = eINSTANCE.getIProductInfo__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Get Icon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_INFO___GET_ICON = eINSTANCE.getIProductInfo__GetIcon();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_INFO___GET_PRICE = eINSTANCE.getIProductInfo__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Get Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_INFO___GET_QUANTITY = eINSTANCE.getIProductInfo__GetQuantity();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.IProductDispenserListener <em>IProduct Dispenser Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.IProductDispenserListener
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIProductDispenserListener()
		 * @generated
		 */
		EClass IPRODUCT_DISPENSER_LISTENER = eINSTANCE.getIProductDispenserListener();

		/**
		 * The meta object literal for the '<em><b>Dispense Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_DISPENSER_LISTENER___DISPENSE_PRODUCT__IPRODUCTINFO = eINSTANCE.getIProductDispenserListener__DispenseProduct__IProductInfo();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.IProductSelectorListener <em>IProduct Selector Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.IProductSelectorListener
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIProductSelectorListener()
		 * @generated
		 */
		EClass IPRODUCT_SELECTOR_LISTENER = eINSTANCE.getIProductSelectorListener();

		/**
		 * The meta object literal for the '<em><b>Update Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_SELECTOR_LISTENER___UPDATE_DISPLAY__IPRODUCTINFO = eINSTANCE.getIProductSelectorListener__UpdateDisplay__IProductInfo();

		/**
		 * The meta object literal for the '<em><b>Item Selected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_SELECTOR_LISTENER___ITEM_SELECTED__IPRODUCTINFO = eINSTANCE.getIProductSelectorListener__ItemSelected__IProductInfo();

		/**
		 * The meta object literal for the '<em><b>Item Deselected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPRODUCT_SELECTOR_LISTENER___ITEM_DESELECTED__IPRODUCTINFO = eINSTANCE.getIProductSelectorListener__ItemDeselected__IProductInfo();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.IOutputDisplayListener <em>IOutput Display Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.IOutputDisplayListener
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getIOutputDisplayListener()
		 * @generated
		 */
		EClass IOUTPUT_DISPLAY_LISTENER = eINSTANCE.getIOutputDisplayListener();

		/**
		 * The meta object literal for the '<em><b>Update Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOUTPUT_DISPLAY_LISTENER___UPDATE_DISPLAY__STRING = eINSTANCE.getIOutputDisplayListener__UpdateDisplay__String();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl <em>Cash Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.CashRegisterImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getCashRegister()
		 * @generated
		 */
		EClass CASH_REGISTER = eINSTANCE.getCashRegister();

		/**
		 * The meta object literal for the '<em><b>MiNum Quarters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_REGISTER__MINUM_QUARTERS = eINSTANCE.getCashRegister_M_iNumQuarters();

		/**
		 * The meta object literal for the '<em><b>MiNum Dimes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_REGISTER__MINUM_DIMES = eINSTANCE.getCashRegister_M_iNumDimes();

		/**
		 * The meta object literal for the '<em><b>MiNum Nickels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_REGISTER__MINUM_NICKELS = eINSTANCE.getCashRegister_M_iNumNickels();

		/**
		 * The meta object literal for the '<em><b>MiNum Dollars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_REGISTER__MINUM_DOLLARS = eINSTANCE.getCashRegister_M_iNumDollars();

		/**
		 * The meta object literal for the '<em><b>Mal Receipts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASH_REGISTER__MAL_RECEIPTS = eINSTANCE.getCashRegister_M_alReceipts();

		/**
		 * The meta object literal for the '<em><b>Cash Register</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_REGISTER___CASH_REGISTER = eINSTANCE.getCashRegister__CashRegister();

		/**
		 * The meta object literal for the '<em><b>Maximum Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_REGISTER___MAXIMUM_CHANGE = eINSTANCE.getCashRegister__MaximumChange();

		/**
		 * The meta object literal for the '<em><b>Add Dollars</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_REGISTER___ADD_DOLLARS__INT = eINSTANCE.getCashRegister__AddDollars__int();

		/**
		 * The meta object literal for the '<em><b>Add Quarters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_REGISTER___ADD_QUARTERS__INT = eINSTANCE.getCashRegister__AddQuarters__int();

		/**
		 * The meta object literal for the '<em><b>Add Dimes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_REGISTER___ADD_DIMES__INT = eINSTANCE.getCashRegister__AddDimes__int();

		/**
		 * The meta object literal for the '<em><b>Add Nickels</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_REGISTER___ADD_NICKELS__INT = eINSTANCE.getCashRegister__AddNickels__int();

		/**
		 * The meta object literal for the '<em><b>Add Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_REGISTER___ADD_RECEIPT = eINSTANCE.getCashRegister__AddReceipt();

		/**
		 * The meta object literal for the '<em><b>Take Out Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH_REGISTER___TAKE_OUT_CHANGE__DOUBLE = eINSTANCE.getCashRegister__TakeOutChange__double();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.OutputDisplayImpl <em>Output Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.OutputDisplayImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getOutputDisplay()
		 * @generated
		 */
		EClass OUTPUT_DISPLAY = eINSTANCE.getOutputDisplay();

		/**
		 * The meta object literal for the '<em><b>MsCurrent Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISPLAY__MSCURRENT_OUTPUT = eINSTANCE.getOutputDisplay_M_sCurrentOutput();

		/**
		 * The meta object literal for the '<em><b>Modl Listener</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DISPLAY__MODL_LISTENER = eINSTANCE.getOutputDisplay_M_odlListener();

		/**
		 * The meta object literal for the '<em><b>Display String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_DISPLAY___DISPLAY_STRING__STRING = eINSTANCE.getOutputDisplay__DisplayString__String();

		/**
		 * The meta object literal for the '<em><b>Set Output Display Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_DISPLAY___SET_OUTPUT_DISPLAY_LISTENER__IOUTPUTDISPLAYLISTENER = eINSTANCE.getOutputDisplay__SetOutputDisplayListener__IOutputDisplayListener();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.PayMachineImpl <em>Pay Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.PayMachineImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getPayMachine()
		 * @generated
		 */
		EClass PAY_MACHINE = eINSTANCE.getPayMachine();

		/**
		 * The meta object literal for the '<em><b>MdMaximum Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_MACHINE__MDMAXIMUM_BALANCE = eINSTANCE.getPayMachine_M_dMaximumBalance();

		/**
		 * The meta object literal for the '<em><b>MdBalance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_MACHINE__MDBALANCE = eINSTANCE.getPayMachine_M_dBalance();

		/**
		 * The meta object literal for the '<em><b>MbOut Of Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_MACHINE__MBOUT_OF_ORDER = eINSTANCE.getPayMachine_M_bOutOfOrder();

		/**
		 * The meta object literal for the '<em><b>Mpml Listener</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAY_MACHINE__MPML_LISTENER = eINSTANCE.getPayMachine_M_pmlListener();

		/**
		 * The meta object literal for the '<em><b>Mcr Register</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAY_MACHINE__MCR_REGISTER = eINSTANCE.getPayMachine_M_crRegister();

		/**
		 * The meta object literal for the '<em><b>Mvvm Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAY_MACHINE__MVVM_OWNER = eINSTANCE.getPayMachine_M_vvmOwner();

		/**
		 * The meta object literal for the '<em><b>Pay Machine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___PAY_MACHINE__VIRTUALVENDINGMACHINE_DOUBLE = eINSTANCE.getPayMachine__PayMachine__VirtualVendingMachine_double();

		/**
		 * The meta object literal for the '<em><b>Set Pay Machine Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___SET_PAY_MACHINE_LISTENER__IPAYMACHINELISTENER = eINSTANCE.getPayMachine__SetPayMachineListener__IPayMachineListener();

		/**
		 * The meta object literal for the '<em><b>Get Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___GET_BALANCE = eINSTANCE.getPayMachine__GetBalance();

		/**
		 * The meta object literal for the '<em><b>Insert Quarter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___INSERT_QUARTER = eINSTANCE.getPayMachine__InsertQuarter();

		/**
		 * The meta object literal for the '<em><b>Insert Dime</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___INSERT_DIME = eINSTANCE.getPayMachine__InsertDime();

		/**
		 * The meta object literal for the '<em><b>Insert Nickel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___INSERT_NICKEL = eINSTANCE.getPayMachine__InsertNickel();

		/**
		 * The meta object literal for the '<em><b>Insert Dollar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___INSERT_DOLLAR = eINSTANCE.getPayMachine__InsertDollar();

		/**
		 * The meta object literal for the '<em><b>Insert Suncard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___INSERT_SUNCARD__INT = eINSTANCE.getPayMachine__InsertSuncard__int();

		/**
		 * The meta object literal for the '<em><b>Return Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___RETURN_CHANGE = eINSTANCE.getPayMachine__ReturnChange();

		/**
		 * The meta object literal for the '<em><b>Deduct Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___DEDUCT_BALANCE__DOUBLE = eINSTANCE.getPayMachine__DeductBalance__double();

		/**
		 * The meta object literal for the '<em><b>Clear Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAY_MACHINE___CLEAR_BALANCE = eINSTANCE.getPayMachine__ClearBalance();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl <em>Virtual Vending Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.VirtualVendingMachineImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getVirtualVendingMachine()
		 * @generated
		 */
		EClass VIRTUAL_VENDING_MACHINE = eINSTANCE.getVirtualVendingMachine();

		/**
		 * The meta object literal for the '<em><b>MbOut Of Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER = eINSTANCE.getVirtualVendingMachine_M_bOutOfOrder();

		/**
		 * The meta object literal for the '<em><b>Mpd Products</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS = eINSTANCE.getVirtualVendingMachine_M_pdProducts();

		/**
		 * The meta object literal for the '<em><b>Mod Output Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY = eINSTANCE.getVirtualVendingMachine_M_odOutputDisplay();

		/**
		 * The meta object literal for the '<em><b>Mpd Dispenser</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MPD_DISPENSER = eINSTANCE.getVirtualVendingMachine_M_pdDispenser();

		/**
		 * The meta object literal for the '<em><b>Mpm Pay Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE = eINSTANCE.getVirtualVendingMachine_M_pmPayMachine();

		/**
		 * The meta object literal for the '<em><b>Mps Product Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR = eINSTANCE.getVirtualVendingMachine_M_psProductSelector();

		/**
		 * The meta object literal for the '<em><b>Virtual Vending Machine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___VIRTUAL_VENDING_MACHINE__IPRODUCTDATABASE = eINSTANCE.getVirtualVendingMachine__VirtualVendingMachine__IProductDatabase();

		/**
		 * The meta object literal for the '<em><b>Get Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___GET_PRODUCTS = eINSTANCE.getVirtualVendingMachine__GetProducts();

		/**
		 * The meta object literal for the '<em><b>Get Product Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___GET_PRODUCT_SELECTOR = eINSTANCE.getVirtualVendingMachine__GetProductSelector();

		/**
		 * The meta object literal for the '<em><b>Get Output Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___GET_OUTPUT_DISPLAY = eINSTANCE.getVirtualVendingMachine__GetOutputDisplay();

		/**
		 * The meta object literal for the '<em><b>Get Pay Machine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___GET_PAY_MACHINE = eINSTANCE.getVirtualVendingMachine__GetPayMachine();

		/**
		 * The meta object literal for the '<em><b>Get Product Dispenser</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___GET_PRODUCT_DISPENSER = eINSTANCE.getVirtualVendingMachine__GetProductDispenser();

		/**
		 * The meta object literal for the '<em><b>Show Product Desc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___SHOW_PRODUCT_DESC__IPRODUCTINFO = eINSTANCE.getVirtualVendingMachine__ShowProductDesc__IProductInfo();

		/**
		 * The meta object literal for the '<em><b>Buy Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___BUY_ITEM__IPRODUCTINFO = eINSTANCE.getVirtualVendingMachine__BuyItem__IProductInfo();

		/**
		 * The meta object literal for the '<em><b>Go Out Of Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_VENDING_MACHINE___GO_OUT_OF_ORDER = eINSTANCE.getVirtualVendingMachine__GoOutOfOrder();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.ProductDispenserImpl <em>Product Dispenser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.ProductDispenserImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getProductDispenser()
		 * @generated
		 */
		EClass PRODUCT_DISPENSER = eINSTANCE.getProductDispenser();

		/**
		 * The meta object literal for the '<em><b>Mpdl Listener</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DISPENSER__MPDL_LISTENER = eINSTANCE.getProductDispenser_M_pdlListener();

		/**
		 * The meta object literal for the '<em><b>Dispense Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_DISPENSER___DISPENSE_PRODUCT__IPRODUCTINFO = eINSTANCE.getProductDispenser__DispenseProduct__IProductInfo();

		/**
		 * The meta object literal for the '<em><b>Set Product Dispenser Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_DISPENSER___SET_PRODUCT_DISPENSER_LISTENER__IPRODUCTDISPENSERLISTENER = eINSTANCE.getProductDispenser__SetProductDispenserListener__IProductDispenserListener();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.ProductSelectorImpl <em>Product Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.ProductSelectorImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getProductSelector()
		 * @generated
		 */
		EClass PRODUCT_SELECTOR = eINSTANCE.getProductSelector();

		/**
		 * The meta object literal for the '<em><b>Mpsl Listener</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SELECTOR__MPSL_LISTENER = eINSTANCE.getProductSelector_M_pslListener();

		/**
		 * The meta object literal for the '<em><b>Mpi Selected Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SELECTOR__MPI_SELECTED_ITEM = eINSTANCE.getProductSelector_M_piSelectedItem();

		/**
		 * The meta object literal for the '<em><b>Mvvm Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SELECTOR__MVVM_MACHINE = eINSTANCE.getProductSelector_M_vvmMachine();

		/**
		 * The meta object literal for the '<em><b>Product Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SELECTOR___PRODUCT_SELECTOR__VIRTUALVENDINGMACHINE = eINSTANCE.getProductSelector__ProductSelector__VirtualVendingMachine();

		/**
		 * The meta object literal for the '<em><b>Display Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SELECTOR___DISPLAY_PRODUCTS = eINSTANCE.getProductSelector__DisplayProducts();

		/**
		 * The meta object literal for the '<em><b>Set Product Selector Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SELECTOR___SET_PRODUCT_SELECTOR_LISTENER__IPRODUCTSELECTORLISTENER = eINSTANCE.getProductSelector__SetProductSelectorListener__IProductSelectorListener();

		/**
		 * The meta object literal for the '<em><b>Show Product Desc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SELECTOR___SHOW_PRODUCT_DESC__IPRODUCTINFO = eINSTANCE.getProductSelector__ShowProductDesc__IProductInfo();

		/**
		 * The meta object literal for the '<em><b>Buy Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SELECTOR___BUY_ITEM__IPRODUCTINFO = eINSTANCE.getProductSelector__BuyItem__IProductInfo();

		/**
		 * The meta object literal for the '<em><b>Set Selected Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SELECTOR___SET_SELECTED_ITEM__IPRODUCTINFO = eINSTANCE.getProductSelector__SetSelectedItem__IProductInfo();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.SuncardReceiptImpl <em>Suncard Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.SuncardReceiptImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getSuncardReceipt()
		 * @generated
		 */
		EClass SUNCARD_RECEIPT = eINSTANCE.getSuncardReceipt();

		/**
		 * The meta object literal for the '<em><b>MiAccount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUNCARD_RECEIPT__MIACCOUNT = eINSTANCE.getSuncardReceipt_M_iAccount();

		/**
		 * The meta object literal for the '<em><b>MdAmount Deducted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUNCARD_RECEIPT__MDAMOUNT_DEDUCTED = eINSTANCE.getSuncardReceipt_M_dAmountDeducted();

		/**
		 * The meta object literal for the '<em><b>Suncard Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUNCARD_RECEIPT___SUNCARD_RECEIPT__INT_DOUBLE = eINSTANCE.getSuncardReceipt__SuncardReceipt__int_double();

		/**
		 * The meta object literal for the '<em><b>Get Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUNCARD_RECEIPT___GET_ACCOUNT = eINSTANCE.getSuncardReceipt__GetAccount();

		/**
		 * The meta object literal for the '<em><b>Get Amount Deducted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUNCARD_RECEIPT___GET_AMOUNT_DEDUCTED = eINSTANCE.getSuncardReceipt__GetAmountDeducted();

		/**
		 * The meta object literal for the '{@link vendingMachine.vendingMachine.vendsys.impl.CoinCountImpl <em>Coin Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vendingMachine.vendingMachine.vendsys.impl.CoinCountImpl
		 * @see vendingMachine.vendingMachine.vendsys.impl.VendsysPackageImpl#getCoinCount()
		 * @generated
		 */
		EClass COIN_COUNT = eINSTANCE.getCoinCount();

		/**
		 * The meta object literal for the '<em><b>NUM QUARTERS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COIN_COUNT__NUM_QUARTERS = eINSTANCE.getCoinCount_NUM_QUARTERS();

		/**
		 * The meta object literal for the '<em><b>NUM DIMES</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COIN_COUNT__NUM_DIMES = eINSTANCE.getCoinCount_NUM_DIMES();

		/**
		 * The meta object literal for the '<em><b>NUM NICKELS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COIN_COUNT__NUM_NICKELS = eINSTANCE.getCoinCount_NUM_NICKELS();

		/**
		 * The meta object literal for the '<em><b>Coins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COIN_COUNT__COINS = eINSTANCE.getCoinCount_Coins();

	}

} //VendsysPackage
