/**
 */
package vendingMachine.vendingMachine.extern.impl;

import java.lang.reflect.InvocationTargetException;
import javax.swing.Icon;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import vendingMachine.vendingMachine.extern.ExternPackage;
import vendingMachine.vendingMachine.extern.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vendingMachine.vendingMachine.extern.impl.ProductImpl#getM_iID <em>MiID</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.extern.impl.ProductImpl#getM_sName <em>MsName</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.extern.impl.ProductImpl#getM_sDescription <em>MsDescription</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.extern.impl.ProductImpl#getM_dPrice <em>MdPrice</em>}</li>
 *   <li>{@link vendingMachine.vendingMachine.extern.impl.ProductImpl#getM_iQuantity <em>MiQuantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
	/**
	 * The default value of the '{@link #getM_iID() <em>MiID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iID()
	 * @generated
	 * @ordered
	 */
	protected static final int MIID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iID() <em>MiID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iID()
	 * @generated
	 * @ordered
	 */
	protected int m_iID = MIID_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_sName() <em>MsName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sName()
	 * @generated
	 * @ordered
	 */
	protected static final String MSNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_sName() <em>MsName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sName()
	 * @generated
	 * @ordered
	 */
	protected String m_sName = MSNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_sDescription() <em>MsDescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MSDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_sDescription() <em>MsDescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sDescription()
	 * @generated
	 * @ordered
	 */
	protected String m_sDescription = MSDESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_dPrice() <em>MdPrice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double MDPRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM_dPrice() <em>MdPrice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dPrice()
	 * @generated
	 * @ordered
	 */
	protected double m_dPrice = MDPRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iQuantity() <em>MiQuantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int MIQUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iQuantity() <em>MiQuantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iQuantity()
	 * @generated
	 * @ordered
	 */
	protected int m_iQuantity = MIQUANTITY_EDEFAULT;

	private Icon m_iIcon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	public ProductImpl(int iID, String sName, String sDescription, Icon iIcon, double dPrice, int iQuantity)
	{
		m_iID = iID;
		m_sName = sName;
		m_sDescription = sDescription;
		m_iIcon = iIcon;
		m_dPrice = dPrice;
		m_iQuantity = iQuantity;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iID() {
		return m_iID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iID(int newM_iID) {
		int oldM_iID = m_iID;
		m_iID = newM_iID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternPackage.PRODUCT__MIID, oldM_iID, m_iID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_sName() {
		return m_sName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_sName(String newM_sName) {
		String oldM_sName = m_sName;
		m_sName = newM_sName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternPackage.PRODUCT__MSNAME, oldM_sName, m_sName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_sDescription() {
		return m_sDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_sDescription(String newM_sDescription) {
		String oldM_sDescription = m_sDescription;
		m_sDescription = newM_sDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternPackage.PRODUCT__MSDESCRIPTION, oldM_sDescription, m_sDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getM_dPrice() {
		return m_dPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_dPrice(double newM_dPrice) {
		double oldM_dPrice = m_dPrice;
		m_dPrice = newM_dPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternPackage.PRODUCT__MDPRICE, oldM_dPrice, m_dPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iQuantity() {
		return m_iQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iQuantity(int newM_iQuantity) {
		int oldM_iQuantity = m_iQuantity;
		m_iQuantity = newM_iQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternPackage.PRODUCT__MIQUANTITY, oldM_iQuantity, m_iQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Product(int iID, String sName, String sDescription, int iICon, double dPrice, int iQuantity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setID(int iID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_iID = iID;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String sName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_sName = sName;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDescription(String sDescription) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_sDescription = sDescription;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getIcon() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIcon(Icon iIcon) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_iIcon = iIcon;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPrice(double dPrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_dPrice = dPrice;
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setQuantity(int iQuantity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		m_iQuantity = iQuantity;
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
			case ExternPackage.PRODUCT__MIID:
				return getM_iID();
			case ExternPackage.PRODUCT__MSNAME:
				return getM_sName();
			case ExternPackage.PRODUCT__MSDESCRIPTION:
				return getM_sDescription();
			case ExternPackage.PRODUCT__MDPRICE:
				return getM_dPrice();
			case ExternPackage.PRODUCT__MIQUANTITY:
				return getM_iQuantity();
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
			case ExternPackage.PRODUCT__MIID:
				setM_iID((Integer)newValue);
				return;
			case ExternPackage.PRODUCT__MSNAME:
				setM_sName((String)newValue);
				return;
			case ExternPackage.PRODUCT__MSDESCRIPTION:
				setM_sDescription((String)newValue);
				return;
			case ExternPackage.PRODUCT__MDPRICE:
				setM_dPrice((Double)newValue);
				return;
			case ExternPackage.PRODUCT__MIQUANTITY:
				setM_iQuantity((Integer)newValue);
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
			case ExternPackage.PRODUCT__MIID:
				setM_iID(MIID_EDEFAULT);
				return;
			case ExternPackage.PRODUCT__MSNAME:
				setM_sName(MSNAME_EDEFAULT);
				return;
			case ExternPackage.PRODUCT__MSDESCRIPTION:
				setM_sDescription(MSDESCRIPTION_EDEFAULT);
				return;
			case ExternPackage.PRODUCT__MDPRICE:
				setM_dPrice(MDPRICE_EDEFAULT);
				return;
			case ExternPackage.PRODUCT__MIQUANTITY:
				setM_iQuantity(MIQUANTITY_EDEFAULT);
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
			case ExternPackage.PRODUCT__MIID:
				return m_iID != MIID_EDEFAULT;
			case ExternPackage.PRODUCT__MSNAME:
				return MSNAME_EDEFAULT == null ? m_sName != null : !MSNAME_EDEFAULT.equals(m_sName);
			case ExternPackage.PRODUCT__MSDESCRIPTION:
				return MSDESCRIPTION_EDEFAULT == null ? m_sDescription != null : !MSDESCRIPTION_EDEFAULT.equals(m_sDescription);
			case ExternPackage.PRODUCT__MDPRICE:
				return m_dPrice != MDPRICE_EDEFAULT;
			case ExternPackage.PRODUCT__MIQUANTITY:
				return m_iQuantity != MIQUANTITY_EDEFAULT;
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
			case ExternPackage.PRODUCT___PRODUCT__INT_STRING_STRING_INT_DOUBLE_INT:
				Product((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Double)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ExternPackage.PRODUCT___GET_ID:
				return getID();
			case ExternPackage.PRODUCT___GET_NAME:
				return getName();
			case ExternPackage.PRODUCT___GET_DESCRIPTION:
				return getDescription();
			case ExternPackage.PRODUCT___GET_ICON:
				getIcon();
				return null;
			case ExternPackage.PRODUCT___GET_PRICE:
				return getPrice();
			case ExternPackage.PRODUCT___GET_QUANTITY:
				return getQuantity();
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
		result.append(" (m_iID: ");
		result.append(m_iID);
		result.append(", m_sName: ");
		result.append(m_sName);
		result.append(", m_sDescription: ");
		result.append(m_sDescription);
		result.append(", m_dPrice: ");
		result.append(m_dPrice);
		result.append(", m_iQuantity: ");
		result.append(m_iQuantity);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
