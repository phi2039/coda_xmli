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
 * <p>Java class for typeCtStatPayMultEdit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtStatPayMultEdit"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="no_change"/&gt;
 *     &lt;enumeration value="available"/&gt;
 *     &lt;enumeration value="held"/&gt;
 *     &lt;enumeration value="draft_available"/&gt;
 *     &lt;enumeration value="draft_held"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtStatPayMultEdit")
@XmlEnum
public enum TypeCtStatPayMultEdit {


    /**
     * No change required.
     * 
     */
    @XmlEnumValue("no_change")
    NO_CHANGE("no_change"),

    /**
     * Available.
     * 
     */
    @XmlEnumValue("available")
    AVAILABLE("available"),

    /**
     * Held.
     * 
     */
    @XmlEnumValue("held")
    HELD("held"),

    /**
     * Draft available.
     * 
     */
    @XmlEnumValue("draft_available")
    DRAFT_AVAILABLE("draft_available"),

    /**
     * Draft Held.
     * 
     */
    @XmlEnumValue("draft_held")
    DRAFT_HELD("draft_held");
    private final String value;

    TypeCtStatPayMultEdit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtStatPayMultEdit fromValue(String v) {
        for (TypeCtStatPayMultEdit c: TypeCtStatPayMultEdit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}