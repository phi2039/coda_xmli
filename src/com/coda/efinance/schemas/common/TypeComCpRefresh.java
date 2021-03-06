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
 * <p>Java class for typeComCpRefresh.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComCpRefresh"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_cp_refresh_hour"/&gt;
 *     &lt;enumeration value="com_cp_refresh_day"/&gt;
 *     &lt;enumeration value="com_cp_refresh_month"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComCpRefresh")
@XmlEnum
public enum TypeComCpRefresh {

    @XmlEnumValue("com_cp_refresh_hour")
    COM_CP_REFRESH_HOUR("com_cp_refresh_hour"),
    @XmlEnumValue("com_cp_refresh_day")
    COM_CP_REFRESH_DAY("com_cp_refresh_day"),
    @XmlEnumValue("com_cp_refresh_month")
    COM_CP_REFRESH_MONTH("com_cp_refresh_month");
    private final String value;

    TypeComCpRefresh(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComCpRefresh fromValue(String v) {
        for (TypeComCpRefresh c: TypeComCpRefresh.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
