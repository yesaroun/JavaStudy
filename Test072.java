/*===========================================
      ■■■ 클래스와 인스턴스 ■■■
=============================================*/

// 직사각형 클래스 설계 실습

/*
직사각형의 넓이와 둘레 계산 → 클래스 표현

클래스의 정체성 → 직사각형
클래스의 속성   → 가로, 세로 (, 넓이, 둘레, 부피, 무게, 재질, 색깔, ........)
클래스의 기능   → 넓이 계산, 둘레 계산, 가로세로 입력, 결과 출력, .......

객체를 구성     → 데이터(속성, 상태) + 기능(동작, 행위)
						↓					↓
클래스 설계     →    변수            +   메소드 


class 직사각형{
	// 데이터(속성, 상태)	→ 변수		(순서 의미 없음)
	int 가로, 세로;

	// 기능(동작, 행위)		→ 메소드	(순서 의미 없음)
	가로세로 입력(){
	}

	둘레 계산(){
	}

	넓이 계산(){
	}

	결과 출력(){
	}
}

*/

import java.util.Scanner;

class Rect			// 직사각형 클래스 설계
{
	// 데이터(속성, 상태)	  → 변수
	int w, h;			    // 가로, 세로

	// 기능(동작, 행위)       → 메소드
	void input(){
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 입력 : ");
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();

	}							// 가로세로 입력()

	int calLength(){
		int result;
		
		result = (w + h)*2;

		return result;

		// return (w+h)*2
	}							// 둘레 계산()


	int calArea(){
		// 주요 변수 선언
		int result;

		// 연산 및 처리 → 선언한 변수들에 값 담아내기
		result = w * h;

		// 최종 결과 반환
		return result;

		// return w * h;

	}							// 넓이 계산()


	void print(int a, int l){
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}							// 결과 출력 -> 넓이와 둘레 전달
}





// ※ 하나의 자바 파일(.java)에 여러 개의 클래스(class)를 설계할 수 있다.
//    하지만, 『public class』는 하나만 올 수 있다.
//    파일을 저장할 때의 이름은
//	  이 『public class』의 이름으로 지정해야 한다.
//    일반적으로는 하나의 파일에 하나의 클래스를 설계한다.
//    또한, 여러 개의 클래스가 설계된 파일을 컴파일하게 되면
//	  내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.    --- 이거 때문에 여러 클래스 생성 가능

//    주석이 엄청 많아도 클래스 파일의 용량은 커지지 않는 것과 비슷


public class Test072{
	public static void main(String[] args){
		
		// Rect 클래스 기반의 인스턴스 생성
		Rect ob = new Rect();

		// 입력 메소드 호출
		ob.input();

		// 넓이 연산 메소드 호출
		int area = ob.calArea();

		// 둘레 연산 메소드 호출
		int length = ob.calLength();

		// 출력 메소드 호출
		ob.print(area, length);

	}
}

// 실행 결과
/*
가로 입력 : 20
세로 입력 : 30
가로 : 20
세로 : 30
넓이 : 600
둘레 : 100
계속하려면 아무 키나 누르십시오 . . .
*/