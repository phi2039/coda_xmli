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
 * <p>Java class for typeCtAdbProgressStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAdbProgressStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="aud_bal_init"/&gt;
 *     &lt;enumeration value="aud_bal_reading"/&gt;
 *     &lt;enumeration value="aud_bal_differ1"/&gt;
 *     &lt;enumeration value="aud_bal_differ2"/&gt;
 *     &lt;enumeration value="aud_bal_differ3"/&gt;
 *     &lt;enumeration value="aud_bal_optional"/&gt;
 *     &lt;enumeration value="aud_bal_fixing"/&gt;
 *     &lt;enumeration value="aud_bal_halted"/&gt;
 *     &lt;enumeration value="aud_bal_complete"/&gt;
 *     &lt;enumeration value="aud_bal_update_commit"/&gt;
 *     &lt;enumeration value="aud_bal_tb_init"/&gt;
 *     &lt;enumeration value="aud_bal_tb_optional"/&gt;
 *     &lt;enumeration value="aud_bal_tb_halted"/&gt;
 *     &lt;enumeration value="aud_bal_tb_complete"/&gt;
 *     &lt;enumeration value="aud_bal_fixing_miss"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAdbProgressStatus")
@XmlEnum
public enum TypeCtAdbProgressStatus {


    /**
     * Initialising
     * 
     */
    @XmlEnumValue("aud_bal_init")
    AUD_BAL_INIT("aud_bal_init"),

    /**
     * Reading
     * 
     */
    @XmlEnumValue("aud_bal_reading")
    AUD_BAL_READING("aud_bal_reading"),

    /**
     * Balance audit checking for differences (stage 1)
     * 
     */
    @XmlEnumValue("aud_bal_differ1")
    AUD_BAL_DIFFER_1("aud_bal_differ1"),

    /**
     * Balance audit checking for differences (stage 2)
     * 
     */
    @XmlEnumValue("aud_bal_differ2")
    AUD_BAL_DIFFER_2("aud_bal_differ2"),

    /**
     * Balance audit checking for differences (stage 3)
     * 
     */
    @XmlEnumValue("aud_bal_differ3")
    AUD_BAL_DIFFER_3("aud_bal_differ3"),

    /**
     * Balance audit optional checking
     * 
     */
    @XmlEnumValue("aud_bal_optional")
    AUD_BAL_OPTIONAL("aud_bal_optional"),

    /**
     * Balance audit fixing errors
     * 
     */
    @XmlEnumValue("aud_bal_fixing")
    AUD_BAL_FIXING("aud_bal_fixing"),

    /**
     * Balance audit halted
     * 
     */
    @XmlEnumValue("aud_bal_halted")
    AUD_BAL_HALTED("aud_bal_halted"),

    /**
     * Balance audit complete
     * 
     */
    @XmlEnumValue("aud_bal_complete")
    AUD_BAL_COMPLETE("aud_bal_complete"),

    /**
     * Balance audit committing to database
     * 
     */
    @XmlEnumValue("aud_bal_update_commit")
    AUD_BAL_UPDATE_COMMIT("aud_bal_update_commit"),

    /**
     * Initilaising balance toolbox
     * 
     */
    @XmlEnumValue("aud_bal_tb_init")
    AUD_BAL_TB_INIT("aud_bal_tb_init"),

    /**
     * Balance toolbox optional checking
     * 
     */
    @XmlEnumValue("aud_bal_tb_optional")
    AUD_BAL_TB_OPTIONAL("aud_bal_tb_optional"),

    /**
     * Balance toolbox halted
     * 
     */
    @XmlEnumValue("aud_bal_tb_halted")
    AUD_BAL_TB_HALTED("aud_bal_tb_halted"),

    /**
     * Balance toolbox complete
     * 
     */
    @XmlEnumValue("aud_bal_tb_complete")
    AUD_BAL_TB_COMPLETE("aud_bal_tb_complete"),
    @XmlEnumValue("aud_bal_fixing_miss")
    AUD_BAL_FIXING_MISS("aud_bal_fixing_miss");
    private final String value;

    TypeCtAdbProgressStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAdbProgressStatus fromValue(String v) {
        for (TypeCtAdbProgressStatus c: TypeCtAdbProgressStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
