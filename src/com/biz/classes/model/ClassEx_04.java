package com.biz.classes.model;

public class ClassEx_04 {

	public static void main(String[] args) {
		
		/*
		 * 클래스를 객체배열로 선언했을경우
		 * 몇몇 클래스(String 등)를 제외하고는
		 * 객체배열의 요소를 모두 초기화 작업을 해야
		 *     메서드 접근 (읽기, 쓰기) 메서드 접근(호출)이가능하다		 
		 */

		// 1. 객체 배열 선언
		StudentVO[] stVO = new SstudentVO[10];
		
		// 2. 객체요소의 초기화를 반드시 수행
		StVO[0] = new SstudentVO();
		StVO[1] = new SstudentVO();
		StVO[2] = new SstudentVO();
		StVO[3] = new SstudentVO();
		StVO[4] = new SstudentVO();
		StVO[5] = new SstudentVO();
		
		
		// 3. 객체요소의 맴버변수(또는 메서드)에 접귾나기
		stVO[0].strNum = "001";
		stVO[0].strName = "홍길동";
		
		System.out.println(stVO[0].strName);
		
		// 아직 index 1의 요소는 초기화 하지 않았기 때문에
		// 맴버변수에 접근하면
		// Nullpointer Exception이 발생
		stVO[0].strNum = "002";

	}

}
