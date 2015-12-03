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
 * <p>Java class for typeCtAsoLineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAsoLineType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="docline"/&gt;
 *     &lt;enumeration value="stmline"/&gt;
 *     &lt;enumeration value="new_docline"/&gt;
 *     &lt;enumeration value="intray_docline"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAsoLineType")
@XmlEnum
public enum TypeCtAsoLineType {

    @XmlEnumValue("docline")
    DOCLINE("docline"),
    @XmlEnumValue("stmline")
    STMLINE("stmline"),
    @XmlEnumValue("new_docline")
    NEW_DOCLINE("new_docline"),
    @XmlEnumValue("intray_docline")
    INTRAY_DOCLINE("intray_docline");
    private final String value;

    TypeCtAsoLineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAsoLineType fromValue(String v) {
        for (TypeCtAsoLineType c: TypeCtAsoLineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
