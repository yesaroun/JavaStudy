/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// 반복문(while) 실습

// 사용자로부터 임의의 정수를 입력 받아
// 입력 받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수
//			 단, 1은 소수 아님.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님

// 임의의 정수 입력 : 11
// 11 → 소수

// 임의 정수 입력 : 967

// 그 안의 수가 나눠 떨어지는지 확인하고 만약 나눠 떨어지지 않는다면 1인지 여부 확인해야함
// while 문으로 줄여가야하나?

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053{
	public static void main(String[] args) throws IOException{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력 : ");
		int n = Integer.parseInt(br.readLine());  //-- 사용자의 입력값을 담아낼 변수
		// String result = "입력 오류";				
		int i = 2;								  //-- 입력값을 대상으로 나눗셈 연산을 수행할 변수
												  //   2부터 시작해서 1씩 증가
												  //   ex) 입력값 27 → n : 2 3 4 5 6 7 8 ... 26

		// 연산 및 처리
		/*---------------내 풀이-----------------------------
		if(n == 1 || n == 2){
			result = "소수가 아님";

		} else{
			while(i < n){
				if(n % i == 0) {
					result = "소수가 아님";
					System.out.printf("%d → %s%n", n, result);
					return;

				} else{
					result = "소수";
				}
				i++;
			}
		}
		*/

		boolean flag = true;				// n은 소수일 것이다!

		while (i < n)
		{
			// n으로 num이 나누어 떨어지는지 확인
			if(n % i == 0){
				// 소수가 아니다
				// result = "소수가 아니다";
				flag = false;
				break;               // 멈춘다. 그리고 빠져나간다.
									 // (break를 감싸는 가장 가까운 반복문)
			}


			i++;
		}

		//결과 출력(출력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)
		if(flag && n != 1){
			System.out.printf("%d → 소수%n", n);

		} else {
			// 최종적으로 n은 소수 아니다
			System.out.printf("%d → 소수가 아니다%n", n);
			
		}
		// System.out.printf("%d → %s%n", n, result);
	}
}

// 실행결과
/*
임의의 정수 입력 : 50
50 → 소수가 아니다
계속하려면 아무 키나 누르십시오 . . .
*/
