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
 * <p>Java class for typeCtMatchingCurr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtMatchingCurr"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="elm_cur"/&gt;
 *     &lt;enumeration value="doc_cur"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtMatchingCurr")
@XmlEnum
public enum TypeCtMatchingCurr {


    /**
     * Element currency.
     * 
     */
    @XmlEnumValue("elm_cur")
    ELM_CUR("elm_cur"),

    /**
     * Document currency.
     * 
     */
    @XmlEnumValue("doc_cur")
    DOC_CUR("doc_cur");
    private final String value;

    TypeCtMatchingCurr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtMatchingCurr fromValue(String v) {
        for (TypeCtMatchingCurr c: TypeCtMatchingCurr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
