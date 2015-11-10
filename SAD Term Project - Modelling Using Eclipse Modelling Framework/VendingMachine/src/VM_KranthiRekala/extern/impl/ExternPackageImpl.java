/**
 */
package VM_KranthiRekala.extern.impl;

import VM_KranthiRekala.extern.ExternFactory;
import VM_KranthiRekala.extern.ExternPackage;
import VM_KranthiRekala.extern.MyProductDatabase;
import VM_KranthiRekala.extern.Product;

import VM_KranthiRekala.vendsys.VendsysPackage;

import VM_KranthiRekala.vendsys.impl.VendsysPackageImpl;

import javax.swing.Icon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternPackageImpl extends EPackageImpl implements ExternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myProductDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconEClass = null;

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
	 * @see VM_KranthiRekala.extern.ExternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternPackageImpl() {
		super(eNS_URI, ExternFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternPackage init() {
		if (isInited) return (ExternPackage)EPackage.Registry.INSTANCE.getEPackage(ExternPackage.eNS_URI);

		// Obtain or create and register package
		ExternPackageImpl theExternPackage = (ExternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExternPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VendsysPackageImpl theVendsysPackage = (VendsysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VendsysPackage.eNS_URI) instanceof VendsysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VendsysPackage.eNS_URI) : VendsysPackage.eINSTANCE);

		// Create package meta-data objects
		theExternPackage.createPackageContents();
		theVendsysPackage.createPackageContents();

		// Initialize created meta-data
		theExternPackage.initializePackageContents();
		theVendsysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternPackage.eNS_URI, theExternPackage);
		return theExternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_iID() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_sName() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_sDescription() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_dPrice() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_iQuantity() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProduct__Product__int_String_String_int_double_int() {
		return productEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyProductDatabase() {
		return myProductDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyProductDatabase_PProducts() {
		return (EReference)myProductDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyProductDatabase__MyProductDatabase() {
		return myProductDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyProductDatabase__GetProducts() {
		return myProductDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyProductDatabase__DecrementQuantity__IProductInfo() {
		return myProductDatabaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyProductDatabase__GetProduct__int() {
		return myProductDatabaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyProductDatabase__GetNumProducts() {
		return myProductDatabaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIcon() {
		return iconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternFactory getExternFactory() {
		return (ExternFactory)getEFactoryInstance();
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
		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__MIID);
		createEAttribute(productEClass, PRODUCT__MSNAME);
		createEAttribute(productEClass, PRODUCT__MSDESCRIPTION);
		createEAttribute(productEClass, PRODUCT__MDPRICE);
		createEAttribute(productEClass, PRODUCT__MIQUANTITY);
		createEOperation(productEClass, PRODUCT___PRODUCT__INT_STRING_STRING_INT_DOUBLE_INT);

		myProductDatabaseEClass = createEClass(MY_PRODUCT_DATABASE);
		createEReference(myProductDatabaseEClass, MY_PRODUCT_DATABASE__PPRODUCTS);
		createEOperation(myProductDatabaseEClass, MY_PRODUCT_DATABASE___MY_PRODUCT_DATABASE);
		createEOperation(myProductDatabaseEClass, MY_PRODUCT_DATABASE___GET_PRODUCTS);
		createEOperation(myProductDatabaseEClass, MY_PRODUCT_DATABASE___DECREMENT_QUANTITY__IPRODUCTINFO);
		createEOperation(myProductDatabaseEClass, MY_PRODUCT_DATABASE___GET_PRODUCT__INT);
		createEOperation(myProductDatabaseEClass, MY_PRODUCT_DATABASE___GET_NUM_PRODUCTS);

		iconEClass = createEClass(ICON);
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
		VendsysPackage theVendsysPackage = (VendsysPackage)EPackage.Registry.INSTANCE.getEPackage(VendsysPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		productEClass.getESuperTypes().add(theVendsysPackage.getIProductInfo());

		// Initialize classes, features, and operations; add parameters
		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_M_iID(), ecorePackage.getEInt(), "m_iID", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_sName(), ecorePackage.getEString(), "m_sName", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_sDescription(), ecorePackage.getEString(), "m_sDescription", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_dPrice(), ecorePackage.getEDouble(), "m_dPrice", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_iQuantity(), ecorePackage.getEInt(), "m_iQuantity", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProduct__Product__int_String_String_int_double_int(), null, "Product", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sDescription", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iICon", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "dPrice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(myProductDatabaseEClass, MyProductDatabase.class, "MyProductDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMyProductDatabase_PProducts(), this.getProduct(), null, "pProducts", null, 0, 1, MyProductDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMyProductDatabase__MyProductDatabase(), null, "MyProductDatabase", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMyProductDatabase__GetProducts(), theVendsysPackage.getIProductInfo(), "getProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMyProductDatabase__DecrementQuantity__IProductInfo(), null, "decrementQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theVendsysPackage.getIProductInfo(), "piProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMyProductDatabase__GetProduct__int(), theVendsysPackage.getIProductInfo(), "getProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "iProductID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMyProductDatabase__GetNumProducts(), ecorePackage.getEInt(), "getNumProducts", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExternPackageImpl
