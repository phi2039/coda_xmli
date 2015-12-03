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
 * <p>Java class for typeAssetStatusExt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAssetStatusExt"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="asset_status_intray"/&gt;
 *     &lt;enumeration value="asset_status_capital"/&gt;
 *     &lt;enumeration value="asset_status_sold"/&gt;
 *     &lt;enumeration value="asset_status_wip_capital"/&gt;
 *     &lt;enumeration value="asset_status_wip_trans"/&gt;
 *     &lt;enumeration value="docstat_active"/&gt;
 *     &lt;enumeration value="docstat_posted"/&gt;
 *     &lt;enumeration value="docstat_cancel"/&gt;
 *     &lt;enumeration value="docstat_intray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeAssetStatusExt")
@XmlEnum
public enum TypeAssetStatusExt {


    /**
     * The asset is on the Intray.
     * 
     */
    @XmlEnumValue("asset_status_intray")
    ASSET_STATUS_INTRAY("asset_status_intray"),

    /**
     * The asset is capitalised.
     * 
     */
    @XmlEnumValue("asset_status_capital")
    ASSET_STATUS_CAPITAL("asset_status_capital"),

    /**
     * The asset is sold.
     * 
     */
    @XmlEnumValue("asset_status_sold")
    ASSET_STATUS_SOLD("asset_status_sold"),
    @XmlEnumValue("asset_status_wip_capital")
    ASSET_STATUS_WIP_CAPITAL("asset_status_wip_capital"),
    @XmlEnumValue("asset_status_wip_trans")
    ASSET_STATUS_WIP_TRANS("asset_status_wip_trans"),
    @XmlEnumValue("docstat_active")
    DOCSTAT_ACTIVE("docstat_active"),
    @XmlEnumValue("docstat_posted")
    DOCSTAT_POSTED("docstat_posted"),
    @XmlEnumValue("docstat_cancel")
    DOCSTAT_CANCEL("docstat_cancel"),
    @XmlEnumValue("docstat_intray")
    DOCSTAT_INTRAY("docstat_intray");
    private final String value;

    TypeAssetStatusExt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAssetStatusExt fromValue(String v) {
        for (TypeAssetStatusExt c: TypeAssetStatusExt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}