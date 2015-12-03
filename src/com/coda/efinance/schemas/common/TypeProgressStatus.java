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
 * <p>Java class for typeProgressStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProgressStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="starting"/&gt;
 *     &lt;enumeration value="in_progress"/&gt;
 *     &lt;enumeration value="completed_ok"/&gt;
 *     &lt;enumeration value="completed_errors"/&gt;
 *     &lt;enumeration value="aborted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeProgressStatus")
@XmlEnum
public enum TypeProgressStatus {


    /**
     * Starting
     * 
     */
    @XmlEnumValue("starting")
    STARTING("starting"),

    /**
     * In progress
     * 
     */
    @XmlEnumValue("in_progress")
    IN_PROGRESS("in_progress"),

    /**
     * Completed successfully
     * 
     */
    @XmlEnumValue("completed_ok")
    COMPLETED_OK("completed_ok"),

    /**
     * Completed with errors
     * 
     */
    @XmlEnumValue("completed_errors")
    COMPLETED_ERRORS("completed_errors"),

    /**
     * Aborted
     * 
     */
    @XmlEnumValue("aborted")
    ABORTED("aborted");
    private final String value;

    TypeProgressStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProgressStatus fromValue(String v) {
        for (TypeProgressStatus c: TypeProgressStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}