/*============================================
      ■■■ 클래스와 인스턴스 ■■■
============================================*/

// 클래스 설계
// 배열 활용
// 접근제어지시자와 정보은닉

// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calendar)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로 WeekDay클래스 설계를 통해
// Test101 클래스 main()메소드가 정상적으로 프로그램 실행될 수 있도록 한다.
// 4의 배수이면서 100의 배수가 아니거나 400의 배수가 윤년 찾아보기


// ※ 1년 1월 1일 → "월요일"

// 실행 예)
// 년 월 일 입력(공백 구분) : 2022 1 19
// 2022년 1월 19일 → 수요일

// 년 월 일 입력(공백 구분) : 2000 5 4
// 2000년 5월 4일 → 목요일

/*
1 입력받는 메소드 0

2 요일을 리스트로 정리 0

3 년도를 다루는 메소드(윤년 추가해서) 이거로 일 수 계산  Test032

4 월을 계산해서 일 수 계산 (윤년 주의) + 월별 날짜를 추가?

5 일을 추가
*/

// --------------------------내 풀이--------- 답 : Test1011

import java.util.Scanner;

class WeekDay{

	Scanner sc = new Scanner(System.in);

	private int year = 1;
	private int month = 1;
	private int day = 1;
	private int total = 0;
	private int yearTotal = 0; // 년도의 총합 일 수 저장
	private int monthTotal = 0; // 월의 총합 일 수 저장
	private String[] week = {"월", "화", "수", "목", "금", "토", "일"};
	String an;

	
	
	void input(){
		System.out.print("년 월 일 입력(공백 구분) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}

	void yearCal(){
		for(int i=1; i<year; i++){  // 전 해 년도의 day 총합
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
				yearTotal += 366;
			} else {
				yearTotal += 365;
			}
		}
	}

	void monthCal(){
		int yearInfo;

		int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			yearInfo = 366; // 윤년 정보 저장
		} else {
			yearInfo = 365; // 평년 정보 저장
		}

		if(yearInfo == 366){
			monthArr[2] = 29; // 윤년
		}

		if(month == 1){
			monthTotal = 0;
		} else {
			for(int i=0; i<month - 1; i++){
				monthTotal += monthArr[i];
			}
		}
	}

	int totalCal(){
		int total = day + monthTotal + yearTotal;
		return total;
	}

	void weekCal(int total){
		int weekDay = total % 7;
		an = week[weekDay - 1];
		
	}

	void output(){
		System.out.printf("%d년 %d월 %d일 → %s요일\n", year, month, day, an);
	}


}

public class Test101{
	public static void main(String[] args){
		WeekDay wd1 = new WeekDay();

		wd1.input();
		wd1.yearCal();
		wd1.monthCal();
		int total = wd1.totalCal();
		wd1.weekCal(total);
		wd1.output();
	}
}