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
 * <p>Java class for typeCtCurParentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtCurParentType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="currel_parent"/&gt;
 *     &lt;enumeration value="currel_home"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtCurParentType")
@XmlEnum
public enum TypeCtCurParentType {

    @XmlEnumValue("currel_parent")
    CURREL_PARENT("currel_parent"),
    @XmlEnumValue("currel_home")
    CURREL_HOME("currel_home");
    private final String value;

    TypeCtCurParentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtCurParentType fromValue(String v) {
        for (TypeCtCurParentType c: TypeCtCurParentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
