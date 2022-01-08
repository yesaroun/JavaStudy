/*===================================
  ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 자바의 기본 입출력 : java.util.Scanner

// ※ java.util.Scanner
//    단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	  디폴트(default)로 사용되는 단락문자는 공백이다.
//	  작성된 다음 토큰은 『next()』 메소드를 사용
//    다른 형태(자료형)의 값으로 변환하 수 있다.

import java.util.Scanner;

public class Test019{
	public static void main(String[] args) // thorows IOException 필요 없다
	{
		// Scanner 클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		

		// 주요 변수 선언
		String name;
		int kor, eng, mat;

		// 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();

		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();



		// 결과 출력
		System.out.println();
		System.out.printf("이름 : %s%n총점 : %d%n", name, kor + eng+ mat);
	}
}