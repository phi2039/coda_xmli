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
 * <p>Java class for typeComPrintformatPageOrientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComPrintformatPageOrientation"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_printformat_page_orientation_portrait"/&gt;
 *     &lt;enumeration value="com_printformat_page_orientation_landscape"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComPrintformatPageOrientation")
@XmlEnum
public enum TypeComPrintformatPageOrientation {


    /**
     * Portrait
     * 
     */
    @XmlEnumValue("com_printformat_page_orientation_portrait")
    COM_PRINTFORMAT_PAGE_ORIENTATION_PORTRAIT("com_printformat_page_orientation_portrait"),

    /**
     * Landscape
     * 
     */
    @XmlEnumValue("com_printformat_page_orientation_landscape")
    COM_PRINTFORMAT_PAGE_ORIENTATION_LANDSCAPE("com_printformat_page_orientation_landscape");
    private final String value;

    TypeComPrintformatPageOrientation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComPrintformatPageOrientation fromValue(String v) {
        for (TypeComPrintformatPageOrientation c: TypeComPrintformatPageOrientation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
