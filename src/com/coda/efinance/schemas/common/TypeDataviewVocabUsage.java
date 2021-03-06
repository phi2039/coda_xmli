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
 * <p>Java class for typeDataviewVocabUsage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDataviewVocabUsage"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_dv_voc_neither"/&gt;
 *     &lt;enumeration value="com_dv_voc_selector"/&gt;
 *     &lt;enumeration value="com_dv_voc_presenter"/&gt;
 *     &lt;enumeration value="com_dv_voc_sel_pres"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDataviewVocabUsage")
@XmlEnum
public enum TypeDataviewVocabUsage {

    @XmlEnumValue("com_dv_voc_neither")
    COM_DV_VOC_NEITHER("com_dv_voc_neither"),
    @XmlEnumValue("com_dv_voc_selector")
    COM_DV_VOC_SELECTOR("com_dv_voc_selector"),
    @XmlEnumValue("com_dv_voc_presenter")
    COM_DV_VOC_PRESENTER("com_dv_voc_presenter"),
    @XmlEnumValue("com_dv_voc_sel_pres")
    COM_DV_VOC_SEL_PRES("com_dv_voc_sel_pres");
    private final String value;

    TypeDataviewVocabUsage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDataviewVocabUsage fromValue(String v) {
        for (TypeDataviewVocabUsage c: TypeDataviewVocabUsage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
