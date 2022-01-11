/*==========================================
  ■■■ 실행  흐름의 컨트롤(제어문) ■■■
==========================================*/

// if ~ else


// 과제
// 사용자로부터 임의의 문자를 하나 입력받아
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 한 문자 입력 : B
// B → b
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 한 문자 입력 : 7
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...


// 참고로 차이 +32


// IOException import 구문
import java.io.IOException;

public class Test042{
	public static void main(String[] args) throws IOException{
		
		// char 타입 cNum1 변수 선언
		char cNum1;

		// int 타입 nNum2 변수 선언
		int nNum2;
		

		//  문자를 입력 받을 구문 출력
		System.out.print("한 문자 입력 : ");

		// 입력 받은 문자 cNum1에 저장
		cNum1 = (char) System.in.read();

		// if문을 이용해 소문자 찾기
		if(cNum1 >= 97 && cNum1 <= 122){

			// 소문자의 경우 nNum2에 대문자 값 대입하기
			nNum2 = (int) cNum1 - 32;

			// else if문을 이용해 대문자 찾기
		} else if(cNum1 >= 65 && cNum1 <= 90){

			// 대문자의 경우 nNum2에 소문자 값 대입하기
			nNum2 = (int) cNum1 + 32;

			// 알파벳이 아닌 경우 nNum2에 0 저장
		} else {
			nNum2 = 0;
		} 

		// nNum2가 0이 아닌 경우 즉. 알파벳인 경우
		if(nNum2 != 0){

			// 아래와 같이 출력
			System.out.printf("%c → %c\n",cNum1 ,(char)nNum2);

			// nNum2가 0인 경우 즉, 알파벳이 아닌 경우
		} else{

			// ">> 입력 오류~!!!" 출력
			System.out.println(">> 입력 오류~!!!");
		}
		
	}
}