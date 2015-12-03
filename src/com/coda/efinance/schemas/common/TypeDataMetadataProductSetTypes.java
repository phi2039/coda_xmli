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
 * <p>Java class for typeDataMetadataProductSetTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDataMetadataProductSetTypes"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="data_metadata_coda_intelligence"/&gt;
 *     &lt;enumeration value="data_metadata_coda_financials"/&gt;
 *     &lt;enumeration value="data_metadata_coda_analytics"/&gt;
 *     &lt;enumeration value="data_metadata_external"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDataMetadataProductSetTypes")
@XmlEnum
public enum TypeDataMetadataProductSetTypes {

    @XmlEnumValue("data_metadata_coda_intelligence")
    DATA_METADATA_CODA_INTELLIGENCE("data_metadata_coda_intelligence"),
    @XmlEnumValue("data_metadata_coda_financials")
    DATA_METADATA_CODA_FINANCIALS("data_metadata_coda_financials"),
    @XmlEnumValue("data_metadata_coda_analytics")
    DATA_METADATA_CODA_ANALYTICS("data_metadata_coda_analytics"),
    @XmlEnumValue("data_metadata_external")
    DATA_METADATA_EXTERNAL("data_metadata_external");
    private final String value;

    TypeDataMetadataProductSetTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDataMetadataProductSetTypes fromValue(String v) {
        for (TypeDataMetadataProductSetTypes c: TypeDataMetadataProductSetTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
