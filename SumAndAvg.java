package Homework5;

import java.util.Scanner;

public class SumAndAvg {
	void SAA(){
		Scanner scData = new Scanner(System.in);
		int count = 0;
		int temp = 0;
		String strData = "";
		while (true){
			try {
				System.out.print("숫자를 입력(Q:종료) >> ");
				strData = scData.next();
				temp += Integer.parseInt(strData);
				count++;
			}catch (NumberFormatException e){
				if("Q".equals(strData)){ System.out.println("합계는" + temp + " 평균은 "+ temp/count); new ExamForWhile().start(); }
				else { System.out.println("입력값을 확인하세요."); }
			}
		}
	}
}
