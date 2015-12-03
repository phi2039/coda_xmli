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
 * <p>Java class for typeComWorkflowSchedulerStrategy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComWorkflowSchedulerStrategy"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_workflow_scheduler_coda"/&gt;
 *     &lt;enumeration value="com_workflow_scheduler_internal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComWorkflowSchedulerStrategy")
@XmlEnum
public enum TypeComWorkflowSchedulerStrategy {


    /**
     * The CODA scheduler.
     * 
     */
    @XmlEnumValue("com_workflow_scheduler_coda")
    COM_WORKFLOW_SCHEDULER_CODA("com_workflow_scheduler_coda"),

    /**
     * The Workflow scheduler.
     * 
     */
    @XmlEnumValue("com_workflow_scheduler_internal")
    COM_WORKFLOW_SCHEDULER_INTERNAL("com_workflow_scheduler_internal");
    private final String value;

    TypeComWorkflowSchedulerStrategy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComWorkflowSchedulerStrategy fromValue(String v) {
        for (TypeComWorkflowSchedulerStrategy c: TypeComWorkflowSchedulerStrategy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}