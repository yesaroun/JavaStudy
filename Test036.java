/*==========================================
  ■■■ 실행  흐름의 컨트롤(제어문) ■■■
==========================================*/

// if ~ else 문 실습

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if문(if문 중첩),
//    switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우,
//	  특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 사용자로부터 임의의 정수를 입력받아
// 다음과 같은 판별 결과를 출력하는 프로그램을 구현한다.

// 2의 배수 / 3의 배수 / 2와 3의 배수 / 2와 3의 배수 아님

// 실행 예)
// 임의의 정수 입력 : 4
// 4 → 2의 배수

// 임의의 정수 입력 : 9
// 9 → 3의 배수

// 임의의 정수 입력 : 6
// 6 → 2와 3의 배수

// 임의의 정수 입력 : 17
// 17 → 2와 3의 배수 아님

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수 입력 : ");
		int nNum = Integer.parseInt(br.readLine());
		
		String result = "확인불가";

		if ((nNum % 2 == 0) && (nNum % 3 == 0)){
			result = "2와 3의 배수\n";
		} else if(nNum % 2 == 0) {
			result = "2의 배수\n";
		} else if(nNum % 3 == 0) {
			result = "3의 배수\n";
		} else {
			result = "2와 3의 배수 아님\n";
		}

		System.out.printf("%d → %s", nNum, result);

	}
}