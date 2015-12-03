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
 * <p>Java class for typeDataProtectionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDataProtectionTypes"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="data_protection_private"/&gt;
 *     &lt;enumeration value="data_protection_protected"/&gt;
 *     &lt;enumeration value="data_protection_public"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDataProtectionTypes")
@XmlEnum
public enum TypeDataProtectionTypes {

    @XmlEnumValue("data_protection_private")
    DATA_PROTECTION_PRIVATE("data_protection_private"),
    @XmlEnumValue("data_protection_protected")
    DATA_PROTECTION_PROTECTED("data_protection_protected"),
    @XmlEnumValue("data_protection_public")
    DATA_PROTECTION_PUBLIC("data_protection_public");
    private final String value;

    TypeDataProtectionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDataProtectionTypes fromValue(String v) {
        for (TypeDataProtectionTypes c: TypeDataProtectionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
