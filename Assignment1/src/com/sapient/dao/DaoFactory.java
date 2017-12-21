package com.sapient.dao;

import java.util.ResourceBundle;

public class DaoFactory {

	private static ResourceBundle rb;
	private static IDao dao;

	static {
		rb = ResourceBundle.getBundle("sap");
		try {
			Class cls = Class.forName(rb.getString("cname")); // load the class
			dao = (IDao) cls.newInstance(); // Create instance ( by loading the
											// class name given in properties
											// file.
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static IDao getDaoInstance() {
		return dao;

	}

}
