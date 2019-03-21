package com.springboot.gradu.util;


import org.xml.sax.SAXException;

public class XmlValidateUtil {
	
	public static void main(String[] args) throws SAXException {
		XmlValidator validator = new XmlValidator();
		String xsdpath = "F:\\XSD_2.1\\dataschema.xsd";
		String xmlpath = "";
		for (int i =10; i<13; i++) {
			xmlpath = "F:\\(2013)��ִ�ֵ�0007��.xml";
			System.out.println(xmlpath);
			boolean flag = validator.validate(xsdpath, xmlpath);
			System.out.println(flag);
		}
	}
}
