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
 * <p>Java class for typeComDpTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComDpTypes"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_upt_colour"/&gt;
 *     &lt;enumeration value="com_upt_image"/&gt;
 *     &lt;enumeration value="com_upt_string"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComDpTypes")
@XmlEnum
public enum TypeComDpTypes {

    @XmlEnumValue("com_upt_colour")
    COM_UPT_COLOUR("com_upt_colour"),
    @XmlEnumValue("com_upt_image")
    COM_UPT_IMAGE("com_upt_image"),
    @XmlEnumValue("com_upt_string")
    COM_UPT_STRING("com_upt_string");
    private final String value;

    TypeComDpTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComDpTypes fromValue(String v) {
        for (TypeComDpTypes c: TypeComDpTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
