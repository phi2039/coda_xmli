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
 * <p>Java class for typeCtDocDestCtrl.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtDocDestCtrl"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="doc_dest_disallow"/&gt;
 *     &lt;enumeration value="doc_dest_force"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtDocDestCtrl")
@XmlEnum
public enum TypeCtDocDestCtrl {

    @XmlEnumValue("doc_dest_disallow")
    DOC_DEST_DISALLOW("doc_dest_disallow"),
    @XmlEnumValue("doc_dest_force")
    DOC_DEST_FORCE("doc_dest_force");
    private final String value;

    TypeCtDocDestCtrl(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtDocDestCtrl fromValue(String v) {
        for (TypeCtDocDestCtrl c: TypeCtDocDestCtrl.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}