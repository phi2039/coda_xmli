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
 * <p>Java class for typeCtRllOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtRllOperator"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="op_eq"/&gt;
 *     &lt;enumeration value="op_ne"/&gt;
 *     &lt;enumeration value="op_gt"/&gt;
 *     &lt;enumeration value="op_gte"/&gt;
 *     &lt;enumeration value="op_lt"/&gt;
 *     &lt;enumeration value="op_lte"/&gt;
 *     &lt;enumeration value="op_like"/&gt;
 *     &lt;enumeration value="op_unlike"/&gt;
 *     &lt;enumeration value="op_list"/&gt;
 *     &lt;enumeration value="op_range"/&gt;
 *     &lt;enumeration value="op_nrange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtRllOperator")
@XmlEnum
public enum TypeCtRllOperator {


    /**
     * None
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * equal to
     * 
     */
    @XmlEnumValue("op_eq")
    OP_EQ("op_eq"),

    /**
     * not equal to
     * 
     */
    @XmlEnumValue("op_ne")
    OP_NE("op_ne"),

    /**
     * greater than
     * 
     */
    @XmlEnumValue("op_gt")
    OP_GT("op_gt"),

    /**
     * greater than or equal to
     * 
     */
    @XmlEnumValue("op_gte")
    OP_GTE("op_gte"),

    /**
     * less than
     * 
     */
    @XmlEnumValue("op_lt")
    OP_LT("op_lt"),

    /**
     * less than or equal to
     * 
     */
    @XmlEnumValue("op_lte")
    OP_LTE("op_lte"),

    /**
     * like
     * 
     */
    @XmlEnumValue("op_like")
    OP_LIKE("op_like"),

    /**
     * not like
     * 
     */
    @XmlEnumValue("op_unlike")
    OP_UNLIKE("op_unlike"),

    /**
     * list
     * 
     */
    @XmlEnumValue("op_list")
    OP_LIST("op_list"),

    /**
     * in range
     * 
     */
    @XmlEnumValue("op_range")
    OP_RANGE("op_range"),

    /**
     * not in range
     * 
     */
    @XmlEnumValue("op_nrange")
    OP_NRANGE("op_nrange");
    private final String value;

    TypeCtRllOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtRllOperator fromValue(String v) {
        for (TypeCtRllOperator c: TypeCtRllOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
