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
 * <p>Java class for typeCtRemittanceAddress.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtRemittanceAddress"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="bill_remit_address_company"/&gt;
 *     &lt;enumeration value="bill_remit_address_other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtRemittanceAddress")
@XmlEnum
public enum TypeCtRemittanceAddress {


    /**
     * Company address
     * 
     */
    @XmlEnumValue("bill_remit_address_company")
    BILL_REMIT_ADDRESS_COMPANY("bill_remit_address_company"),

    /**
     * Other address
     * 
     */
    @XmlEnumValue("bill_remit_address_other")
    BILL_REMIT_ADDRESS_OTHER("bill_remit_address_other");
    private final String value;

    TypeCtRemittanceAddress(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtRemittanceAddress fromValue(String v) {
        for (TypeCtRemittanceAddress c: TypeCtRemittanceAddress.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}