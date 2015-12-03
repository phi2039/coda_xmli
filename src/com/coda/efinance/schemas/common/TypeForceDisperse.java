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
 * <p>Java class for typeForceDisperse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeForceDisperse"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="forcedisp"/&gt;
 *     &lt;enumeration value="warn"/&gt;
 *     &lt;enumeration value="off"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeForceDisperse")
@XmlEnum
public enum TypeForceDisperse {

    @XmlEnumValue("forcedisp")
    FORCEDISP("forcedisp"),
    @XmlEnumValue("warn")
    WARN("warn"),
    @XmlEnumValue("off")
    OFF("off");
    private final String value;

    TypeForceDisperse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeForceDisperse fromValue(String v) {
        for (TypeForceDisperse c: TypeForceDisperse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}