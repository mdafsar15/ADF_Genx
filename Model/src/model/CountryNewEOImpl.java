package model;

import java.math.BigDecimal;

import java.math.BigInteger;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 21 15:17:54 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CountryNewEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CountryId,
        CountryName,
        RegionId,
        LocationEO,
        RegionsEO;
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
    public static final int LOCATIONEO = AttributesEnum.LocationEO.index();
    public static final int REGIONSEO = AttributesEnum.RegionsEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CountryNewEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.CountryNewEO");
    }


    /**
     * Gets the attribute value for CountryId, using the alias name CountryId.
     * @return the value of CountryId
     */
    public String getCountryId() {
        return (String) getAttributeInternal(COUNTRYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CountryId.
     * @param value value to set the CountryId
     */
    public void setCountryId(String value) {
        setAttributeInternal(COUNTRYID, value);
    }

    /**
     * Gets the attribute value for CountryName, using the alias name CountryName.
     * @return the value of CountryName
     */
    public String getCountryName() {
        return (String) getAttributeInternal(COUNTRYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for CountryName.
     * @param value value to set the CountryName
     */
    public void setCountryName(String value) {
        setAttributeInternal(COUNTRYNAME, value);
    }

    /**
     * Gets the attribute value for RegionId, using the alias name RegionId.
     * @return the value of RegionId
     */
    public BigDecimal getRegionId() {
        return (BigDecimal) getAttributeInternal(REGIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegionId.
     * @param value value to set the RegionId
     */
    public void setRegionId(BigDecimal value) {
        setAttributeInternal(REGIONID, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLocationEO() {
        return (RowIterator) getAttributeInternal(LOCATIONEO);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getRegionsEO() {
        return (EntityImpl) getAttributeInternal(REGIONSEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setRegionsEO(EntityImpl value) {
        setAttributeInternal(REGIONSEO, value);
    }


    /**
     * @param countryId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String countryId) {
        return new Key(new Object[] { countryId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

