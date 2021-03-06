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
 * <p>Java class for typeComWorkflowVariableKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComWorkflowVariableKind"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_workflow_variable_kind_in"/&gt;
 *     &lt;enumeration value="com_workflow_variable_kind_out"/&gt;
 *     &lt;enumeration value="com_workflow_variable_kind_instance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComWorkflowVariableKind")
@XmlEnum
public enum TypeComWorkflowVariableKind {


    /**
     * Input variable
     * 
     */
    @XmlEnumValue("com_workflow_variable_kind_in")
    COM_WORKFLOW_VARIABLE_KIND_IN("com_workflow_variable_kind_in"),

    /**
     * Output variable
     * 
     */
    @XmlEnumValue("com_workflow_variable_kind_out")
    COM_WORKFLOW_VARIABLE_KIND_OUT("com_workflow_variable_kind_out"),

    /**
     * Instance variable
     * 
     */
    @XmlEnumValue("com_workflow_variable_kind_instance")
    COM_WORKFLOW_VARIABLE_KIND_INSTANCE("com_workflow_variable_kind_instance");
    private final String value;

    TypeComWorkflowVariableKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComWorkflowVariableKind fromValue(String v) {
        for (TypeComWorkflowVariableKind c: TypeComWorkflowVariableKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
