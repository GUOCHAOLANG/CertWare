/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Negates#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getNegates()
 * @model
 * @generated
 */
public interface Negates extends EvidenceResolution {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EvidenceRelation)
	 * @see net.certware.evidence.evidence.EvidencePackage#getNegates_Element()
	 * @model required="true"
	 * @generated
	 */
	EvidenceRelation getElement();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Negates#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EvidenceRelation value);

} // Negates
