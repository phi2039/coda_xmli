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
 * <p>Java class for typeCtBaseOnDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtBaseOnDate"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="due_date"/&gt;
 *     &lt;enumeration value="document_date"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtBaseOnDate")
@XmlEnum
public enum TypeCtBaseOnDate {

    @XmlEnumValue("due_date")
    DUE_DATE("due_date"),
    @XmlEnumValue("document_date")
    DOCUMENT_DATE("document_date");
    private final String value;

    TypeCtBaseOnDate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtBaseOnDate fromValue(String v) {
        for (TypeCtBaseOnDate c: TypeCtBaseOnDate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
