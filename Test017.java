/*
  ### 자바 기본 프로그래밍 ###
*/

// 자바의 기본 입출력 : System.in.read()

/*
 『System.in.read()』 메소드는 한 문자만 가져온다.
  단, 입력받은  하나의 문자를 문자 그대로 가져오는 것이 아니라
  ASCII Code 값으로 반환한다.
*/

//실행 예)
// 한 문자 입력 : A
// 한 자리 정수 입력 : 8

// 입력한 문자 : A
// 입력한 정수 : 8


import java.io.IOException;

public class Test017{
	public static void main(String[] args) throws IOException{
		
		// 주요 변수 선언
		char ch;
		int num;

		// 추가 변수 선언
		char temp;
		
		// 연산 및 처리
		// 사용자에게 안내 메세지 출력
		System.out.print("문자 하나 입력하세요 : ");     // A
		ch = (char) System.in.read();                    // 65
		
		// 입력 대기열에 남아있는 『\r』과 『\n』을 스킵(건너뛰기)
		System.in.skip(2); // 왜 2개를 스킵하냐면 엔터에는 개행과 왼쪽으로 가는거(찾아보기)두개가 있기 때문
		//-- 매개변수(2)에 의해 두 글자를 읽지 않고 건너뛴다.(버린다.)

		System.out.print("한 자리 정수 입력 : ");
		// num = System.in.read();
		temp = (char) System.in.read();

		// 입력받은 n을 48만큼 감소시켜라
		// num -= 48;


		// 결과 출력
		System.out.println();
		System.out.println("입력한 문자 : " + ch);
		// System.out.println("입력한 정수 : " + num);
		System.out.println("입력한 정수 : " + temp);

	}
}

//실행 결과
/*
문자 하나 입력하세요 : a
한 자리 정수 입력 : 7

입력한 문자 : a
입력한 정수 : 7
계속하려면 아무 키나 누르십시오 . . .
*/