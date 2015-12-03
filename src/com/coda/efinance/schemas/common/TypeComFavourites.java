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
 * <p>Java class for typeComFavourites.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeComFavourites"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="com_favourites_type_static"/&gt;
 *     &lt;enumeration value="com_favourites_type_dynamic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeComFavourites")
@XmlEnum
public enum TypeComFavourites {

    @XmlEnumValue("com_favourites_type_static")
    COM_FAVOURITES_TYPE_STATIC("com_favourites_type_static"),
    @XmlEnumValue("com_favourites_type_dynamic")
    COM_FAVOURITES_TYPE_DYNAMIC("com_favourites_type_dynamic");
    private final String value;

    TypeComFavourites(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeComFavourites fromValue(String v) {
        for (TypeComFavourites c: TypeComFavourites.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
