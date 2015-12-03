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
 * <p>Java class for typeExnID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeExnID"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="exn_maintain"/&gt;
 *     &lt;enumeration value="exn_input_addline"/&gt;
 *     &lt;enumeration value="exn_log"/&gt;
 *     &lt;enumeration value="exn_stat_match"/&gt;
 *     &lt;enumeration value="exn_toolbar"/&gt;
 *     &lt;enumeration value="exn_input_accvalerr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeExnID")
@XmlEnum
public enum TypeExnID {

    @XmlEnumValue("exn_maintain")
    EXN_MAINTAIN("exn_maintain"),
    @XmlEnumValue("exn_input_addline")
    EXN_INPUT_ADDLINE("exn_input_addline"),
    @XmlEnumValue("exn_log")
    EXN_LOG("exn_log"),
    @XmlEnumValue("exn_stat_match")
    EXN_STAT_MATCH("exn_stat_match"),
    @XmlEnumValue("exn_toolbar")
    EXN_TOOLBAR("exn_toolbar"),
    @XmlEnumValue("exn_input_accvalerr")
    EXN_INPUT_ACCVALERR("exn_input_accvalerr");
    private final String value;

    TypeExnID(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeExnID fromValue(String v) {
        for (TypeExnID c: TypeExnID.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}