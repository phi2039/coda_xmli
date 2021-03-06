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
 * <p>Java class for typeCtArchiveState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtArchiveState"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="idle"/&gt;
 *     &lt;enumeration value="selecting"/&gt;
 *     &lt;enumeration value="loading"/&gt;
 *     &lt;enumeration value="unloading"/&gt;
 *     &lt;enumeration value="posting"/&gt;
 *     &lt;enumeration value="balances"/&gt;
 *     &lt;enumeration value="missing"/&gt;
 *     &lt;enumeration value="purchasing"/&gt;
 *     &lt;enumeration value="sales_invoicing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtArchiveState")
@XmlEnum
public enum TypeCtArchiveState {


    /**
     * Idle
     * 
     */
    @XmlEnumValue("idle")
    IDLE("idle"),

    /**
     * Selecting
     * 
     */
    @XmlEnumValue("selecting")
    SELECTING("selecting"),

    /**
     * Loading
     * 
     */
    @XmlEnumValue("loading")
    LOADING("loading"),

    /**
     * Unloading
     * 
     */
    @XmlEnumValue("unloading")
    UNLOADING("unloading"),

    /**
     * Posting
     * 
     */
    @XmlEnumValue("posting")
    POSTING("posting"),

    /**
     * Balances
     * 
     */
    @XmlEnumValue("balances")
    BALANCES("balances"),

    /**
     * Misiing
     * 
     */
    @XmlEnumValue("missing")
    MISSING("missing"),

    /**
     * Purchasing
     * 
     */
    @XmlEnumValue("purchasing")
    PURCHASING("purchasing"),

    /**
     * Sales Invoicing
     * 
     */
    @XmlEnumValue("sales_invoicing")
    SALES_INVOICING("sales_invoicing");
    private final String value;

    TypeCtArchiveState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtArchiveState fromValue(String v) {
        for (TypeCtArchiveState c: TypeCtArchiveState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
