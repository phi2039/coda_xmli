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
 * <p>Java class for typeCtAllRevalRate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAllRevalRate"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="current_rate"/&gt;
 *     &lt;enumeration value="dated_rate"/&gt;
 *     &lt;enumeration value="specified_rate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAllRevalRate")
@XmlEnum
public enum TypeCtAllRevalRate {

    @XmlEnumValue("current_rate")
    CURRENT_RATE("current_rate"),
    @XmlEnumValue("dated_rate")
    DATED_RATE("dated_rate"),
    @XmlEnumValue("specified_rate")
    SPECIFIED_RATE("specified_rate");
    private final String value;

    TypeCtAllRevalRate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAllRevalRate fromValue(String v) {
        for (TypeCtAllRevalRate c: TypeCtAllRevalRate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}