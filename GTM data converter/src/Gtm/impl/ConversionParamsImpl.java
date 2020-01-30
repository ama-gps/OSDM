/**
 */
package Gtm.impl;

import Gtm.ConversionParams;
import Gtm.Country;
import Gtm.EndOfSale;
import Gtm.GtmPackage;
import Gtm.LegacyStationMappings;
import Gtm.LegacyStationToServiceConstraintMappings;
import Gtm.LegacyTargetFares;
import Gtm.LegacyZoneMappings;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getVATpercentage <em>VA Tpercentage</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyStationMappings <em>Legacy Station Mappings</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyTargetFares <em>Legacy Target Fares</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyZoneMappings <em>Legacy Zone Mappings</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getEndOfSale <em>End Of Sale</em>}</li>
 *   <li>{@link Gtm.impl.ConversionParamsImpl#getStartOfSale <em>Start Of Sale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionParamsImpl extends MinimalEObjectImpl.Container implements ConversionParams {
	/**
	 * The default value of the '{@link #getTaxId() <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxId() <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxId()
	 * @generated
	 * @ordered
	 */
	protected String taxId = TAX_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVATpercentage() <em>VA Tpercentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVATpercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float VA_TPERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVATpercentage() <em>VA Tpercentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVATpercentage()
	 * @generated
	 * @ordered
	 */
	protected float vaTpercentage = VA_TPERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The cached value of the '{@link #getLegacyStationMappings() <em>Legacy Station Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationMappings()
	 * @generated
	 * @ordered
	 */
	protected LegacyStationMappings legacyStationMappings;

	/**
	 * The cached value of the '{@link #getLegacyTargetFares() <em>Legacy Target Fares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyTargetFares()
	 * @generated
	 * @ordered
	 */
	protected LegacyTargetFares legacyTargetFares;

	/**
	 * The cached value of the '{@link #getLegacyZoneMappings() <em>Legacy Zone Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyZoneMappings()
	 * @generated
	 * @ordered
	 */
	protected LegacyZoneMappings legacyZoneMappings;

	/**
	 * The cached value of the '{@link #getLegacyStationToServiceBrandMappings() <em>Legacy Station To Service Brand Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyStationToServiceBrandMappings()
	 * @generated
	 * @ordered
	 */
	protected LegacyStationToServiceConstraintMappings legacyStationToServiceBrandMappings;

	/**
	 * The cached value of the '{@link #getEndOfSale() <em>End Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfSale()
	 * @generated
	 * @ordered
	 */
	protected EndOfSale endOfSale;

	/**
	 * The cached value of the '{@link #getStartOfSale() <em>Start Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOfSale()
	 * @generated
	 * @ordered
	 */
	protected EndOfSale startOfSale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.CONVERSION_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxId() {
		return taxId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxId(String newTaxId) {
		String oldTaxId = taxId;
		taxId = newTaxId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__TAX_ID, oldTaxId, taxId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVATpercentage() {
		return vaTpercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVATpercentage(float newVATpercentage) {
		float oldVATpercentage = vaTpercentage;
		vaTpercentage = newVATpercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE, oldVATpercentage, vaTpercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtmPackage.CONVERSION_PARAMS__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationMappings getLegacyStationMappings() {
		return legacyStationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyStationMappings(LegacyStationMappings newLegacyStationMappings, NotificationChain msgs) {
		LegacyStationMappings oldLegacyStationMappings = legacyStationMappings;
		legacyStationMappings = newLegacyStationMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS, oldLegacyStationMappings, newLegacyStationMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStationMappings(LegacyStationMappings newLegacyStationMappings) {
		if (newLegacyStationMappings != legacyStationMappings) {
			NotificationChain msgs = null;
			if (legacyStationMappings != null)
				msgs = ((InternalEObject)legacyStationMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS, null, msgs);
			if (newLegacyStationMappings != null)
				msgs = ((InternalEObject)newLegacyStationMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS, null, msgs);
			msgs = basicSetLegacyStationMappings(newLegacyStationMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS, newLegacyStationMappings, newLegacyStationMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyTargetFares getLegacyTargetFares() {
		return legacyTargetFares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyTargetFares(LegacyTargetFares newLegacyTargetFares, NotificationChain msgs) {
		LegacyTargetFares oldLegacyTargetFares = legacyTargetFares;
		legacyTargetFares = newLegacyTargetFares;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES, oldLegacyTargetFares, newLegacyTargetFares);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyTargetFares(LegacyTargetFares newLegacyTargetFares) {
		if (newLegacyTargetFares != legacyTargetFares) {
			NotificationChain msgs = null;
			if (legacyTargetFares != null)
				msgs = ((InternalEObject)legacyTargetFares).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES, null, msgs);
			if (newLegacyTargetFares != null)
				msgs = ((InternalEObject)newLegacyTargetFares).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES, null, msgs);
			msgs = basicSetLegacyTargetFares(newLegacyTargetFares, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES, newLegacyTargetFares, newLegacyTargetFares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyZoneMappings getLegacyZoneMappings() {
		return legacyZoneMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyZoneMappings(LegacyZoneMappings newLegacyZoneMappings, NotificationChain msgs) {
		LegacyZoneMappings oldLegacyZoneMappings = legacyZoneMappings;
		legacyZoneMappings = newLegacyZoneMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS, oldLegacyZoneMappings, newLegacyZoneMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyZoneMappings(LegacyZoneMappings newLegacyZoneMappings) {
		if (newLegacyZoneMappings != legacyZoneMappings) {
			NotificationChain msgs = null;
			if (legacyZoneMappings != null)
				msgs = ((InternalEObject)legacyZoneMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS, null, msgs);
			if (newLegacyZoneMappings != null)
				msgs = ((InternalEObject)newLegacyZoneMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS, null, msgs);
			msgs = basicSetLegacyZoneMappings(newLegacyZoneMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS, newLegacyZoneMappings, newLegacyZoneMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationToServiceConstraintMappings getLegacyStationToServiceBrandMappings() {
		return legacyStationToServiceBrandMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyStationToServiceBrandMappings(LegacyStationToServiceConstraintMappings newLegacyStationToServiceBrandMappings, NotificationChain msgs) {
		LegacyStationToServiceConstraintMappings oldLegacyStationToServiceBrandMappings = legacyStationToServiceBrandMappings;
		legacyStationToServiceBrandMappings = newLegacyStationToServiceBrandMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, oldLegacyStationToServiceBrandMappings, newLegacyStationToServiceBrandMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyStationToServiceBrandMappings(LegacyStationToServiceConstraintMappings newLegacyStationToServiceBrandMappings) {
		if (newLegacyStationToServiceBrandMappings != legacyStationToServiceBrandMappings) {
			NotificationChain msgs = null;
			if (legacyStationToServiceBrandMappings != null)
				msgs = ((InternalEObject)legacyStationToServiceBrandMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, null, msgs);
			if (newLegacyStationToServiceBrandMappings != null)
				msgs = ((InternalEObject)newLegacyStationToServiceBrandMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, null, msgs);
			msgs = basicSetLegacyStationToServiceBrandMappings(newLegacyStationToServiceBrandMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, newLegacyStationToServiceBrandMappings, newLegacyStationToServiceBrandMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfSale getEndOfSale() {
		return endOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndOfSale(EndOfSale newEndOfSale, NotificationChain msgs) {
		EndOfSale oldEndOfSale = endOfSale;
		endOfSale = newEndOfSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__END_OF_SALE, oldEndOfSale, newEndOfSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfSale(EndOfSale newEndOfSale) {
		if (newEndOfSale != endOfSale) {
			NotificationChain msgs = null;
			if (endOfSale != null)
				msgs = ((InternalEObject)endOfSale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__END_OF_SALE, null, msgs);
			if (newEndOfSale != null)
				msgs = ((InternalEObject)newEndOfSale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__END_OF_SALE, null, msgs);
			msgs = basicSetEndOfSale(newEndOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__END_OF_SALE, newEndOfSale, newEndOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfSale getStartOfSale() {
		return startOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOfSale(EndOfSale newStartOfSale, NotificationChain msgs) {
		EndOfSale oldStartOfSale = startOfSale;
		startOfSale = newStartOfSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__START_OF_SALE, oldStartOfSale, newStartOfSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOfSale(EndOfSale newStartOfSale) {
		if (newStartOfSale != startOfSale) {
			NotificationChain msgs = null;
			if (startOfSale != null)
				msgs = ((InternalEObject)startOfSale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__START_OF_SALE, null, msgs);
			if (newStartOfSale != null)
				msgs = ((InternalEObject)newStartOfSale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtmPackage.CONVERSION_PARAMS__START_OF_SALE, null, msgs);
			msgs = basicSetStartOfSale(newStartOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtmPackage.CONVERSION_PARAMS__START_OF_SALE, newStartOfSale, newStartOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				return basicSetLegacyStationMappings(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES:
				return basicSetLegacyTargetFares(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS:
				return basicSetLegacyZoneMappings(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return basicSetLegacyStationToServiceBrandMappings(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return basicSetEndOfSale(null, msgs);
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return basicSetStartOfSale(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
				return getTaxId();
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
				return getVATpercentage();
			case GtmPackage.CONVERSION_PARAMS__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				return getLegacyStationMappings();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES:
				return getLegacyTargetFares();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS:
				return getLegacyZoneMappings();
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return getLegacyStationToServiceBrandMappings();
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return getEndOfSale();
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return getStartOfSale();
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
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
				setTaxId((String)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
				setVATpercentage((Float)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__COUNTRY:
				setCountry((Country)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				setLegacyStationMappings((LegacyStationMappings)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES:
				setLegacyTargetFares((LegacyTargetFares)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS:
				setLegacyZoneMappings((LegacyZoneMappings)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				setLegacyStationToServiceBrandMappings((LegacyStationToServiceConstraintMappings)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				setEndOfSale((EndOfSale)newValue);
				return;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				setStartOfSale((EndOfSale)newValue);
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
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
				setTaxId(TAX_ID_EDEFAULT);
				return;
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
				setVATpercentage(VA_TPERCENTAGE_EDEFAULT);
				return;
			case GtmPackage.CONVERSION_PARAMS__COUNTRY:
				setCountry((Country)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				setLegacyStationMappings((LegacyStationMappings)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES:
				setLegacyTargetFares((LegacyTargetFares)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS:
				setLegacyZoneMappings((LegacyZoneMappings)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				setLegacyStationToServiceBrandMappings((LegacyStationToServiceConstraintMappings)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				setEndOfSale((EndOfSale)null);
				return;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				setStartOfSale((EndOfSale)null);
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
			case GtmPackage.CONVERSION_PARAMS__TAX_ID:
				return TAX_ID_EDEFAULT == null ? taxId != null : !TAX_ID_EDEFAULT.equals(taxId);
			case GtmPackage.CONVERSION_PARAMS__VA_TPERCENTAGE:
				return vaTpercentage != VA_TPERCENTAGE_EDEFAULT;
			case GtmPackage.CONVERSION_PARAMS__COUNTRY:
				return country != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS:
				return legacyStationMappings != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_TARGET_FARES:
				return legacyTargetFares != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_ZONE_MAPPINGS:
				return legacyZoneMappings != null;
			case GtmPackage.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS:
				return legacyStationToServiceBrandMappings != null;
			case GtmPackage.CONVERSION_PARAMS__END_OF_SALE:
				return endOfSale != null;
			case GtmPackage.CONVERSION_PARAMS__START_OF_SALE:
				return startOfSale != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (TaxId: ");
		result.append(taxId);
		result.append(", VATpercentage: ");
		result.append(vaTpercentage);
		result.append(')');
		return result.toString();
	}

} //ConversionParamsImpl