/*==========================================
  ■■■ 실행  흐름의 컨트롤(제어문) ■■■
==========================================*/

// if ~ else 문 실습

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if문(if문 중첩),
//    switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우,
//	  특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 사용자로부터 이름, 국어점수, 영어 점수, 수학점수를 입력 받아
// 다음과 같은 형태로 출력하는 프로그램을 작성한다.
// 등급은 평균 점수를 기준으로 처리한다.

// 90점 ~ 100점 : A        80~89점 : B
// 70~79점 : C			   60~69점 : D
// 60점 미만 : F

// 단, BufferedReader 의 readLine() 메소드를 통해 입력받을 수 있도록 하며,
// printf()메소드를 통해 출력할 수 있도록 구현한다.

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



public class Test033{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strName;
		String strGrade;
		int nKor, nEng, nMath;
		int nTotal; 
		double fAve;


		System.out.print("이름 입력 : ");
		strName = br.readLine();

		System.out.print("국어 점수 : ");
		nKor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		nEng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");
		nMath = Integer.parseInt(br.readLine());

		nTotal = nKor + nEng + nMath;
		fAve = nTotal / 3.0;

		// 선생님 풀이법
		/*
		if(fAve >= 90) {
			strGrade = "A";
		} else if(fAve >= 80) {
			strGrade = "B";
		} esle if(fAvae >= 70) {
			strGrade = "C";
		} else if(fAvg >= 60){
			strGrade = "D";
		} else {
			strGrade = "F";
		}

		*/

		switch((int)nAve / 10) {
			case 10:
			case 9:
				strGrade = "A";
				break;
			case 8:
				strGrade = "B";
				break;
			case 7:
				strGrade = "C";
				break;
			case 6:
				strGrade = "D";
				break;
			default:
				strGrade = "F";
				break;		
		}
		
		System.out.println();
		System.out.printf("당신의 이름은 %s입니다.\n", strName);
		System.out.printf("국어 점수는 %s\n", nKor);
		System.out.println("영어 점수는 " + nEng);
		System.out.println("수학 점수는 "+nMath);

		System.out.printf("총점은 %d이고, 평균은 %.2f입니다.", nTotal, nAve);
		System.out.printf("등급은 %s입니다.\n", strGrade);



		
	}
}