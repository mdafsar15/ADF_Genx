package model.common;

import java.math.BigDecimal;

import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 21 15:22:43 IST 2020
// ---------------------------------------------------------------------
public interface CountryNewViewRow extends Row {
    String getCountryId();

    void setCountryId(String value);

    String getCountryName();

    void setCountryName(String value);

    BigDecimal getRegionId();

    void setRegionId(BigDecimal value);
}
