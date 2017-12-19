package com.sapient.service;

import java.util.ResourceBundle;

public class EmpUtil {

	private static ResourceBundle rb;
	private static Idao dao;

	static {
		rb = ResourceBundle.getBundle("sap");
		try {
			Class cls = Class.forName(rb.getString("cname")); //load the class
			dao = (Idao) cls.newInstance();   // Create instance ( by loading the class name given in properties file.
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static Idao getDaoInstance() {
		return dao;

	}

}
