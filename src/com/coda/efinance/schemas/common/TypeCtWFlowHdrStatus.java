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
 * <p>Java class for typeCtWFlowHdrStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtWFlowHdrStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="wflow_hstat_none"/&gt;
 *     &lt;enumeration value="wflow_hstat_in_progress"/&gt;
 *     &lt;enumeration value="wflow_hstat_authorised_ok"/&gt;
 *     &lt;enumeration value="wflow_hstat_authorised_failed"/&gt;
 *     &lt;enumeration value="wflow_hstat_any"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtWFlowHdrStatus")
@XmlEnum
public enum TypeCtWFlowHdrStatus {


    /**
     * None
     * 
     */
    @XmlEnumValue("wflow_hstat_none")
    WFLOW_HSTAT_NONE("wflow_hstat_none"),

    /**
     * In progress
     * 
     */
    @XmlEnumValue("wflow_hstat_in_progress")
    WFLOW_HSTAT_IN_PROGRESS("wflow_hstat_in_progress"),

    /**
     * Authorised
     * 
     */
    @XmlEnumValue("wflow_hstat_authorised_ok")
    WFLOW_HSTAT_AUTHORISED_OK("wflow_hstat_authorised_ok"),

    /**
     * Failed authorisation
     * 
     */
    @XmlEnumValue("wflow_hstat_authorised_failed")
    WFLOW_HSTAT_AUTHORISED_FAILED("wflow_hstat_authorised_failed"),

    /**
     * Any
     * 
     */
    @XmlEnumValue("wflow_hstat_any")
    WFLOW_HSTAT_ANY("wflow_hstat_any");
    private final String value;

    TypeCtWFlowHdrStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtWFlowHdrStatus fromValue(String v) {
        for (TypeCtWFlowHdrStatus c: TypeCtWFlowHdrStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
