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
 * <p>Java class for typeComSelftestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComSelftestStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_selftest_status_inactive"/&gt;
 *     &lt;enumeration value="com_selftest_status_running"/&gt;
 *     &lt;enumeration value="com_selftest_status_complete"/&gt;
 *     &lt;enumeration value="com_selftest_status_failed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComSelftestStatus")
@XmlEnum
public enum TypeComSelftestStatus {

    @XmlEnumValue("com_selftest_status_inactive")
    COM_SELFTEST_STATUS_INACTIVE("com_selftest_status_inactive"),
    @XmlEnumValue("com_selftest_status_running")
    COM_SELFTEST_STATUS_RUNNING("com_selftest_status_running"),
    @XmlEnumValue("com_selftest_status_complete")
    COM_SELFTEST_STATUS_COMPLETE("com_selftest_status_complete"),
    @XmlEnumValue("com_selftest_status_failed")
    COM_SELFTEST_STATUS_FAILED("com_selftest_status_failed");
    private final String value;

    TypeComSelftestStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComSelftestStatus fromValue(String v) {
        for (TypeComSelftestStatus c: TypeComSelftestStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
