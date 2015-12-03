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
 * <p>Java class for typeCtMatchingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtMatchingMethod"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="standard"/&gt;
 *     &lt;enumeration value="deferred"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtMatchingMethod")
@XmlEnum
public enum TypeCtMatchingMethod {


    /**
     * Standard
     * 
     */
    @XmlEnumValue("standard")
    STANDARD("standard"),

    /**
     * Deferred
     * 
     */
    @XmlEnumValue("deferred")
    DEFERRED("deferred");
    private final String value;

    TypeCtMatchingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtMatchingMethod fromValue(String v) {
        for (TypeCtMatchingMethod c: TypeCtMatchingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}