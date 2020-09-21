package model;

import java.math.BigDecimal;

import model.common.CountryNewViewRow;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 21 15:22:33 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CountryNewViewRowImpl extends ViewRowImpl implements CountryNewViewRow {

    public static final int ENTITY_COUNTRYNEWEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CountryId,
        CountryName,
        RegionId;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int COUNTRYID = AttributesEnum.CountryId.index();
    public static final int COUNTRYNAME = AttributesEnum.CountryName.index();
    public static final int REGIONID = AttributesEnum.RegionId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CountryNewViewRowImpl() {
    }

    /**
     * Gets CountryNewEO entity object.
     * @return the CountryNewEO
     */
    public CountryNewEOImpl getCountryNewEO() {
        return (CountryNewEOImpl) getEntity(ENTITY_COUNTRYNEWEO);
    }

    /**
     * Gets the attribute value for COUNTRY_ID using the alias name CountryId.
     * @return the COUNTRY_ID
     */
    public String getCountryId() {
        return (String) getAttributeInternal(COUNTRYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COUNTRY_ID using the alias name CountryId.
     * @param value value to set the COUNTRY_ID
     */
    public void setCountryId(String value) {
        setAttributeInternal(COUNTRYID, value);
    }

    /**
     * Gets the attribute value for COUNTRY_NAME using the alias name CountryName.
     * @return the COUNTRY_NAME
     */
    public String getCountryName() {
        return (String) getAttributeInternal(COUNTRYNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for COUNTRY_NAME using the alias name CountryName.
     * @param value value to set the COUNTRY_NAME
     */
    public void setCountryName(String value) {
        setAttributeInternal(COUNTRYNAME, value);
    }

    /**
     * Gets the attribute value for REGION_ID using the alias name RegionId.
     * @return the REGION_ID
     */
    public BigDecimal getRegionId() {
        return (BigDecimal) getAttributeInternal(REGIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for REGION_ID using the alias name RegionId.
     * @param value value to set the REGION_ID
     */
    public void setRegionId(BigDecimal value) {
        setAttributeInternal(REGIONID, value);
    }
}

