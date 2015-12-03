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
 * <p>Java class for typeCtTtrStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtTtrStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="ttr_cannot_affect"/&gt;
 *     &lt;enumeration value="ttr_will_not_affect"/&gt;
 *     &lt;enumeration value="ttr_may_affect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtTtrStatus")
@XmlEnum
public enum TypeCtTtrStatus {

    @XmlEnumValue("ttr_cannot_affect")
    TTR_CANNOT_AFFECT("ttr_cannot_affect"),
    @XmlEnumValue("ttr_will_not_affect")
    TTR_WILL_NOT_AFFECT("ttr_will_not_affect"),
    @XmlEnumValue("ttr_may_affect")
    TTR_MAY_AFFECT("ttr_may_affect");
    private final String value;

    TypeCtTtrStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtTtrStatus fromValue(String v) {
        for (TypeCtTtrStatus c: TypeCtTtrStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}