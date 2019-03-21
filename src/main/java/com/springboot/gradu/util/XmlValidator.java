package com.springboot.gradu.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlValidator {
	
	public boolean validate(String xsdpath,String xmlpath) throws SAXException {
		SchemaFactory sf = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		File schemaFile = new File(xsdpath);
		Schema schema = sf.newSchema(schemaFile);
		boolean flag = false;
		Validator validator = schema.newValidator();
		try {
			System.out.println(xmlpath);
			InputSource inputSource = new InputSource(new FileInputStream(new File(xmlpath)));
			Source source = new SAXSource(inputSource);
			validator.validate(source);
			flag = true;
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flag;
	}
}
