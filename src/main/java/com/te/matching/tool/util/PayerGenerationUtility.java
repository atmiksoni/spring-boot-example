package com.te.matching.tool.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.te.matching.jaxb.generated.payerupload.ActionType;
import com.te.matching.jaxb.generated.payerupload.ObjectFactory;
import com.te.matching.jaxb.generated.payerupload.Payer;
import com.te.matching.jaxb.generated.payerupload.PayerData;

public class PayerGenerationUtility {
	
	
	public static void generateXMLForPayer(String JAXB_CONTEXT_PATH, String dda, String concode, String custNo,
			String account, String payerName, String payerAccount, String vaAccount, String PayerCustomerNo,String filePath,String noOfPayer,String actionFlag)
			throws DatatypeConfigurationException, JAXBException, PropertyException, FileNotFoundException {
		ObjectFactory payerDatafactory = new ObjectFactory();
		
		PayerData payerData = payerDatafactory.createPayerData();
		if(null == filePath || filePath.isEmpty() ) {
		 filePath="C:/TPS/";
		}
		
		//String fileName1 ="CHIDCUST#1002#VAD0000051#ACCTInvoice.xml";
		String fileName="CHID#"+custNo+"#"+account+"#"+"payer.xml" ;
		payerData.withPayer(getPayerList( payerDatafactory, new Integer(noOfPayer),  payerName,  account,  payerAccount, PayerCustomerNo, actionFlag,vaAccount));
		JAXBContext context = JAXBContext.newInstance(JAXB_CONTEXT_PATH);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
        marshaller.marshal(payerData, System.out);
        marshaller.marshal(payerData, new FileOutputStream(filePath+fileName));
	}
	
	
	public static List<Payer> getPayerList(ObjectFactory payerDataFactory,int noOfPayer, String payerName, String accountNo, String payerAccount,String PayerCustomerNo,String actionFlag,String vaAccount) throws DatatypeConfigurationException{
		List<Payer> payerList = new ArrayList<Payer>();
		for (int i = 0; i < noOfPayer; i++) {
			
			Payer payer =payerDataFactory.createPayer();
			if(noOfPayer ==1) {
				payer.setName(payerName);
			}else {
				payer.setName(payerName+i);
			}				
				payer.setCity("Pune");
				payer.setPayeraccountnumber(payerAccount+i);
				payer.setPayercustomernumber(PayerCustomerNo+i);
				payer.setCountry("INDIA");
				payer.setAddress("EON IT Park");
				payer.setPostcode("411061");
				payer.setTransactiontype("SEPATRANSFER");
				payer.setNationalid("91");
				payer.setBiccode("biccode");
				payer.setAccount(vaAccount);
				
				if("D".equals(actionFlag)) {
					payer.setAction(ActionType.D);
				}
				payerList.add(payer);
		}
			
		return payerList;
	}
	
	
	
}
