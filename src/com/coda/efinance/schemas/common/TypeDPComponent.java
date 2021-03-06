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
 * <p>Java class for typeDPComponent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDPComponent"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_dp_comp_common"/&gt;
 *     &lt;enumeration value="com_dp_comp_bar"/&gt;
 *     &lt;enumeration value="com_dp_comp_dial"/&gt;
 *     &lt;enumeration value="com_dp_comp_graded_bar"/&gt;
 *     &lt;enumeration value="com_dp_comp_line"/&gt;
 *     &lt;enumeration value="com_dp_comp_pie"/&gt;
 *     &lt;enumeration value="com_dp_comp_traffic_light"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDPComponent")
@XmlEnum
public enum TypeDPComponent {


    /**
     * Common properties component for Intelligence charts.
     * 
     */
    @XmlEnumValue("com_dp_comp_common")
    COM_DP_COMP_COMMON("com_dp_comp_common"),

    /**
     * Intelligence bar chart component properties.
     * 
     */
    @XmlEnumValue("com_dp_comp_bar")
    COM_DP_COMP_BAR("com_dp_comp_bar"),

    /**
     * Intelligence dial chart component properties.
     * 
     */
    @XmlEnumValue("com_dp_comp_dial")
    COM_DP_COMP_DIAL("com_dp_comp_dial"),

    /**
     * Intelligence graded bar component properties.
     * 
     */
    @XmlEnumValue("com_dp_comp_graded_bar")
    COM_DP_COMP_GRADED_BAR("com_dp_comp_graded_bar"),

    /**
     * Intelligence line graph component properties.
     * 
     */
    @XmlEnumValue("com_dp_comp_line")
    COM_DP_COMP_LINE("com_dp_comp_line"),

    /**
     * Intelligence pie chart component properties.
     * 
     */
    @XmlEnumValue("com_dp_comp_pie")
    COM_DP_COMP_PIE("com_dp_comp_pie"),

    /**
     * Intelligence traffic light component properties.
     * 
     */
    @XmlEnumValue("com_dp_comp_traffic_light")
    COM_DP_COMP_TRAFFIC_LIGHT("com_dp_comp_traffic_light");
    private final String value;

    TypeDPComponent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDPComponent fromValue(String v) {
        for (TypeDPComponent c: TypeDPComponent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
