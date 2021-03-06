//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.selectormaster;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.coda.efinance.schemas.selectormaster package. 
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

    private final static QName _SelectorMaster_QNAME = new QName("http://www.coda.com/efinance/schemas/selectormaster", "SelectorMaster");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.coda.efinance.schemas.selectormaster
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectorMaster }
     * 
     */
    public SelectorMaster createSelectorMaster() {
        return new SelectorMaster();
    }

    /**
     * Create an instance of {@link SelectorType }
     * 
     */
    public SelectorType createSelectorType() {
        return new SelectorType();
    }

    /**
     * Create an instance of {@link SourceModeSelectorType }
     * 
     */
    public SourceModeSelectorType createSourceModeSelectorType() {
        return new SourceModeSelectorType();
    }

    /**
     * Create an instance of {@link DetailsLocation }
     * 
     */
    public DetailsLocation createDetailsLocation() {
        return new DetailsLocation();
    }

    /**
     * Create an instance of {@link VocListDataElement }
     * 
     */
    public VocListDataElement createVocListDataElement() {
        return new VocListDataElement();
    }

    /**
     * Create an instance of {@link SelectorVocListData }
     * 
     */
    public SelectorVocListData createSelectorVocListData() {
        return new SelectorVocListData();
    }

    /**
     * Create an instance of {@link VocListData }
     * 
     */
    public VocListData createVocListData() {
        return new VocListData();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new Key();
    }

    /**
     * Create an instance of {@link ReqKeys }
     * 
     */
    public ReqKeys createReqKeys() {
        return new ReqKeys();
    }

    /**
     * Create an instance of {@link PrintReqKeys }
     * 
     */
    public PrintReqKeys createPrintReqKeys() {
        return new PrintReqKeys();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectorMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.coda.com/efinance/schemas/selectormaster", name = "SelectorMaster")
    public JAXBElement<SelectorMaster> createSelectorMaster(SelectorMaster value) {
        return new JAXBElement<SelectorMaster>(_SelectorMaster_QNAME, SelectorMaster.class, null, value);
    }

}
