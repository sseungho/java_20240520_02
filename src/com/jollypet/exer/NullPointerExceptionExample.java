package com.jollypet.exer;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		String data = null;
		System.out.println(data.toString());
	}catch(NullPointerException e) {
	System.out.println("null 값을 가리키고 있음 > 다시 확인");
	}
}

	}
