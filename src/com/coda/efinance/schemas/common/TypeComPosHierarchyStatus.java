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
 * <p>Java class for typeComPosHierarchyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComPosHierarchyStatus"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_pos_hierarchy_status_unused"/&gt;
 *     &lt;enumeration value="com_pos_hierarchy_status_current"/&gt;
 *     &lt;enumeration value="com_pos_hierarchy_status_obsolete"/&gt;
 *     &lt;enumeration value="com_pos_hierarchy_status_deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComPosHierarchyStatus")
@XmlEnum
public enum TypeComPosHierarchyStatus {


    /**
     * Not used
     * 
     */
    @XmlEnumValue("com_pos_hierarchy_status_unused")
    COM_POS_HIERARCHY_STATUS_UNUSED("com_pos_hierarchy_status_unused"),

    /**
     * Current
     * 
     */
    @XmlEnumValue("com_pos_hierarchy_status_current")
    COM_POS_HIERARCHY_STATUS_CURRENT("com_pos_hierarchy_status_current"),

    /**
     * Obsolete
     * 
     */
    @XmlEnumValue("com_pos_hierarchy_status_obsolete")
    COM_POS_HIERARCHY_STATUS_OBSOLETE("com_pos_hierarchy_status_obsolete"),

    /**
     * Deleted
     * 
     */
    @XmlEnumValue("com_pos_hierarchy_status_deleted")
    COM_POS_HIERARCHY_STATUS_DELETED("com_pos_hierarchy_status_deleted");
    private final String value;

    TypeComPosHierarchyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComPosHierarchyStatus fromValue(String v) {
        for (TypeComPosHierarchyStatus c: TypeComPosHierarchyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
