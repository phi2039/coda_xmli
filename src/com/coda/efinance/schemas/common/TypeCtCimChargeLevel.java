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
 * <p>Java class for typeCtCimChargeLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtCimChargeLevel"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="acct_level"/&gt;
 *     &lt;enumeration value="summary"/&gt;
 *     &lt;enumeration value="transaction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtCimChargeLevel")
@XmlEnum
public enum TypeCtCimChargeLevel {


    /**
     * Account level.
     * 
     */
    @XmlEnumValue("acct_level")
    ACCT_LEVEL("acct_level"),

    /**
     * Summary level.
     * 
     */
    @XmlEnumValue("summary")
    SUMMARY("summary"),

    /**
     * Transaction level.
     * 
     */
    @XmlEnumValue("transaction")
    TRANSACTION("transaction");
    private final String value;

    TypeCtCimChargeLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtCimChargeLevel fromValue(String v) {
        for (TypeCtCimChargeLevel c: TypeCtCimChargeLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
