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
 * <p>Java class for typeArchiveFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeArchiveFlag"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="doc_in_archive"/&gt;
 *     &lt;enumeration value="doc_in_books"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeArchiveFlag")
@XmlEnum
public enum TypeArchiveFlag {


    /**
     * The document is in the archive.
     * 
     */
    @XmlEnumValue("doc_in_archive")
    DOC_IN_ARCHIVE("doc_in_archive"),

    /**
     * The document is in the books.
     * 
     */
    @XmlEnumValue("doc_in_books")
    DOC_IN_BOOKS("doc_in_books");
    private final String value;

    TypeArchiveFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeArchiveFlag fromValue(String v) {
        for (TypeArchiveFlag c: TypeArchiveFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
