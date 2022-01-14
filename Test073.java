/*===========================================
      ■■■ 클래스와 인스턴스 ■■■
=============================================*/

// ※ CircleTest.java 파일과 세트!!

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest) → CircleTest.java
// BufferedReader 의 readLine()

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3 * 3.141592

// 실행 예)
// 반지름 입력 : ㅇㅇ

// >> 반지름이 ㅇㅇ인 원의
// >> 넓이 : ㅇㅇ
// >> 둘레 : ㅇㅇ

import java.io.IOException;

public class Test073{
	public static void main(String[] args) throws IOException{

		// CircleTest 클래스 기반 인스턴스 생성
		// CircleTest 인스턴스 생성
		// CircleTest 객체 생성
		CircleTest ct = new CircleTest();

		ct.input();
		
		double area = ct.calArea();
		double length = ct.calLength();

		ct.print(area, length);
	}
}

//실행 결과
/*
반지름 입력 : 20

>> 반지름이 20인 원의
>> 넓이 : 1256.636800
>> 둘레 : 125.66368
계속하려면 아무 키나 누르십시오 . . .
*/