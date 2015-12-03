//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:22 AM EST 
//


package com.coda.efinance.schemas.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCtDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtDateType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="date_type_days"/&gt;
 *     &lt;enumeration value="date_type_weeks"/&gt;
 *     &lt;enumeration value="date_type_months"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtDateType")
@XmlEnum
public enum TypeCtDateType {

    @XmlEnumValue("date_type_days")
    DATE_TYPE_DAYS("date_type_days"),
    @XmlEnumValue("date_type_weeks")
    DATE_TYPE_WEEKS("date_type_weeks"),
    @XmlEnumValue("date_type_months")
    DATE_TYPE_MONTHS("date_type_months");
    private final String value;

    TypeCtDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtDateType fromValue(String v) {
        for (TypeCtDateType c: TypeCtDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}