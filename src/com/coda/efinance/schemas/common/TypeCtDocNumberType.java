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
 * <p>Java class for typeCtDocNumberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtDocNumberType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="numeric"/&gt;
 *     &lt;enumeration value="alphanumeric"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtDocNumberType")
@XmlEnum
public enum TypeCtDocNumberType {


    /**
     * Numeric document number.
     * 
     */
    @XmlEnumValue("numeric")
    NUMERIC("numeric"),

    /**
     * Alphanumeric document number.
     * 
     */
    @XmlEnumValue("alphanumeric")
    ALPHANUMERIC("alphanumeric");
    private final String value;

    TypeCtDocNumberType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtDocNumberType fromValue(String v) {
        for (TypeCtDocNumberType c: TypeCtDocNumberType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}