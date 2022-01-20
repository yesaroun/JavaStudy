/*============================================
      ■■■ 클래스와 인스턴스 ■■■
============================================*/

// 클래스와 인스턴스 활용

// 학생별 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 클래스 설계는 다음의 가이드라인에 따라 진행할 수 있도록 한다.

// 프로그램을 구성하는 클래스
// 1. Record 클래스
//		- 속성만 존재하는 클래스로 설계할 것~!!

// 2. Sungjuk 클래스
//		- 인원 수를 입력받아, 입력받은 인원수 만큼
//		  이름, 국어점수, 영어점수, 수학점수를 입력받고
//		  총점과 평균을 산출하는 클래스로 설계할 것!!
//		  0 속성 : 인원수, Record 형태의 배열
//		  0 기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력
//
// 3. Test103 클래스
//		- main() 메소드가 존재하는 외부 클래스로 설계할 것

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : 3

// 1번째 학생의 이름 입력 :  김상기
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// 2번째 학생의 이름 입력 : 임소민
// 국어 점수 : 92
// 영어 점수 : 82	
// 수학 점수 : 72

// 3번째 학생의 이름 입력 : 이연주
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62

// 김상기 90 80 70 240 xx.xx 2
// 임소민 92 82 72 xxx xx.xx 1
// 이연주 82 72 62 xxx xx.xx 3

import java.util.Scanner;

class Record{
	String name = null;
	int[] score = new int[3];
	int tot;
	double avg;
	int rank;
}

class Sungjuk{
	int inwon;
	Record[] rec;

	public void set() {
		Scanner sc = new Scanner(System.in);

		do{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 100);

		rec = new Record[inwon];
	}


	public void input(){
		Scanner sc = new Scanner(System.in);

		
		
		for(int i=0; i<inwon; i++){
			rec[i] = new Record();


			System.out.printf("%d번째 학생의 이름 입력 : ", i+1);
			rec[i].name = sc.next();
			System.out.print("국어 점수 : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("수학 점수 : ");
			rec[i].score[2] = sc.nextInt();
		}

		for(int i=0; i<rec.length; i++){
			for(int j=0; j<rec[i].score.length; j++){
				rec[i].tot += rec[i].score[j];
			}
			rec[i].avg = (double) rec[i].tot / rec[i].score.length;
		}		
	}

	

	public void print(){
		for(int i=0; i<inwon; i++){
			System.out.printf("%s %d %d %d %d %.2f", 
				rec[i].name, rec[i].score[0], rec[i].score[1], rec[i].score[2],
				rec[i].tot, rec[i].avg);
			System.out.println();
		}
	}
	
}



public class Test103{
	public static void main(String[] args){
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();

	}
}
