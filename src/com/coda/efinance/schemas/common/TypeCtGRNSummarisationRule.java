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
 * <p>Java class for typeCtGRNSummarisationRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtGRNSummarisationRule"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="one_per_grn"/&gt;
 *     &lt;enumeration value="one_per_sup_delivdate_pocurr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtGRNSummarisationRule")
@XmlEnum
public enum TypeCtGRNSummarisationRule {


    /**
     * One purchase invoice for each GRN.
     * 
     */
    @XmlEnumValue("one_per_grn")
    ONE_PER_GRN("one_per_grn"),

    /**
     * One purchase invoice for all GRNs sharing the same supplier, delivery date and currency.
     * 
     */
    @XmlEnumValue("one_per_sup_delivdate_pocurr")
    ONE_PER_SUP_DELIVDATE_POCURR("one_per_sup_delivdate_pocurr");
    private final String value;

    TypeCtGRNSummarisationRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtGRNSummarisationRule fromValue(String v) {
        for (TypeCtGRNSummarisationRule c: TypeCtGRNSummarisationRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
