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
 * <p>Java class for typeCtMulDiv.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtMulDiv"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="rate_mul"/&gt;
 *     &lt;enumeration value="rate_div"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtMulDiv")
@XmlEnum
public enum TypeCtMulDiv {


    /**
     * The rule is Multiply. A value in the currency must be multiplied by the exchange rate and divided by the scaling factor when converting to its parent currency or your home currency, whichever applies.
     * 
     */
    @XmlEnumValue("rate_mul")
    RATE_MUL("rate_mul"),

    /**
     * The rule is Divide. A value in the currency must be divided by the exchange rate and multiplied by the scaling factor when converting to its parent currency or your home currency, whichever applies.
     * 
     */
    @XmlEnumValue("rate_div")
    RATE_DIV("rate_div");
    private final String value;

    TypeCtMulDiv(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtMulDiv fromValue(String v) {
        for (TypeCtMulDiv c: TypeCtMulDiv.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
