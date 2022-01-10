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

// ○ 정수를 입력받아 홀수/짝수 판별하는 프로그램을 구현한다.
//	  단, 단일 if 구문을 사용한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("정수를 입력하세요 : ");
		int nNum = Integer.parseInt(br.readLine());
		
		String strResult;
		/*
		if (nNum % 2 == 0){ 
			strResult = "짝수";
		} else{
			strResult = "홀수";
		}
		*/
		if (nNum % 2 == 0)
		{ strResult = "짝수";
		}

		if (nNum % 2 == 1)
		{ strResult = "홀수";
		}

		System.out.printf("정수 %d는 %s입니다.\n", nNum, strResult);

	}
}