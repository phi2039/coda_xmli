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
 * <p>Java class for typeCtBBQHideType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtBBQHideType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="hide"/&gt;
 *     &lt;enumeration value="show"/&gt;
 *     &lt;enumeration value="period"/&gt;
 *     &lt;enumeration value="precollapse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtBBQHideType")
@XmlEnum
public enum TypeCtBBQHideType {

    @XmlEnumValue("hide")
    HIDE("hide"),
    @XmlEnumValue("show")
    SHOW("show"),
    @XmlEnumValue("period")
    PERIOD("period"),
    @XmlEnumValue("precollapse")
    PRECOLLAPSE("precollapse");
    private final String value;

    TypeCtBBQHideType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtBBQHideType fromValue(String v) {
        for (TypeCtBBQHideType c: TypeCtBBQHideType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
