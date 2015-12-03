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
 * <p>Java class for typeCommitmentsOonOpList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCommitmentsOonOpList"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="op_eq"/&gt;
 *     &lt;enumeration value="op_ne"/&gt;
 *     &lt;enumeration value="op_isblank"/&gt;
 *     &lt;enumeration value="op_isnull"/&gt;
 *     &lt;enumeration value="op_isnotnull"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCommitmentsOonOpList")
@XmlEnum
public enum TypeCommitmentsOonOpList {

    @XmlEnumValue("op_eq")
    OP_EQ("op_eq"),
    @XmlEnumValue("op_ne")
    OP_NE("op_ne"),
    @XmlEnumValue("op_isblank")
    OP_ISBLANK("op_isblank"),
    @XmlEnumValue("op_isnull")
    OP_ISNULL("op_isnull"),
    @XmlEnumValue("op_isnotnull")
    OP_ISNOTNULL("op_isnotnull");
    private final String value;

    TypeCommitmentsOonOpList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCommitmentsOonOpList fromValue(String v) {
        for (TypeCommitmentsOonOpList c: TypeCommitmentsOonOpList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}