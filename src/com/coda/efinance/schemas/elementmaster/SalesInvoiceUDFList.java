//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:25 AM EST 
//


package com.coda.efinance.schemas.elementmaster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains a list of user-defined fields on a sales invoice header.
 * 
 * <p>Java class for SalesInvoiceUDFList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesInvoiceUDFList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesInvoiceUDFRow" type="{http://www.coda.com/efinance/schemas/elementmaster}SalesInvoiceUDFRow" maxOccurs="6" minOccurs="6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesInvoiceUDFList", propOrder = {
    "salesInvoiceUDFRow"
})
public class SalesInvoiceUDFList
    implements Serializable
{

    @XmlElement(name = "SalesInvoiceUDFRow", required = true)
    protected List<SalesInvoiceUDFRow> salesInvoiceUDFRow;

    /**
     * Gets the value of the salesInvoiceUDFRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesInvoiceUDFRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesInvoiceUDFRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesInvoiceUDFRow }
     * 
     * 
     */
    public List<SalesInvoiceUDFRow> getSalesInvoiceUDFRow() {
        if (salesInvoiceUDFRow == null) {
            salesInvoiceUDFRow = new ArrayList<SalesInvoiceUDFRow>();
        }
        return this.salesInvoiceUDFRow;
    }

}
