//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.coda.efinance.schemas.transaction package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Transaction_QNAME = new QName("http://www.coda.com/efinance/schemas/transaction", "Transaction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.coda.efinance.schemas.transaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link Currencies }
     * 
     */
    public Currencies createCurrencies() {
        return new Currencies();
    }

    /**
     * Create an instance of {@link WhichCurrs }
     * 
     */
    public WhichCurrs createWhichCurrs() {
        return new WhichCurrs();
    }

    /**
     * Create an instance of {@link CurrencyInfo }
     * 
     */
    public CurrencyInfo createCurrencyInfo() {
        return new CurrencyInfo();
    }

    /**
     * Create an instance of {@link HeaderWorkflow }
     * 
     */
    public HeaderWorkflow createHeaderWorkflow() {
        return new HeaderWorkflow();
    }

    /**
     * Create an instance of {@link LineWorkflow }
     * 
     */
    public LineWorkflow createLineWorkflow() {
        return new LineWorkflow();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link Taxes }
     * 
     */
    public Taxes createTaxes() {
        return new Taxes();
    }

    /**
     * Create an instance of {@link Ten99Taxes }
     * 
     */
    public Ten99Taxes createTen99Taxes() {
        return new Ten99Taxes();
    }

    /**
     * Create an instance of {@link Discount }
     * 
     */
    public Discount createDiscount() {
        return new Discount();
    }

    /**
     * Create an instance of {@link RecurringDiscount }
     * 
     */
    public RecurringDiscount createRecurringDiscount() {
        return new RecurringDiscount();
    }

    /**
     * Create an instance of {@link Discounts }
     * 
     */
    public Discounts createDiscounts() {
        return new Discounts();
    }

    /**
     * Create an instance of {@link RecurringDiscounts }
     * 
     */
    public RecurringDiscounts createRecurringDiscounts() {
        return new RecurringDiscounts();
    }

    /**
     * Create an instance of {@link ElmQuantities }
     * 
     */
    public ElmQuantities createElmQuantities() {
        return new ElmQuantities();
    }

    /**
     * Create an instance of {@link Comments }
     * 
     */
    public Comments createComments() {
        return new Comments();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link BasicLine }
     * 
     */
    public BasicLine createBasicLine() {
        return new BasicLine();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link Lines }
     * 
     */
    public Lines createLines() {
        return new Lines();
    }

    /**
     * Create an instance of {@link TxnKey }
     * 
     */
    public TxnKey createTxnKey() {
        return new TxnKey();
    }

    /**
     * Create an instance of {@link TxnLineKey }
     * 
     */
    public TxnLineKey createTxnLineKey() {
        return new TxnLineKey();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.coda.com/efinance/schemas/transaction", name = "Transaction")
    public JAXBElement<Transaction> createTransaction(Transaction value) {
        return new JAXBElement<Transaction>(_Transaction_QNAME, Transaction.class, null, value);
    }

}
