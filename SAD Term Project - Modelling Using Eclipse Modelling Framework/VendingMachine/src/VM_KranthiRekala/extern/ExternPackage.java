/**
 */
package VM_KranthiRekala.extern;

import VM_KranthiRekala.vendsys.VendsysPackage;

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
 * @see VM_KranthiRekala.extern.ExternFactory
 * @model kind="package"
 * @generated
 */
public interface ExternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://extern";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternPackage eINSTANCE = VM_KranthiRekala.extern.impl.ExternPackageImpl.init();

	/**
	 * The meta object id for the '{@link VM_KranthiRekala.extern.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VM_KranthiRekala.extern.impl.ProductImpl
	 * @see VM_KranthiRekala.extern.impl.ExternPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>MiID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MIID = VendsysPackage.IPRODUCT_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MsName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MSNAME = VendsysPackage.IPRODUCT_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MsDescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MSDESCRIPTION = VendsysPackage.IPRODUCT_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MdPrice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MDPRICE = VendsysPackage.IPRODUCT_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MiQuantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MIQUANTITY = VendsysPackage.IPRODUCT_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = VendsysPackage.IPRODUCT_INFO_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_ID = VendsysPackage.IPRODUCT_INFO___GET_ID;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_NAME = VendsysPackage.IPRODUCT_INFO___GET_NAME;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_DESCRIPTION = VendsysPackage.IPRODUCT_INFO___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Icon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_ICON = VendsysPackage.IPRODUCT_INFO___GET_ICON;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_PRICE = VendsysPackage.IPRODUCT_INFO___GET_PRICE;

	/**
	 * The operation id for the '<em>Get Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_QUANTITY = VendsysPackage.IPRODUCT_INFO___GET_QUANTITY;

	/**
	 * The operation id for the '<em>Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___PRODUCT__INT_STRING_STRING_INT_DOUBLE_INT = VendsysPackage.IPRODUCT_INFO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = VendsysPackage.IPRODUCT_INFO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link VM_KranthiRekala.extern.impl.MyProductDatabaseImpl <em>My Product Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VM_KranthiRekala.extern.impl.MyProductDatabaseImpl
	 * @see VM_KranthiRekala.extern.impl.ExternPackageImpl#getMyProductDatabase()
	 * @generated
	 */
	int MY_PRODUCT_DATABASE = 1;

	/**
	 * The feature id for the '<em><b>PProducts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_PRODUCT_DATABASE__PPRODUCTS = 0;

	/**
	 * The number of structural features of the '<em>My Product Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_PRODUCT_DATABASE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>My Product Database</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_PRODUCT_DATABASE___MY_PRODUCT_DATABASE = 0;

	/**
	 * The operation id for the '<em>Get Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_PRODUCT_DATABASE___GET_PRODUCTS = 1;

	/**
	 * The operation id for the '<em>Decrement Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_PRODUCT_DATABASE___DECREMENT_QUANTITY__IPRODUCTINFO = 2;

	/**
	 * The operation id for the '<em>Get Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_PRODUCT_DATABASE___GET_PRODUCT__INT = 3;

	/**
	 * The operation id for the '<em>Get Num Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_PRODUCT_DATABASE___GET_NUM_PRODUCTS = 4;

	/**
	 * The number of operations of the '<em>My Product Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_PRODUCT_DATABASE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link VM_KranthiRekala.extern.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VM_KranthiRekala.extern.impl.IconImpl
	 * @see VM_KranthiRekala.extern.impl.ExternPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 2;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link VM_KranthiRekala.extern.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see VM_KranthiRekala.extern.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link VM_KranthiRekala.extern.Product#getM_iID <em>MiID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiID</em>'.
	 * @see VM_KranthiRekala.extern.Product#getM_iID()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_iID();

	/**
	 * Returns the meta object for the attribute '{@link VM_KranthiRekala.extern.Product#getM_sName <em>MsName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MsName</em>'.
	 * @see VM_KranthiRekala.extern.Product#getM_sName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_sName();

	/**
	 * Returns the meta object for the attribute '{@link VM_KranthiRekala.extern.Product#getM_sDescription <em>MsDescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MsDescription</em>'.
	 * @see VM_KranthiRekala.extern.Product#getM_sDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_sDescription();

	/**
	 * Returns the meta object for the attribute '{@link VM_KranthiRekala.extern.Product#getM_dPrice <em>MdPrice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MdPrice</em>'.
	 * @see VM_KranthiRekala.extern.Product#getM_dPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_dPrice();

	/**
	 * Returns the meta object for the attribute '{@link VM_KranthiRekala.extern.Product#getM_iQuantity <em>MiQuantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiQuantity</em>'.
	 * @see VM_KranthiRekala.extern.Product#getM_iQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_iQuantity();

	/**
	 * Returns the meta object for the '{@link VM_KranthiRekala.extern.Product#Product(int, java.lang.String, java.lang.String, int, double, int) <em>Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product</em>' operation.
	 * @see VM_KranthiRekala.extern.Product#Product(int, java.lang.String, java.lang.String, int, double, int)
	 * @generated
	 */
	EOperation getProduct__Product__int_String_String_int_double_int();

	/**
	 * Returns the meta object for class '{@link VM_KranthiRekala.extern.MyProductDatabase <em>My Product Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Product Database</em>'.
	 * @see VM_KranthiRekala.extern.MyProductDatabase
	 * @generated
	 */
	EClass getMyProductDatabase();

	/**
	 * Returns the meta object for the containment reference '{@link VM_KranthiRekala.extern.MyProductDatabase#getPProducts <em>PProducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PProducts</em>'.
	 * @see VM_KranthiRekala.extern.MyProductDatabase#getPProducts()
	 * @see #getMyProductDatabase()
	 * @generated
	 */
	EReference getMyProductDatabase_PProducts();

	/**
	 * Returns the meta object for the '{@link VM_KranthiRekala.extern.MyProductDatabase#MyProductDatabase() <em>My Product Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>My Product Database</em>' operation.
	 * @see VM_KranthiRekala.extern.MyProductDatabase#MyProductDatabase()
	 * @generated
	 */
	EOperation getMyProductDatabase__MyProductDatabase();

	/**
	 * Returns the meta object for the '{@link VM_KranthiRekala.extern.MyProductDatabase#getProducts() <em>Get Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Products</em>' operation.
	 * @see VM_KranthiRekala.extern.MyProductDatabase#getProducts()
	 * @generated
	 */
	EOperation getMyProductDatabase__GetProducts();

	/**
	 * Returns the meta object for the '{@link VM_KranthiRekala.extern.MyProductDatabase#decrementQuantity(VM_KranthiRekala.vendsys.IProductInfo) <em>Decrement Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decrement Quantity</em>' operation.
	 * @see VM_KranthiRekala.extern.MyProductDatabase#decrementQuantity(VM_KranthiRekala.vendsys.IProductInfo)
	 * @generated
	 */
	EOperation getMyProductDatabase__DecrementQuantity__IProductInfo();

	/**
	 * Returns the meta object for the '{@link VM_KranthiRekala.extern.MyProductDatabase#getProduct(int) <em>Get Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product</em>' operation.
	 * @see VM_KranthiRekala.extern.MyProductDatabase#getProduct(int)
	 * @generated
	 */
	EOperation getMyProductDatabase__GetProduct__int();

	/**
	 * Returns the meta object for the '{@link VM_KranthiRekala.extern.MyProductDatabase#getNumProducts() <em>Get Num Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num Products</em>' operation.
	 * @see VM_KranthiRekala.extern.MyProductDatabase#getNumProducts()
	 * @generated
	 */
	EOperation getMyProductDatabase__GetNumProducts();

	/**
	 * Returns the meta object for class '{@link javax.swing.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see javax.swing.Icon
	 * @model instanceClass="javax.swing.Icon"
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExternFactory getExternFactory();

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
		 * The meta object literal for the '{@link VM_KranthiRekala.extern.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VM_KranthiRekala.extern.impl.ProductImpl
		 * @see VM_KranthiRekala.extern.impl.ExternPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>MiID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MIID = eINSTANCE.getProduct_M_iID();

		/**
		 * The meta object literal for the '<em><b>MsName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MSNAME = eINSTANCE.getProduct_M_sName();

		/**
		 * The meta object literal for the '<em><b>MsDescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MSDESCRIPTION = eINSTANCE.getProduct_M_sDescription();

		/**
		 * The meta object literal for the '<em><b>MdPrice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MDPRICE = eINSTANCE.getProduct_M_dPrice();

		/**
		 * The meta object literal for the '<em><b>MiQuantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MIQUANTITY = eINSTANCE.getProduct_M_iQuantity();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT___PRODUCT__INT_STRING_STRING_INT_DOUBLE_INT = eINSTANCE.getProduct__Product__int_String_String_int_double_int();

		/**
		 * The meta object literal for the '{@link VM_KranthiRekala.extern.impl.MyProductDatabaseImpl <em>My Product Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VM_KranthiRekala.extern.impl.MyProductDatabaseImpl
		 * @see VM_KranthiRekala.extern.impl.ExternPackageImpl#getMyProductDatabase()
		 * @generated
		 */
		EClass MY_PRODUCT_DATABASE = eINSTANCE.getMyProductDatabase();

		/**
		 * The meta object literal for the '<em><b>PProducts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_PRODUCT_DATABASE__PPRODUCTS = eINSTANCE.getMyProductDatabase_PProducts();

		/**
		 * The meta object literal for the '<em><b>My Product Database</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_PRODUCT_DATABASE___MY_PRODUCT_DATABASE = eINSTANCE.getMyProductDatabase__MyProductDatabase();

		/**
		 * The meta object literal for the '<em><b>Get Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_PRODUCT_DATABASE___GET_PRODUCTS = eINSTANCE.getMyProductDatabase__GetProducts();

		/**
		 * The meta object literal for the '<em><b>Decrement Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_PRODUCT_DATABASE___DECREMENT_QUANTITY__IPRODUCTINFO = eINSTANCE.getMyProductDatabase__DecrementQuantity__IProductInfo();

		/**
		 * The meta object literal for the '<em><b>Get Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_PRODUCT_DATABASE___GET_PRODUCT__INT = eINSTANCE.getMyProductDatabase__GetProduct__int();

		/**
		 * The meta object literal for the '<em><b>Get Num Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_PRODUCT_DATABASE___GET_NUM_PRODUCTS = eINSTANCE.getMyProductDatabase__GetNumProducts();

		/**
		 * The meta object literal for the '{@link VM_KranthiRekala.extern.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VM_KranthiRekala.extern.impl.IconImpl
		 * @see VM_KranthiRekala.extern.impl.ExternPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

	}

} //ExternPackage
