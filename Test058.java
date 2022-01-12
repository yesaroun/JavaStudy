/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// 반복문(do~while) 실습

// 사용자로부터 여러 개의 양의 정수를 입력받고,
// 그 합을 게산하여 출력하는 프로그램을 작성한다.
// 단, -1이 입력되는 순간
// 입력을 중지하고 그동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
// 즉, -1을 입력 중지 커맨드로 활용한다.
// do~while 문을 활용하여 문제를 해결할 수 있도록 한다.

// 실행 예)
// 정수1 입력 : 10
// 정수2 입력 : 5
// 정수3 입력 : 8
// 정수4 입력 : 9
// 정수5 입력 : -1

// >> 현재까지 입력된 정수의 합 : ㅇㅇㅇ


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test058{
	public static void main(String[] args) throws IOException{
		
		//-----------내 풀이------------
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nCount = 1;
		int nSum = 0;
		int nNum;

		do{
			System.out.printf("정수%d 입력 : ", nCount);
			nNum = Integer.parseInt(br.readLine());

			nCount++;
			nSum += nNum;

		}while(nNum != -1);
		
		System.out.println(">> 현재까지 입력된 정수의 합 : "+ (nSum + 1));
		*/


		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;			//-- 사용자의 입력값을 담아낼 변수
		int sum = 0;		//-- 누적합을 담아낼 변수
		int n = 1;			//-- 루프 변수로 활용하며 몇 번째 입력값인지를 담아낼 변수


		// 연산 및 처리
		do{
			System.out.printf("%d번째 정수 입력(-1 종료) : ", n);
			num = Integer.parseInt(br.readLine());
			sum += num;			// sum을 num 만큼 증가~~!!

			n++;

		}while(num != -1);		//-- num이 -1이 아닌 경우 (계속해서 반복)
		
		// 테스트(확인)
		// System.out.println("-1 입력 확인");

		//결과 출력
		System.out.printf("\n>> 현재까지 입력된 정수의 합 : %d\n", (sum+1));
	}
}

// 실행 결과
/*
1번째 정수 입력(-1 종료) : 10
2번째 정수 입력(-1 종료) : 20
3번째 정수 입력(-1 종료) : 30
4번째 정수 입력(-1 종료) : 40
5번째 정수 입력(-1 종료) : -1

>> 현재까지 입력된 정수의 합 : 100
계속하려면 아무 키나 누르십시오 . . .
*/