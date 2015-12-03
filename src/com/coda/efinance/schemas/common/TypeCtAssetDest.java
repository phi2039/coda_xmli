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
 * <p>Java class for typeCtAssetDest.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAssetDest"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="intray"/&gt;
 *     &lt;enumeration value="register"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAssetDest")
@XmlEnum
public enum TypeCtAssetDest {


    /**
     * None
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Send to the Intray
     * 
     */
    @XmlEnumValue("intray")
    INTRAY("intray"),

    /**
     * Post to the books
     * 
     */
    @XmlEnumValue("register")
    REGISTER("register");
    private final String value;

    TypeCtAssetDest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAssetDest fromValue(String v) {
        for (TypeCtAssetDest c: TypeCtAssetDest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}