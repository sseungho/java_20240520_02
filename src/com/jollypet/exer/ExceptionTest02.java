package com.jollypet.exer;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		throwTest(10,0);
		} catch (NullPointerException e) {
			e.printStackTrace();			
			System.out.println("0 나누기 에러");
		}		
	}
	
	
	public static void throwTest(int a, int b) throws ArithmeticException {
		System.out.print(a/b);
	}
}
