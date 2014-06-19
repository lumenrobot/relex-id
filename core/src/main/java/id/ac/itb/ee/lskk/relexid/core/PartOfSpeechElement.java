/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Of Speech Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechElement#getPartOfSpeech <em>Part Of Speech</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartOfSpeechElement()
 * @model
 * @generated
 */
public interface PartOfSpeechElement extends LexElement {
	/**
	 * Returns the value of the '<em><b>Part Of Speech</b></em>' attribute.
	 * The literals are from the enumeration {@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of Speech</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of Speech</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType
	 * @see #setPartOfSpeech(PartOfSpeechType)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartOfSpeechElement_PartOfSpeech()
	 * @model required="true"
	 * @generated
	 */
	PartOfSpeechType getPartOfSpeech();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechElement#getPartOfSpeech <em>Part Of Speech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of Speech</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType
	 * @see #getPartOfSpeech()
	 * @generated
	 */
	void setPartOfSpeech(PartOfSpeechType value);

} // PartOfSpeechElement
