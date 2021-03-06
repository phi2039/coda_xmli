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
 * <p>Java class for typeCtAssetStatusExt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAssetStatusExt"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="docstat_active"/&gt;
 *     &lt;enumeration value="docstat_posted"/&gt;
 *     &lt;enumeration value="docstat_cancel"/&gt;
 *     &lt;enumeration value="docstat_intray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAssetStatusExt")
@XmlEnum
public enum TypeCtAssetStatusExt {


    /**
     * Active
     * 
     */
    @XmlEnumValue("docstat_active")
    DOCSTAT_ACTIVE("docstat_active"),

    /**
     * Posted
     * 
     */
    @XmlEnumValue("docstat_posted")
    DOCSTAT_POSTED("docstat_posted"),

    /**
     * Cancelled
     * 
     */
    @XmlEnumValue("docstat_cancel")
    DOCSTAT_CANCEL("docstat_cancel"),

    /**
     * On the Intray
     * 
     */
    @XmlEnumValue("docstat_intray")
    DOCSTAT_INTRAY("docstat_intray");
    private final String value;

    TypeCtAssetStatusExt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAssetStatusExt fromValue(String v) {
        for (TypeCtAssetStatusExt c: TypeCtAssetStatusExt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
