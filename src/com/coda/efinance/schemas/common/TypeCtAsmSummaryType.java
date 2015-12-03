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
 * <p>Java class for typeCtAsmSummaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAsmSummaryType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="total_home"/&gt;
 *     &lt;enumeration value="total_dual"/&gt;
 *     &lt;enumeration value="total_element"/&gt;
 *     &lt;enumeration value="average_home"/&gt;
 *     &lt;enumeration value="average_dual"/&gt;
 *     &lt;enumeration value="average_element"/&gt;
 *     &lt;enumeration value="vocab_linecount"/&gt;
 *     &lt;enumeration value="credit_remain"/&gt;
 *     &lt;enumeration value="credit_percent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAsmSummaryType")
@XmlEnum
public enum TypeCtAsmSummaryType {

    @XmlEnumValue("total_home")
    TOTAL_HOME("total_home"),
    @XmlEnumValue("total_dual")
    TOTAL_DUAL("total_dual"),
    @XmlEnumValue("total_element")
    TOTAL_ELEMENT("total_element"),
    @XmlEnumValue("average_home")
    AVERAGE_HOME("average_home"),
    @XmlEnumValue("average_dual")
    AVERAGE_DUAL("average_dual"),
    @XmlEnumValue("average_element")
    AVERAGE_ELEMENT("average_element"),
    @XmlEnumValue("vocab_linecount")
    VOCAB_LINECOUNT("vocab_linecount"),
    @XmlEnumValue("credit_remain")
    CREDIT_REMAIN("credit_remain"),
    @XmlEnumValue("credit_percent")
    CREDIT_PERCENT("credit_percent");
    private final String value;

    TypeCtAsmSummaryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAsmSummaryType fromValue(String v) {
        for (TypeCtAsmSummaryType c: TypeCtAsmSummaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
