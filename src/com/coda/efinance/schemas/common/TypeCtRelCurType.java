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
 * <p>Java class for typeCtRelCurType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtRelCurType"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="relcur_none"/&gt;
 *     &lt;enumeration value="relcur_home"/&gt;
 *     &lt;enumeration value="relcur_dual"/&gt;
 *     &lt;enumeration value="relcur_blank"/&gt;
 *     &lt;enumeration value="relcur_quantity"/&gt;
 *     &lt;enumeration value="relcur_account"/&gt;
 *     &lt;enumeration value="relcur_el1"/&gt;
 *     &lt;enumeration value="relcur_el2"/&gt;
 *     &lt;enumeration value="relcur_el3"/&gt;
 *     &lt;enumeration value="relcur_el4"/&gt;
 *     &lt;enumeration value="relcur_el5"/&gt;
 *     &lt;enumeration value="relcur_el6"/&gt;
 *     &lt;enumeration value="relcur_el7"/&gt;
 *     &lt;enumeration value="relcur_el8"/&gt;
 *     &lt;enumeration value="relcur_ruling"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtRelCurType")
@XmlEnum
public enum TypeCtRelCurType {

    @XmlEnumValue("relcur_none")
    RELCUR_NONE("relcur_none"),
    @XmlEnumValue("relcur_home")
    RELCUR_HOME("relcur_home"),
    @XmlEnumValue("relcur_dual")
    RELCUR_DUAL("relcur_dual"),
    @XmlEnumValue("relcur_blank")
    RELCUR_BLANK("relcur_blank"),
    @XmlEnumValue("relcur_quantity")
    RELCUR_QUANTITY("relcur_quantity"),
    @XmlEnumValue("relcur_account")
    RELCUR_ACCOUNT("relcur_account"),
    @XmlEnumValue("relcur_el1")
    RELCUR_EL_1("relcur_el1"),
    @XmlEnumValue("relcur_el2")
    RELCUR_EL_2("relcur_el2"),
    @XmlEnumValue("relcur_el3")
    RELCUR_EL_3("relcur_el3"),
    @XmlEnumValue("relcur_el4")
    RELCUR_EL_4("relcur_el4"),
    @XmlEnumValue("relcur_el5")
    RELCUR_EL_5("relcur_el5"),
    @XmlEnumValue("relcur_el6")
    RELCUR_EL_6("relcur_el6"),
    @XmlEnumValue("relcur_el7")
    RELCUR_EL_7("relcur_el7"),
    @XmlEnumValue("relcur_el8")
    RELCUR_EL_8("relcur_el8"),
    @XmlEnumValue("relcur_ruling")
    RELCUR_RULING("relcur_ruling");
    private final String value;

    TypeCtRelCurType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtRelCurType fromValue(String v) {
        for (TypeCtRelCurType c: TypeCtRelCurType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
