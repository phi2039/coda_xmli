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
 * <p>Java class for typeCtPreDataclass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtPreDataclass"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="dataclass_all"/&gt;
 *     &lt;enumeration value="dataclass_assets"/&gt;
 *     &lt;enumeration value="dataclass_commitments"/&gt;
 *     &lt;enumeration value="dataclass_details"/&gt;
 *     &lt;enumeration value="dataclass_statement"/&gt;
 *     &lt;enumeration value="dataclass_pay"/&gt;
 *     &lt;enumeration value="dataclass_balance"/&gt;
 *     &lt;enumeration value="dataclass_diary"/&gt;
 *     &lt;enumeration value="dataclass_trace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtPreDataclass")
@XmlEnum
public enum TypeCtPreDataclass {


    /**
     * All types of data
     * 
     */
    @XmlEnumValue("dataclass_all")
    DATACLASS_ALL("dataclass_all"),

    /**
     * Assets
     * 
     */
    @XmlEnumValue("dataclass_assets")
    DATACLASS_ASSETS("dataclass_assets"),

    /**
     * Commitments
     * 
     */
    @XmlEnumValue("dataclass_commitments")
    DATACLASS_COMMITMENTS("dataclass_commitments"),

    /**
     * Document details
     * 
     */
    @XmlEnumValue("dataclass_details")
    DATACLASS_DETAILS("dataclass_details"),

    /**
     * Statement details
     * 
     */
    @XmlEnumValue("dataclass_statement")
    DATACLASS_STATEMENT("dataclass_statement"),

    /**
     * Payment document details
     * 
     */
    @XmlEnumValue("dataclass_pay")
    DATACLASS_PAY("dataclass_pay"),

    /**
     * Balances
     * 
     */
    @XmlEnumValue("dataclass_balance")
    DATACLASS_BALANCE("dataclass_balance"),

    /**
     * Diary entries
     * 
     */
    @XmlEnumValue("dataclass_diary")
    DATACLASS_DIARY("dataclass_diary"),

    /**
     * Trace data
     * 
     */
    @XmlEnumValue("dataclass_trace")
    DATACLASS_TRACE("dataclass_trace");
    private final String value;

    TypeCtPreDataclass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtPreDataclass fromValue(String v) {
        for (TypeCtPreDataclass c: TypeCtPreDataclass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
