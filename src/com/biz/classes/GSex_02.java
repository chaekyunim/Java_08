package com.biz.classes;

public class GSex_02 {

	private static final GradeScoreVO[][] GradeScoreVO = null;

	public static void main(String[] args) {
		
		/*
		 * Random 클래스
		 * 임의 범위에 잇는 숫자를 추출해서
		 * 다양값을 만들수 있는 클래스 도구
		 */
								
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			
			// 임의 정수를 생성하는 코드
			// Random.nextInt(10)
			// 0부터 9까지의 임의 난수를 발생
			
			// Random.nextInt(10) + 1
			// 1부터 10까지의 난수 발생
			
			// Random.nextInt(50) + 50;
			int n = rnd.nextInt(10) +1;
			
			
			
			GradeScoreVO[] gsVO = GradeScoreVO[10];
			for(int i = 0 ; i1 < gsVO.length; i++) {
				int intKor = rnd.nextInt(50) + 51;
				int intEng = rnd.nextInt(50) + 51;
				int intMath = rnd.nextInt(50) + 51;
				
				gsVO[i].strNum = String.format("%03d", i+1) + "";
				
				
				gsVO[i].intKor = intKor;
				gsVO[i].intEng = intEng;
			    gsVO[i].intMath = intMath;
			    
			    gsVO[0].total();
			    gsVO[0].average();
			    	
			    System.out.println();
						
			}
			
			
			
		}

	}

}
