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
 * <p>Java class for typeCtSpecialOpt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtSpecialOpt"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="allow"/&gt;
 *     &lt;enumeration value="disallow"/&gt;
 *     &lt;enumeration value="expect"/&gt;
 *     &lt;enumeration value="force"/&gt;
 *     &lt;enumeration value="null"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtSpecialOpt")
@XmlEnum
public enum TypeCtSpecialOpt {

    @XmlEnumValue("allow")
    ALLOW("allow"),
    @XmlEnumValue("disallow")
    DISALLOW("disallow"),
    @XmlEnumValue("expect")
    EXPECT("expect"),
    @XmlEnumValue("force")
    FORCE("force"),
    @XmlEnumValue("null")
    NULL("null");
    private final String value;

    TypeCtSpecialOpt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtSpecialOpt fromValue(String v) {
        for (TypeCtSpecialOpt c: TypeCtSpecialOpt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
