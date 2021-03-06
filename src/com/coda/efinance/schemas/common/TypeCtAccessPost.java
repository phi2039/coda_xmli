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
 * <p>Java class for typeCtAccessPost.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtAccessPost"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="post_elm1"/&gt;
 *     &lt;enumeration value="post_elm2"/&gt;
 *     &lt;enumeration value="post_elm3"/&gt;
 *     &lt;enumeration value="post_elm4"/&gt;
 *     &lt;enumeration value="post_elm5"/&gt;
 *     &lt;enumeration value="post_elm6"/&gt;
 *     &lt;enumeration value="post_elm7"/&gt;
 *     &lt;enumeration value="post_elm8"/&gt;
 *     &lt;enumeration value="post_grp1"/&gt;
 *     &lt;enumeration value="post_grp2"/&gt;
 *     &lt;enumeration value="post_grp3"/&gt;
 *     &lt;enumeration value="post_grp4"/&gt;
 *     &lt;enumeration value="post_grp5"/&gt;
 *     &lt;enumeration value="post_grp6"/&gt;
 *     &lt;enumeration value="post_grp7"/&gt;
 *     &lt;enumeration value="post_grp8"/&gt;
 *     &lt;enumeration value="post_doc"/&gt;
 *     &lt;enumeration value="post_bal"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtAccessPost")
@XmlEnum
public enum TypeCtAccessPost {

    @XmlEnumValue("post_elm1")
    POST_ELM_1("post_elm1"),
    @XmlEnumValue("post_elm2")
    POST_ELM_2("post_elm2"),
    @XmlEnumValue("post_elm3")
    POST_ELM_3("post_elm3"),
    @XmlEnumValue("post_elm4")
    POST_ELM_4("post_elm4"),
    @XmlEnumValue("post_elm5")
    POST_ELM_5("post_elm5"),
    @XmlEnumValue("post_elm6")
    POST_ELM_6("post_elm6"),
    @XmlEnumValue("post_elm7")
    POST_ELM_7("post_elm7"),
    @XmlEnumValue("post_elm8")
    POST_ELM_8("post_elm8"),
    @XmlEnumValue("post_grp1")
    POST_GRP_1("post_grp1"),
    @XmlEnumValue("post_grp2")
    POST_GRP_2("post_grp2"),
    @XmlEnumValue("post_grp3")
    POST_GRP_3("post_grp3"),
    @XmlEnumValue("post_grp4")
    POST_GRP_4("post_grp4"),
    @XmlEnumValue("post_grp5")
    POST_GRP_5("post_grp5"),
    @XmlEnumValue("post_grp6")
    POST_GRP_6("post_grp6"),
    @XmlEnumValue("post_grp7")
    POST_GRP_7("post_grp7"),
    @XmlEnumValue("post_grp8")
    POST_GRP_8("post_grp8"),
    @XmlEnumValue("post_doc")
    POST_DOC("post_doc"),
    @XmlEnumValue("post_bal")
    POST_BAL("post_bal"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    TypeCtAccessPost(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtAccessPost fromValue(String v) {
        for (TypeCtAccessPost c: TypeCtAccessPost.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
