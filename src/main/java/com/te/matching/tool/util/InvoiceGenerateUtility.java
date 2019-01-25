package com.te.matching.tool.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.te.matching.jaxb.generated.invoiceupload.Invoice;
import com.te.matching.jaxb.generated.invoiceupload.InvoiceType;
import com.te.matching.jaxb.generated.invoiceupload.Invoices;
import com.te.matching.jaxb.generated.invoiceupload.ObjectFactory;
import com.te.matching.jaxb.generated.invoiceupload.Payer;

public class InvoiceGenerateUtility {
	
	private InvoiceGenerateUtility() {
		// TODO Auto-generated constructor stub
	}
	
	public static void generateXMLForInvoice(String JAXB_CONTEXT_PATH, String dda, String concode, String custNo,
			String account, String invoiceRef, String noOfInvoices, String vaAccount, String amount,String filePath)
			throws DatatypeConfigurationException, JAXBException, PropertyException, FileNotFoundException {
		ObjectFactory invoiceFactory = new ObjectFactory();
		
		Invoices invoices = invoiceFactory.createInvoices();
		invoices.setConcode(concode);
		invoices.setDda(dda);
		if(null == filePath || filePath.isEmpty() ) {
		 filePath="C:/TPS/";
		}
		//String fileName1 ="CHIDCUST#1002#VAD0000051#ACCTInvoice.xml";
		//String fileName2="CHIN#8765431234#NL64INGB2234567823#invoice.xml";
		String fileName="CHID#"+custNo+"#"+account+"#"+"invoice.xml" ;
		invoices.withInvoice(getInvoiceList(invoiceFactory, new Integer(noOfInvoices), invoiceRef,vaAccount, amount));
		
		JAXBContext context = JAXBContext.newInstance(JAXB_CONTEXT_PATH);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
        marshaller.marshal(invoices, System.out);
        marshaller.marshal(invoices, new FileOutputStream(filePath+fileName));
	}


	
	
	
	public static List<Invoice> getInvoiceList(ObjectFactory invoiceFactory,int noOfInvoices, String invoiceRef, String accountNo, String amount) throws DatatypeConfigurationException{
		XMLGregorianCalendar now = getCurrentDate();
		List<Invoice> invoiceList = new ArrayList<Invoice>();
		for (int i = 0; i < noOfInvoices; i++) {
			
			Invoice invoice =invoiceFactory.createInvoice();
			if(noOfInvoices ==1) {
				invoice.setInvoiceref(invoiceRef);
			}else {
				invoice.setInvoiceref(invoiceRef+i);
			}
				invoice.setAdditionalref("additionalRef"+i);
				invoice.setAccount(accountNo);
				invoice.setInvoiceType(InvoiceType.CINV);
				invoice.setAmount(new BigDecimal(amount));
				invoice.setComment("comment");
				invoice.setCreatedby("Matching Tool");
				invoice.setCreationdate(now);
				invoice.setDuedate(now);
			Payer payer = invoiceFactory.createPayer();
				payer.setName("payerName");
				payer.setCity("Pune");
				payer.setPayeraccountnumber("payerAcc");
				payer.setPayercustomernumber("payerCust");
				payer.setCountry("INDIA");
				payer.setAddress("EON IT Park");
				payer.setPostcode("411061");
				payer.setTransactiontype("SEPATRANSFER");
				payer.setNationalid("123");
				invoice.setPayer(payer);
			invoiceList.add(invoice);
		}
			
		return invoiceList;
	}


	public static XMLGregorianCalendar getCurrentDate() throws DatatypeConfigurationException {
		XMLGregorianCalendar now = DatatypeFactory.newInstance().newXMLGregorianCalendar
				(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		return now;
	}


}
