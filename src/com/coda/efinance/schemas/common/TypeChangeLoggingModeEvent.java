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
 * <p>Java class for typeChangeLoggingModeEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeChangeLoggingModeEvent"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_clt_event"/&gt;
 *     &lt;enumeration value="com_clt_audit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeChangeLoggingModeEvent")
@XmlEnum
public enum TypeChangeLoggingModeEvent {


    /**
     * Event
     * 
     */
    @XmlEnumValue("com_clt_event")
    COM_CLT_EVENT("com_clt_event"),

    /**
     * Audit
     * 
     */
    @XmlEnumValue("com_clt_audit")
    COM_CLT_AUDIT("com_clt_audit");
    private final String value;

    TypeChangeLoggingModeEvent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeChangeLoggingModeEvent fromValue(String v) {
        for (TypeChangeLoggingModeEvent c: TypeChangeLoggingModeEvent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
