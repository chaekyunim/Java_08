package com.biz.classes;

import com.biz.classes.model.GradeScoreVO;
import com.biz.classes.model.StudentVO;

/*
 * ~~Servic 클래스
 * 서비스 클래스는 데이터를 활용하여
 * 다양한 연산을 수행하는 클래스들을 지칭하는 접미사
 */

public class GradeScoreService {

	/*
	 * gradeScoreVO 객체변수는
	 * GradeScoreService 클래스내의 method에서만
	 * 읽고 쓰기를 하고 있다.
	 * 
	 * 만약
	 * GSEx_03에서 gradeScoreVO 맴버변수를 읽기, 쓰기를
	 * 수행한다면
	 * 다연히 이변수는 public 키워드로 시작을 해야 한다.
	 * 
	 * 그런데 현재 코드상에서
	 * GradeScoreService가 아닌곳에서
	 * gradeScoreVO 맴버변수를 접근하지 않는다
	 * 
	 * 이럴때는
	 * 아예 다른 곳에서  gradeScoreVO 맴버변수를
	 * 참조 접근 하지 못하도록 해도 된다.
	 * 다른 곳에서 참조하지 못하도록 키워드를
	 * private으로 설정을 한다.
	 * 
	 * private :
	 *   public은 누구나 접근 참조 할수 있다는 위미
	 *   private은 현재 클래스내의 메서드에서만
	 *   접근, 참조가 가능하도록 제한하는 키워드이다.
	 *   
	 * 
	 */
	
	public GradeScoreVO[] gradeScoreVO;
	
	public void newVO(int length) {
		
		// length 변수에 담긴 숫자만큼
		// GradeScoreVO 배열을 만들어서
		// gradeScoreVO에 할당한다.
		gradeScoreVO = new GradeScoreVO[length];
		
		
		
   public void makeScore() {
	   Random rnd = new Random();
	   
	   for(int i = 0 ; i < gradeScoreVO.length ; i+) {
		   
		   String strNum = String.format("%03d". i+1);
		   int intKor = rnd.nextInt(50) + 51;
		   int intEng = rnd.nextInt(50) + 51;
		   int intMath = rnd.nextInt(50) + 51;
		   
		   gradeScoreVO[i].strNum =  strNum;
		   gradeScoreVO[i].intEng =  intEng;
		   gradeScoreVO[i].intMath = intMath; 
		   gradeScoreVO[i].intKor = intKor;
		   
		   gradeScoreVO
	   }
   }// makeScore and
   
   public void scoreList();
		
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
		for(int i = 0 ; i < gradeScoreVO.strNum ; i++) {
			System.out.print(gradeScoreVO[i]strNum + "|t");
			System.out.print(gradeScoreVO[i]strName + "|t");
			System.out.print(gradeScoreVO[i]strTel + "|n");
	}
	
}
