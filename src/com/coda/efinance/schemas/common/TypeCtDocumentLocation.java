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
 * <p>Java class for typeCtDocumentLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtDocumentLocation"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="archive"/&gt;
 *     &lt;enumeration value="books"/&gt;
 *     &lt;enumeration value="intray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtDocumentLocation")
@XmlEnum
public enum TypeCtDocumentLocation {


    /**
     * Archived
     * 
     */
    @XmlEnumValue("archive")
    ARCHIVE("archive"),

    /**
     * Posted
     * 
     */
    @XmlEnumValue("books")
    BOOKS("books"),

    /**
     * On the Intray
     * 
     */
    @XmlEnumValue("intray")
    INTRAY("intray");
    private final String value;

    TypeCtDocumentLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtDocumentLocation fromValue(String v) {
        for (TypeCtDocumentLocation c: TypeCtDocumentLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
