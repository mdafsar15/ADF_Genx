package model.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CountryNewViewSDOImpl extends SDODataObject implements CountryNewViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 2;

   public CountryNewViewSDOImpl() {}

   public java.lang.String getCountryId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setCountryId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getCountryName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setCountryName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getRegionId() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setRegionId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }


}

