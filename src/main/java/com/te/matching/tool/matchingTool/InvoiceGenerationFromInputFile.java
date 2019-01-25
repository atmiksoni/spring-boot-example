package com.te.matching.tool.matchingTool;
import static com.te.matching.tool.util.InvoiceGenerateUtility.generateXMLForInvoice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;

public class InvoiceGenerationFromInputFile {
	
	
	
	public static void main(String[] args) throws  PropertyException, DatatypeConfigurationException, JAXBException, JAXBException, PropertyException, IOException {
		
		String JAXB_CONTEXT_PATH = "com.te.matching.jaxb.generated.invoiceupload";
	    //the base folder is ./, the root of the main.properties file  
	    String path = "./invoice.properties";
	    FileInputStream file =null;
	    //load the file handle for main.properties
	    try {
	    	 file= new FileInputStream(path);
	    	//to load application's properties, we use this class
		    Properties mainProperties = new Properties();
			//load all the properties from this file
		    mainProperties.load(file);
		    //retrieve the property we are intrested, the app.version
		   String dda = mainProperties.getProperty("DDA");
		   String concode = mainProperties.getProperty("Concode");
		   String custNo = mainProperties.getProperty("custNO");
		   String account= mainProperties.getProperty("AccountNO");
		   String invoiceRef = mainProperties.getProperty("InvoiceRef");
		   String noOfInvoices = mainProperties.getProperty("NoOfInvoice");
		   String vaAccount = mainProperties.getProperty("vaAccount");
		   String amount = mainProperties.getProperty("Amount");
		   String filePath = mainProperties.getProperty("OutPutFilePath");
		   System.out.println("Input for  DDA::"+dda);	
		   System.out.println("Input concode::"+concode);
		   System.out.println("Input cust::"+custNo);
		   System.out.println("Input account::"+account);
		   System.out.println("Input invoiceref::"+invoiceRef);
		   System.out.println("Input noOfinvoice::"+noOfInvoices);
		   System.out.println("Input vaAccount::"+vaAccount);
		   System.out.println("Input Amount::"+amount);
		   System.out.println("Input filePath::"+filePath);
		   generateXMLForInvoice(JAXB_CONTEXT_PATH, dda, concode, custNo, account, invoiceRef, noOfInvoices, vaAccount, 
				   amount, filePath);
		} catch (IOException io) {
			// TODO Auto-generated catch block
			io.printStackTrace();
		}finally {
			file.close();
		}

	    
			
		 
	}

}
