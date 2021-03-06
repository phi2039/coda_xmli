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
 * <p>Java class for typeDataMetadataJoins.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDataMetadataJoins"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="data_metadata_join_inner"/&gt;
 *     &lt;enumeration value="data_metadata_join_left_outer"/&gt;
 *     &lt;enumeration value="data_metadata_join_right_outer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDataMetadataJoins")
@XmlEnum
public enum TypeDataMetadataJoins {


    /**
     * Inner join.
     * 
     */
    @XmlEnumValue("data_metadata_join_inner")
    DATA_METADATA_JOIN_INNER("data_metadata_join_inner"),

    /**
     * Left outer join.
     * 
     */
    @XmlEnumValue("data_metadata_join_left_outer")
    DATA_METADATA_JOIN_LEFT_OUTER("data_metadata_join_left_outer"),

    /**
     * Right otuer join.
     * 
     */
    @XmlEnumValue("data_metadata_join_right_outer")
    DATA_METADATA_JOIN_RIGHT_OUTER("data_metadata_join_right_outer");
    private final String value;

    TypeDataMetadataJoins(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDataMetadataJoins fromValue(String v) {
        for (TypeDataMetadataJoins c: TypeDataMetadataJoins.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
