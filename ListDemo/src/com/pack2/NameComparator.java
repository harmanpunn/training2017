package com.pack2;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		String str1 = e1.getEmpName();
		String str2 = e2.getEmpName();
		return str1.compareTo(str2);
	}

	
	
	

}
