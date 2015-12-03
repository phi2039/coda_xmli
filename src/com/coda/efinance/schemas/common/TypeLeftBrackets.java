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
 * <p>Java class for typeLeftBrackets.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLeftBrackets"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="left_one_bracket"/&gt;
 *     &lt;enumeration value="left_two_brackets"/&gt;
 *     &lt;enumeration value="left_three_brackets"/&gt;
 *     &lt;enumeration value="left_four_brackets"/&gt;
 *     &lt;enumeration value="left_five_brackets"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeLeftBrackets")
@XmlEnum
public enum TypeLeftBrackets {


    /**
     * None
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * One
     * 
     */
    @XmlEnumValue("left_one_bracket")
    LEFT_ONE_BRACKET("left_one_bracket"),

    /**
     * Two
     * 
     */
    @XmlEnumValue("left_two_brackets")
    LEFT_TWO_BRACKETS("left_two_brackets"),

    /**
     * Three
     * 
     */
    @XmlEnumValue("left_three_brackets")
    LEFT_THREE_BRACKETS("left_three_brackets"),

    /**
     * Four
     * 
     */
    @XmlEnumValue("left_four_brackets")
    LEFT_FOUR_BRACKETS("left_four_brackets"),

    /**
     * Five
     * 
     */
    @XmlEnumValue("left_five_brackets")
    LEFT_FIVE_BRACKETS("left_five_brackets");
    private final String value;

    TypeLeftBrackets(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeLeftBrackets fromValue(String v) {
        for (TypeLeftBrackets c: TypeLeftBrackets.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
