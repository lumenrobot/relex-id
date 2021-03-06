/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.CapturingGroup;
import id.ac.itb.ee.lskk.relexid.core.LexMatchResult;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeech;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechMatcher;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType;
import id.ac.itb.ee.lskk.relexid.core.RelEx;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.UnrecognizedPart;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Of Speech Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PartOfSpeechMatcherImpl#getPartOfSpeech <em>Part Of Speech</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartOfSpeechMatcherImpl extends MinimalEObjectImpl.Container implements PartOfSpeechMatcher {
	
	private static final Logger log = LoggerFactory
			.getLogger(PartOfSpeechMatcherImpl.class);
	
	/**
	 * The default value of the '{@link #getPartOfSpeech() <em>Part Of Speech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfSpeech()
	 * @generated
	 * @ordered
	 */
	protected static final PartOfSpeechType PART_OF_SPEECH_EDEFAULT = PartOfSpeechType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getPartOfSpeech() <em>Part Of Speech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfSpeech()
	 * @generated
	 * @ordered
	 */
	protected PartOfSpeechType partOfSpeech = PART_OF_SPEECH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartOfSpeechMatcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.PART_OF_SPEECH_MATCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartOfSpeechType getPartOfSpeech() {
		return partOfSpeech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartOfSpeech(PartOfSpeechType newPartOfSpeech) {
		PartOfSpeechType oldPartOfSpeech = partOfSpeech;
		partOfSpeech = newPartOfSpeech == null ? PART_OF_SPEECH_EDEFAULT : newPartOfSpeech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PART_OF_SPEECH_MATCHER__PART_OF_SPEECH, oldPartOfSpeech, partOfSpeech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public LexMatchResult match(final RelEx relex, PartOfSpeech part) {
		if (!(part instanceof UnrecognizedPart)) {
			return LexMatchResult.MISMATCH;
		}
		
		final List<QName> senses;
		switch (getPartOfSpeech()) {
		case VERB:
			senses = relex.getVerbSenses(part.getLiteral());
			break;
		case NOUN:
			senses = relex.getNounSenses(part.getLiteral());
			break;
		case ADJECTIVE:
			senses = relex.getAdjectiveSenses(part.getLiteral());
			break;
		case ADJECTIVE_SATELLITE:
			senses = relex.getAdjectiveSatelliteSenses(part.getLiteral());
			break;
		default:
			throw new IllegalArgumentException("Lex matcher PartOfSpeech does not support " + getPartOfSpeech());
		}
		if (!senses.isEmpty()) {
			QName sense = senses.get(0);
			if (senses.size() > 1) {
				log.warn("PartOfSpeech matcher for {} '{}' chose the first sense {} but matched {} senses: {}",
						getPartOfSpeech(), part.getLiteral(), relex.shortQName(sense), senses.size(), 
						FluentIterable.from(senses).transform(new Function<QName, String>() {
							@Override
							public String apply(QName input) {
								return relex.shortQName(input);
							}
						}) );
			}
			return new LexMatchResult(1, new CapturingGroup(sense));
		} else {
			return LexMatchResult.MISMATCH;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.PART_OF_SPEECH_MATCHER__PART_OF_SPEECH:
				return getPartOfSpeech();
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
			case RelexidPackage.PART_OF_SPEECH_MATCHER__PART_OF_SPEECH:
				setPartOfSpeech((PartOfSpeechType)newValue);
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
			case RelexidPackage.PART_OF_SPEECH_MATCHER__PART_OF_SPEECH:
				setPartOfSpeech(PART_OF_SPEECH_EDEFAULT);
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
			case RelexidPackage.PART_OF_SPEECH_MATCHER__PART_OF_SPEECH:
				return partOfSpeech != PART_OF_SPEECH_EDEFAULT;
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
			case RelexidPackage.PART_OF_SPEECH_MATCHER___MATCH__PARTOFSPEECH:
				return match((RelEx)arguments.get(0), (PartOfSpeech)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return partOfSpeech.toString();
	}

} //PartOfSpeechElementImpl
