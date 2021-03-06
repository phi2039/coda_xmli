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
 * <p>Java class for typeCtAccessLog.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAccessLog"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="logical_and"/&gt;
 *     &lt;enumeration value="logical_or"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAccessLog")
@XmlEnum
public enum TypeCtAccessLog {


    /**
     * None
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * AND
     * 
     */
    @XmlEnumValue("logical_and")
    LOGICAL_AND("logical_and"),

    /**
     * OR
     * 
     */
    @XmlEnumValue("logical_or")
    LOGICAL_OR("logical_or");
    private final String value;

    TypeCtAccessLog(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAccessLog fromValue(String v) {
        for (TypeCtAccessLog c: TypeCtAccessLog.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
