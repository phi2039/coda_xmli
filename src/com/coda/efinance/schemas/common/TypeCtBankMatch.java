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
 * <p>Java class for typeCtBankMatch.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtBankMatch"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="line_descr"/&gt;
 *     &lt;enumeration value="doc_no"/&gt;
 *     &lt;enumeration value="ext_ref1"/&gt;
 *     &lt;enumeration value="ext_ref2"/&gt;
 *     &lt;enumeration value="ext_ref3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtBankMatch")
@XmlEnum
public enum TypeCtBankMatch {


    /**
     * Line description
     * 
     */
    @XmlEnumValue("line_descr")
    LINE_DESCR("line_descr"),

    /**
     * Document number.
     * 
     */
    @XmlEnumValue("doc_no")
    DOC_NO("doc_no"),

    /**
     * External reference 1
     * 
     */
    @XmlEnumValue("ext_ref1")
    EXT_REF_1("ext_ref1"),

    /**
     * External reference 2
     * 
     */
    @XmlEnumValue("ext_ref2")
    EXT_REF_2("ext_ref2"),

    /**
     * External reference 3
     * 
     */
    @XmlEnumValue("ext_ref3")
    EXT_REF_3("ext_ref3");
    private final String value;

    TypeCtBankMatch(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtBankMatch fromValue(String v) {
        for (TypeCtBankMatch c: TypeCtBankMatch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
