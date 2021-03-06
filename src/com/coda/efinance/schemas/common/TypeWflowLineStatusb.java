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
 * <p>Java class for typeWflowLineStatusb.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeWflowLineStatusb"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="wflow_lstat_authorised"/&gt;
 *     &lt;enumeration value="wflow_lstat_unauthorised"/&gt;
 *     &lt;enumeration value="wflow_lstat_none"/&gt;
 *     &lt;enumeration value="null"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeWflowLineStatusb")
@XmlEnum
public enum TypeWflowLineStatusb {


    /**
     * Authorised
     * 
     */
    @XmlEnumValue("wflow_lstat_authorised")
    WFLOW_LSTAT_AUTHORISED("wflow_lstat_authorised"),

    /**
     * Not authorised
     * 
     */
    @XmlEnumValue("wflow_lstat_unauthorised")
    WFLOW_LSTAT_UNAUTHORISED("wflow_lstat_unauthorised"),

    /**
     * None
     * 
     */
    @XmlEnumValue("wflow_lstat_none")
    WFLOW_LSTAT_NONE("wflow_lstat_none"),

    /**
     * Null
     * 
     */
    @XmlEnumValue("null")
    NULL("null");
    private final String value;

    TypeWflowLineStatusb(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeWflowLineStatusb fromValue(String v) {
        for (TypeWflowLineStatusb c: TypeWflowLineStatusb.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
