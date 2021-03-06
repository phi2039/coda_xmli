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
 * <p>Java class for typeDataMetadataCategoryTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDataMetadataCategoryTypes"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="data_metadata_grouped"/&gt;
 *     &lt;enumeration value="data_metadata_summed"/&gt;
 *     &lt;enumeration value="data_metadata_unique"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDataMetadataCategoryTypes")
@XmlEnum
public enum TypeDataMetadataCategoryTypes {

    @XmlEnumValue("data_metadata_grouped")
    DATA_METADATA_GROUPED("data_metadata_grouped"),
    @XmlEnumValue("data_metadata_summed")
    DATA_METADATA_SUMMED("data_metadata_summed"),
    @XmlEnumValue("data_metadata_unique")
    DATA_METADATA_UNIQUE("data_metadata_unique");
    private final String value;

    TypeDataMetadataCategoryTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDataMetadataCategoryTypes fromValue(String v) {
        for (TypeDataMetadataCategoryTypes c: TypeDataMetadataCategoryTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
