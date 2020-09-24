package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 24 14:21:32 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SalesEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Product,
        Dateofsale,
        Age,
        Sex,
        Location,
        Price,
        Modeofsale,
        Category;
        private static AttributesEnum[] vals = null;
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
    public static final int PRODUCT = AttributesEnum.Product.index();
    public static final int DATEOFSALE = AttributesEnum.Dateofsale.index();
    public static final int AGE = AttributesEnum.Age.index();
    public static final int SEX = AttributesEnum.Sex.index();
    public static final int LOCATION = AttributesEnum.Location.index();
    public static final int PRICE = AttributesEnum.Price.index();
    public static final int MODEOFSALE = AttributesEnum.Modeofsale.index();
    public static final int CATEGORY = AttributesEnum.Category.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SalesEOImpl() {
    }

    /**
     * Gets the attribute value for Product, using the alias name Product.
     * @return the value of Product
     */
    public String getProduct() {
        return (String) getAttributeInternal(PRODUCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Product.
     * @param value value to set the Product
     */
    public void setProduct(String value) {
        setAttributeInternal(PRODUCT, value);
    }

    /**
     * Gets the attribute value for Dateofsale, using the alias name Dateofsale.
     * @return the value of Dateofsale
     */
    public Timestamp getDateofsale() {
        return (Timestamp) getAttributeInternal(DATEOFSALE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dateofsale.
     * @param value value to set the Dateofsale
     */
    public void setDateofsale(Timestamp value) {
        setAttributeInternal(DATEOFSALE, value);
    }

    /**
     * Gets the attribute value for Age, using the alias name Age.
     * @return the value of Age
     */
    public BigDecimal getAge() {
        return (BigDecimal) getAttributeInternal(AGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Age.
     * @param value value to set the Age
     */
    public void setAge(BigDecimal value) {
        setAttributeInternal(AGE, value);
    }

    /**
     * Gets the attribute value for Sex, using the alias name Sex.
     * @return the value of Sex
     */
    public String getSex() {
        return (String) getAttributeInternal(SEX);
    }

    /**
     * Sets <code>value</code> as the attribute value for Sex.
     * @param value value to set the Sex
     */
    public void setSex(String value) {
        setAttributeInternal(SEX, value);
    }

    /**
     * Gets the attribute value for Location, using the alias name Location.
     * @return the value of Location
     */
    public String getLocation() {
        return (String) getAttributeInternal(LOCATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Location.
     * @param value value to set the Location
     */
    public void setLocation(String value) {
        setAttributeInternal(LOCATION, value);
    }

    /**
     * Gets the attribute value for Price, using the alias name Price.
     * @return the value of Price
     */
    public BigDecimal getPrice() {
        return (BigDecimal) getAttributeInternal(PRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Price.
     * @param value value to set the Price
     */
    public void setPrice(BigDecimal value) {
        setAttributeInternal(PRICE, value);
    }

    /**
     * Gets the attribute value for Modeofsale, using the alias name Modeofsale.
     * @return the value of Modeofsale
     */
    public String getModeofsale() {
        return (String) getAttributeInternal(MODEOFSALE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modeofsale.
     * @param value value to set the Modeofsale
     */
    public void setModeofsale(String value) {
        setAttributeInternal(MODEOFSALE, value);
    }

    /**
     * Gets the attribute value for Category, using the alias name Category.
     * @return the value of Category
     */
    public String getCategory() {
        return (String) getAttributeInternal(CATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Category.
     * @param value value to set the Category
     */
    public void setCategory(String value) {
        setAttributeInternal(CATEGORY, value);
    }

    /**
     * @param product key constituent
     * @param dateofsale key constituent
     * @param age key constituent
     * @param sex key constituent
     * @param location key constituent
     * @param price key constituent
     * @param modeofsale key constituent
     * @param category key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String product, Timestamp dateofsale, BigDecimal age, String sex,
                                       String location, BigDecimal price, String modeofsale, String category) {
        return new Key(new Object[] { product, dateofsale, age, sex, location, price, modeofsale, category });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.SalesEO");
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
