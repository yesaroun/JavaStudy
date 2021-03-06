/*===================================
  ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 자바의 기본 입출력 : java.util.Scanner

// ※ java.util.Scanner
//    단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	  디폴트(default)로 사용되는 단락문자는 공백이다.
//	  작성된 다음 토큰은 『next()』 메소드를 사용
//    다른 형태(자료형)의 값으로 변환하 수 있다.



public class Test020{
	public static void main(String[] args) {
		// 주요 변수 선언
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// 연산 및 처리
		// - 사용자에게 안내 메세지 출력
		System.out.print("이름 국어 영어 수학 입력(공백 구분) : ");

		// - 사용자가 입력한 데이터를 각 변수에 한 번에 담아내기
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// - 총점 산출
		tot = kor + eng + mat;


		// 결과 출력
		System.out.println();
		System.out.printf(">> 이름 : %s%n>> 총점 : %d%n", name, tot);
	}
}

//실행 결과
/*
이름 국어 영어 수학 입력(공백 구분) : dd 1 2 3

>> 이름 : dd
>> 총점 : 6
계속하려면 아무 키나 누르십시오 . . .
*/