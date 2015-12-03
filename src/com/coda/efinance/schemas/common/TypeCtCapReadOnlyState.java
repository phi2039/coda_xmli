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
 * <p>Java class for typeCtCapReadOnlyState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtCapReadOnlyState"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="read_and_write"/&gt;
 *     &lt;enumeration value="read_only"/&gt;
 *     &lt;enumeration value="read_only_wflow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtCapReadOnlyState")
@XmlEnum
public enum TypeCtCapReadOnlyState {


    /**
     * The user has read and write access to all functions made available via their CapabilityMaster.
     * 
     */
    @XmlEnumValue("read_and_write")
    READ_AND_WRITE("read_and_write"),

    /**
     * The user has read-only access to all functions.
     * 
     */
    @XmlEnumValue("read_only")
    READ_ONLY("read_only"),

    /**
     * The user has only write access via XML
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:com="http://www.coda.com/efinance/schemas/common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;i&lt;/i&gt;
     * </pre>
     *  Workflow requests.
     * 
     */
    @XmlEnumValue("read_only_wflow")
    READ_ONLY_WFLOW("read_only_wflow");
    private final String value;

    TypeCtCapReadOnlyState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtCapReadOnlyState fromValue(String v) {
        for (TypeCtCapReadOnlyState c: TypeCtCapReadOnlyState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
