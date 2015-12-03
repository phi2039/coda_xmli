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
 * <p>Java class for typeComMeaningOfNoBudget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComMeaningOfNoBudget"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="zero_budget"/&gt;
 *     &lt;enumeration value="infinite_budget"/&gt;
 *     &lt;enumeration value="infinite_budget_with_warning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComMeaningOfNoBudget")
@XmlEnum
public enum TypeComMeaningOfNoBudget {

    @XmlEnumValue("zero_budget")
    ZERO_BUDGET("zero_budget"),
    @XmlEnumValue("infinite_budget")
    INFINITE_BUDGET("infinite_budget"),
    @XmlEnumValue("infinite_budget_with_warning")
    INFINITE_BUDGET_WITH_WARNING("infinite_budget_with_warning");
    private final String value;

    TypeComMeaningOfNoBudget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComMeaningOfNoBudget fromValue(String v) {
        for (TypeComMeaningOfNoBudget c: TypeComMeaningOfNoBudget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}