//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.07 at 03:38:13 PM IST 
//


package com.te.matching.jaxb.PayerDataUpload;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.te.matching.jaxb.PayerDataUpload package. 
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

    private final static QName _Payerdata_QNAME = new QName("", "payerdata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.te.matching.jaxb.PayerDataUpload
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Payer }
     * 
     */
    public Payer createPayer() {
        return new Payer();
    }

    /**
     * Create an instance of {@link PayerData }
     * 
     */
    public PayerData createPayerData() {
        return new PayerData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "payerdata")
    public JAXBElement<PayerData> createPayerdata(PayerData value) {
        return new JAXBElement<PayerData>(_Payerdata_QNAME, PayerData.class, null, value);
    }

}