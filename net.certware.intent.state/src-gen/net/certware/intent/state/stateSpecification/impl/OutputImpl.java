/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.math.BigDecimal;

import java.util.Collection;

import net.certware.intent.state.stateSpecification.BigUnitValue;
import net.certware.intent.state.stateSpecification.Output;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.TriggerTable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getRangeUnits <em>Range Units</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getValues <em>Values</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getCompletionHandling <em>Completion Handling</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getMinResponse <em>Min Response</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getMaxResponse <em>Max Response</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getFeebackHandling <em>Feeback Handling</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getReversed <em>Reversed</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getReferences <em>References</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.OutputImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputImpl extends MinimalEObjectImpl.Container implements Output
{
  /**
   * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected static final BigDecimal LOWER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected BigDecimal lower = LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected static final BigDecimal UPPER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected BigDecimal upper = UPPER_EDEFAULT;

  /**
   * The default value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeType()
   * @generated
   * @ordered
   */
  protected static final String RANGE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeType()
   * @generated
   * @ordered
   */
  protected String rangeType = RANGE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getRangeUnits() <em>Range Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeUnits()
   * @generated
   * @ordered
   */
  protected static final String RANGE_UNITS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRangeUnits() <em>Range Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeUnits()
   * @generated
   * @ordered
   */
  protected String rangeUnits = RANGE_UNITS_EDEFAULT;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<String> values;

  /**
   * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRate()
   * @generated
   * @ordered
   */
  protected BigUnitValue rate;

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected BigUnitValue delay;

  /**
   * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeadline()
   * @generated
   * @ordered
   */
  protected BigUnitValue deadline;

  /**
   * The default value of the '{@link #getCompletionHandling() <em>Completion Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompletionHandling()
   * @generated
   * @ordered
   */
  protected static final String COMPLETION_HANDLING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCompletionHandling() <em>Completion Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompletionHandling()
   * @generated
   * @ordered
   */
  protected String completionHandling = COMPLETION_HANDLING_EDEFAULT;

  /**
   * The default value of the '{@link #getVariables() <em>Variables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected static final String VARIABLES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected String variables = VARIABLES_EDEFAULT;

  /**
   * The default value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationship()
   * @generated
   * @ordered
   */
  protected static final String RELATIONSHIP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationship()
   * @generated
   * @ordered
   */
  protected String relationship = RELATIONSHIP_EDEFAULT;

  /**
   * The cached value of the '{@link #getMinResponse() <em>Min Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinResponse()
   * @generated
   * @ordered
   */
  protected BigUnitValue minResponse;

  /**
   * The cached value of the '{@link #getMaxResponse() <em>Max Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxResponse()
   * @generated
   * @ordered
   */
  protected BigUnitValue maxResponse;

  /**
   * The default value of the '{@link #getFeebackHandling() <em>Feeback Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeebackHandling()
   * @generated
   * @ordered
   */
  protected static final String FEEBACK_HANDLING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeebackHandling() <em>Feeback Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeebackHandling()
   * @generated
   * @ordered
   */
  protected String feebackHandling = FEEBACK_HANDLING_EDEFAULT;

  /**
   * The default value of the '{@link #getReversed() <em>Reversed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReversed()
   * @generated
   * @ordered
   */
  protected static final String REVERSED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReversed() <em>Reversed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReversed()
   * @generated
   * @ordered
   */
  protected String reversed = REVERSED_EDEFAULT;

  /**
   * The default value of the '{@link #getReferences() <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected static final String REFERENCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected String references = REFERENCES_EDEFAULT;

  /**
   * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected static final String COMMENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected String comments = COMMENTS_EDEFAULT;

  /**
   * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected static final String CONTENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected String contents = CONTENTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected TriggerTable table;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StateSpecificationPackage.Literals.OUTPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getLower()
  {
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(BigDecimal newLower)
  {
    BigDecimal oldLower = lower;
    lower = newLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__LOWER, oldLower, lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getUpper()
  {
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(BigDecimal newUpper)
  {
    BigDecimal oldUpper = upper;
    upper = newUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__UPPER, oldUpper, upper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRangeType()
  {
    return rangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeType(String newRangeType)
  {
    String oldRangeType = rangeType;
    rangeType = newRangeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__RANGE_TYPE, oldRangeType, rangeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRangeUnits()
  {
    return rangeUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeUnits(String newRangeUnits)
  {
    String oldRangeUnits = rangeUnits;
    rangeUnits = newRangeUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__RANGE_UNITS, oldRangeUnits, rangeUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<String>(String.class, this, StateSpecificationPackage.OUTPUT__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getRate()
  {
    return rate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRate(BigUnitValue newRate, NotificationChain msgs)
  {
    BigUnitValue oldRate = rate;
    rate = newRate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__RATE, oldRate, newRate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRate(BigUnitValue newRate)
  {
    if (newRate != rate)
    {
      NotificationChain msgs = null;
      if (rate != null)
        msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__RATE, null, msgs);
      if (newRate != null)
        msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__RATE, null, msgs);
      msgs = basicSetRate(newRate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__RATE, newRate, newRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getDelay()
  {
    return delay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelay(BigUnitValue newDelay, NotificationChain msgs)
  {
    BigUnitValue oldDelay = delay;
    delay = newDelay;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__DELAY, oldDelay, newDelay);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelay(BigUnitValue newDelay)
  {
    if (newDelay != delay)
    {
      NotificationChain msgs = null;
      if (delay != null)
        msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__DELAY, null, msgs);
      if (newDelay != null)
        msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__DELAY, null, msgs);
      msgs = basicSetDelay(newDelay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__DELAY, newDelay, newDelay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getDeadline()
  {
    return deadline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeadline(BigUnitValue newDeadline, NotificationChain msgs)
  {
    BigUnitValue oldDeadline = deadline;
    deadline = newDeadline;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__DEADLINE, oldDeadline, newDeadline);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeadline(BigUnitValue newDeadline)
  {
    if (newDeadline != deadline)
    {
      NotificationChain msgs = null;
      if (deadline != null)
        msgs = ((InternalEObject)deadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__DEADLINE, null, msgs);
      if (newDeadline != null)
        msgs = ((InternalEObject)newDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__DEADLINE, null, msgs);
      msgs = basicSetDeadline(newDeadline, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__DEADLINE, newDeadline, newDeadline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCompletionHandling()
  {
    return completionHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompletionHandling(String newCompletionHandling)
  {
    String oldCompletionHandling = completionHandling;
    completionHandling = newCompletionHandling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__COMPLETION_HANDLING, oldCompletionHandling, completionHandling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariables()
  {
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariables(String newVariables)
  {
    String oldVariables = variables;
    variables = newVariables;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__VARIABLES, oldVariables, variables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelationship()
  {
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationship(String newRelationship)
  {
    String oldRelationship = relationship;
    relationship = newRelationship;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__RELATIONSHIP, oldRelationship, relationship));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getMinResponse()
  {
    return minResponse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinResponse(BigUnitValue newMinResponse, NotificationChain msgs)
  {
    BigUnitValue oldMinResponse = minResponse;
    minResponse = newMinResponse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__MIN_RESPONSE, oldMinResponse, newMinResponse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinResponse(BigUnitValue newMinResponse)
  {
    if (newMinResponse != minResponse)
    {
      NotificationChain msgs = null;
      if (minResponse != null)
        msgs = ((InternalEObject)minResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__MIN_RESPONSE, null, msgs);
      if (newMinResponse != null)
        msgs = ((InternalEObject)newMinResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__MIN_RESPONSE, null, msgs);
      msgs = basicSetMinResponse(newMinResponse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__MIN_RESPONSE, newMinResponse, newMinResponse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getMaxResponse()
  {
    return maxResponse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxResponse(BigUnitValue newMaxResponse, NotificationChain msgs)
  {
    BigUnitValue oldMaxResponse = maxResponse;
    maxResponse = newMaxResponse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__MAX_RESPONSE, oldMaxResponse, newMaxResponse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxResponse(BigUnitValue newMaxResponse)
  {
    if (newMaxResponse != maxResponse)
    {
      NotificationChain msgs = null;
      if (maxResponse != null)
        msgs = ((InternalEObject)maxResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__MAX_RESPONSE, null, msgs);
      if (newMaxResponse != null)
        msgs = ((InternalEObject)newMaxResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__MAX_RESPONSE, null, msgs);
      msgs = basicSetMaxResponse(newMaxResponse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__MAX_RESPONSE, newMaxResponse, newMaxResponse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeebackHandling()
  {
    return feebackHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeebackHandling(String newFeebackHandling)
  {
    String oldFeebackHandling = feebackHandling;
    feebackHandling = newFeebackHandling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__FEEBACK_HANDLING, oldFeebackHandling, feebackHandling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReversed()
  {
    return reversed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReversed(String newReversed)
  {
    String oldReversed = reversed;
    reversed = newReversed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__REVERSED, oldReversed, reversed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferences()
  {
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferences(String newReferences)
  {
    String oldReferences = references;
    references = newReferences;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__REFERENCES, oldReferences, references));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComments()
  {
    return comments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComments(String newComments)
  {
    String oldComments = comments;
    comments = newComments;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__COMMENTS, oldComments, comments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContents()
  {
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContents(String newContents)
  {
    String oldContents = contents;
    contents = newContents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__CONTENTS, oldContents, contents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerTable getTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTable(TriggerTable newTable, NotificationChain msgs)
  {
    TriggerTable oldTable = table;
    table = newTable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__TABLE, oldTable, newTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(TriggerTable newTable)
  {
    if (newTable != table)
    {
      NotificationChain msgs = null;
      if (table != null)
        msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__TABLE, null, msgs);
      if (newTable != null)
        msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.OUTPUT__TABLE, null, msgs);
      msgs = basicSetTable(newTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.OUTPUT__TABLE, newTable, newTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StateSpecificationPackage.OUTPUT__RATE:
        return basicSetRate(null, msgs);
      case StateSpecificationPackage.OUTPUT__DELAY:
        return basicSetDelay(null, msgs);
      case StateSpecificationPackage.OUTPUT__DEADLINE:
        return basicSetDeadline(null, msgs);
      case StateSpecificationPackage.OUTPUT__MIN_RESPONSE:
        return basicSetMinResponse(null, msgs);
      case StateSpecificationPackage.OUTPUT__MAX_RESPONSE:
        return basicSetMaxResponse(null, msgs);
      case StateSpecificationPackage.OUTPUT__TABLE:
        return basicSetTable(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StateSpecificationPackage.OUTPUT__LOWER:
        return getLower();
      case StateSpecificationPackage.OUTPUT__UPPER:
        return getUpper();
      case StateSpecificationPackage.OUTPUT__RANGE_TYPE:
        return getRangeType();
      case StateSpecificationPackage.OUTPUT__RANGE_UNITS:
        return getRangeUnits();
      case StateSpecificationPackage.OUTPUT__VALUES:
        return getValues();
      case StateSpecificationPackage.OUTPUT__RATE:
        return getRate();
      case StateSpecificationPackage.OUTPUT__DELAY:
        return getDelay();
      case StateSpecificationPackage.OUTPUT__DEADLINE:
        return getDeadline();
      case StateSpecificationPackage.OUTPUT__COMPLETION_HANDLING:
        return getCompletionHandling();
      case StateSpecificationPackage.OUTPUT__VARIABLES:
        return getVariables();
      case StateSpecificationPackage.OUTPUT__RELATIONSHIP:
        return getRelationship();
      case StateSpecificationPackage.OUTPUT__MIN_RESPONSE:
        return getMinResponse();
      case StateSpecificationPackage.OUTPUT__MAX_RESPONSE:
        return getMaxResponse();
      case StateSpecificationPackage.OUTPUT__FEEBACK_HANDLING:
        return getFeebackHandling();
      case StateSpecificationPackage.OUTPUT__REVERSED:
        return getReversed();
      case StateSpecificationPackage.OUTPUT__REFERENCES:
        return getReferences();
      case StateSpecificationPackage.OUTPUT__COMMENTS:
        return getComments();
      case StateSpecificationPackage.OUTPUT__CONTENTS:
        return getContents();
      case StateSpecificationPackage.OUTPUT__TABLE:
        return getTable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StateSpecificationPackage.OUTPUT__LOWER:
        setLower((BigDecimal)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__UPPER:
        setUpper((BigDecimal)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__RANGE_TYPE:
        setRangeType((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__RANGE_UNITS:
        setRangeUnits((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends String>)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__RATE:
        setRate((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__DELAY:
        setDelay((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__DEADLINE:
        setDeadline((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__COMPLETION_HANDLING:
        setCompletionHandling((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__VARIABLES:
        setVariables((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__RELATIONSHIP:
        setRelationship((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__MIN_RESPONSE:
        setMinResponse((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__MAX_RESPONSE:
        setMaxResponse((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__FEEBACK_HANDLING:
        setFeebackHandling((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__REVERSED:
        setReversed((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__REFERENCES:
        setReferences((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__COMMENTS:
        setComments((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__CONTENTS:
        setContents((String)newValue);
        return;
      case StateSpecificationPackage.OUTPUT__TABLE:
        setTable((TriggerTable)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StateSpecificationPackage.OUTPUT__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__UPPER:
        setUpper(UPPER_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__RANGE_TYPE:
        setRangeType(RANGE_TYPE_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__RANGE_UNITS:
        setRangeUnits(RANGE_UNITS_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__VALUES:
        getValues().clear();
        return;
      case StateSpecificationPackage.OUTPUT__RATE:
        setRate((BigUnitValue)null);
        return;
      case StateSpecificationPackage.OUTPUT__DELAY:
        setDelay((BigUnitValue)null);
        return;
      case StateSpecificationPackage.OUTPUT__DEADLINE:
        setDeadline((BigUnitValue)null);
        return;
      case StateSpecificationPackage.OUTPUT__COMPLETION_HANDLING:
        setCompletionHandling(COMPLETION_HANDLING_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__VARIABLES:
        setVariables(VARIABLES_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__RELATIONSHIP:
        setRelationship(RELATIONSHIP_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__MIN_RESPONSE:
        setMinResponse((BigUnitValue)null);
        return;
      case StateSpecificationPackage.OUTPUT__MAX_RESPONSE:
        setMaxResponse((BigUnitValue)null);
        return;
      case StateSpecificationPackage.OUTPUT__FEEBACK_HANDLING:
        setFeebackHandling(FEEBACK_HANDLING_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__REVERSED:
        setReversed(REVERSED_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__REFERENCES:
        setReferences(REFERENCES_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__COMMENTS:
        setComments(COMMENTS_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__CONTENTS:
        setContents(CONTENTS_EDEFAULT);
        return;
      case StateSpecificationPackage.OUTPUT__TABLE:
        setTable((TriggerTable)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StateSpecificationPackage.OUTPUT__LOWER:
        return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
      case StateSpecificationPackage.OUTPUT__UPPER:
        return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
      case StateSpecificationPackage.OUTPUT__RANGE_TYPE:
        return RANGE_TYPE_EDEFAULT == null ? rangeType != null : !RANGE_TYPE_EDEFAULT.equals(rangeType);
      case StateSpecificationPackage.OUTPUT__RANGE_UNITS:
        return RANGE_UNITS_EDEFAULT == null ? rangeUnits != null : !RANGE_UNITS_EDEFAULT.equals(rangeUnits);
      case StateSpecificationPackage.OUTPUT__VALUES:
        return values != null && !values.isEmpty();
      case StateSpecificationPackage.OUTPUT__RATE:
        return rate != null;
      case StateSpecificationPackage.OUTPUT__DELAY:
        return delay != null;
      case StateSpecificationPackage.OUTPUT__DEADLINE:
        return deadline != null;
      case StateSpecificationPackage.OUTPUT__COMPLETION_HANDLING:
        return COMPLETION_HANDLING_EDEFAULT == null ? completionHandling != null : !COMPLETION_HANDLING_EDEFAULT.equals(completionHandling);
      case StateSpecificationPackage.OUTPUT__VARIABLES:
        return VARIABLES_EDEFAULT == null ? variables != null : !VARIABLES_EDEFAULT.equals(variables);
      case StateSpecificationPackage.OUTPUT__RELATIONSHIP:
        return RELATIONSHIP_EDEFAULT == null ? relationship != null : !RELATIONSHIP_EDEFAULT.equals(relationship);
      case StateSpecificationPackage.OUTPUT__MIN_RESPONSE:
        return minResponse != null;
      case StateSpecificationPackage.OUTPUT__MAX_RESPONSE:
        return maxResponse != null;
      case StateSpecificationPackage.OUTPUT__FEEBACK_HANDLING:
        return FEEBACK_HANDLING_EDEFAULT == null ? feebackHandling != null : !FEEBACK_HANDLING_EDEFAULT.equals(feebackHandling);
      case StateSpecificationPackage.OUTPUT__REVERSED:
        return REVERSED_EDEFAULT == null ? reversed != null : !REVERSED_EDEFAULT.equals(reversed);
      case StateSpecificationPackage.OUTPUT__REFERENCES:
        return REFERENCES_EDEFAULT == null ? references != null : !REFERENCES_EDEFAULT.equals(references);
      case StateSpecificationPackage.OUTPUT__COMMENTS:
        return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
      case StateSpecificationPackage.OUTPUT__CONTENTS:
        return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
      case StateSpecificationPackage.OUTPUT__TABLE:
        return table != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lower: ");
    result.append(lower);
    result.append(", upper: ");
    result.append(upper);
    result.append(", rangeType: ");
    result.append(rangeType);
    result.append(", rangeUnits: ");
    result.append(rangeUnits);
    result.append(", values: ");
    result.append(values);
    result.append(", completionHandling: ");
    result.append(completionHandling);
    result.append(", variables: ");
    result.append(variables);
    result.append(", relationship: ");
    result.append(relationship);
    result.append(", feebackHandling: ");
    result.append(feebackHandling);
    result.append(", reversed: ");
    result.append(reversed);
    result.append(", references: ");
    result.append(references);
    result.append(", comments: ");
    result.append(comments);
    result.append(", contents: ");
    result.append(contents);
    result.append(')');
    return result.toString();
  }

} //OutputImpl
