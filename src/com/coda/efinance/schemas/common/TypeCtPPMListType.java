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
 * <p>Java class for typeCtPPMListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtPPMListType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="ppm_listtype_header"/&gt;
 *     &lt;enumeration value="ppm_listtype_po_line"/&gt;
 *     &lt;enumeration value="ppm_listtype_analysis"/&gt;
 *     &lt;enumeration value="ppm_listtype_matched"/&gt;
 *     &lt;enumeration value="ppm_listtype_findoc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtPPMListType")
@XmlEnum
public enum TypeCtPPMListType {

    @XmlEnumValue("ppm_listtype_header")
    PPM_LISTTYPE_HEADER("ppm_listtype_header"),
    @XmlEnumValue("ppm_listtype_po_line")
    PPM_LISTTYPE_PO_LINE("ppm_listtype_po_line"),
    @XmlEnumValue("ppm_listtype_analysis")
    PPM_LISTTYPE_ANALYSIS("ppm_listtype_analysis"),
    @XmlEnumValue("ppm_listtype_matched")
    PPM_LISTTYPE_MATCHED("ppm_listtype_matched"),
    @XmlEnumValue("ppm_listtype_findoc")
    PPM_LISTTYPE_FINDOC("ppm_listtype_findoc");
    private final String value;

    TypeCtPPMListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtPPMListType fromValue(String v) {
        for (TypeCtPPMListType c: TypeCtPPMListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}