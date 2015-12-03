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
 * <p>Java class for typeComPrintformatPageNumber.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComPrintformatPageNumber"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_printformat_page_current"/&gt;
 *     &lt;enumeration value="com_printformat_page_last"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComPrintformatPageNumber")
@XmlEnum
public enum TypeComPrintformatPageNumber {


    /**
     * Current page number
     * 
     */
    @XmlEnumValue("com_printformat_page_current")
    COM_PRINTFORMAT_PAGE_CURRENT("com_printformat_page_current"),

    /**
     * Last page number
     * 
     */
    @XmlEnumValue("com_printformat_page_last")
    COM_PRINTFORMAT_PAGE_LAST("com_printformat_page_last");
    private final String value;

    TypeComPrintformatPageNumber(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComPrintformatPageNumber fromValue(String v) {
        for (TypeComPrintformatPageNumber c: TypeComPrintformatPageNumber.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}