/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// 반복문(while) 실습

// 실행 예)
// 1 부터 100까지 정수의 합 : 5050
// 1 부터 100까지 짝수의 합 : 2550
// 1 부터 100까지 홀수의 합 : 2500

public class Test049{
	public static void main(String[] args){

		
		// 주요 변수 선언 및 초기화
		int a = 1, nSum, nEvenSum, nOddSum;
		nSum = nEvenSum = nOddSum = 0; //-- 이거 대입 연산자임!!
		/*
		int nSum = 0;
		int nEvenSum = 0;
		int nOddSum = 0;
		*/

		while (a <= 100){
			nSum += a;
			if(a % 2 == 0){
				nEvenSum += a;
			} else if(a % 2 == 1) {
				nOddSum += a;
			} else{
				System.out.println("판별 불가 데이터");
				return;
			}
			a++;
		}

		// 결과 출력
		System.out.println("1부터 100까지 정수의 합 : " + nSum);
		System.out.println("1부터 100까지 짝수의 합 : " + nEvenSum);
		System.out.println("1부터 100까지 홀수의 합 : " + nOddSum);
		
	}
}
// 실행 결과
/*
1부터 100까지 정수의 합 : 5050
1부터 100까지 짝수의 합 : 2550
1부터 100까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/