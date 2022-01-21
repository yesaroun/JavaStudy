/*========================
 ■■■ 만년달력 ■■■
========================*/

// 이 코드 문제 있음!! 2020년? 이전은 이상하게 나옴
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
변수 년, 월
변수 시작 날짜

연도 입력
월 입력

요일 배열 저장

요일 계산 정의하고 첫번 째 줄은 정의된 그거로 가고
두번째 줄부터는 for문을 이용해서 연달아 출력하기?

년 월 출력
요일 출력
*/

import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{	
		int year, month;
		int yearDay = 0, monthDay = 0, totalDay = 0;
		int startWeek;
		int firstDay = 1;

		int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] week = {0, 1, 2, 3, 4, 5, 6};   // 0이 일요일이고 6이 토요일임!!


		Scanner sc = new Scanner(System.in);

		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();

		System.out.print("『월』을 입력하세요	 : ");
		month = sc.nextInt();
			
		for(int i=1; i<year; i++)  // 연도에 따른 일 수 총합
		{
			if((year%4==0 && year%100!=0) || year%400==0)
			{
				yearDay += 366;
			} 
			else
			{
				yearDay += 365;
			}
		}
		
		if((year%4==0 && year%100!=0) || year%400==0) // 윤년의 경우 2월 일 수 변경
		{
			monthArr[1] = 29;
		}	
		
		for(int i=1; i<month; i++)		// 월에 따른 일 수 총합
		{
			monthDay += monthArr[i-1];
		}
			

		// 출력
		System.out.printf("    [ %d년 %d월 ]\n\n", year, month);
		String[] name = {"일", "월", "화", "수", "목", "금", "토"};
		for(int i=0; i<name.length; i++)
		{
			System.out.printf("%2s", name[i]);
		}
		System.out.printf("\n=======================\n");
		
			
		startWeek = (yearDay + monthDay +1) % 7; // 시작 요일

		for(int i=0; i<week[startWeek]; i++)
		{
			System.out.print("   ");

		}

		
		for(int i=week[startWeek]; i<week.length; i++)
		{
			System.out.printf("%3d", firstDay);
			firstDay++;
		}
		System.out.println();

		int j=0;
		for(int i=firstDay; i<=monthArr[month-1]; i++)
		{
			System.out.printf("%3d", firstDay);
			firstDay++;
			j++;
			if(j%7==0)
			{
				System.out.println();
			}
		}
		System.out.printf("\n=======================\n");		
	}
}