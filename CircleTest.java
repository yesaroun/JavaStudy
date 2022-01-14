/*===========================================
      ■■■ 클래스와 인스턴스 ■■■
=============================================*/

// ※ Test073.java 파일과 세트!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest {
	// 멤버 변수 → 주요 속성(데이터)
	int radius;						// 반지름
	final double PI = 3.141592;		// 원주율 (변수의 상수화)


	// 멤버 메소드 → 주요 기능(동작, 행위)
	// 반지름 입력 기능 → 메소드 정의
	void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("반지름 입력 : ");
		radius = Integer.parseInt(br.readLine());
	}

	// 넓이 계산 기능 → 메소드 정의
	double calArea(){
		double area = radius * radius * PI;

		return area;
	}

	// 둘레 계산 기능 → 메소드 정의
	double calLength(){
		double length = radius * 2 * PI;

		return length;
	}

	// 결과 출력 → 메소드 정의
	void print(double a, double b){
		System.out.printf("\n>> 반지름이 %d인 원의\n", radius);
		System.out.printf(">> 넓이 : %f%n", a);
		System.out.println(">> 둘레 : " + b);
	}
	
}