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
 * <p>Java class for typeComWorkflowStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComWorkflowStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_workflow_status_running"/&gt;
 *     &lt;enumeration value="com_workflow_status_paused"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComWorkflowStatus")
@XmlEnum
public enum TypeComWorkflowStatus {


    /**
     * Running
     * 
     */
    @XmlEnumValue("com_workflow_status_running")
    COM_WORKFLOW_STATUS_RUNNING("com_workflow_status_running"),

    /**
     * Paused
     * 
     */
    @XmlEnumValue("com_workflow_status_paused")
    COM_WORKFLOW_STATUS_PAUSED("com_workflow_status_paused");
    private final String value;

    TypeComWorkflowStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComWorkflowStatus fromValue(String v) {
        for (TypeComWorkflowStatus c: TypeComWorkflowStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}