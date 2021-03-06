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
 * <p>Java class for typeComWorkflowJoin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComWorkflowJoin"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_workflow_xor"/&gt;
 *     &lt;enumeration value="com_workflow_or"/&gt;
 *     &lt;enumeration value="com_workflow_and"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComWorkflowJoin")
@XmlEnum
public enum TypeComWorkflowJoin {


    /**
     * XOR
     * 
     */
    @XmlEnumValue("com_workflow_xor")
    COM_WORKFLOW_XOR("com_workflow_xor"),

    /**
     * OR
     * 
     */
    @XmlEnumValue("com_workflow_or")
    COM_WORKFLOW_OR("com_workflow_or"),

    /**
     * AND
     * 
     */
    @XmlEnumValue("com_workflow_and")
    COM_WORKFLOW_AND("com_workflow_and");
    private final String value;

    TypeComWorkflowJoin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComWorkflowJoin fromValue(String v) {
        for (TypeComWorkflowJoin c: TypeComWorkflowJoin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
