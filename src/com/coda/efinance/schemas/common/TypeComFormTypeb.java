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
 * <p>Java class for typeComFormTypeb.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComFormTypeb"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="null"/&gt;
 *     &lt;enumeration value="com_form_type_cheque"/&gt;
 *     &lt;enumeration value="com_form_type_cheque_and_remittance"/&gt;
 *     &lt;enumeration value="com_form_type_credit_note"/&gt;
 *     &lt;enumeration value="com_form_type_debit_note"/&gt;
 *     &lt;enumeration value="com_form_type_goods_received_note"/&gt;
 *     &lt;enumeration value="com_form_type_purchase_invoice"/&gt;
 *     &lt;enumeration value="com_form_type_purchase_order"/&gt;
 *     &lt;enumeration value="com_form_type_remittance"/&gt;
 *     &lt;enumeration value="com_form_type_request_credit"/&gt;
 *     &lt;enumeration value="com_form_type_request_quotation"/&gt;
 *     &lt;enumeration value="com_form_type_requisition"/&gt;
 *     &lt;enumeration value="com_form_type_returns_note"/&gt;
 *     &lt;enumeration value="com_form_type_sales_invoice"/&gt;
 *     &lt;enumeration value="com_form_type_user_defined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComFormTypeb")
@XmlEnum
public enum TypeComFormTypeb {

    @XmlEnumValue("null")
    NULL("null"),
    @XmlEnumValue("com_form_type_cheque")
    COM_FORM_TYPE_CHEQUE("com_form_type_cheque"),
    @XmlEnumValue("com_form_type_cheque_and_remittance")
    COM_FORM_TYPE_CHEQUE_AND_REMITTANCE("com_form_type_cheque_and_remittance"),
    @XmlEnumValue("com_form_type_credit_note")
    COM_FORM_TYPE_CREDIT_NOTE("com_form_type_credit_note"),
    @XmlEnumValue("com_form_type_debit_note")
    COM_FORM_TYPE_DEBIT_NOTE("com_form_type_debit_note"),
    @XmlEnumValue("com_form_type_goods_received_note")
    COM_FORM_TYPE_GOODS_RECEIVED_NOTE("com_form_type_goods_received_note"),
    @XmlEnumValue("com_form_type_purchase_invoice")
    COM_FORM_TYPE_PURCHASE_INVOICE("com_form_type_purchase_invoice"),
    @XmlEnumValue("com_form_type_purchase_order")
    COM_FORM_TYPE_PURCHASE_ORDER("com_form_type_purchase_order"),
    @XmlEnumValue("com_form_type_remittance")
    COM_FORM_TYPE_REMITTANCE("com_form_type_remittance"),
    @XmlEnumValue("com_form_type_request_credit")
    COM_FORM_TYPE_REQUEST_CREDIT("com_form_type_request_credit"),
    @XmlEnumValue("com_form_type_request_quotation")
    COM_FORM_TYPE_REQUEST_QUOTATION("com_form_type_request_quotation"),
    @XmlEnumValue("com_form_type_requisition")
    COM_FORM_TYPE_REQUISITION("com_form_type_requisition"),
    @XmlEnumValue("com_form_type_returns_note")
    COM_FORM_TYPE_RETURNS_NOTE("com_form_type_returns_note"),
    @XmlEnumValue("com_form_type_sales_invoice")
    COM_FORM_TYPE_SALES_INVOICE("com_form_type_sales_invoice"),
    @XmlEnumValue("com_form_type_user_defined")
    COM_FORM_TYPE_USER_DEFINED("com_form_type_user_defined");
    private final String value;

    TypeComFormTypeb(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComFormTypeb fromValue(String v) {
        for (TypeComFormTypeb c: TypeComFormTypeb.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}