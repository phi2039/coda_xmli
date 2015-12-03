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
 * <p>Java class for typeComWorkflowEscalateUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComWorkflowEscalateUnits"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_workflow_escalate_units_hours"/&gt;
 *     &lt;enumeration value="com_workflow_escalate_units_days"/&gt;
 *     &lt;enumeration value="com_workflow_escalate_units_weeks"/&gt;
 *     &lt;enumeration value="com_workflow_escalate_units_months"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComWorkflowEscalateUnits")
@XmlEnum
public enum TypeComWorkflowEscalateUnits {


    /**
     * Hours
     * 
     */
    @XmlEnumValue("com_workflow_escalate_units_hours")
    COM_WORKFLOW_ESCALATE_UNITS_HOURS("com_workflow_escalate_units_hours"),

    /**
     * Days
     * 
     */
    @XmlEnumValue("com_workflow_escalate_units_days")
    COM_WORKFLOW_ESCALATE_UNITS_DAYS("com_workflow_escalate_units_days"),

    /**
     * Weeks
     * 
     */
    @XmlEnumValue("com_workflow_escalate_units_weeks")
    COM_WORKFLOW_ESCALATE_UNITS_WEEKS("com_workflow_escalate_units_weeks"),

    /**
     * Months
     * 
     */
    @XmlEnumValue("com_workflow_escalate_units_months")
    COM_WORKFLOW_ESCALATE_UNITS_MONTHS("com_workflow_escalate_units_months");
    private final String value;

    TypeComWorkflowEscalateUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComWorkflowEscalateUnits fromValue(String v) {
        for (TypeComWorkflowEscalateUnits c: TypeComWorkflowEscalateUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}