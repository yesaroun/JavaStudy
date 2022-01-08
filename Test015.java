/*
   ### 자바 기본 프로그래밍 ###
*/

// 퀴즈
// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 이 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 3 
// - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 :

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;

public class Test015{
	public static void main(String[] args) throws IOException{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		int base, height;        //-- 밑변과 높이
		double area;			 //-- 넓이          check~!!!
		
		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");

		// ② 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//    변수 underLength 에 담아내기
		base = Integer.parseInt(br.readLine());
		
		// ③ 다시 사용자에게 안내 메세지 출력
		System.out.print("- 삼각형의 높이 입력 : ");

		// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//    변수 height에 담아내기
		height = Integer.parseInt(br.readLine());
		

		// ⑤ 삼각ㅎ형의 넓이 구하는 연산 처리
		//area = base * height / 2;
		//      정수형  정수형 / 정수형 → 정수 기반 연산(즉, 몫을  취하고 나머지는 버림)
		
		//area = (double) (base * height / 2);    //--(x)
		//area = (double) base * height / 2;
		//area = base * (double)height / 2;
		//area = base * height / 2.0;
		area = base * height / 2.0;
		//     정수형  정수형/ 실수형 → 실수 기반 연산
		
		// ※ 실수 자료형이 결과값으로 나오는 과정에서
		//	  실수 기반의 연산이 필요한 상황이다.
		//	  정수형 『2』가 아닌, 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면
		//    이 연산은 실수 기반으로 처리된다.

		
		// 결과 출력
		System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f%n"
			, base, height, area);
		
		
	}
}

//출력값
/*
■ 삼각형의 넓이 구하기 ■
- 삼각형의 밑변 입력 : 3
- 삼각형의 높이 입력 : 5
밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .
*/