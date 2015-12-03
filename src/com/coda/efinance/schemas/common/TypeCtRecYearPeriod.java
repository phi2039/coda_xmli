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
 * <p>Java class for typeCtRecYearPeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtRecYearPeriod"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="dochead_same_as_sending"/&gt;
 *     &lt;enumeration value="dochead_cur_per"/&gt;
 *     &lt;enumeration value="dochead_per_doc_date"/&gt;
 *     &lt;enumeration value="dochead_per_send_per_date"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtRecYearPeriod")
@XmlEnum
public enum TypeCtRecYearPeriod {

    @XmlEnumValue("dochead_same_as_sending")
    DOCHEAD_SAME_AS_SENDING("dochead_same_as_sending"),
    @XmlEnumValue("dochead_cur_per")
    DOCHEAD_CUR_PER("dochead_cur_per"),
    @XmlEnumValue("dochead_per_doc_date")
    DOCHEAD_PER_DOC_DATE("dochead_per_doc_date"),
    @XmlEnumValue("dochead_per_send_per_date")
    DOCHEAD_PER_SEND_PER_DATE("dochead_per_send_per_date");
    private final String value;

    TypeCtRecYearPeriod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtRecYearPeriod fromValue(String v) {
        for (TypeCtRecYearPeriod c: TypeCtRecYearPeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
