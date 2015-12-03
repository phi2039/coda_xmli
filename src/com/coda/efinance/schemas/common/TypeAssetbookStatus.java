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
 * <p>Java class for typeAssetbookStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAssetbookStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="asset_status_sold"/&gt;
 *     &lt;enumeration value="asset_bookstatus_notdepn"/&gt;
 *     &lt;enumeration value="asset_bookstatus_partdepn"/&gt;
 *     &lt;enumeration value="asset_bookstatus_fullydepn"/&gt;
 *     &lt;enumeration value="asset_bookstatus_wip_capital"/&gt;
 *     &lt;enumeration value="asset_bookstatus_wip_trans"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeAssetbookStatus")
@XmlEnum
public enum TypeAssetbookStatus {


    /**
     * The asset is sold.
     * 
     */
    @XmlEnumValue("asset_status_sold")
    ASSET_STATUS_SOLD("asset_status_sold"),

    /**
     * The asset is not depreciated.
     * 
     */
    @XmlEnumValue("asset_bookstatus_notdepn")
    ASSET_BOOKSTATUS_NOTDEPN("asset_bookstatus_notdepn"),

    /**
     * The asset is part depreciated.
     * 
     */
    @XmlEnumValue("asset_bookstatus_partdepn")
    ASSET_BOOKSTATUS_PARTDEPN("asset_bookstatus_partdepn"),

    /**
     * The asset is fully depreciated.
     * 
     */
    @XmlEnumValue("asset_bookstatus_fullydepn")
    ASSET_BOOKSTATUS_FULLYDEPN("asset_bookstatus_fullydepn"),
    @XmlEnumValue("asset_bookstatus_wip_capital")
    ASSET_BOOKSTATUS_WIP_CAPITAL("asset_bookstatus_wip_capital"),
    @XmlEnumValue("asset_bookstatus_wip_trans")
    ASSET_BOOKSTATUS_WIP_TRANS("asset_bookstatus_wip_trans");
    private final String value;

    TypeAssetbookStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAssetbookStatus fromValue(String v) {
        for (TypeAssetbookStatus c: TypeAssetbookStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
