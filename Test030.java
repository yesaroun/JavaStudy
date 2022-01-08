/*===================================
  ■■■ 연산자(Operator) ■■■
======================================*/

// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
// 이 결과를 출력하는 프로그램을 구현한다.
// 단, 입력 데이터는 BufferedReader 의 readLine()을 통해 넘겨받을 수 있도록 한다.
// 또한, 조건 연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : -12
// -12 → 음수

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test030{
	public static void main(String[] args) throws IOException{
		
		// 주요 변수 선언
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int num;
		String strResult;

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		/*
		num 이 0보다 크다 → true      → n은 양수
						  → false     → n이 0보다 작다  → true   →  n은 음수
						  								  → false  →  n은 0

		*/
		/*================내 방식===========
		strResult = (num >= 0) ? ((num == 0) ? "0" : "양수") : "음수";
		==================================*/

		strResult = (n>0) ? ("양수") : ( (n<0) ? ("음수") : ("0") );

		// 최종 결과 출력
		System.out.printf("%d → %s%n", num, strResult);
		
	}
}