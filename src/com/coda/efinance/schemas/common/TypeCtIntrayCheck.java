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
 * <p>Java class for typeCtIntrayCheck.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtIntrayCheck"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="books"/&gt;
 *     &lt;enumeration value="intray"/&gt;
 *     &lt;enumeration value="booksandintray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtIntrayCheck")
@XmlEnum
public enum TypeCtIntrayCheck {

    @XmlEnumValue("books")
    BOOKS("books"),
    @XmlEnumValue("intray")
    INTRAY("intray"),
    @XmlEnumValue("booksandintray")
    BOOKSANDINTRAY("booksandintray");
    private final String value;

    TypeCtIntrayCheck(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtIntrayCheck fromValue(String v) {
        for (TypeCtIntrayCheck c: TypeCtIntrayCheck.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
