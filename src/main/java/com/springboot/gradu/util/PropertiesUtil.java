package com.springboot.gradu.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

/**
 * �����ļ���*.properties��������
 * 
 * @author wzq
 */
public class PropertiesUtil {
	public static int getRowsPerPage() {
		ClassPathResource resource = new ClassPathResource("ajcx.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "ajcx.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		int rowsPerPage = Integer.parseInt(pros.getProperty("rowsPerPage"));
		return rowsPerPage;
	}
	
	public static String getLoginId() {
		ClassPathResource resource = new ClassPathResource("ajcx.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "ajcx.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		String username=pros.getProperty("username");
		return username;
	}
	
	public static String getLoginPass() {
		ClassPathResource resource = new ClassPathResource("ajcx.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "ajcx.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		String password=pros.getProperty("password");
		return password;
	}

}
