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
 * <p>Java class for typeCtUndoMatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtUndoMatchType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="matching_ref"/&gt;
 *     &lt;enumeration value="payment_no"/&gt;
 *     &lt;enumeration value="individual_lines"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtUndoMatchType")
@XmlEnum
public enum TypeCtUndoMatchType {


    /**
     * Use matching references.
     * 
     */
    @XmlEnumValue("matching_ref")
    MATCHING_REF("matching_ref"),

    /**
     * Use payment numbers.
     * 
     */
    @XmlEnumValue("payment_no")
    PAYMENT_NO("payment_no"),
    @XmlEnumValue("individual_lines")
    INDIVIDUAL_LINES("individual_lines");
    private final String value;

    TypeCtUndoMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtUndoMatchType fromValue(String v) {
        for (TypeCtUndoMatchType c: TypeCtUndoMatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
