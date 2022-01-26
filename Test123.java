/*=================================
    ■■■ 클래스 고급 ■■■
=================================*/

// 인터페이스(Interface)

// ○ 실습 문제
//	성적 처리 프로그램을 구현한다.
//	단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2280946 홍은혜
// 국어 영어 수학 점수 입력	  (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2290847 최문저
// 국어 영어 수학 점수 입력	  (공백 구분) : 85 70 65

// 2280946 홍은혜	90 100  85	xxx		xx
//					수  수  우
// 2290847 최문저	85  70  65	xxx		xx
//					우	미	양

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// 속성만 존재하는 클래스 → 자료형 활용
class Record
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}


// 인터페이스
interface Sungjuk
{
	public void set() throws IOException;				//-- 인원 세팅
	public void input() throws IOException;		//-- 데이터 입력
	public void print();		//-- 결과 출력
}

// 문제 해결 과정에서 설계해야할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;
	
	// 내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		switch(score/10)
		{
			case 10:
			case 9:	return "수";
			case 8: return "우";
			case 7: return "미";
			case 6: return "양";
			default: return "가";
		}
	}

	@Override
	public void set() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = Integer.parseInt(br.readLine());
														// 정수가 아닐 경우 예외 처리 추가하기*
		}
		while (inwon<1 || inwon>10);
	}

	@Override
	public void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		rec = new Record[inwon];

		for(int i=0; i<inwon; i++)
		{

			rec[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);	
			String temp = br.readLine();

			String[] tempArr = temp.split("\\s");			// 이름 학번 임시저장할 배열 생성
		
			rec[i].hak = tempArr[0];
			rec[i].name = tempArr[1];
			

			System.out.print("국어 영어 수학 점수 입력	  (공백 구분) : ");	
			String tempScore = br.readLine();

			String[] tempScoreArr = tempScore.split("\\s");
			rec[i].kor = Integer.parseInt(tempScoreArr[0]);
			rec[i].eng = Integer.parseInt(tempScoreArr[1]);
			rec[i].mat = Integer.parseInt(tempScoreArr[2]);

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3;
			
		}		
	}

	@Override
	public void print()
	{
		for(int i=0; i<inwon; i++)
		{
			System.out.printf("%7s%5s%4d%4d%4d%5d%5d\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%15s%3s%3s\n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}
	}
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test123
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk ob;

		// 문제 해결 과정에서 작성해야 할 ob 생성
		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
	}
}