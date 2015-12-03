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
 * <p>Java class for typeCtPodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtPodType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="pod_liquidation"/&gt;
 *     &lt;enumeration value="pod_obligation"/&gt;
 *     &lt;enumeration value="pod_requisition"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtPodType")
@XmlEnum
public enum TypeCtPodType {


    /**
     * Liquidation
     * 
     */
    @XmlEnumValue("pod_liquidation")
    POD_LIQUIDATION("pod_liquidation"),

    /**
     * Obligation
     * 
     */
    @XmlEnumValue("pod_obligation")
    POD_OBLIGATION("pod_obligation"),

    /**
     * Requisition
     * 
     */
    @XmlEnumValue("pod_requisition")
    POD_REQUISITION("pod_requisition");
    private final String value;

    TypeCtPodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtPodType fromValue(String v) {
        for (TypeCtPodType c: TypeCtPodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}