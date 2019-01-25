//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.07 at 03:38:13 PM IST 
//


package com.te.matching.jaxb.PayerDataUpload;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payer" type="{}Payer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerData", propOrder = {
    "payer"
})
public class PayerData {

    @XmlElement(required = true)
    protected List<Payer> payer;

    /**
     * Gets the value of the payer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payer }
     * 
     * 
     */
    public List<Payer> getPayer() {
        if (payer == null) {
            payer = new ArrayList<Payer>();
        }
        return this.payer;
    }

    public PayerData withPayer(Payer... values) {
        if (values!= null) {
            for (Payer value: values) {
                getPayer().add(value);
            }
        }
        return this;
    }

    public PayerData withPayer(Collection<Payer> values) {
        if (values!= null) {
            getPayer().addAll(values);
        }
        return this;
    }

}