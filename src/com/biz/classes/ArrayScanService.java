package com.biz.classes;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {
	
	private int[] nums ;
	
	// 생성자 메서드 :
	//     클래스에 포함되는 method 중에
	//     void 등이 없고
	//     method 이름이 클래스 이름과 같은 method
	// 생성자 메서드는
	// 누군가 new ArrayScannerService() 생성자 메서드를
	// 호출할때 자동으로 호출되는 method이다
	
	
	public ArrayScanService(int length) {
		
	    Random rnd = new Random();
	    
		nums = new int[length];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(10) + 1;
			
		}
		
	}

	public void scanArray( ) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0 ~ 10까지 정수>> ");
		String strNum = scanner.nextLine();
		
		int intNum = Integer.valueOf(strNum);
		
		int index;
		for(index = 0; index < nums.length ; index++) {
		}
		
		if(index >= nums.length);
		System.out.println("찾는 값이 없음");
		
		else
		System.out.printf("화면 위치에서 찾음 |n",i);
		
		if(nCount < 1) {
			System.out.println("찾지 못함!!!");
			
		}
		
		for(index = 0; index < nums.length ; i++) {
			System.out.print(nums[i] + ", ");
			
		}
		
		System.out.println();
		
		// scanArray close();
			
			public 
			
		     Scanner scanner = new Scanner(Ssystem.in);
			System,out.print("1~10까지의 정수 >> ")
		}
			
		
		
	}
}
