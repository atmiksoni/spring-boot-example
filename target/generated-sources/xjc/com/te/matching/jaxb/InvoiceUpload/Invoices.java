//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.07 at 03:38:13 PM IST 
//


package com.te.matching.jaxb.InvoiceUpload;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concode" type="{}Max5Text"/>
 *         &lt;element name="dda" type="{}Max35Text"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;choice>
 *             &lt;element name="invoice" type="{}Invoice"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "concode",
    "dda",
    "invoice"
})
@XmlRootElement(name = "invoices")
public class Invoices {

    @XmlElement(required = true)
    protected String concode;
    @XmlElement(required = true)
    protected String dda;
    protected List<Invoice> invoice;

    /**
     * Gets the value of the concode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcode() {
        return concode;
    }

    /**
     * Sets the value of the concode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcode(String value) {
        this.concode = value;
    }

    /**
     * Gets the value of the dda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDda() {
        return dda;
    }

    /**
     * Sets the value of the dda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDda(String value) {
        this.dda = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Invoice }
     * 
     * 
     */
    public List<Invoice> getInvoice() {
        if (invoice == null) {
            invoice = new ArrayList<Invoice>();
        }
        return this.invoice;
    }

    public Invoices withConcode(String value) {
        setConcode(value);
        return this;
    }

    public Invoices withDda(String value) {
        setDda(value);
        return this;
    }

    public Invoices withInvoice(Invoice... values) {
        if (values!= null) {
            for (Invoice value: values) {
                getInvoice().add(value);
            }
        }
        return this;
    }

    public Invoices withInvoice(Collection<Invoice> values) {
        if (values!= null) {
            getInvoice().addAll(values);
        }
        return this;
    }

}
