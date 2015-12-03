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
 * <p>Java class for typeCtRightBracketVocab.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtRightBracketVocab"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="right_one_bracket"/&gt;
 *     &lt;enumeration value="right_two_brackets"/&gt;
 *     &lt;enumeration value="right_three_brackets"/&gt;
 *     &lt;enumeration value="right_four_brackets"/&gt;
 *     &lt;enumeration value="right_five_brackets"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtRightBracketVocab")
@XmlEnum
public enum TypeCtRightBracketVocab {


    /**
     * One right bracket.
     * 
     */
    @XmlEnumValue("right_one_bracket")
    RIGHT_ONE_BRACKET("right_one_bracket"),

    /**
     * Two right brackets.
     * 
     */
    @XmlEnumValue("right_two_brackets")
    RIGHT_TWO_BRACKETS("right_two_brackets"),

    /**
     * Three right brackets.
     * 
     */
    @XmlEnumValue("right_three_brackets")
    RIGHT_THREE_BRACKETS("right_three_brackets"),

    /**
     * Four right brackets.
     * 
     */
    @XmlEnumValue("right_four_brackets")
    RIGHT_FOUR_BRACKETS("right_four_brackets"),

    /**
     * Five right brackets.
     * 
     */
    @XmlEnumValue("right_five_brackets")
    RIGHT_FIVE_BRACKETS("right_five_brackets"),

    /**
     * No right brackets.
     * 
     */
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    TypeCtRightBracketVocab(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtRightBracketVocab fromValue(String v) {
        for (TypeCtRightBracketVocab c: TypeCtRightBracketVocab.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}