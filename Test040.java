/*==========================================
  ■■■ 실행  흐름의 컨트롤(제어문) ■■■
==========================================*/

// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner  를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예)
// 임의의 정수 5개 입력 : 1 2 3 4 5

// >> 짝수의 합은 6이고, 홀수의 합은 9입니다.


// 풀이 구상
/*
스캐너 사용
정수 5개 입력 받기(단, 띄어쓰기로 구분)
if문 활용해서 짝수 홀수 구분
*/


import java.util.Scanner;

public class Test040{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;			//-- 입력 받은 다섯 개의 정수를 담아둘 변수 선언
		int even = 0;				//-- 짝수의 합을 담아낼 변수 선언 및 초기화
		int odd = 0;				//-- 홀수의 합을 담아낼 변수 선언 및 초기화
		

		// 연산 및 처리
		System.out.print("임의의 정수 5개 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();


		if(a % 2 == 0){		// a가 짝수일 때 → even 을 a만큼 증가
			even += a;
		} else {			//	   홀수		 → odd 을 a만큼 증가
			odd += a;
		}

		if(b % 2 == 0){		// b가 짝수일 때 → even 을 b만큼 증가
			even += b;
		} else {			//	   홀수		 → odd 을 b만큼 증가
			odd += b;
		}

		if(c % 2 == 0) {	// c가 짝수일 때 → even 을 c만큼 증가
			even += c;
		} else {			//	   홀수		 → odd 을 c만큼 증가
			odd += c;
		}

		if(d % 2 == 0){		// d가 짝수일 때 → even 을 d만큼 증가
			even += d;
		} else{			//	   홀수		 → odd 을 d만큼 증가
			odd += d;
		}

		if(e % 2 == 0){		// e가 짝수일 때 → even 을 e만큼 증가
			even += e;
		} else {			//	   홀수		 → odd 을 e만큼 증가
			odd += e;
		}
		
		// 결과 출력
		System.out.printf("%n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n"
			, even, odd);
		
	}
}

// 실행 결과
/*
임의의 정수 5개 입력 : 1 2 3 4 5

>> 짝수의 합은 6 이고, 홀수의 합은 9 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/