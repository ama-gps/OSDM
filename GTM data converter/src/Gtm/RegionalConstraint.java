/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regional Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.RegionalConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.RegionalConstraint#getDistance <em>Distance</em>}</li>
 *   <li>{@link Gtm.RegionalConstraint#getEntryConnectionPoint <em>Entry Connection Point</em>}</li>
 *   <li>{@link Gtm.RegionalConstraint#getExitConnectionPoint <em>Exit Connection Point</em>}</li>
 *   <li>{@link Gtm.RegionalConstraint#getRegionalValidity <em>Regional Validity</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getRegionalConstraint()
 * @model
 * @generated
 */
public interface RegionalConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getRegionalConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.RegionalConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see Gtm.GtmPackage#getRegionalConstraint_Distance()
	 * @model
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link Gtm.RegionalConstraint#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Entry Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Connection Point</em>' reference.
	 * @see #setEntryConnectionPoint(ConnectionPoint)
	 * @see Gtm.GtmPackage#getRegionalConstraint_EntryConnectionPoint()
	 * @model
	 * @generated
	 */
	ConnectionPoint getEntryConnectionPoint();

	/**
	 * Sets the value of the '{@link Gtm.RegionalConstraint#getEntryConnectionPoint <em>Entry Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Connection Point</em>' reference.
	 * @see #getEntryConnectionPoint()
	 * @generated
	 */
	void setEntryConnectionPoint(ConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>Exit Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Connection Point</em>' reference.
	 * @see #setExitConnectionPoint(ConnectionPoint)
	 * @see Gtm.GtmPackage#getRegionalConstraint_ExitConnectionPoint()
	 * @model
	 * @generated
	 */
	ConnectionPoint getExitConnectionPoint();

	/**
	 * Sets the value of the '{@link Gtm.RegionalConstraint#getExitConnectionPoint <em>Exit Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Connection Point</em>' reference.
	 * @see #getExitConnectionPoint()
	 * @generated
	 */
	void setExitConnectionPoint(ConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>Regional Validity</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.RegionalValidity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional Validity</em>' containment reference list.
	 * @see Gtm.GtmPackage#getRegionalConstraint_RegionalValidity()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegionalValidity> getRegionalValidity();

} // RegionalConstraint