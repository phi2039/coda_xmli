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
 * <p>Java class for typeCtCreateChangeTempElementValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtCreateChangeTempElementValues"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="create_temp_element"/&gt;
 *     &lt;enumeration value="change_temp_element"/&gt;
 *     &lt;enumeration value="create_and_change_temp_element"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtCreateChangeTempElementValues")
@XmlEnum
public enum TypeCtCreateChangeTempElementValues {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("create_temp_element")
    CREATE_TEMP_ELEMENT("create_temp_element"),
    @XmlEnumValue("change_temp_element")
    CHANGE_TEMP_ELEMENT("change_temp_element"),
    @XmlEnumValue("create_and_change_temp_element")
    CREATE_AND_CHANGE_TEMP_ELEMENT("create_and_change_temp_element");
    private final String value;

    TypeCtCreateChangeTempElementValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtCreateChangeTempElementValues fromValue(String v) {
        for (TypeCtCreateChangeTempElementValues c: TypeCtCreateChangeTempElementValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
