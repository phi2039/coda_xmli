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
 * <p>Java class for typeCurcodeb.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCurcodeb"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="curcode_c"/&gt;
 *     &lt;enumeration value="curcode_f"/&gt;
 *     &lt;enumeration value="curcode_q"/&gt;
 *     &lt;enumeration value="curcode_e"/&gt;
 *     &lt;enumeration value="curcode_x"/&gt;
 *     &lt;enumeration value="null"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCurcodeb")
@XmlEnum
public enum TypeCurcodeb {

    @XmlEnumValue("curcode_c")
    CURCODE_C("curcode_c"),
    @XmlEnumValue("curcode_f")
    CURCODE_F("curcode_f"),
    @XmlEnumValue("curcode_q")
    CURCODE_Q("curcode_q"),
    @XmlEnumValue("curcode_e")
    CURCODE_E("curcode_e"),
    @XmlEnumValue("curcode_x")
    CURCODE_X("curcode_x"),
    @XmlEnumValue("null")
    NULL("null");
    private final String value;

    TypeCurcodeb(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCurcodeb fromValue(String v) {
        for (TypeCurcodeb c: TypeCurcodeb.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}