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
 * <p>Java class for typeDataviewVocabUsageNoSelect.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDataviewVocabUsageNoSelect"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_dv_voc_neither"/&gt;
 *     &lt;enumeration value="com_dv_voc_presenter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDataviewVocabUsageNoSelect")
@XmlEnum
public enum TypeDataviewVocabUsageNoSelect {

    @XmlEnumValue("com_dv_voc_neither")
    COM_DV_VOC_NEITHER("com_dv_voc_neither"),
    @XmlEnumValue("com_dv_voc_presenter")
    COM_DV_VOC_PRESENTER("com_dv_voc_presenter");
    private final String value;

    TypeDataviewVocabUsageNoSelect(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDataviewVocabUsageNoSelect fromValue(String v) {
        for (TypeDataviewVocabUsageNoSelect c: TypeDataviewVocabUsageNoSelect.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
