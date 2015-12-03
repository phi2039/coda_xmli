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
 * <p>Java class for typeCommitmentsNumberOpList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCommitmentsNumberOpList"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="op_eq"/&gt;
 *     &lt;enumeration value="op_ne"/&gt;
 *     &lt;enumeration value="op_gt"/&gt;
 *     &lt;enumeration value="op_gte"/&gt;
 *     &lt;enumeration value="op_lt"/&gt;
 *     &lt;enumeration value="op_lte"/&gt;
 *     &lt;enumeration value="op_range"/&gt;
 *     &lt;enumeration value="op_nrange"/&gt;
 *     &lt;enumeration value="op_isblank"/&gt;
 *     &lt;enumeration value="op_isnull"/&gt;
 *     &lt;enumeration value="op_isnotnull"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCommitmentsNumberOpList")
@XmlEnum
public enum TypeCommitmentsNumberOpList {

    @XmlEnumValue("op_eq")
    OP_EQ("op_eq"),
    @XmlEnumValue("op_ne")
    OP_NE("op_ne"),
    @XmlEnumValue("op_gt")
    OP_GT("op_gt"),
    @XmlEnumValue("op_gte")
    OP_GTE("op_gte"),
    @XmlEnumValue("op_lt")
    OP_LT("op_lt"),
    @XmlEnumValue("op_lte")
    OP_LTE("op_lte"),
    @XmlEnumValue("op_range")
    OP_RANGE("op_range"),
    @XmlEnumValue("op_nrange")
    OP_NRANGE("op_nrange"),
    @XmlEnumValue("op_isblank")
    OP_ISBLANK("op_isblank"),
    @XmlEnumValue("op_isnull")
    OP_ISNULL("op_isnull"),
    @XmlEnumValue("op_isnotnull")
    OP_ISNOTNULL("op_isnotnull");
    private final String value;

    TypeCommitmentsNumberOpList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCommitmentsNumberOpList fromValue(String v) {
        for (TypeCommitmentsNumberOpList c: TypeCommitmentsNumberOpList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
