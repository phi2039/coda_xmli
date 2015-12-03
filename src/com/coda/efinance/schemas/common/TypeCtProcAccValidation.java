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
 * <p>Java class for typeCtProcAccValidation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtProcAccValidation"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="on_document_submission"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtProcAccValidation")
@XmlEnum
public enum TypeCtProcAccValidation {


    /**
     * No checking.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * When document is sent for authorisation.
     * 
     */
    @XmlEnumValue("on_document_submission")
    ON_DOCUMENT_SUBMISSION("on_document_submission");
    private final String value;

    TypeCtProcAccValidation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtProcAccValidation fromValue(String v) {
        for (TypeCtProcAccValidation c: TypeCtProcAccValidation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}