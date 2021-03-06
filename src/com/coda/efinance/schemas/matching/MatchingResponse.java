//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.matching;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.ServiceResponse;
import com.coda.efinance.schemas.progress.ProgressAbortResponseVerb;


/**
 * This is the response that is returned when you match debit and credit entries.
 * 
 * <p>Java class for MatchingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ServiceResponse"&gt;
 *       &lt;all&gt;
 *         &lt;element name="SelectMaster" type="{http://www.coda.com/efinance/schemas/matching}SelectMasterResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="ValidateParams" type="{http://www.coda.com/efinance/schemas/matching}ValidateParamsResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="SelectLines" type="{http://www.coda.com/efinance/schemas/matching}SelectLinesResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetDiscounts" type="{http://www.coda.com/efinance/schemas/matching}GetDiscountResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.coda.com/efinance/schemas/matching}DiscountResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="PartMatch" type="{http://www.coda.com/efinance/schemas/matching}PartMatchResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="WriteOff" type="{http://www.coda.com/efinance/schemas/matching}WriteOffResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetLineValues" type="{http://www.coda.com/efinance/schemas/matching}GetLineValuesResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetTotals" type="{http://www.coda.com/efinance/schemas/matching}GetTotalsResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetPayDetailsSources" type="{http://www.coda.com/efinance/schemas/matching}GetPayDetailsSourcesResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetDrivingLineInfo" type="{http://www.coda.com/efinance/schemas/matching}GetDrivingLineInfoResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Commit" type="{http://www.coda.com/efinance/schemas/matching}CommitResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Disperse" type="{http://www.coda.com/efinance/schemas/matching}DisperseResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="StartBackground" type="{http://www.coda.com/efinance/schemas/matching}StartBackgroundResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="StartAssistant" type="{http://www.coda.com/efinance/schemas/matching}StartAssistantResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetGroupLines" type="{http://www.coda.com/efinance/schemas/matching}GetGroupLinesResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetProgress" type="{http://www.coda.com/efinance/schemas/matching}ProgressResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Abort" type="{http://www.coda.com/efinance/schemas/progress}progressAbortResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetDocumentChain" type="{http://www.coda.com/efinance/schemas/matching}GetDocumentChainResponseVerb" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingResponse", propOrder = {
    "selectMaster",
    "validateParams",
    "selectLines",
    "getDiscounts",
    "discount",
    "partMatch",
    "writeOff",
    "getLineValues",
    "getTotals",
    "getPayDetailsSources",
    "getDrivingLineInfo",
    "commit",
    "disperse",
    "startBackground",
    "startAssistant",
    "getGroupLines",
    "getProgress",
    "abort",
    "getDocumentChain"
})
public class MatchingResponse
    extends ServiceResponse
    implements Serializable
{

    @XmlElement(name = "SelectMaster")
    protected SelectMasterResponseVerb selectMaster;
    @XmlElement(name = "ValidateParams")
    protected ValidateParamsResponseVerb validateParams;
    @XmlElement(name = "SelectLines")
    protected SelectLinesResponseVerb selectLines;
    @XmlElement(name = "GetDiscounts")
    protected GetDiscountResponseVerb getDiscounts;
    @XmlElement(name = "Discount")
    protected DiscountResponseVerb discount;
    @XmlElement(name = "PartMatch")
    protected PartMatchResponseVerb partMatch;
    @XmlElement(name = "WriteOff")
    protected WriteOffResponseVerb writeOff;
    @XmlElement(name = "GetLineValues")
    protected GetLineValuesResponseVerb getLineValues;
    @XmlElement(name = "GetTotals")
    protected GetTotalsResponseVerb getTotals;
    @XmlElement(name = "GetPayDetailsSources")
    protected GetPayDetailsSourcesResponseVerb getPayDetailsSources;
    @XmlElement(name = "GetDrivingLineInfo")
    protected GetDrivingLineInfoResponseVerb getDrivingLineInfo;
    @XmlElement(name = "Commit")
    protected CommitResponseVerb commit;
    @XmlElement(name = "Disperse")
    protected DisperseResponseVerb disperse;
    @XmlElement(name = "StartBackground")
    protected StartBackgroundResponseVerb startBackground;
    @XmlElement(name = "StartAssistant")
    protected StartAssistantResponseVerb startAssistant;
    @XmlElement(name = "GetGroupLines")
    protected GetGroupLinesResponseVerb getGroupLines;
    @XmlElement(name = "GetProgress")
    protected ProgressResponseVerb getProgress;
    @XmlElement(name = "Abort")
    protected ProgressAbortResponseVerb abort;
    @XmlElement(name = "GetDocumentChain")
    protected GetDocumentChainResponseVerb getDocumentChain;

    /**
     * Gets the value of the selectMaster property.
     * 
     * @return
     *     possible object is
     *     {@link SelectMasterResponseVerb }
     *     
     */
    public SelectMasterResponseVerb getSelectMaster() {
        return selectMaster;
    }

    /**
     * Sets the value of the selectMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectMasterResponseVerb }
     *     
     */
    public void setSelectMaster(SelectMasterResponseVerb value) {
        this.selectMaster = value;
    }

    /**
     * Gets the value of the validateParams property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateParamsResponseVerb }
     *     
     */
    public ValidateParamsResponseVerb getValidateParams() {
        return validateParams;
    }

    /**
     * Sets the value of the validateParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateParamsResponseVerb }
     *     
     */
    public void setValidateParams(ValidateParamsResponseVerb value) {
        this.validateParams = value;
    }

    /**
     * Gets the value of the selectLines property.
     * 
     * @return
     *     possible object is
     *     {@link SelectLinesResponseVerb }
     *     
     */
    public SelectLinesResponseVerb getSelectLines() {
        return selectLines;
    }

    /**
     * Sets the value of the selectLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectLinesResponseVerb }
     *     
     */
    public void setSelectLines(SelectLinesResponseVerb value) {
        this.selectLines = value;
    }

    /**
     * Gets the value of the getDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link GetDiscountResponseVerb }
     *     
     */
    public GetDiscountResponseVerb getGetDiscounts() {
        return getDiscounts;
    }

    /**
     * Sets the value of the getDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDiscountResponseVerb }
     *     
     */
    public void setGetDiscounts(GetDiscountResponseVerb value) {
        this.getDiscounts = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountResponseVerb }
     *     
     */
    public DiscountResponseVerb getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountResponseVerb }
     *     
     */
    public void setDiscount(DiscountResponseVerb value) {
        this.discount = value;
    }

    /**
     * Gets the value of the partMatch property.
     * 
     * @return
     *     possible object is
     *     {@link PartMatchResponseVerb }
     *     
     */
    public PartMatchResponseVerb getPartMatch() {
        return partMatch;
    }

    /**
     * Sets the value of the partMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartMatchResponseVerb }
     *     
     */
    public void setPartMatch(PartMatchResponseVerb value) {
        this.partMatch = value;
    }

    /**
     * Gets the value of the writeOff property.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffResponseVerb }
     *     
     */
    public WriteOffResponseVerb getWriteOff() {
        return writeOff;
    }

    /**
     * Sets the value of the writeOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffResponseVerb }
     *     
     */
    public void setWriteOff(WriteOffResponseVerb value) {
        this.writeOff = value;
    }

    /**
     * Gets the value of the getLineValues property.
     * 
     * @return
     *     possible object is
     *     {@link GetLineValuesResponseVerb }
     *     
     */
    public GetLineValuesResponseVerb getGetLineValues() {
        return getLineValues;
    }

    /**
     * Sets the value of the getLineValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLineValuesResponseVerb }
     *     
     */
    public void setGetLineValues(GetLineValuesResponseVerb value) {
        this.getLineValues = value;
    }

    /**
     * Gets the value of the getTotals property.
     * 
     * @return
     *     possible object is
     *     {@link GetTotalsResponseVerb }
     *     
     */
    public GetTotalsResponseVerb getGetTotals() {
        return getTotals;
    }

    /**
     * Sets the value of the getTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTotalsResponseVerb }
     *     
     */
    public void setGetTotals(GetTotalsResponseVerb value) {
        this.getTotals = value;
    }

    /**
     * Gets the value of the getPayDetailsSources property.
     * 
     * @return
     *     possible object is
     *     {@link GetPayDetailsSourcesResponseVerb }
     *     
     */
    public GetPayDetailsSourcesResponseVerb getGetPayDetailsSources() {
        return getPayDetailsSources;
    }

    /**
     * Sets the value of the getPayDetailsSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPayDetailsSourcesResponseVerb }
     *     
     */
    public void setGetPayDetailsSources(GetPayDetailsSourcesResponseVerb value) {
        this.getPayDetailsSources = value;
    }

    /**
     * Gets the value of the getDrivingLineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetDrivingLineInfoResponseVerb }
     *     
     */
    public GetDrivingLineInfoResponseVerb getGetDrivingLineInfo() {
        return getDrivingLineInfo;
    }

    /**
     * Sets the value of the getDrivingLineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDrivingLineInfoResponseVerb }
     *     
     */
    public void setGetDrivingLineInfo(GetDrivingLineInfoResponseVerb value) {
        this.getDrivingLineInfo = value;
    }

    /**
     * Gets the value of the commit property.
     * 
     * @return
     *     possible object is
     *     {@link CommitResponseVerb }
     *     
     */
    public CommitResponseVerb getCommit() {
        return commit;
    }

    /**
     * Sets the value of the commit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitResponseVerb }
     *     
     */
    public void setCommit(CommitResponseVerb value) {
        this.commit = value;
    }

    /**
     * Gets the value of the disperse property.
     * 
     * @return
     *     possible object is
     *     {@link DisperseResponseVerb }
     *     
     */
    public DisperseResponseVerb getDisperse() {
        return disperse;
    }

    /**
     * Sets the value of the disperse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisperseResponseVerb }
     *     
     */
    public void setDisperse(DisperseResponseVerb value) {
        this.disperse = value;
    }

    /**
     * Gets the value of the startBackground property.
     * 
     * @return
     *     possible object is
     *     {@link StartBackgroundResponseVerb }
     *     
     */
    public StartBackgroundResponseVerb getStartBackground() {
        return startBackground;
    }

    /**
     * Sets the value of the startBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartBackgroundResponseVerb }
     *     
     */
    public void setStartBackground(StartBackgroundResponseVerb value) {
        this.startBackground = value;
    }

    /**
     * Gets the value of the startAssistant property.
     * 
     * @return
     *     possible object is
     *     {@link StartAssistantResponseVerb }
     *     
     */
    public StartAssistantResponseVerb getStartAssistant() {
        return startAssistant;
    }

    /**
     * Sets the value of the startAssistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAssistantResponseVerb }
     *     
     */
    public void setStartAssistant(StartAssistantResponseVerb value) {
        this.startAssistant = value;
    }

    /**
     * Gets the value of the getGroupLines property.
     * 
     * @return
     *     possible object is
     *     {@link GetGroupLinesResponseVerb }
     *     
     */
    public GetGroupLinesResponseVerb getGetGroupLines() {
        return getGroupLines;
    }

    /**
     * Sets the value of the getGroupLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGroupLinesResponseVerb }
     *     
     */
    public void setGetGroupLines(GetGroupLinesResponseVerb value) {
        this.getGroupLines = value;
    }

    /**
     * Gets the value of the getProgress property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressResponseVerb }
     *     
     */
    public ProgressResponseVerb getGetProgress() {
        return getProgress;
    }

    /**
     * Sets the value of the getProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressResponseVerb }
     *     
     */
    public void setGetProgress(ProgressResponseVerb value) {
        this.getProgress = value;
    }

    /**
     * Gets the value of the abort property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressAbortResponseVerb }
     *     
     */
    public ProgressAbortResponseVerb getAbort() {
        return abort;
    }

    /**
     * Sets the value of the abort property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressAbortResponseVerb }
     *     
     */
    public void setAbort(ProgressAbortResponseVerb value) {
        this.abort = value;
    }

    /**
     * Gets the value of the getDocumentChain property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentChainResponseVerb }
     *     
     */
    public GetDocumentChainResponseVerb getGetDocumentChain() {
        return getDocumentChain;
    }

    /**
     * Sets the value of the getDocumentChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentChainResponseVerb }
     *     
     */
    public void setGetDocumentChain(GetDocumentChainResponseVerb value) {
        this.getDocumentChain = value;
    }

}
