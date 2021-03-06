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
 * <p>Java class for typeCtAssistantAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAssistantAction"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="reconcile"/&gt;
 *     &lt;enumeration value="reconcile_write_off"/&gt;
 *     &lt;enumeration value="match"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAssistantAction")
@XmlEnum
public enum TypeCtAssistantAction {


    /**
     * Reconcile lines.
     * 
     */
    @XmlEnumValue("reconcile")
    RECONCILE("reconcile"),

    /**
     * Reconcile lines and create write-offs
     * 
     */
    @XmlEnumValue("reconcile_write_off")
    RECONCILE_WRITE_OFF("reconcile_write_off"),

    /**
     * Match lines.
     * 
     */
    @XmlEnumValue("match")
    MATCH("match");
    private final String value;

    TypeCtAssistantAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAssistantAction fromValue(String v) {
        for (TypeCtAssistantAction c: TypeCtAssistantAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
