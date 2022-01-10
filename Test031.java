/*===================================
  ■■■ 연산자(Operator) ■■■
======================================*/

// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 문자를 하나 입력받아
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a

// 참고로 차이 +35임

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test031{
	public static void main(String[] args) throws IOException{
		
		/*
		int temp;
		
		System.out.print("한 문자 입력 : ");
		temp = System.in.read();

		//System.out.println("입력 받은 값 확인 : " + temp);
		
		
		// String result = temp >= 65 && temp <= 90 ? "대문자" : "대문자 아님";
		// System.out.println("결과 : " + result);
		

		String result = temp >= 'A' && temp <= 'Z' ? "대문자" : "대문자 아님";
		System.out.println("결과 : " + result);
		*/
		
		
		/*
		ch
		대문자니 ? 소문자로변환 : (소문자니 ? 대문자로변환 : 있는그대로)
		result = 최종결과;
		*/



		String str;
		char ch, result;
		int num;
		

		//InputStreamReader isr = new InputStreamReader(reader);
		//BufferedReader br = new BufferedReader(isr);
	
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		result = (ch >= 'A' && ch <= 'Z') ? (char)(ch+32) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : (char) ch); 

		System.out.println(ch + " → " + result);
		
		
	}
}