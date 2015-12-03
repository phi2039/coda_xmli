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
 * <p>Java class for typeCtEntityTypeWild.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtEntityTypeWild"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="entity_all"/&gt;
 *     &lt;enumeration value="address_cat"/&gt;
 *     &lt;enumeration value="elm_status_cat"/&gt;
 *     &lt;enumeration value="reason_code_cat"/&gt;
 *     &lt;enumeration value="diary_action_code"/&gt;
 *     &lt;enumeration value="resolution_code"/&gt;
 *     &lt;enumeration value="reporting_code"/&gt;
 *     &lt;enumeration value="store_cat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtEntityTypeWild")
@XmlEnum
public enum TypeCtEntityTypeWild {


    /**
     * All entity types
     * 
     */
    @XmlEnumValue("entity_all")
    ENTITY_ALL("entity_all"),

    /**
     * Address
     * 
     */
    @XmlEnumValue("address_cat")
    ADDRESS_CAT("address_cat"),

    /**
     * Element status
     * 
     */
    @XmlEnumValue("elm_status_cat")
    ELM_STATUS_CAT("elm_status_cat"),

    /**
     * Reason code
     * 
     */
    @XmlEnumValue("reason_code_cat")
    REASON_CODE_CAT("reason_code_cat"),

    /**
     * Diary action code
     * 
     */
    @XmlEnumValue("diary_action_code")
    DIARY_ACTION_CODE("diary_action_code"),

    /**
     * Resolution code
     * 
     */
    @XmlEnumValue("resolution_code")
    RESOLUTION_CODE("resolution_code"),

    /**
     * Reporting code
     * 
     */
    @XmlEnumValue("reporting_code")
    REPORTING_CODE("reporting_code"),
    @XmlEnumValue("store_cat")
    STORE_CAT("store_cat");
    private final String value;

    TypeCtEntityTypeWild(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtEntityTypeWild fromValue(String v) {
        for (TypeCtEntityTypeWild c: TypeCtEntityTypeWild.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
