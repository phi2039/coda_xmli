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
 * <p>Java class for typeLineTypeb.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLineTypeb"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="summary"/&gt;
 *     &lt;enumeration value="analysis"/&gt;
 *     &lt;enumeration value="tax"/&gt;
 *     &lt;enumeration value="null"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeLineTypeb")
@XmlEnum
public enum TypeLineTypeb {


    /**
     * Summary line.
     * 
     */
    @XmlEnumValue("summary")
    SUMMARY("summary"),

    /**
     * Analysis line
     * 
     */
    @XmlEnumValue("analysis")
    ANALYSIS("analysis"),

    /**
     * Tax line
     * 
     */
    @XmlEnumValue("tax")
    TAX("tax"),

    /**
     * Null
     * 
     */
    @XmlEnumValue("null")
    NULL("null");
    private final String value;

    TypeLineTypeb(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeLineTypeb fromValue(String v) {
        for (TypeLineTypeb c: TypeLineTypeb.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
