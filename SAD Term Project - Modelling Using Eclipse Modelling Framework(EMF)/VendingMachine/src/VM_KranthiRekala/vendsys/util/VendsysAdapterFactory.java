/**
 */
package VM_KranthiRekala.vendsys.util;

import VM_KranthiRekala.vendsys.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see VM_KranthiRekala.vendsys.VendsysPackage
 * @generated
 */
public class VendsysAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VendsysPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendsysAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VendsysPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendsysSwitch<Adapter> modelSwitch =
		new VendsysSwitch<Adapter>() {
			@Override
			public Adapter caseIPayMachineListener(IPayMachineListener object) {
				return createIPayMachineListenerAdapter();
			}
			@Override
			public Adapter caseIProductDatabase(IProductDatabase object) {
				return createIProductDatabaseAdapter();
			}
			@Override
			public Adapter caseIProductInfo(IProductInfo object) {
				return createIProductInfoAdapter();
			}
			@Override
			public Adapter caseIProductDispenserListener(IProductDispenserListener object) {
				return createIProductDispenserListenerAdapter();
			}
			@Override
			public Adapter caseIProductSelectorListener(IProductSelectorListener object) {
				return createIProductSelectorListenerAdapter();
			}
			@Override
			public Adapter caseIOutputDisplayListener(IOutputDisplayListener object) {
				return createIOutputDisplayListenerAdapter();
			}
			@Override
			public Adapter caseCashRegister(CashRegister object) {
				return createCashRegisterAdapter();
			}
			@Override
			public Adapter caseOutputDisplay(OutputDisplay object) {
				return createOutputDisplayAdapter();
			}
			@Override
			public Adapter casePayMachine(PayMachine object) {
				return createPayMachineAdapter();
			}
			@Override
			public Adapter caseVirtualVendingMachine(VirtualVendingMachine object) {
				return createVirtualVendingMachineAdapter();
			}
			@Override
			public Adapter caseProductDispenser(ProductDispenser object) {
				return createProductDispenserAdapter();
			}
			@Override
			public Adapter caseProductSelector(ProductSelector object) {
				return createProductSelectorAdapter();
			}
			@Override
			public Adapter caseSuncardReceipt(SuncardReceipt object) {
				return createSuncardReceiptAdapter();
			}
			@Override
			public Adapter caseCoinCount(CoinCount object) {
				return createCoinCountAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.IPayMachineListener <em>IPay Machine Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.IPayMachineListener
	 * @generated
	 */
	public Adapter createIPayMachineListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.IProductDatabase <em>IProduct Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.IProductDatabase
	 * @generated
	 */
	public Adapter createIProductDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.IProductInfo <em>IProduct Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.IProductInfo
	 * @generated
	 */
	public Adapter createIProductInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.IProductDispenserListener <em>IProduct Dispenser Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.IProductDispenserListener
	 * @generated
	 */
	public Adapter createIProductDispenserListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.IProductSelectorListener <em>IProduct Selector Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.IProductSelectorListener
	 * @generated
	 */
	public Adapter createIProductSelectorListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.IOutputDisplayListener <em>IOutput Display Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.IOutputDisplayListener
	 * @generated
	 */
	public Adapter createIOutputDisplayListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.CashRegister <em>Cash Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.CashRegister
	 * @generated
	 */
	public Adapter createCashRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.OutputDisplay <em>Output Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.OutputDisplay
	 * @generated
	 */
	public Adapter createOutputDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.PayMachine <em>Pay Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.PayMachine
	 * @generated
	 */
	public Adapter createPayMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.VirtualVendingMachine <em>Virtual Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.VirtualVendingMachine
	 * @generated
	 */
	public Adapter createVirtualVendingMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.ProductDispenser <em>Product Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.ProductDispenser
	 * @generated
	 */
	public Adapter createProductDispenserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.ProductSelector <em>Product Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.ProductSelector
	 * @generated
	 */
	public Adapter createProductSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.SuncardReceipt <em>Suncard Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.SuncardReceipt
	 * @generated
	 */
	public Adapter createSuncardReceiptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VM_KranthiRekala.vendsys.CoinCount <em>Coin Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VM_KranthiRekala.vendsys.CoinCount
	 * @generated
	 */
	public Adapter createCoinCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VendsysAdapterFactory
