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
 * <p>Java class for typeCtAuthorisingUser.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAuthorisingUser"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="not"/&gt;
 *     &lt;enumeration value="optional"/&gt;
 *     &lt;enumeration value="mandatory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAuthorisingUser")
@XmlEnum
public enum TypeCtAuthorisingUser {

    @XmlEnumValue("not")
    NOT("not"),
    @XmlEnumValue("optional")
    OPTIONAL("optional"),
    @XmlEnumValue("mandatory")
    MANDATORY("mandatory");
    private final String value;

    TypeCtAuthorisingUser(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAuthorisingUser fromValue(String v) {
        for (TypeCtAuthorisingUser c: TypeCtAuthorisingUser.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
