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
 * <p>Java class for typeCtSysLogStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtSysLogStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="sys_log_success"/&gt;
 *     &lt;enumeration value="sys_log_invalid_password"/&gt;
 *     &lt;enumeration value="sys_log_invalid_usercode"/&gt;
 *     &lt;enumeration value="sys_log_user_locked_out"/&gt;
 *     &lt;enumeration value="sys_log_all"/&gt;
 *     &lt;enumeration value="sys_log_logoff"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtSysLogStatus")
@XmlEnum
public enum TypeCtSysLogStatus {


    /**
     * User logged on.
     * 
     */
    @XmlEnumValue("sys_log_success")
    SYS_LOG_SUCCESS("sys_log_success"),

    /**
     * Invalid password entered.
     * 
     */
    @XmlEnumValue("sys_log_invalid_password")
    SYS_LOG_INVALID_PASSWORD("sys_log_invalid_password"),

    /**
     * Invlaid user code entered.
     * 
     */
    @XmlEnumValue("sys_log_invalid_usercode")
    SYS_LOG_INVALID_USERCODE("sys_log_invalid_usercode"),

    /**
     * User code locked out.
     * 
     */
    @XmlEnumValue("sys_log_user_locked_out")
    SYS_LOG_USER_LOCKED_OUT("sys_log_user_locked_out"),

    /**
     * All user code events.
     * 
     */
    @XmlEnumValue("sys_log_all")
    SYS_LOG_ALL("sys_log_all"),

    /**
     * Users logged off.
     * 
     */
    @XmlEnumValue("sys_log_logoff")
    SYS_LOG_LOGOFF("sys_log_logoff");
    private final String value;

    TypeCtSysLogStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtSysLogStatus fromValue(String v) {
        for (TypeCtSysLogStatus c: TypeCtSysLogStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
