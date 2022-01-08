/*
 ### 자바의 개요 및 특징 ###
*/

//퀴즈
// 사전에 부여된 반지름 정보를 통해
// 원의 넓이와 둘레를 구하는 프로그램을 구현한다.
// → 반지름 : 10

// 실행 예)
// 넓이 : ****
// 둘레 : ****
// 계속하려면 아무 키나 누르세요...

public class Test012{
	public static void main(String[] args){
		/* ------------내 풀이--------------------------
		//변수  선언
		int radius = 10;
		double pi = 3.141592;
		
		// 넓이, 둘레 변수 선언
		double area, circumference;

		//계산식
		circumference = pi * 2 * (double) radius;
		area = pi * (double) radius * radius;

		// 결과 출력
		System.out.printf("넓이 : %f%n둘레 : %f%n", area, circumference);

		*/

		// ---------------강의 풀이-----------------

		//주요 변수 선언
		int r = 10;                //-- 반지름
		//double pi = 3.141592;      //-- 원주율

		final double PI = 3.141592;      //-- 원주율
		// ※ 『final』 키워드 : 변수의 상수화~!!!
		//final 키워드를 사용한 상수는 대문자를 쓴다
		// ex) final int RAINBOW_COLOR;  //-- 그래서 두글자 이상은 언더라인 사용

		double area, length;             //-- 원의 넓이, 원의 둘레


		// 연산 및 처리
		// ① 넓이 연산
		// 원의 넓이 = 반지름 * 반지름 * 3.141592
		area = r * r * PI;

		// ② 둘레 연산
		// 원의 둘레 = 반지름 * 2 * 3.141592
		length = r * 2 * PI;

		// 결과 출력
		//System.out.println("넓이 : " + area);
		//System.out.println("둘레 : " + length);

		System.out.printf("넓이 : %.2f%n둘레 : %.2f%n", area, length);
		/*넓이 : 314.16
		둘레 : 62.83*/


	}
}

// 실행 결과
/*
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/