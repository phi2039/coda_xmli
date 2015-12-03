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
 * <p>Java class for typeCtRllVocab.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtRllVocab"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="vocab_el1"/&gt;
 *     &lt;enumeration value="vocab_el2"/&gt;
 *     &lt;enumeration value="vocab_el3"/&gt;
 *     &lt;enumeration value="vocab_el4"/&gt;
 *     &lt;enumeration value="vocab_el5"/&gt;
 *     &lt;enumeration value="vocab_el6"/&gt;
 *     &lt;enumeration value="vocab_el7"/&gt;
 *     &lt;enumeration value="vocab_el8"/&gt;
 *     &lt;enumeration value="vocab_grp1"/&gt;
 *     &lt;enumeration value="vocab_grp2"/&gt;
 *     &lt;enumeration value="vocab_grp3"/&gt;
 *     &lt;enumeration value="vocab_grp4"/&gt;
 *     &lt;enumeration value="vocab_grp5"/&gt;
 *     &lt;enumeration value="vocab_grp6"/&gt;
 *     &lt;enumeration value="vocab_grp7"/&gt;
 *     &lt;enumeration value="vocab_grp8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtRllVocab")
@XmlEnum
public enum TypeCtRllVocab {


    /**
     * None
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Element level 1
     * 
     */
    @XmlEnumValue("vocab_el1")
    VOCAB_EL_1("vocab_el1"),

    /**
     * Element level 2
     * 
     */
    @XmlEnumValue("vocab_el2")
    VOCAB_EL_2("vocab_el2"),

    /**
     * Element level 3
     * 
     */
    @XmlEnumValue("vocab_el3")
    VOCAB_EL_3("vocab_el3"),

    /**
     * Element level 4
     * 
     */
    @XmlEnumValue("vocab_el4")
    VOCAB_EL_4("vocab_el4"),

    /**
     * Element level 5
     * 
     */
    @XmlEnumValue("vocab_el5")
    VOCAB_EL_5("vocab_el5"),

    /**
     * Element level 6
     * 
     */
    @XmlEnumValue("vocab_el6")
    VOCAB_EL_6("vocab_el6"),

    /**
     * Element level 7
     * 
     */
    @XmlEnumValue("vocab_el7")
    VOCAB_EL_7("vocab_el7"),

    /**
     * Element level 8
     * 
     */
    @XmlEnumValue("vocab_el8")
    VOCAB_EL_8("vocab_el8"),

    /**
     * Element 1 account group
     * 
     */
    @XmlEnumValue("vocab_grp1")
    VOCAB_GRP_1("vocab_grp1"),

    /**
     * Element 2 account group
     * 
     */
    @XmlEnumValue("vocab_grp2")
    VOCAB_GRP_2("vocab_grp2"),

    /**
     * Element 3 account group
     * 
     */
    @XmlEnumValue("vocab_grp3")
    VOCAB_GRP_3("vocab_grp3"),

    /**
     * Element 4 account group
     * 
     */
    @XmlEnumValue("vocab_grp4")
    VOCAB_GRP_4("vocab_grp4"),

    /**
     * Element 5 account group
     * 
     */
    @XmlEnumValue("vocab_grp5")
    VOCAB_GRP_5("vocab_grp5"),

    /**
     * Element 6 account group
     * 
     */
    @XmlEnumValue("vocab_grp6")
    VOCAB_GRP_6("vocab_grp6"),

    /**
     * Element 7 account group
     * 
     */
    @XmlEnumValue("vocab_grp7")
    VOCAB_GRP_7("vocab_grp7"),

    /**
     * Element 8 account group
     * 
     */
    @XmlEnumValue("vocab_grp8")
    VOCAB_GRP_8("vocab_grp8");
    private final String value;

    TypeCtRllVocab(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtRllVocab fromValue(String v) {
        for (TypeCtRllVocab c: TypeCtRllVocab.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
