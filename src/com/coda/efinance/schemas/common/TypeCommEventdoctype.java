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
 * <p>Java class for typeCommEventdoctype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCommEventdoctype"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="comm_eventdoctype_po"/&gt;
 *     &lt;enumeration value="comm_eventdoctype_pi"/&gt;
 *     &lt;enumeration value="comm_eventdoctype_grn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCommEventdoctype")
@XmlEnum
public enum TypeCommEventdoctype {

    @XmlEnumValue("comm_eventdoctype_po")
    COMM_EVENTDOCTYPE_PO("comm_eventdoctype_po"),
    @XmlEnumValue("comm_eventdoctype_pi")
    COMM_EVENTDOCTYPE_PI("comm_eventdoctype_pi"),
    @XmlEnumValue("comm_eventdoctype_grn")
    COMM_EVENTDOCTYPE_GRN("comm_eventdoctype_grn");
    private final String value;

    TypeCommEventdoctype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCommEventdoctype fromValue(String v) {
        for (TypeCommEventdoctype c: TypeCommEventdoctype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}