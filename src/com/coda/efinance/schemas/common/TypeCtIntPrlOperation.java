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
 * <p>Java class for typeCtIntPrlOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtIntPrlOperation"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="generate"/&gt;
 *     &lt;enumeration value="manipulate"/&gt;
 *     &lt;enumeration value="post"/&gt;
 *     &lt;enumeration value="recover"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtIntPrlOperation")
@XmlEnum
public enum TypeCtIntPrlOperation {

    @XmlEnumValue("generate")
    GENERATE("generate"),
    @XmlEnumValue("manipulate")
    MANIPULATE("manipulate"),
    @XmlEnumValue("post")
    POST("post"),
    @XmlEnumValue("recover")
    RECOVER("recover"),
    @XmlEnumValue("delete")
    DELETE("delete");
    private final String value;

    TypeCtIntPrlOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtIntPrlOperation fromValue(String v) {
        for (TypeCtIntPrlOperation c: TypeCtIntPrlOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
