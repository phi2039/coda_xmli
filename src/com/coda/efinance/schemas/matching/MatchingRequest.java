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
import com.coda.efinance.schemas.common.ServiceRequest;
import com.coda.efinance.schemas.progress.ProgressAbortRequestVerb;
import com.coda.efinance.schemas.progress.ProgressGetRequestVerb;


/**
 * This service allows you to match outstanding debit and credit entries.
 * 
 * <p>Java class for MatchingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ServiceRequest"&gt;
 *       &lt;all&gt;
 *         &lt;element name="SelectMaster" type="{http://www.coda.com/efinance/schemas/matching}SelectMasterRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="ValidateParams" type="{http://www.coda.com/efinance/schemas/matching}ValidateParamsRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="SelectLines" type="{http://www.coda.com/efinance/schemas/matching}SelectLinesRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetDiscounts" type="{http://www.coda.com/efinance/schemas/matching}GetDiscountRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.coda.com/efinance/schemas/matching}DiscountRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="PartMatch" type="{http://www.coda.com/efinance/schemas/matching}PartMatchRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="WriteOff" type="{http://www.coda.com/efinance/schemas/matching}WriteOffRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetLineValues" type="{http://www.coda.com/efinance/schemas/matching}GetLineValuesRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetTotals" type="{http://www.coda.com/efinance/schemas/matching}GetTotalsRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetPayDetailsSources" type="{http://www.coda.com/efinance/schemas/matching}GetPayDetailsSourcesRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetDrivingLineInfo" type="{http://www.coda.com/efinance/schemas/matching}GetDrivingLineInfoRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Commit" type="{http://www.coda.com/efinance/schemas/matching}CommitRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Disperse" type="{http://www.coda.com/efinance/schemas/matching}DisperseRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="StartBackground" type="{http://www.coda.com/efinance/schemas/matching}StartBackgroundRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="StartAssistant" type="{http://www.coda.com/efinance/schemas/matching}StartAssistantRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetGroupLines" type="{http://www.coda.com/efinance/schemas/matching}GetGroupLinesRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetProgress" type="{http://www.coda.com/efinance/schemas/progress}progressGetRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Abort" type="{http://www.coda.com/efinance/schemas/progress}progressAbortRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetDocumentChain" type="{http://www.coda.com/efinance/schemas/matching}GetDocumentChainRequestVerb" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingRequest", propOrder = {
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
public class MatchingRequest
    extends ServiceRequest
    implements Serializable
{

    @XmlElement(name = "SelectMaster")
    protected SelectMasterRequestVerb selectMaster;
    @XmlElement(name = "ValidateParams")
    protected ValidateParamsRequestVerb validateParams;
    @XmlElement(name = "SelectLines")
    protected SelectLinesRequestVerb selectLines;
    @XmlElement(name = "GetDiscounts")
    protected GetDiscountRequestVerb getDiscounts;
    @XmlElement(name = "Discount")
    protected DiscountRequestVerb discount;
    @XmlElement(name = "PartMatch")
    protected PartMatchRequestVerb partMatch;
    @XmlElement(name = "WriteOff")
    protected WriteOffRequestVerb writeOff;
    @XmlElement(name = "GetLineValues")
    protected GetLineValuesRequestVerb getLineValues;
    @XmlElement(name = "GetTotals")
    protected GetTotalsRequestVerb getTotals;
    @XmlElement(name = "GetPayDetailsSources")
    protected GetPayDetailsSourcesRequestVerb getPayDetailsSources;
    @XmlElement(name = "GetDrivingLineInfo")
    protected GetDrivingLineInfoRequestVerb getDrivingLineInfo;
    @XmlElement(name = "Commit")
    protected CommitRequestVerb commit;
    @XmlElement(name = "Disperse")
    protected DisperseRequestVerb disperse;
    @XmlElement(name = "StartBackground")
    protected StartBackgroundRequestVerb startBackground;
    @XmlElement(name = "StartAssistant")
    protected StartAssistantRequestVerb startAssistant;
    @XmlElement(name = "GetGroupLines")
    protected GetGroupLinesRequestVerb getGroupLines;
    @XmlElement(name = "GetProgress")
    protected ProgressGetRequestVerb getProgress;
    @XmlElement(name = "Abort")
    protected ProgressAbortRequestVerb abort;
    @XmlElement(name = "GetDocumentChain")
    protected GetDocumentChainRequestVerb getDocumentChain;

    /**
     * Gets the value of the selectMaster property.
     * 
     * @return
     *     possible object is
     *     {@link SelectMasterRequestVerb }
     *     
     */
    public SelectMasterRequestVerb getSelectMaster() {
        return selectMaster;
    }

    /**
     * Sets the value of the selectMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectMasterRequestVerb }
     *     
     */
    public void setSelectMaster(SelectMasterRequestVerb value) {
        this.selectMaster = value;
    }

    /**
     * Gets the value of the validateParams property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateParamsRequestVerb }
     *     
     */
    public ValidateParamsRequestVerb getValidateParams() {
        return validateParams;
    }

    /**
     * Sets the value of the validateParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateParamsRequestVerb }
     *     
     */
    public void setValidateParams(ValidateParamsRequestVerb value) {
        this.validateParams = value;
    }

    /**
     * Gets the value of the selectLines property.
     * 
     * @return
     *     possible object is
     *     {@link SelectLinesRequestVerb }
     *     
     */
    public SelectLinesRequestVerb getSelectLines() {
        return selectLines;
    }

    /**
     * Sets the value of the selectLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectLinesRequestVerb }
     *     
     */
    public void setSelectLines(SelectLinesRequestVerb value) {
        this.selectLines = value;
    }

    /**
     * Gets the value of the getDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link GetDiscountRequestVerb }
     *     
     */
    public GetDiscountRequestVerb getGetDiscounts() {
        return getDiscounts;
    }

    /**
     * Sets the value of the getDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDiscountRequestVerb }
     *     
     */
    public void setGetDiscounts(GetDiscountRequestVerb value) {
        this.getDiscounts = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountRequestVerb }
     *     
     */
    public DiscountRequestVerb getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountRequestVerb }
     *     
     */
    public void setDiscount(DiscountRequestVerb value) {
        this.discount = value;
    }

    /**
     * Gets the value of the partMatch property.
     * 
     * @return
     *     possible object is
     *     {@link PartMatchRequestVerb }
     *     
     */
    public PartMatchRequestVerb getPartMatch() {
        return partMatch;
    }

    /**
     * Sets the value of the partMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartMatchRequestVerb }
     *     
     */
    public void setPartMatch(PartMatchRequestVerb value) {
        this.partMatch = value;
    }

    /**
     * Gets the value of the writeOff property.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffRequestVerb }
     *     
     */
    public WriteOffRequestVerb getWriteOff() {
        return writeOff;
    }

    /**
     * Sets the value of the writeOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffRequestVerb }
     *     
     */
    public void setWriteOff(WriteOffRequestVerb value) {
        this.writeOff = value;
    }

    /**
     * Gets the value of the getLineValues property.
     * 
     * @return
     *     possible object is
     *     {@link GetLineValuesRequestVerb }
     *     
     */
    public GetLineValuesRequestVerb getGetLineValues() {
        return getLineValues;
    }

    /**
     * Sets the value of the getLineValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLineValuesRequestVerb }
     *     
     */
    public void setGetLineValues(GetLineValuesRequestVerb value) {
        this.getLineValues = value;
    }

    /**
     * Gets the value of the getTotals property.
     * 
     * @return
     *     possible object is
     *     {@link GetTotalsRequestVerb }
     *     
     */
    public GetTotalsRequestVerb getGetTotals() {
        return getTotals;
    }

    /**
     * Sets the value of the getTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTotalsRequestVerb }
     *     
     */
    public void setGetTotals(GetTotalsRequestVerb value) {
        this.getTotals = value;
    }

    /**
     * Gets the value of the getPayDetailsSources property.
     * 
     * @return
     *     possible object is
     *     {@link GetPayDetailsSourcesRequestVerb }
     *     
     */
    public GetPayDetailsSourcesRequestVerb getGetPayDetailsSources() {
        return getPayDetailsSources;
    }

    /**
     * Sets the value of the getPayDetailsSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPayDetailsSourcesRequestVerb }
     *     
     */
    public void setGetPayDetailsSources(GetPayDetailsSourcesRequestVerb value) {
        this.getPayDetailsSources = value;
    }

    /**
     * Gets the value of the getDrivingLineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetDrivingLineInfoRequestVerb }
     *     
     */
    public GetDrivingLineInfoRequestVerb getGetDrivingLineInfo() {
        return getDrivingLineInfo;
    }

    /**
     * Sets the value of the getDrivingLineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDrivingLineInfoRequestVerb }
     *     
     */
    public void setGetDrivingLineInfo(GetDrivingLineInfoRequestVerb value) {
        this.getDrivingLineInfo = value;
    }

    /**
     * Gets the value of the commit property.
     * 
     * @return
     *     possible object is
     *     {@link CommitRequestVerb }
     *     
     */
    public CommitRequestVerb getCommit() {
        return commit;
    }

    /**
     * Sets the value of the commit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitRequestVerb }
     *     
     */
    public void setCommit(CommitRequestVerb value) {
        this.commit = value;
    }

    /**
     * Gets the value of the disperse property.
     * 
     * @return
     *     possible object is
     *     {@link DisperseRequestVerb }
     *     
     */
    public DisperseRequestVerb getDisperse() {
        return disperse;
    }

    /**
     * Sets the value of the disperse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisperseRequestVerb }
     *     
     */
    public void setDisperse(DisperseRequestVerb value) {
        this.disperse = value;
    }

    /**
     * Gets the value of the startBackground property.
     * 
     * @return
     *     possible object is
     *     {@link StartBackgroundRequestVerb }
     *     
     */
    public StartBackgroundRequestVerb getStartBackground() {
        return startBackground;
    }

    /**
     * Sets the value of the startBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartBackgroundRequestVerb }
     *     
     */
    public void setStartBackground(StartBackgroundRequestVerb value) {
        this.startBackground = value;
    }

    /**
     * Gets the value of the startAssistant property.
     * 
     * @return
     *     possible object is
     *     {@link StartAssistantRequestVerb }
     *     
     */
    public StartAssistantRequestVerb getStartAssistant() {
        return startAssistant;
    }

    /**
     * Sets the value of the startAssistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAssistantRequestVerb }
     *     
     */
    public void setStartAssistant(StartAssistantRequestVerb value) {
        this.startAssistant = value;
    }

    /**
     * Gets the value of the getGroupLines property.
     * 
     * @return
     *     possible object is
     *     {@link GetGroupLinesRequestVerb }
     *     
     */
    public GetGroupLinesRequestVerb getGetGroupLines() {
        return getGroupLines;
    }

    /**
     * Sets the value of the getGroupLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGroupLinesRequestVerb }
     *     
     */
    public void setGetGroupLines(GetGroupLinesRequestVerb value) {
        this.getGroupLines = value;
    }

    /**
     * Gets the value of the getProgress property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressGetRequestVerb }
     *     
     */
    public ProgressGetRequestVerb getGetProgress() {
        return getProgress;
    }

    /**
     * Sets the value of the getProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressGetRequestVerb }
     *     
     */
    public void setGetProgress(ProgressGetRequestVerb value) {
        this.getProgress = value;
    }

    /**
     * Gets the value of the abort property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressAbortRequestVerb }
     *     
     */
    public ProgressAbortRequestVerb getAbort() {
        return abort;
    }

    /**
     * Sets the value of the abort property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressAbortRequestVerb }
     *     
     */
    public void setAbort(ProgressAbortRequestVerb value) {
        this.abort = value;
    }

    /**
     * Gets the value of the getDocumentChain property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentChainRequestVerb }
     *     
     */
    public GetDocumentChainRequestVerb getGetDocumentChain() {
        return getDocumentChain;
    }

    /**
     * Sets the value of the getDocumentChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentChainRequestVerb }
     *     
     */
    public void setGetDocumentChain(GetDocumentChainRequestVerb value) {
        this.getDocumentChain = value;
    }

}
