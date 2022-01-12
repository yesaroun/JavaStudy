/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// 반복문(while) 실습

// ○ 과제
//		사용자로부터 임의의 정수를 입력 받아
//		1부터 입력 받은 그 정수까지의
//		전체 합과, 짝수의 합과, 홀수의 합을
//		각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 280
// >> 1~280까지 정수의 합 : ㅇㅇㅇ
// >> 1~280까지 짝수의 합 : ㅇㅇㅇ
// >> 1~280까지 홀수의 합 : ㅇㅇㅇ

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test055{
	public static void main(String[] args) throws IOException{
		
		// 주요 변수 선언 및 초기화
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		

		int n;
		//-- 사용자의 입력값을 정수 형태로 담아낼 변수

		int i = 1;
		//-- while문에서 사용될 변수

		int sum = 0;
		//-- 정수의 누적합을 담아낼 변수

		int even = 0;
		//-- 짝수의 누적합을 담아낼 변수

		int odd = 0;
		//-- 홀수의 누적합을 담아낼 변수


		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		// 사용자의 입력값을 정수 형태로 담아냄


		while(i <= n){
			// 입력한 정수값까지 while문 반복

			sum += i;
			// 1부터 입력한 정수값까지 정수 누적합
			
			if(i % 2 == 0){
				even += i;
				// 짝수의 경우 even변수에 누적합

			} else {
				odd += i;
				// 홀수의 경우 odd 변수에 누적합
			}

			i++;
		}
		
		// 결과 출력
		System.out.printf(">> 1 ~ %d까지의 정수의 합 : %d\n", n, sum);
		System.out.printf(">> 1 ~ %d까지의 짝수의 합 : %d\n", n, even);
		System.out.printf(">> 1 ~ %d까지의 홀수의 합 : %d\n", n, odd);
	}
}

// 실행 결과

/*
임의의 정수 입력 : 280
>> 1 ~ 280까지의 정수의 합 : 39340
>> 1 ~ 280까지의 짝수의 합 : 19740
>> 1 ~ 280까지의 홀수의 합 : 19600
계속하려면 아무 키나 누르십시오 . . .
*/