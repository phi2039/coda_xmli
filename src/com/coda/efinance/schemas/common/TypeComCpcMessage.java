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
 * <p>Java class for typeComCpcMessage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComCpcMessage"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_cpc_success"/&gt;
 *     &lt;enumeration value="com_cpc_warning"/&gt;
 *     &lt;enumeration value="com_cpc_info"/&gt;
 *     &lt;enumeration value="com_cpc_failure"/&gt;
 *     &lt;enumeration value="com_cpc_finished"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComCpcMessage")
@XmlEnum
public enum TypeComCpcMessage {

    @XmlEnumValue("com_cpc_success")
    COM_CPC_SUCCESS("com_cpc_success"),
    @XmlEnumValue("com_cpc_warning")
    COM_CPC_WARNING("com_cpc_warning"),
    @XmlEnumValue("com_cpc_info")
    COM_CPC_INFO("com_cpc_info"),
    @XmlEnumValue("com_cpc_failure")
    COM_CPC_FAILURE("com_cpc_failure"),
    @XmlEnumValue("com_cpc_finished")
    COM_CPC_FINISHED("com_cpc_finished");
    private final String value;

    TypeComCpcMessage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComCpcMessage fromValue(String v) {
        for (TypeComCpcMessage c: TypeComCpcMessage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
