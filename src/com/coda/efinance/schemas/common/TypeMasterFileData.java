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
 * <p>Java class for typeMasterFileData.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMasterFileData"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="master_code"/&gt;
 *     &lt;enumeration value="master_name"/&gt;
 *     &lt;enumeration value="master_sname"/&gt;
 *     &lt;enumeration value="master_elmcur"/&gt;
 *     &lt;enumeration value="master_credlim"/&gt;
 *     &lt;enumeration value="master_normterms"/&gt;
 *     &lt;enumeration value="master_account"/&gt;
 *     &lt;enumeration value="master_company"/&gt;
 *     &lt;enumeration value="master_cr_manager"/&gt;
 *     &lt;enumeration value="master_cr_rating"/&gt;
 *     &lt;enumeration value="master_elmstat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeMasterFileData")
@XmlEnum
public enum TypeMasterFileData {

    @XmlEnumValue("master_code")
    MASTER_CODE("master_code"),
    @XmlEnumValue("master_name")
    MASTER_NAME("master_name"),
    @XmlEnumValue("master_sname")
    MASTER_SNAME("master_sname"),
    @XmlEnumValue("master_elmcur")
    MASTER_ELMCUR("master_elmcur"),
    @XmlEnumValue("master_credlim")
    MASTER_CREDLIM("master_credlim"),
    @XmlEnumValue("master_normterms")
    MASTER_NORMTERMS("master_normterms"),
    @XmlEnumValue("master_account")
    MASTER_ACCOUNT("master_account"),
    @XmlEnumValue("master_company")
    MASTER_COMPANY("master_company"),
    @XmlEnumValue("master_cr_manager")
    MASTER_CR_MANAGER("master_cr_manager"),
    @XmlEnumValue("master_cr_rating")
    MASTER_CR_RATING("master_cr_rating"),
    @XmlEnumValue("master_elmstat")
    MASTER_ELMSTAT("master_elmstat");
    private final String value;

    TypeMasterFileData(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMasterFileData fromValue(String v) {
        for (TypeMasterFileData c: TypeMasterFileData.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
