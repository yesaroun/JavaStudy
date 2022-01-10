/*==========================================
  ■■■ 실행  흐름의 컨트롤(제어문) ■■■
==========================================*/

// if 문
// if ~ else 문 실습

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 7
// 두 번째 정수 입력 : 70
// 세 번째 정수 입력 : 42

// >> 정렬 결과 : 7 42 70

// 힌트
// 1 첫 번째 정수 vs 두 번째 정수 크기 비교 및 자리 바꿈

// 2 첫 번째 정수 vs 세 번째 정수 크기 비교 및 자리 바꿈

// 3 두 번째 정수 vs 세 번째 정수 크기 비교 및 자리 바꿈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test039{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("첫 번째 정수 입력 : ");
		int nNum1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		int nNum2 = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		int nNum3 = Integer.parseInt(br.readLine());
		
		int nSmall1, nSmall2, nSmall3;


		if(nNum1 >= nNum2 && nNum1 >= nNum3){
			nSmall3 = nNum1;
			if(nNum2 >= nNum3){
				nSmall2 = nNum2;
				nSmall1 = nNum3;
			} 
		} else {
			if(nNum2 >= nNum3){
				nSmall3 = nNum2;
				if(nNum1 >= nNum3){
					nSmall2 = nNum1;
					nSmall1 = nNum3;
				}
			}else{
				nSmall3 = nNum3;
				if(nNum2 >= nNum1){
					nSmall2 = nNum2;
					nSmall1 = nNum1;
				}else{
					nSmall2 = nNum1;
					nSmall1 = nNum2;
				}
			} 
		}
		
		System.out.printf("%d - %d - %d\n", nSmall1, nSmall2, nSmall3);
		
	}
}