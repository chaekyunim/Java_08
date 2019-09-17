package com.biz.classes.Arrays;

import com.biz.classes.model.StudentVO;

public class Array_01 {

	public static void main(String[] args) {
		
		String[] str = new String[10];
		//문자열을 저장할 메모리를 10개 준비하라.

		// 배열의 요소를 지정하는 방법
	    // 배열 [인덱스] 형식으로 지정
	    // 인덱스를 "(배열)첨자" 라고 부른다	
		//배열의 요소(0,1,2)에 값을 저장(할당, 대입)하기
		String[] str1 = new String[10];
		str1[0] = "대한민국";
		str1[1] = "우리나라";
		str1[2] = "Republic of Korea";
		
		
		// 배열의 요소 1번째 위치의 값을 읽어서 콘솔에 보이기
		System.out.println(str[1]);
		
		System.out.println(str[10]);
		
		
		//배열의 요소(0,1,2)에 값을 저장(할당, 대입)하기
		int[] intNum = new int[10];
		intNum[0] = 10;
		intNum[1] = 30;
		intNum[3] = 40;
		intNum[9] = 100;
		
		
		// 실수값을 저장할 메모리 10개를 준비하라
		float[] floatNum = new float[10];
		
		/*
		 * str 배열을 10개ㅑ 선언하였으므로
		 * 인덱스는 0~9까지만 사용할수 있따
		 * 그런데, 10번 index의 배열요소를
		 * console에 보이라는 명령을 내리면
		 * ArrayIndexoUtoF...
		 */
		
		
//		stVO[0] = new StudentVO();
//		stVO[0] = new StudentVO();
		
	}

}
