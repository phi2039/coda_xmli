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
 * <p>Java class for typeCtICLineStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtICLineStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="ic_line_status_ready"/&gt;
 *     &lt;enumeration value="ic_line_status_intray"/&gt;
 *     &lt;enumeration value="ic_line_status_books"/&gt;
 *     &lt;enumeration value="ic_line_status_failed"/&gt;
 *     &lt;enumeration value="ic_line_status_self"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtICLineStatus")
@XmlEnum
public enum TypeCtICLineStatus {


    /**
     * Ready
     * 
     */
    @XmlEnumValue("ic_line_status_ready")
    IC_LINE_STATUS_READY("ic_line_status_ready"),

    /**
     * On the Intray
     * 
     */
    @XmlEnumValue("ic_line_status_intray")
    IC_LINE_STATUS_INTRAY("ic_line_status_intray"),

    /**
     * Posted to the books
     * 
     */
    @XmlEnumValue("ic_line_status_books")
    IC_LINE_STATUS_BOOKS("ic_line_status_books"),

    /**
     * Failed
     * 
     */
    @XmlEnumValue("ic_line_status_failed")
    IC_LINE_STATUS_FAILED("ic_line_status_failed"),

    /**
     * Self
     * 
     */
    @XmlEnumValue("ic_line_status_self")
    IC_LINE_STATUS_SELF("ic_line_status_self");
    private final String value;

    TypeCtICLineStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtICLineStatus fromValue(String v) {
        for (TypeCtICLineStatus c: TypeCtICLineStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
