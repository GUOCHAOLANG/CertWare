/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.OrSentence#getLeft <em>Left</em>}</li>
 *   <li>{@link net.certware.argument.language.l.OrSentence#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getOrSentence()
 * @model
 * @generated
 */
public interface OrSentence extends SentenceExpr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(SentenceExpr)
   * @see net.certware.argument.language.l.LPackage#getOrSentence_Left()
   * @model containment="true"
   * @generated
   */
  SentenceExpr getLeft();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.OrSentence#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SentenceExpr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SentenceExpr)
   * @see net.certware.argument.language.l.LPackage#getOrSentence_Right()
   * @model containment="true"
   * @generated
   */
  SentenceExpr getRight();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.OrSentence#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SentenceExpr value);

} // OrSentence
