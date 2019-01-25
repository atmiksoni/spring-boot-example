package com.te.matching.tool.matchingTool;
import java.io.IOException;
import java.util.Scanner;
import static com.te.matching.tool.util.InvoiceGenerateUtility.*;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

public class InvoiceGeneration {

	public static void main(String[] args) throws JAXBException, DatatypeConfigurationException, IOException {
		
		String JAXB_CONTEXT_PATH = "com.te.matching.jaxb.InvoiceUpload";
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Please enter DDA Accunt::"); 
        String dda = in.nextLine();      
        System.out.println("Please enter concode::"); 
        String concode = in.nextLine(); 
        System.out.println("Please enter Custmer No::"); 
        String custNo = in.nextLine();
        System.out.println("Please enter Account No::"); 
        String account = in.nextLine();
        System.out.println("Please enter no of invoice You want to Generate::"); 
        String noOfInvoices = in.nextLine();  
        System.out.println("Please enter invoice ref you want to start with it::"); 
        String invoiceRef = in.nextLine();
        System.out.println("Please enter Valid VA account for invoice::"); 
        String vaAccount = in.nextLine();
        System.out.println("Please enter Valid amount for invoice::"); 
        String amount = in.nextLine();
        System.out.println("Please enter Valid Path where you want to generate file: Default path is C:/TPS/ ::"); 
        String filePath = in.nextLine();
        
        
		generateXMLForInvoice(JAXB_CONTEXT_PATH, dda, concode, custNo, account, invoiceRef, noOfInvoices, vaAccount,
				amount,filePath);
        
       

	}





	
}
