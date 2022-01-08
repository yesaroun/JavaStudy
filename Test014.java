/*
  ### 자바 기본 프로그래밍 ###
*/

//변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스 (키보드 같은 장치)

// 원의 반지름 입력 : 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014{
	public static void main(String[] args) throws IOException{
		//키보드 장착(생성)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//-------------------------------------
		// 문자 입력을 읽어들이는 장치
		//                                     ---------------------
		//                                     바이트 → 문자 번역기
		//                                                           ----------
		//                                                           바이트 입력값

		
		// 주요 변수 선언
		int r;                                   //-- 반지름
		double PI = 3.141592;                    //-- 원주율 (변수의 상수화)
		double a, b;							 //-- 넓이, 둘레


		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");
		
		//② 사용자가 입력한 값을 받아와 반지름 변수 r에 담아내기
		// r = br.readLine();       //-- BufferedReader 의 readLine() → 문자열 반환
		// r = "80";

		// r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("80");
		// r = 80;

		// Integer.parseInt("80") → 80
		//-- 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
		//   단, 이 때 넘겨받는 문자열 데이터는 숫자모양(NumberFormat)이어야 한다.

		r = Integer.parseInt(br.readLine());
		//-- 사용자가 입력한 값을 BufferedReader(br)의 readLine()
		//   메소드를 활용하여 문자열 형태로 읽어들인 후
		//   그 값을 Integer.pparseInt() 를 통해 숫자형(정수형)으로 변환한 후
		//   정수 형태의 반지름 변수 r에 담아내기

		// ③ 넓이 및 둘레 게산(연산)
		a = r * r * PI;
		b = r * 2 * PI;


		// 결과 출력
		System.out.printf("반지름이 %d인 원의 넓이 : %.2f 둘레 : %.2f%n", r, a, b);


	}
}

// 출력 결과
/*
원의 반지름 입력 : 45
반지름이 45인 원의 넓이 : 6361.72 둘레 : 282.74
계속하려면 아무 키나 누르십시오 . . .
*/