package com.biz.classes.model;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		StudentVO[] stVO = new StudentVO[5];
		for(int i = 0 ; i < stVO.length ;i++) {
			stVO[i] = new StudentVO();
			
			stVO[0].strNum = "001";
			stVO[0].strName = "홍길동";
			stVO[0].strTel = "010-1111-1111";
			
			stVO[0].strNum = "002";
			stVO[0].strName = "이몽룡";
			stVO[0].strTel = "010-222-3333";
			
			stVO[0].strNum = "003";
			stVO[0].strName = "성춘향";
			stVO[0].strTel = "010-333-3333";
			
			// 학생 명부
			System.out.println("==================================");
			System.out.println("학생명부");
			System.out.println("-----------------------------------");
			System.out.println("학번|t이름|t전화번호");
			System.out.println("-----------------------------------");
			for(int i = 0 ; i < stVO.length ;i++) {
				System.out.print(stVO[i]strNum + "|t");
				System.out.print(stVO[i]strName + "|t");
				System.out.print(stVO[i]strTel + "|n");
				
			}
		}

	}

}
