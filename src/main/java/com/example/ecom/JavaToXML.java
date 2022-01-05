package com.example.ecom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.example.ecom.Models.Product;

public class JavaToXML {
	private static final String BOOKSTORE_XML = "bookstore-jaxb.xml";
	
	 public static void convertObjectToXML(Product p) throws JAXBException, FileNotFoundException {
	        // create JAXB context and instantiate marshaller
	        JAXBContext context = JAXBContext.newInstance(Product.class);
	        Marshaller m = context.createMarshaller();
	        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	        // Write to System.out
	        m.marshal(p, System.out);

	        // Write to File
	        m.marshal(p, new File(BOOKSTORE_XML));
	    }
	
}
