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
 * <p>Java class for typeComPrintformatItem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComPrintformatItem"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_printformat_item_type_section"/&gt;
 *     &lt;enumeration value="com_printformat_item_type_database"/&gt;
 *     &lt;enumeration value="com_printformat_item_type_image"/&gt;
 *     &lt;enumeration value="com_printformat_item_type_text"/&gt;
 *     &lt;enumeration value="com_printformat_item_type_line_horizontal"/&gt;
 *     &lt;enumeration value="com_printformat_item_type_line_vertical"/&gt;
 *     &lt;enumeration value="com_printformat_item_type_table"/&gt;
 *     &lt;enumeration value="com_printformat_item_type_aggregate_table"/&gt;
 *     &lt;enumeration value="com_printformat_item_pagenum"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComPrintformatItem")
@XmlEnum
public enum TypeComPrintformatItem {

    @XmlEnumValue("com_printformat_item_type_section")
    COM_PRINTFORMAT_ITEM_TYPE_SECTION("com_printformat_item_type_section"),
    @XmlEnumValue("com_printformat_item_type_database")
    COM_PRINTFORMAT_ITEM_TYPE_DATABASE("com_printformat_item_type_database"),
    @XmlEnumValue("com_printformat_item_type_image")
    COM_PRINTFORMAT_ITEM_TYPE_IMAGE("com_printformat_item_type_image"),
    @XmlEnumValue("com_printformat_item_type_text")
    COM_PRINTFORMAT_ITEM_TYPE_TEXT("com_printformat_item_type_text"),
    @XmlEnumValue("com_printformat_item_type_line_horizontal")
    COM_PRINTFORMAT_ITEM_TYPE_LINE_HORIZONTAL("com_printformat_item_type_line_horizontal"),
    @XmlEnumValue("com_printformat_item_type_line_vertical")
    COM_PRINTFORMAT_ITEM_TYPE_LINE_VERTICAL("com_printformat_item_type_line_vertical"),
    @XmlEnumValue("com_printformat_item_type_table")
    COM_PRINTFORMAT_ITEM_TYPE_TABLE("com_printformat_item_type_table"),
    @XmlEnumValue("com_printformat_item_type_aggregate_table")
    COM_PRINTFORMAT_ITEM_TYPE_AGGREGATE_TABLE("com_printformat_item_type_aggregate_table"),
    @XmlEnumValue("com_printformat_item_pagenum")
    COM_PRINTFORMAT_ITEM_PAGENUM("com_printformat_item_pagenum");
    private final String value;

    TypeComPrintformatItem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComPrintformatItem fromValue(String v) {
        for (TypeComPrintformatItem c: TypeComPrintformatItem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
