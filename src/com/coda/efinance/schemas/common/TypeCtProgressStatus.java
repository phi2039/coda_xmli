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
 * <p>Java class for typeCtProgressStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtProgressStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="in_progress"/&gt;
 *     &lt;enumeration value="completed_ok"/&gt;
 *     &lt;enumeration value="completed_errors"/&gt;
 *     &lt;enumeration value="aborted"/&gt;
 *     &lt;enumeration value="paused"/&gt;
 *     &lt;enumeration value="starting"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtProgressStatus")
@XmlEnum
public enum TypeCtProgressStatus {


    /**
     * In progress.
     * 
     */
    @XmlEnumValue("in_progress")
    IN_PROGRESS("in_progress"),

    /**
     * Completed successfully.
     * 
     */
    @XmlEnumValue("completed_ok")
    COMPLETED_OK("completed_ok"),

    /**
     * Completed with errors.
     * 
     */
    @XmlEnumValue("completed_errors")
    COMPLETED_ERRORS("completed_errors"),

    /**
     * Aborted because of an error or by user request.
     * 
     */
    @XmlEnumValue("aborted")
    ABORTED("aborted"),

    /**
     * Paused.
     * 
     */
    @XmlEnumValue("paused")
    PAUSED("paused"),

    /**
     * Starting.
     * 
     */
    @XmlEnumValue("starting")
    STARTING("starting");
    private final String value;

    TypeCtProgressStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtProgressStatus fromValue(String v) {
        for (TypeCtProgressStatus c: TypeCtProgressStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}