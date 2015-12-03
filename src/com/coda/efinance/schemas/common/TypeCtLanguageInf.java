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
 * <p>Java class for typeCtLanguageInf.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtLanguageInf"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="lang_czech"/&gt;
 *     &lt;enumeration value="lang_danish"/&gt;
 *     &lt;enumeration value="lang_german"/&gt;
 *     &lt;enumeration value="lang_greek"/&gt;
 *     &lt;enumeration value="lang_english"/&gt;
 *     &lt;enumeration value="lang_american_english"/&gt;
 *     &lt;enumeration value="lang_spanish"/&gt;
 *     &lt;enumeration value="lang_american_spanish"/&gt;
 *     &lt;enumeration value="lang_french"/&gt;
 *     &lt;enumeration value="lang_swiss_french"/&gt;
 *     &lt;enumeration value="lang_hungarian"/&gt;
 *     &lt;enumeration value="lang_italian"/&gt;
 *     &lt;enumeration value="lang_dutch"/&gt;
 *     &lt;enumeration value="lang_norwegian"/&gt;
 *     &lt;enumeration value="lang_portugese"/&gt;
 *     &lt;enumeration value="lang_swedish"/&gt;
 *     &lt;enumeration value="lang_turkish"/&gt;
 *     &lt;enumeration value="lang_brazilian"/&gt;
 *     &lt;enumeration value="lang_simchi"/&gt;
 *     &lt;enumeration value="lang_romanian"/&gt;
 *     &lt;enumeration value="lang_polish"/&gt;
 *     &lt;enumeration value="lang_qalang"/&gt;
 *     &lt;enumeration value="lang_wildcard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtLanguageInf")
@XmlEnum
public enum TypeCtLanguageInf {


    /**
     * Czech
     * 
     */
    @XmlEnumValue("lang_czech")
    LANG_CZECH("lang_czech"),

    /**
     * Danish
     * 
     */
    @XmlEnumValue("lang_danish")
    LANG_DANISH("lang_danish"),

    /**
     * German
     * 
     */
    @XmlEnumValue("lang_german")
    LANG_GERMAN("lang_german"),

    /**
     * Greek
     * 
     */
    @XmlEnumValue("lang_greek")
    LANG_GREEK("lang_greek"),

    /**
     * UK English
     * 
     */
    @XmlEnumValue("lang_english")
    LANG_ENGLISH("lang_english"),

    /**
     * US English
     * 
     */
    @XmlEnumValue("lang_american_english")
    LANG_AMERICAN_ENGLISH("lang_american_english"),

    /**
     * Spanish
     * 
     */
    @XmlEnumValue("lang_spanish")
    LANG_SPANISH("lang_spanish"),

    /**
     * Latin American Spanish
     * 
     */
    @XmlEnumValue("lang_american_spanish")
    LANG_AMERICAN_SPANISH("lang_american_spanish"),

    /**
     * French
     * 
     */
    @XmlEnumValue("lang_french")
    LANG_FRENCH("lang_french"),

    /**
     * Swiss French
     * 
     */
    @XmlEnumValue("lang_swiss_french")
    LANG_SWISS_FRENCH("lang_swiss_french"),

    /**
     * Hungarian
     * 
     */
    @XmlEnumValue("lang_hungarian")
    LANG_HUNGARIAN("lang_hungarian"),

    /**
     * Italian
     * 
     */
    @XmlEnumValue("lang_italian")
    LANG_ITALIAN("lang_italian"),

    /**
     * Dutch
     * 
     */
    @XmlEnumValue("lang_dutch")
    LANG_DUTCH("lang_dutch"),

    /**
     * Norwegian
     * 
     */
    @XmlEnumValue("lang_norwegian")
    LANG_NORWEGIAN("lang_norwegian"),

    /**
     * Iberian Portuguese
     * 
     */
    @XmlEnumValue("lang_portugese")
    LANG_PORTUGESE("lang_portugese"),

    /**
     * Swedish
     * 
     */
    @XmlEnumValue("lang_swedish")
    LANG_SWEDISH("lang_swedish"),

    /**
     * Turkish
     * 
     */
    @XmlEnumValue("lang_turkish")
    LANG_TURKISH("lang_turkish"),

    /**
     * Brazilian Portuguese
     * 
     */
    @XmlEnumValue("lang_brazilian")
    LANG_BRAZILIAN("lang_brazilian"),

    /**
     * Simplified Chinese
     * 
     */
    @XmlEnumValue("lang_simchi")
    LANG_SIMCHI("lang_simchi"),

    /**
     * Romanian
     * 
     */
    @XmlEnumValue("lang_romanian")
    LANG_ROMANIAN("lang_romanian"),

    /**
     * Polish
     * 
     */
    @XmlEnumValue("lang_polish")
    LANG_POLISH("lang_polish"),

    /**
     * For CODA use only
     * 
     */
    @XmlEnumValue("lang_qalang")
    LANG_QALANG("lang_qalang"),

    /**
     * Wildcard language
     * 
     */
    @XmlEnumValue("lang_wildcard")
    LANG_WILDCARD("lang_wildcard");
    private final String value;

    TypeCtLanguageInf(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtLanguageInf fromValue(String v) {
        for (TypeCtLanguageInf c: TypeCtLanguageInf.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
