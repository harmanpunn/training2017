package com.sapient.demos;

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=sum(4,9,12,15,24);
		System.out.println(res);
	}
	
	public static int sum(int ...arr){
		System.out.println("var args called");
		int sum=0;
		for(int i=0;i<arr.length; ++i)
			sum=sum+arr[i];
		return sum;
		
	}

}
