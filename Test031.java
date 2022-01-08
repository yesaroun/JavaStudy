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
		char ch;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("한 문자 입력 : ");
		ch = Integer.readLine();

		System.out.println(ch);
		
	}
}