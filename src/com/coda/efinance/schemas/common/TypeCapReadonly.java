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
 * <p>Java class for typeCapReadonly.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCapReadonly"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_cap_readonly_false"/&gt;
 *     &lt;enumeration value="com_cap_readonly_true"/&gt;
 *     &lt;enumeration value="com_cap_readonly_true_workflow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCapReadonly")
@XmlEnum
public enum TypeCapReadonly {


    /**
     * Read and write access to all functions.
     * 
     */
    @XmlEnumValue("com_cap_readonly_false")
    COM_CAP_READONLY_FALSE("com_cap_readonly_false"),

    /**
     * Read-only access to all functions.
     * 
     */
    @XmlEnumValue("com_cap_readonly_true")
    COM_CAP_READONLY_TRUE("com_cap_readonly_true"),

    /**
     * Read-only access to all functions, and write access to workflow functions using XMLi.
     * 
     */
    @XmlEnumValue("com_cap_readonly_true_workflow")
    COM_CAP_READONLY_TRUE_WORKFLOW("com_cap_readonly_true_workflow");
    private final String value;

    TypeCapReadonly(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCapReadonly fromValue(String v) {
        for (TypeCapReadonly c: TypeCapReadonly.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
