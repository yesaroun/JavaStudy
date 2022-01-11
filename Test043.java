/*==========================================
  ■■■ 실행  흐름의 컨트롤(제어문) ■■■
==========================================*/

// switch 문 실습

/*
○ 다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식 및 구조
   switch(수식)
   {
	   case 상수1 : 문장1; [break;]
	   case 상수2 : 문장2; [break;]

	   [default : 문장n+1; [break;]]
	}

	switch문의 수식과 case의 상수는 
	byte, short, int, long 형이어야 한다.(정수 형태만 가능)

	case 문 뒤에 break; 가 없는 형태인 경우
	다음 case 문의 문장을 계속해서(이어서) 수행하게 된다. (→ 기본 모델)
	break;가 존재할 경우
	해당 지점에서 수행을 멈춘 후 switch문을 빠져나간다. (→ 일반 모델)
*/

// 사용자로부터 이름, 국어점수, 영어 점수, 수학점수를 입력 받아
// 다음과 같은 형태로 출력하는 프로그램을 작성한다.
// 등급은 평균 점수를 기준으로 처리한다.

// 90점 ~ 100점 : A        80~89점 : B
// 70~79점 : C			   60~69점 : D
// 60점 미만 : F

// 실행 예)
// 이름 입력 : 홍은혜
// 국어 점수 : 90점
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 홍은헤입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, mat, tot;
		double avg;
		// int avg;
		char grade;

		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3;

		switch((int) avg / 10){
			case 10: case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F';
		}

		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 총점은 %d 이고, 평균은 %.2f 입니다.%n", tot, avg);
		System.out.printf("당신의 등급은 %c 입니다.\n", grade);
		
	}
}

// 실행 결과
/*
이름 입력 : dd
국어점수 입력 : 88
영어점수 입력 : 85
수학점수 입력 : 70
당신의 이름은 dd입니다.
당신의 총점은 243 이고, 평균은 81.00 입니다.
당신의 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/