//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:19 AM EST 
//


package com.coda.efinance.schemas.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.Request;
import com.coda.efinance.schemas.transaction.Transaction;


/**
 * <p>Java class for PostRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transaction" type="{http://www.coda.com/efinance/schemas/transaction}Transaction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostRequest", propOrder = {
    "transaction"
})
public class PostRequest
    extends Request
    implements Serializable
{

    @XmlElement(name = "Transaction", required = true)
    protected Transaction transaction;

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
        this.transaction = value;
    }

}
