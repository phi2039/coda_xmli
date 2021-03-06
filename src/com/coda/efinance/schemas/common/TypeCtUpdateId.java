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
 * <p>Java class for typeCtUpdateId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtUpdateId"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="description"/&gt;
 *     &lt;enumeration value="statuser"/&gt;
 *     &lt;enumeration value="valdate"/&gt;
 *     &lt;enumeration value="due_date"/&gt;
 *     &lt;enumeration value="statpay"/&gt;
 *     &lt;enumeration value="statrecon"/&gt;
 *     &lt;enumeration value="mediacode"/&gt;
 *     &lt;enumeration value="bankcode"/&gt;
 *     &lt;enumeration value="elmbanktag"/&gt;
 *     &lt;enumeration value="elmaddrtag"/&gt;
 *     &lt;enumeration value="userref"/&gt;
 *     &lt;enumeration value="comment"/&gt;
 *     &lt;enumeration value="discount"/&gt;
 *     &lt;enumeration value="extref"/&gt;
 *     &lt;enumeration value="append_comment"/&gt;
 *     &lt;enumeration value="reminder_letter_severity"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtUpdateId")
@XmlEnum
public enum TypeCtUpdateId {

    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("statuser")
    STATUSER("statuser"),
    @XmlEnumValue("valdate")
    VALDATE("valdate"),
    @XmlEnumValue("due_date")
    DUE_DATE("due_date"),
    @XmlEnumValue("statpay")
    STATPAY("statpay"),
    @XmlEnumValue("statrecon")
    STATRECON("statrecon"),
    @XmlEnumValue("mediacode")
    MEDIACODE("mediacode"),
    @XmlEnumValue("bankcode")
    BANKCODE("bankcode"),
    @XmlEnumValue("elmbanktag")
    ELMBANKTAG("elmbanktag"),
    @XmlEnumValue("elmaddrtag")
    ELMADDRTAG("elmaddrtag"),
    @XmlEnumValue("userref")
    USERREF("userref"),
    @XmlEnumValue("comment")
    COMMENT("comment"),
    @XmlEnumValue("discount")
    DISCOUNT("discount"),
    @XmlEnumValue("extref")
    EXTREF("extref"),
    @XmlEnumValue("append_comment")
    APPEND_COMMENT("append_comment"),
    @XmlEnumValue("reminder_letter_severity")
    REMINDER_LETTER_SEVERITY("reminder_letter_severity");
    private final String value;

    TypeCtUpdateId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtUpdateId fromValue(String v) {
        for (TypeCtUpdateId c: TypeCtUpdateId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
