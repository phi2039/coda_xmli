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
 * <p>Java class for typeCommPosted.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCommPosted"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="comm_posted_books"/&gt;
 *     &lt;enumeration value="comm_posted_intray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCommPosted")
@XmlEnum
public enum TypeCommPosted {

    @XmlEnumValue("comm_posted_books")
    COMM_POSTED_BOOKS("comm_posted_books"),
    @XmlEnumValue("comm_posted_intray")
    COMM_POSTED_INTRAY("comm_posted_intray");
    private final String value;

    TypeCommPosted(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCommPosted fromValue(String v) {
        for (TypeCommPosted c: TypeCommPosted.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
