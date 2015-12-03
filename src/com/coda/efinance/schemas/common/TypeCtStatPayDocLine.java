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
 * <p>Java class for typeCtStatPayDocLine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtStatPayDocLine"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="available"/&gt;
 *     &lt;enumeration value="held"/&gt;
 *     &lt;enumeration value="notmatchable"/&gt;
 *     &lt;enumeration value="paid"/&gt;
 *     &lt;enumeration value="paid_by_bill"/&gt;
 *     &lt;enumeration value="proposed"/&gt;
 *     &lt;enumeration value="null"/&gt;
 *     &lt;enumeration value="draft_available"/&gt;
 *     &lt;enumeration value="draft_paid"/&gt;
 *     &lt;enumeration value="draft_held"/&gt;
 *     &lt;enumeration value="suppress_post"/&gt;
 *     &lt;enumeration value="cancel_matched"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtStatPayDocLine")
@XmlEnum
public enum TypeCtStatPayDocLine {


    /**
     * Available
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
     * Not Matchable.
     * 
     */
    @XmlEnumValue("notmatchable")
    NOTMATCHABLE("notmatchable"),

    /**
     * Paid - set by Pay.
     * 
     */
    @XmlEnumValue("paid")
    PAID("paid"),

    /**
     * Proposed by bill.
     * 
     */
    @XmlEnumValue("paid_by_bill")
    PAID_BY_BILL("paid_by_bill"),

    /**
     * Proposed - in a Pay list.
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * Null
     * 
     */
    @XmlEnumValue("null")
    NULL("null"),

    /**
     * Draft Available
     * 
     */
    @XmlEnumValue("draft_available")
    DRAFT_AVAILABLE("draft_available"),

    /**
     * Draft Paid
     * 
     */
    @XmlEnumValue("draft_paid")
    DRAFT_PAID("draft_paid"),

    /**
     * Draft Held
     * 
     */
    @XmlEnumValue("draft_held")
    DRAFT_HELD("draft_held"),

    /**
     * Payment suppressed
     * 
     */
    @XmlEnumValue("suppress_post")
    SUPPRESS_POST("suppress_post"),

    /**
     * Cancel matched
     * 
     */
    @XmlEnumValue("cancel_matched")
    CANCEL_MATCHED("cancel_matched");
    private final String value;

    TypeCtStatPayDocLine(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtStatPayDocLine fromValue(String v) {
        for (TypeCtStatPayDocLine c: TypeCtStatPayDocLine.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
