package com.biz.classes.model;

public class GSEx_01 {

	private static final GradeScoreVO[][] GradeScoreVO = null;

	public static void main(String[] args) {
		
		GradeScoreVO[] gsVO = GradeScoreVO[10];
		for(int i = 0 ; i < gsVO.length ;i++) 
			gsVO[i] = new GradeScoreVO();
			
			
		gsVO[0].strNum = "001";
		gsVO[0].intKor = 99;
	    gsVO[0].intEng = 88;
	    gsVO[0].intMath = 77;
	    gsVO[0].total(); 
	 // total() 메서드를 호출하면
	    // 과목의 총점을 걔산한 후에
	    // 자신의 total 맴버변수에 값을 저정해 둔다
	    // 성적내역을 출력할때
	    // total 변수의 값을 읽으면
	    // 총점을 표시 할수 있다
	    gsVO[0].average();
	    
	    // average() 메서드를 호출하면
	    // 과목의 평균을 계산한 후에
	    // 자신의 average 맴버변수에 값을 저장해 둔다.
	    // average
	    
	    gsVO[0].strNum = "002";
		gsVO[0].intKor = 80;
	    gsVO[0].intEng = 55;
	    gsVO[0].intMath = 44;
	    gsVO[0].total();
	    gsVO[0].average();
	    
	    gsVO[0].strNum = "003";
		gsVO[0].intKor = 55;
	    gsVO[0].intEng = 33;
	    gsVO[0].intMath = 0;
	    gsVO[0].total();
	    gsVO[0].average();
	    
	    System.out.println("================================");
	    System.out.println("성적 알람표");
	    System.out.println("--------------------------------");
	    System.out.println("학번|t국어|t영어|t수학|t평균|t총점");
	    for(int i = 0 ; i < gsVO.length ;i++) {
	    	System.out.printf(gsVO[i] [i].strNum);
	        System.out.printf("%3d|t", gsVO[i].intKor);
	        System.out.printf("%3d|t", gsVO[i].intEng);
	        System.out.printf("%3d|t", gsVO[i].intMath);
	        System.out.printf("%3d|t", gsVO[i].total);
	        System.out.printf("%5.2f|n", gsVO[i].average);
	        
	        System.out.printf 
	    }
	}

}
