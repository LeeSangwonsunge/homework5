package Homework5;i

import java.util.Scanner;


public class GuGuDan2 {
	void GGD2(){
		String strData = "";
		Scanner scData = new Scanner(System.in);
		while (true){
			System.out.print("짝수단 : E 홀수단 : O (종료는 : Q)");
			strData = scData.next();
			if("E".equals(strData)){
				for(int i=2; i<=8; i=i+2){
					for(int j=1; j<=9; j++){
						System.out.println(i+"*"+j+"="+(i*j));
					}
				}
			}
			else if("O".equals(strData)){
				for(int i=1; i<=9; i=i+2){
					for(int j=1; j<=9; j++){
						System.out.println(i+"*"+j+"="+(i*j));
					}
				}
			}
			else if("Q".equals(strData)){ new ExamForWhile().start(); }
			else { System.out.println("입력값 확인하세요."); }
		}
	}
}
