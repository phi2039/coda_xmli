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
 * <p>Java class for typeCtCustSuppExt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtCustSuppExt"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="customer"/&gt;
 *     &lt;enumeration value="supplier"/&gt;
 *     &lt;enumeration value="customer_only"/&gt;
 *     &lt;enumeration value="supplier_only"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="either"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="any"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtCustSuppExt")
@XmlEnum
public enum TypeCtCustSuppExt {


    /**
     * Customer
     * 
     */
    @XmlEnumValue("customer")
    CUSTOMER("customer"),

    /**
     * Supplier
     * 
     */
    @XmlEnumValue("supplier")
    SUPPLIER("supplier"),

    /**
     * Customer only
     * 
     */
    @XmlEnumValue("customer_only")
    CUSTOMER_ONLY("customer_only"),

    /**
     * Supplier only
     * 
     */
    @XmlEnumValue("supplier_only")
    SUPPLIER_ONLY("supplier_only"),

    /**
     * Both customer and supplier
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),

    /**
     * Either customer or supplier
     * 
     */
    @XmlEnumValue("either")
    EITHER("either"),

    /**
     * Neither customer or supplier
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Any
     * 
     */
    @XmlEnumValue("any")
    ANY("any");
    private final String value;

    TypeCtCustSuppExt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtCustSuppExt fromValue(String v) {
        for (TypeCtCustSuppExt c: TypeCtCustSuppExt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
