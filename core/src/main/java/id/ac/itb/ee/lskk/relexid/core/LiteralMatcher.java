/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.LiteralMatcher#getLiterals <em>Literals</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.LiteralMatcher#isCaseSensitive <em>Case Sensitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLiteralMatcher()
 * @model
 * @generated
 */
public interface LiteralMatcher extends LexMatcher {
	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #setCaseSensitive(boolean)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLiteralMatcher_CaseSensitive()
	 * @model default="false"
	 * @generated
	 */
	boolean isCaseSensitive();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.LiteralMatcher#isCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #isCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any of the literals will match this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Literals</em>' attribute list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLiteralMatcher_Literals()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getLiterals();

} // LiteralElement
