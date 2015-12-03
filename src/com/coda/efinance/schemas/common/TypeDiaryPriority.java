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
 * <p>Java class for typeDiaryPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDiaryPriority"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="low_priority"/&gt;
 *     &lt;enumeration value="medium_priority"/&gt;
 *     &lt;enumeration value="high_priority"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDiaryPriority")
@XmlEnum
public enum TypeDiaryPriority {


    /**
     * Low priority
     * 
     */
    @XmlEnumValue("low_priority")
    LOW_PRIORITY("low_priority"),

    /**
     * Medium priority
     * 
     */
    @XmlEnumValue("medium_priority")
    MEDIUM_PRIORITY("medium_priority"),

    /**
     * High priority
     * 
     */
    @XmlEnumValue("high_priority")
    HIGH_PRIORITY("high_priority");
    private final String value;

    TypeDiaryPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDiaryPriority fromValue(String v) {
        for (TypeDiaryPriority c: TypeDiaryPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
