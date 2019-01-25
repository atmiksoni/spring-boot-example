package com.te.matching.tool.matchingTool;

import static com.te.matching.tool.util.PayerGenerationUtility.generateXMLForPayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;

public class PayerGenerationFromInputFile {
	
	public static void main(String[] args) throws PropertyException, DatatypeConfigurationException, JAXBException, IOException {
		String JAXB_CONTEXT_PATH = "com.te.matching.jaxb.generated.payerupload";
	    //the base folder is ./, the root of the main.properties file  
	    String path = "./payer.properties";
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
		   String payerName = mainProperties.getProperty("PayerName");
		   String noOfPayer = mainProperties.getProperty("NoOfPayer");
		   String vaAccount = mainProperties.getProperty("vaAccount");
		   String payerAccount = mainProperties.getProperty("PayerAccount");
		   String payerCustomerNo = mainProperties.getProperty("PayerCustomer");
		   String actionFlag = mainProperties.getProperty("ActionFlag");
		   String filePath = mainProperties.getProperty("OutPutFilePath");
		   System.out.println("Input for  DDA::"+dda);	
		   System.out.println("Input concode::"+concode);
		   System.out.println("Input cust::"+custNo);
		   System.out.println("Input account::"+account);
		   System.out.println("Input payerName::"+payerName);
		   System.out.println("Input noOfPayer::"+noOfPayer);
		   System.out.println("Input vaAccount::"+vaAccount);
		   System.out.println("Input payerAccount::"+payerAccount);
		   System.out.println("Input Action Flag::"+actionFlag);
		   System.out.println("Input filePath::"+filePath);
		   System.out.println("Input payerCustNO::"+payerCustomerNo);
		   generateXMLForPayer(JAXB_CONTEXT_PATH,  dda,  concode,  custNo,
					 account,  payerName,  payerAccount,  vaAccount,  payerCustomerNo, 
					filePath, noOfPayer, actionFlag);
			
		} catch (IOException io) {
			// TODO Auto-generated catch block
			io.printStackTrace();
		}finally {
			file.close();
		}

	    
			
	}

}
