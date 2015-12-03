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
 * <p>Java class for typeGrnSummarisationRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeGrnSummarisationRule"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="one_per_grn"/&gt;
 *     &lt;enumeration value="one_per_sup_delivdate_pocurr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeGrnSummarisationRule")
@XmlEnum
public enum TypeGrnSummarisationRule {


    /**
     * One purchase invoice is generated for each goods receipt note.
     * 
     */
    @XmlEnumValue("one_per_grn")
    ONE_PER_GRN("one_per_grn"),

    /**
     * One purchase invoice is generated for all GRNs for this supplier element which share the same date and the same purchase order currency.
     * 
     */
    @XmlEnumValue("one_per_sup_delivdate_pocurr")
    ONE_PER_SUP_DELIVDATE_POCURR("one_per_sup_delivdate_pocurr");
    private final String value;

    TypeGrnSummarisationRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeGrnSummarisationRule fromValue(String v) {
        for (TypeGrnSummarisationRule c: TypeGrnSummarisationRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
