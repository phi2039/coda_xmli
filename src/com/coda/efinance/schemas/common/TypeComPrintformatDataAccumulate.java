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
 * <p>Java class for typeComPrintformatDataAccumulate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComPrintformatDataAccumulate"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_printformat_data_accumulate_none"/&gt;
 *     &lt;enumeration value="com_printformat_data_accumulate_document"/&gt;
 *     &lt;enumeration value="com_printformat_data_accumulate_page_start"/&gt;
 *     &lt;enumeration value="com_printformat_data_accumulate_page_end"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComPrintformatDataAccumulate")
@XmlEnum
public enum TypeComPrintformatDataAccumulate {

    @XmlEnumValue("com_printformat_data_accumulate_none")
    COM_PRINTFORMAT_DATA_ACCUMULATE_NONE("com_printformat_data_accumulate_none"),
    @XmlEnumValue("com_printformat_data_accumulate_document")
    COM_PRINTFORMAT_DATA_ACCUMULATE_DOCUMENT("com_printformat_data_accumulate_document"),
    @XmlEnumValue("com_printformat_data_accumulate_page_start")
    COM_PRINTFORMAT_DATA_ACCUMULATE_PAGE_START("com_printformat_data_accumulate_page_start"),
    @XmlEnumValue("com_printformat_data_accumulate_page_end")
    COM_PRINTFORMAT_DATA_ACCUMULATE_PAGE_END("com_printformat_data_accumulate_page_end");
    private final String value;

    TypeComPrintformatDataAccumulate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComPrintformatDataAccumulate fromValue(String v) {
        for (TypeComPrintformatDataAccumulate c: TypeComPrintformatDataAccumulate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}