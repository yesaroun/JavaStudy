/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// 반복문(while) 실습

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// >> 2 ~ 10 까지의 합 : ㅇㅇ

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test054{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
			// 내 풀이!
		/*
		int n1, n2;
		int n3;
		int total = 0;

		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		if(n2 < n1) {
			n1 = n1^n2;
			n2 = n2^n1;
			n1 = n1^n2;
		}

		n3 = n1;

		while(n3 <= n2){
			total += n3;
			n3++;
		}

		System.out.printf(">> %d ~ %d 까지의 합 : %d %n", n1, n2, total);
		*/

		int n;			//-- 루프 변수로 활용할 변수
		int su1, su2;   //-- 첫 번째, 두 번째 사용자 입력값을 담아낼 변수
		int result = 0; //-- 누적합을 담아낼 변수

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());


		// 입력 받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, su1이 su2 보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리
		if(su1 > su2) {
			// 자리 바꿈
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;
		}

		// 반복 연산 수행
		// 반복 연산을 수행하기 전에 
		// 작은 수를 따로 저장하여 루프 변수로 활용한다.
		// (결과 출력 과정에서 입력받은 작은 수가 필요한데...)
		// 그 수를 반복과정에서 사용하게 되면... 원래의 값을 확인할 수 없기 때문...
		n = su1;

		while(n<=su2){
			result += n;
			n++;
		}

		// 결과 출력
		System.out.printf(">> %d ~ %d까지의 합 : %d%n", su1, su2, result);
		
	}
}

// 실행 결과
/*
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 10
>> 10 ~ 20까지의 합 : 165
계속하려면 아무 키나 누르십시오 . . .
*/