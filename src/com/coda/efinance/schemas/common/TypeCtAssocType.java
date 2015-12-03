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
 * <p>Java class for typeCtAssocType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAssocType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="bua_fromfile"/&gt;
 *     &lt;enumeration value="bua_hardcopy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAssocType")
@XmlEnum
public enum TypeCtAssocType {


    /**
     * Electronic file
     * 
     */
    @XmlEnumValue("bua_fromfile")
    BUA_FROMFILE("bua_fromfile"),

    /**
     * Printed statement
     * 
     */
    @XmlEnumValue("bua_hardcopy")
    BUA_HARDCOPY("bua_hardcopy");
    private final String value;

    TypeCtAssocType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAssocType fromValue(String v) {
        for (TypeCtAssocType c: TypeCtAssocType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
