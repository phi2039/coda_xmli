//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:31 AM EST 
//


package com.coda.common.schemas.positions;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.Response;


/**
 * <p>Java class for GetPositionAttributeDefinitionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPositionAttributeDefinitionsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetPositionAttributeDefinitions" type="{http://www.coda.com/common/schemas/positions}PositionAttributeDefinitions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPositionAttributeDefinitionsResponse", propOrder = {
    "getPositionAttributeDefinitions"
})
public class GetPositionAttributeDefinitionsResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "GetPositionAttributeDefinitions", required = true)
    protected PositionAttributeDefinitions getPositionAttributeDefinitions;

    /**
     * Gets the value of the getPositionAttributeDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link PositionAttributeDefinitions }
     *     
     */
    public PositionAttributeDefinitions getGetPositionAttributeDefinitions() {
        return getPositionAttributeDefinitions;
    }

    /**
     * Sets the value of the getPositionAttributeDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionAttributeDefinitions }
     *     
     */
    public void setGetPositionAttributeDefinitions(PositionAttributeDefinitions value) {
        this.getPositionAttributeDefinitions = value;
    }

}
