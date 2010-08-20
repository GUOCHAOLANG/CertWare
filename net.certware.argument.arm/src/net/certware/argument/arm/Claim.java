/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010 Kestrel Technology LLC (generated models) 
 */
package net.certware.argument.arm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.arm.Claim#getAssumed <em>Assumed</em>}</li>
 *   <li>{@link net.certware.argument.arm.Claim#getToBeSupported <em>To Be Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.arm.ArmPackage#getClaim()
 * @model
 * @generated
 */
public interface Claim extends ReasoningElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010 Kestrel Technology LLC (generated models) "; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumed</em>' attribute.
	 * @see #setAssumed(String)
	 * @see net.certware.argument.arm.ArmPackage#getClaim_Assumed()
	 * @model dataType="net.certware.argument.arm.Boolean"
	 * @generated
	 */
	String getAssumed();

	/**
	 * Sets the value of the '{@link net.certware.argument.arm.Claim#getAssumed <em>Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumed</em>' attribute.
	 * @see #getAssumed()
	 * @generated
	 */
	void setAssumed(String value);

	/**
	 * Returns the value of the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Supported</em>' attribute.
	 * @see #setToBeSupported(String)
	 * @see net.certware.argument.arm.ArmPackage#getClaim_ToBeSupported()
	 * @model dataType="net.certware.argument.arm.Boolean"
	 * @generated
	 */
	String getToBeSupported();

	/**
	 * Sets the value of the '{@link net.certware.argument.arm.Claim#getToBeSupported <em>To Be Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Supported</em>' attribute.
	 * @see #getToBeSupported()
	 * @generated
	 */
	void setToBeSupported(String value);

} // Claim