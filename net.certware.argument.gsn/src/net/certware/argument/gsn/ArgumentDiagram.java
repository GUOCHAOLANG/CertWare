/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.gsn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.ArgumentDiagram#getGoals <em>Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsn.ArgumentDiagram#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link net.certware.argument.gsn.ArgumentDiagram#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.gsn.ArgumentDiagram#getContexts <em>Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsn.ArgumentDiagram#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.gsn.ArgumentDiagram#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link net.certware.argument.gsn.ArgumentDiagram#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.argument.gsn.ArgumentDiagram#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram()
 * @model annotation="gmf.diagram model.extension='gsn' diagram.extension='gsnd' onefile='false'"
 * @generated
 */
public interface ArgumentDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram_Goals()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram_Strategies()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Strategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram_Solutions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram_Evidence()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Evidence> getEvidence();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram_Assumptions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram_Contexts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Justifications</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justifications</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram_Justifications()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Justification> getJustifications();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.certware.argument.gsn.GsnPackage#getArgumentDiagram_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.certware.argument.gsn.ArgumentDiagram#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ArgumentDiagram
