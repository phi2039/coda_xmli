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
 * <p>Java class for typeCtLineCreatedBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtLineCreatedBy"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="by_non_pay"/&gt;
 *     &lt;enumeration value="first"/&gt;
 *     &lt;enumeration value="middle"/&gt;
 *     &lt;enumeration value="final"/&gt;
 *     &lt;enumeration value="single"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtLineCreatedBy")
@XmlEnum
public enum TypeCtLineCreatedBy {

    @XmlEnumValue("by_non_pay")
    BY_NON_PAY("by_non_pay"),
    @XmlEnumValue("first")
    FIRST("first"),
    @XmlEnumValue("middle")
    MIDDLE("middle"),
    @XmlEnumValue("final")
    FINAL("final"),
    @XmlEnumValue("single")
    SINGLE("single");
    private final String value;

    TypeCtLineCreatedBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtLineCreatedBy fromValue(String v) {
        for (TypeCtLineCreatedBy c: TypeCtLineCreatedBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
