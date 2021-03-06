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
 * <p>Java class for typeCtLetPrlStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtLetPrlStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="generating"/&gt;
 *     &lt;enumeration value="generated"/&gt;
 *     &lt;enumeration value="manipulating"/&gt;
 *     &lt;enumeration value="manipulated"/&gt;
 *     &lt;enumeration value="producing"/&gt;
 *     &lt;enumeration value="produced"/&gt;
 *     &lt;enumeration value="part_confirmed"/&gt;
 *     &lt;enumeration value="confirming"/&gt;
 *     &lt;enumeration value="deleting"/&gt;
 *     &lt;enumeration value="complete"/&gt;
 *     &lt;enumeration value="void"/&gt;
 *     &lt;enumeration value="recovering"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtLetPrlStatus")
@XmlEnum
public enum TypeCtLetPrlStatus {


    /**
     * Generating
     * 
     */
    @XmlEnumValue("generating")
    GENERATING("generating"),

    /**
     * Generated
     * 
     */
    @XmlEnumValue("generated")
    GENERATED("generated"),

    /**
     * Manipulating
     * 
     */
    @XmlEnumValue("manipulating")
    MANIPULATING("manipulating"),

    /**
     * Manipulated
     * 
     */
    @XmlEnumValue("manipulated")
    MANIPULATED("manipulated"),

    /**
     * Producing
     * 
     */
    @XmlEnumValue("producing")
    PRODUCING("producing"),

    /**
     * Produced
     * 
     */
    @XmlEnumValue("produced")
    PRODUCED("produced"),

    /**
     * Part-confirmed
     * 
     */
    @XmlEnumValue("part_confirmed")
    PART_CONFIRMED("part_confirmed"),

    /**
     * Confirming
     * 
     */
    @XmlEnumValue("confirming")
    CONFIRMING("confirming"),

    /**
     * Deleting
     * 
     */
    @XmlEnumValue("deleting")
    DELETING("deleting"),

    /**
     * Complete
     * 
     */
    @XmlEnumValue("complete")
    COMPLETE("complete"),

    /**
     * Void
     * 
     */
    @XmlEnumValue("void")
    VOID("void"),

    /**
     * Recovering
     * 
     */
    @XmlEnumValue("recovering")
    RECOVERING("recovering");
    private final String value;

    TypeCtLetPrlStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtLetPrlStatus fromValue(String v) {
        for (TypeCtLetPrlStatus c: TypeCtLetPrlStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
