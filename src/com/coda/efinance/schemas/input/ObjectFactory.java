//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:19 AM EST 
//


package com.coda.efinance.schemas.input;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.coda.efinance.schemas.input package. 
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

    private final static QName _InputRequest_QNAME = new QName("http://www.coda.com/efinance/schemas/input", "InputRequest");
    private final static QName _InputResponse_QNAME = new QName("http://www.coda.com/efinance/schemas/input", "InputResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.coda.efinance.schemas.input
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InputRequest }
     * 
     */
    public InputRequest createInputRequest() {
        return new InputRequest();
    }

    /**
     * Create an instance of {@link InputResponse }
     * 
     */
    public InputResponse createInputResponse() {
        return new InputResponse();
    }

    /**
     * Create an instance of {@link PostRequest }
     * 
     */
    public PostRequest createPostRequest() {
        return new PostRequest();
    }

    /**
     * Create an instance of {@link PostRequestVerb }
     * 
     */
    public PostRequestVerb createPostRequestVerb() {
        return new PostRequestVerb();
    }

    /**
     * Create an instance of {@link PostResponse }
     * 
     */
    public PostResponse createPostResponse() {
        return new PostResponse();
    }

    /**
     * Create an instance of {@link PostResponseVerb }
     * 
     */
    public PostResponseVerb createPostResponseVerb() {
        return new PostResponseVerb();
    }

    /**
     * Create an instance of {@link PostToXRequestVerb }
     * 
     */
    public PostToXRequestVerb createPostToXRequestVerb() {
        return new PostToXRequestVerb();
    }

    /**
     * Create an instance of {@link PostToXResponse }
     * 
     */
    public PostToXResponse createPostToXResponse() {
        return new PostToXResponse();
    }

    /**
     * Create an instance of {@link PostToXResponseVerb }
     * 
     */
    public PostToXResponseVerb createPostToXResponseVerb() {
        return new PostToXResponseVerb();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.coda.com/efinance/schemas/input", name = "InputRequest")
    public JAXBElement<InputRequest> createInputRequest(InputRequest value) {
        return new JAXBElement<InputRequest>(_InputRequest_QNAME, InputRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.coda.com/efinance/schemas/input", name = "InputResponse")
    public JAXBElement<InputResponse> createInputResponse(InputResponse value) {
        return new JAXBElement<InputResponse>(_InputResponse_QNAME, InputResponse.class, null, value);
    }

}
