package com.jollypet.exer;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 10;
			int sum = a / 0;		// 0 나누기 에러 발생
			System.out.println(sum);
		} catch(Exception e) {
			System.out.println("0 나누기 에러 발생 > 다시 확인");
		} finally {
			System.out.println("에러와 상관 없이 결국 프로그램은 실행된다.");
		}
//		
//		catch(NullPointerException e) {
//			System.out.println("null 값을 가리키고 있음 > 다시 확인");
//
//		}
	}

}
