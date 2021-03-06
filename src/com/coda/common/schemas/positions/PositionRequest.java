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
import com.coda.efinance.schemas.common.ServiceRequest;


/**
 * This service allows you to maintain position masters.
 * 
 * <p>Java class for PositionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ServiceRequest"&gt;
 *       &lt;all&gt;
 *         &lt;element name="GetPosition" type="{http://www.coda.com/common/schemas/positions}GetPositionRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="AddPosition" type="{http://www.coda.com/common/schemas/positions}AddPositionRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="UpdatePosition" type="{http://www.coda.com/common/schemas/positions}UpdatePositionRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="DeletePosition" type="{http://www.coda.com/common/schemas/positions}DeletePositionRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="ListPositions" type="{http://www.coda.com/common/schemas/positions}ListPositionsRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetPositionAttributeDefinitions" type="{http://www.coda.com/common/schemas/positions}GetPositionAttributeDefinitionsRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="UpdatePositionAttributeDefinitions" type="{http://www.coda.com/common/schemas/positions}UpdatePositionAttributeDefinitionsRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="FindPosition" type="{http://www.coda.com/common/schemas/positions}FindPositionRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="IsWithinLimits" type="{http://www.coda.com/common/schemas/positions}IsWithinLimitsRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="CheckMultipleAccountsAgainstLimits" type="{http://www.coda.com/common/schemas/positions}CheckMultipleAccountsAgainstLimitsRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="LightweightListPositions" type="{http://www.coda.com/common/schemas/positions}LightweightListPositionsRequestVerb" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionRequest", propOrder = {
    "getPosition",
    "addPosition",
    "updatePosition",
    "deletePosition",
    "listPositions",
    "getPositionAttributeDefinitions",
    "updatePositionAttributeDefinitions",
    "findPosition",
    "isWithinLimits",
    "checkMultipleAccountsAgainstLimits",
    "lightweightListPositions"
})
public class PositionRequest
    extends ServiceRequest
    implements Serializable
{

    @XmlElement(name = "GetPosition")
    protected GetPositionRequestVerb getPosition;
    @XmlElement(name = "AddPosition")
    protected AddPositionRequestVerb addPosition;
    @XmlElement(name = "UpdatePosition")
    protected UpdatePositionRequestVerb updatePosition;
    @XmlElement(name = "DeletePosition")
    protected DeletePositionRequestVerb deletePosition;
    @XmlElement(name = "ListPositions")
    protected ListPositionsRequestVerb listPositions;
    @XmlElement(name = "GetPositionAttributeDefinitions")
    protected GetPositionAttributeDefinitionsRequestVerb getPositionAttributeDefinitions;
    @XmlElement(name = "UpdatePositionAttributeDefinitions")
    protected UpdatePositionAttributeDefinitionsRequestVerb updatePositionAttributeDefinitions;
    @XmlElement(name = "FindPosition")
    protected FindPositionRequestVerb findPosition;
    @XmlElement(name = "IsWithinLimits")
    protected IsWithinLimitsRequestVerb isWithinLimits;
    @XmlElement(name = "CheckMultipleAccountsAgainstLimits")
    protected CheckMultipleAccountsAgainstLimitsRequestVerb checkMultipleAccountsAgainstLimits;
    @XmlElement(name = "LightweightListPositions")
    protected LightweightListPositionsRequestVerb lightweightListPositions;

    /**
     * Gets the value of the getPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GetPositionRequestVerb }
     *     
     */
    public GetPositionRequestVerb getGetPosition() {
        return getPosition;
    }

    /**
     * Sets the value of the getPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPositionRequestVerb }
     *     
     */
    public void setGetPosition(GetPositionRequestVerb value) {
        this.getPosition = value;
    }

    /**
     * Gets the value of the addPosition property.
     * 
     * @return
     *     possible object is
     *     {@link AddPositionRequestVerb }
     *     
     */
    public AddPositionRequestVerb getAddPosition() {
        return addPosition;
    }

    /**
     * Sets the value of the addPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddPositionRequestVerb }
     *     
     */
    public void setAddPosition(AddPositionRequestVerb value) {
        this.addPosition = value;
    }

    /**
     * Gets the value of the updatePosition property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePositionRequestVerb }
     *     
     */
    public UpdatePositionRequestVerb getUpdatePosition() {
        return updatePosition;
    }

    /**
     * Sets the value of the updatePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePositionRequestVerb }
     *     
     */
    public void setUpdatePosition(UpdatePositionRequestVerb value) {
        this.updatePosition = value;
    }

    /**
     * Gets the value of the deletePosition property.
     * 
     * @return
     *     possible object is
     *     {@link DeletePositionRequestVerb }
     *     
     */
    public DeletePositionRequestVerb getDeletePosition() {
        return deletePosition;
    }

    /**
     * Sets the value of the deletePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePositionRequestVerb }
     *     
     */
    public void setDeletePosition(DeletePositionRequestVerb value) {
        this.deletePosition = value;
    }

    /**
     * Gets the value of the listPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ListPositionsRequestVerb }
     *     
     */
    public ListPositionsRequestVerb getListPositions() {
        return listPositions;
    }

    /**
     * Sets the value of the listPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPositionsRequestVerb }
     *     
     */
    public void setListPositions(ListPositionsRequestVerb value) {
        this.listPositions = value;
    }

    /**
     * Gets the value of the getPositionAttributeDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link GetPositionAttributeDefinitionsRequestVerb }
     *     
     */
    public GetPositionAttributeDefinitionsRequestVerb getGetPositionAttributeDefinitions() {
        return getPositionAttributeDefinitions;
    }

    /**
     * Sets the value of the getPositionAttributeDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPositionAttributeDefinitionsRequestVerb }
     *     
     */
    public void setGetPositionAttributeDefinitions(GetPositionAttributeDefinitionsRequestVerb value) {
        this.getPositionAttributeDefinitions = value;
    }

    /**
     * Gets the value of the updatePositionAttributeDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePositionAttributeDefinitionsRequestVerb }
     *     
     */
    public UpdatePositionAttributeDefinitionsRequestVerb getUpdatePositionAttributeDefinitions() {
        return updatePositionAttributeDefinitions;
    }

    /**
     * Sets the value of the updatePositionAttributeDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePositionAttributeDefinitionsRequestVerb }
     *     
     */
    public void setUpdatePositionAttributeDefinitions(UpdatePositionAttributeDefinitionsRequestVerb value) {
        this.updatePositionAttributeDefinitions = value;
    }

    /**
     * Gets the value of the findPosition property.
     * 
     * @return
     *     possible object is
     *     {@link FindPositionRequestVerb }
     *     
     */
    public FindPositionRequestVerb getFindPosition() {
        return findPosition;
    }

    /**
     * Sets the value of the findPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindPositionRequestVerb }
     *     
     */
    public void setFindPosition(FindPositionRequestVerb value) {
        this.findPosition = value;
    }

    /**
     * Gets the value of the isWithinLimits property.
     * 
     * @return
     *     possible object is
     *     {@link IsWithinLimitsRequestVerb }
     *     
     */
    public IsWithinLimitsRequestVerb getIsWithinLimits() {
        return isWithinLimits;
    }

    /**
     * Sets the value of the isWithinLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsWithinLimitsRequestVerb }
     *     
     */
    public void setIsWithinLimits(IsWithinLimitsRequestVerb value) {
        this.isWithinLimits = value;
    }

    /**
     * Gets the value of the checkMultipleAccountsAgainstLimits property.
     * 
     * @return
     *     possible object is
     *     {@link CheckMultipleAccountsAgainstLimitsRequestVerb }
     *     
     */
    public CheckMultipleAccountsAgainstLimitsRequestVerb getCheckMultipleAccountsAgainstLimits() {
        return checkMultipleAccountsAgainstLimits;
    }

    /**
     * Sets the value of the checkMultipleAccountsAgainstLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckMultipleAccountsAgainstLimitsRequestVerb }
     *     
     */
    public void setCheckMultipleAccountsAgainstLimits(CheckMultipleAccountsAgainstLimitsRequestVerb value) {
        this.checkMultipleAccountsAgainstLimits = value;
    }

    /**
     * Gets the value of the lightweightListPositions property.
     * 
     * @return
     *     possible object is
     *     {@link LightweightListPositionsRequestVerb }
     *     
     */
    public LightweightListPositionsRequestVerb getLightweightListPositions() {
        return lightweightListPositions;
    }

    /**
     * Sets the value of the lightweightListPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightweightListPositionsRequestVerb }
     *     
     */
    public void setLightweightListPositions(LightweightListPositionsRequestVerb value) {
        this.lightweightListPositions = value;
    }

}
