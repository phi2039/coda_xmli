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
 * <p>Java class for typeCtIntersectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtIntersectType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="act_home"/&gt;
 *     &lt;enumeration value="act_dual"/&gt;
 *     &lt;enumeration value="act_foreign"/&gt;
 *     &lt;enumeration value="act_elm"/&gt;
 *     &lt;enumeration value="turn_home"/&gt;
 *     &lt;enumeration value="turn_dual"/&gt;
 *     &lt;enumeration value="turn_foreign"/&gt;
 *     &lt;enumeration value="turn_elm"/&gt;
 *     &lt;enumeration value="qty"/&gt;
 *     &lt;enumeration value="comm_home"/&gt;
 *     &lt;enumeration value="comm_dual"/&gt;
 *     &lt;enumeration value="comm_qty"/&gt;
 *     &lt;enumeration value="bud_home"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtIntersectType")
@XmlEnum
public enum TypeCtIntersectType {

    @XmlEnumValue("act_home")
    ACT_HOME("act_home"),
    @XmlEnumValue("act_dual")
    ACT_DUAL("act_dual"),
    @XmlEnumValue("act_foreign")
    ACT_FOREIGN("act_foreign"),
    @XmlEnumValue("act_elm")
    ACT_ELM("act_elm"),
    @XmlEnumValue("turn_home")
    TURN_HOME("turn_home"),
    @XmlEnumValue("turn_dual")
    TURN_DUAL("turn_dual"),
    @XmlEnumValue("turn_foreign")
    TURN_FOREIGN("turn_foreign"),
    @XmlEnumValue("turn_elm")
    TURN_ELM("turn_elm"),
    @XmlEnumValue("qty")
    QTY("qty"),
    @XmlEnumValue("comm_home")
    COMM_HOME("comm_home"),
    @XmlEnumValue("comm_dual")
    COMM_DUAL("comm_dual"),
    @XmlEnumValue("comm_qty")
    COMM_QTY("comm_qty"),
    @XmlEnumValue("bud_home")
    BUD_HOME("bud_home");
    private final String value;

    TypeCtIntersectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtIntersectType fromValue(String v) {
        for (TypeCtIntersectType c: TypeCtIntersectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
