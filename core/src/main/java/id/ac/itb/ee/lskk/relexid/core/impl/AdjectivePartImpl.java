/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.AdjectivePart;
import id.ac.itb.ee.lskk.relexid.core.Questionable;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adjective Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.AdjectivePartImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.AdjectivePartImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.AdjectivePartImpl#isQuestioning <em>Questioning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdjectivePartImpl extends MinimalEObjectImpl.Container implements AdjectivePart {
	/**
	 * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected String literal = LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final QName RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected QName resource = RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isQuestioning() <em>Questioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuestioning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUESTIONING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQuestioning() <em>Questioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuestioning()
	 * @generated
	 * @ordered
	 */
	protected boolean questioning = QUESTIONING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdjectivePartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.ADJECTIVE_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(String newLiteral) {
		String oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.ADJECTIVE_PART__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(QName newResource) {
		QName oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.ADJECTIVE_PART__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQuestioning() {
		return questioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestioning(boolean newQuestioning) {
		boolean oldQuestioning = questioning;
		questioning = newQuestioning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.ADJECTIVE_PART__QUESTIONING, oldQuestioning, questioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.ADJECTIVE_PART__LITERAL:
				return getLiteral();
			case RelexidPackage.ADJECTIVE_PART__RESOURCE:
				return getResource();
			case RelexidPackage.ADJECTIVE_PART__QUESTIONING:
				return isQuestioning();
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
			case RelexidPackage.ADJECTIVE_PART__LITERAL:
				setLiteral((String)newValue);
				return;
			case RelexidPackage.ADJECTIVE_PART__RESOURCE:
				setResource((QName)newValue);
				return;
			case RelexidPackage.ADJECTIVE_PART__QUESTIONING:
				setQuestioning((Boolean)newValue);
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
			case RelexidPackage.ADJECTIVE_PART__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
				return;
			case RelexidPackage.ADJECTIVE_PART__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case RelexidPackage.ADJECTIVE_PART__QUESTIONING:
				setQuestioning(QUESTIONING_EDEFAULT);
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
			case RelexidPackage.ADJECTIVE_PART__LITERAL:
				return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
			case RelexidPackage.ADJECTIVE_PART__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case RelexidPackage.ADJECTIVE_PART__QUESTIONING:
				return questioning != QUESTIONING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Questionable.class) {
			switch (derivedFeatureID) {
				case RelexidPackage.ADJECTIVE_PART__QUESTIONING: return RelexidPackage.QUESTIONABLE__QUESTIONING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Questionable.class) {
			switch (baseFeatureID) {
				case RelexidPackage.QUESTIONABLE__QUESTIONING: return RelexidPackage.ADJECTIVE_PART__QUESTIONING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (literal: ");
		result.append(literal);
		result.append(", resource: ");
		result.append(resource);
		result.append(", questioning: ");
		result.append(questioning);
		result.append(')');
		return result.toString();
	}

} //AdjectivePartImpl