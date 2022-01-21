	/*========================
	 ■■■ 만년달력 ■■■
	========================*/

	//1071 공유 코드
	//1072 선생님 코드

	// 다음가 같은 기능의 프로그램을 구현한다.

	// 실행 예)
	// 『연도』를 입력하세요 : 2022
	// 『월』을 입력하세요	 : 6
	/*
		[ 2020년 6월 ]

		일	월	화	수	목	금	토
		===========================
					1	2	3	4
		5	6	7	8	9	10	11
		12	13	14	5	16	17	18
		19	20	21	22	23	24	25
		26	27	28	29	30
		===========================

	*/
/*
○ 문제 분석
	- 서기 1년 1월 1일 : 월요일
	- 연도가 4의 배수이면서 100의 배수가 아니거나.
	  400의 배수이면 2월은 29일(윤년)
	  나머지 2월은 28일(평년)
	
	- 만약 2022년 6월 달력을 그린다고 가정하면
	  1.1.1 ~ 2022.5.31 까지의 날 수를 구한다.
	  ----------------
	  (1.1.1 ~ 2021.12.31) + (2022.1.1 ~ 2022.5.31)
	  그 날 수에 『+1』 연산을 수행하면... (2022년 6월 1일의 요일 확인)

	  -----------여기까지 수행하면 달력 그릴 준비 끝

	  - 요일 = 전체날수 % 7
		요일 = 0 → 일요일
			   1 → 월요일
			   2 → 화요일
			   		 :
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test1072
{
	public static void main(String[] args) throws IOException
	{	
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언 및 초기화
		//-- 각 달이 담고있는 마지막 날짜(매 월의 최대 날짜)
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 주요 변수 선언
		int nalsu, y, m, w;		//-- 날수, 년, 월, 요일

		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		//-- 입력받은 연도가 1보다 작을 경우 다시 입력받기~!!!

		do
		{
			System.out.print("『월』을 입력하세요   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		//-- 입력받은 월이 1보다 작거나 12보다 크면 다시 입력받기~!!

		//----------------여기까지 수행하면 유효한 연도와 월을 입력한 상태

		// 입력받은 연도에 해당하는 2월의 마지막 날 계산
		if ((y%4==0 && y%100!=0) || y%400==0)		// 윤년이라면
		{
			days[1] = 29;
		}
		// else 구문은
		// 현재 days 배열의 1번째 요소(2월)가 28로 구성되어 있는 상태이기 때문에
		// 생략이 가능한 구문이 된다.

		// 1년 1월 1일 ~ 입력받은 연도의 이전년도 12월 31일까지의 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		// 입력받은 연도(해당연도) 1월 1일 ~ 입력한 월의 이전 월까지의 날 수 누적 연산
		for(int i=0; i<(m-1); i++)
		{
			nalsu += days[i];
		}
		
		// 입력받은 월의 1일을 날 수 누적 연산
		nalsu += 1;		// ++nalsu;

		//-----------------------------------------여기까지 수행하면 모든 날 수에 대한 종합처리 완료

		// 요일 확인
		//-- 입력받은 연의 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = nalsu % 7;
		// w:0 → 일요일
		// w:1 → 월요일

		// 테스트
		//System.out.println(w);
		//--==>>
		/*
		『연도』를 입력하세요 : 2022
		『월』을 입력하세요   : 6
		3
		계속하려면 아무 키나 누르십시오 . . .
		2022년 6월 1일은 수요일이라는 의미
		*/

		//------------------------------------여기까지 수행하면 해당 연도 해당 월1일이 무슨 요일인지 확인 완료

		
		// 출력(달력 그리기)
		System.out.println();	//개행
		System.out.printf("\t[ %d년 %d월 ]\n", y, m);
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("=============================");

		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<=w; i++)
		{
			System.out.print("    ");		// 공백 4칸 발생
		}

		// 테스트
		//System.out.printf("%4d", 1);

		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1]; i++)
		{
			System.out.printf("%4d", i);								//-- 1 2 3 4 5 ... 30
			w++;														//-- 3 4 5 6 7 ... 
			//-- 날짜를 처리하는 만큼 요일도 함께 증가


			// 일요일을 구성하려는 경우... (이번에 출력하고자 하는 날씨가 일요일일 경우)
			if (w%7==0)
			{
				System.out.println();		// 개행
			}
		}
		
		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우(토요일까지 라인 전체 출력)
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이 경우에는 추가 개행을 하지 않도록 처리
		if(w%7!=0)
		{
			System.out.println();	// 마지막 날짜 다 찍은 후 개행
		}
		
		System.out.println("=============================");

	}
}