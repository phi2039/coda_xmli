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
 * <p>Java class for typeCtCurRounding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtCurRounding"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="general"/&gt;
 *     &lt;enumeration value="arith"/&gt;
 *     &lt;enumeration value="truncate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtCurRounding")
@XmlEnum
public enum TypeCtCurRounding {

    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("arith")
    ARITH("arith"),
    @XmlEnumValue("truncate")
    TRUNCATE("truncate");
    private final String value;

    TypeCtCurRounding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtCurRounding fromValue(String v) {
        for (TypeCtCurRounding c: TypeCtCurRounding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
