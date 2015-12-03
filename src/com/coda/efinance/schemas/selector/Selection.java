//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.selector;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.selectormaster.SelectorType;


/**
 * This element contains the selected data, which is returned from the server.
 * 
 * <p>Java class for Selection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Selection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelType" type="{http://www.coda.com/efinance/schemas/selectormaster}SelectorType"/&gt;
 *         &lt;element name="Header" type="{http://www.coda.com/efinance/schemas/selector}SelectionRow"/&gt;
 *         &lt;element name="DataSet" type="{http://www.coda.com/efinance/schemas/selector}RowList"/&gt;
 *         &lt;element name="RowLimitExceeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Selection", propOrder = {
    "selType",
    "header",
    "dataSet",
    "rowLimitExceeded"
})
public class Selection
    implements Serializable
{

    @XmlElement(name = "SelType", required = true)
    protected SelectorType selType;
    @XmlElement(name = "Header", required = true)
    protected SelectionRow header;
    @XmlElement(name = "DataSet", required = true)
    protected RowList dataSet;
    @XmlElement(name = "RowLimitExceeded")
    protected boolean rowLimitExceeded;

    /**
     * Gets the value of the selType property.
     * 
     * @return
     *     possible object is
     *     {@link SelectorType }
     *     
     */
    public SelectorType getSelType() {
        return selType;
    }

    /**
     * Sets the value of the selType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectorType }
     *     
     */
    public void setSelType(SelectorType value) {
        this.selType = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionRow }
     *     
     */
    public SelectionRow getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionRow }
     *     
     */
    public void setHeader(SelectionRow value) {
        this.header = value;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link RowList }
     *     
     */
    public RowList getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowList }
     *     
     */
    public void setDataSet(RowList value) {
        this.dataSet = value;
    }

    /**
     * Gets the value of the rowLimitExceeded property.
     * 
     */
    public boolean isRowLimitExceeded() {
        return rowLimitExceeded;
    }

    /**
     * Sets the value of the rowLimitExceeded property.
     * 
     */
    public void setRowLimitExceeded(boolean value) {
        this.rowLimitExceeded = value;
    }

}
