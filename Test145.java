/*===============================================
    ■■■ 자바의 주요(중요) 클래스 ■■■
===============================================*/

// Calender 클래스
// 답:1451

/*
○ java.util.Calendar 클래스는
   날짜와 시간을 객체 모델링화 한 클래스로
   연, 월, 일 요일, 시, 분, 초 까지의
   시간과 날짜와 관련된 정보를 제공한다.
   그리고, Calendar 클래스는 추상 클래스이므로 직접 객체를 생성할 수 없으며
   실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
   GregorianCalender 클래스에 정의되어 있다.

   시스템으로부터 현재 시스템 시간 정보를 얻어올 때
   getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
   생성된 Calender 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
   이 객체가 생성되면 갖고 있는 시간 정보들은
   get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.
   
   getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
   돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
   구할 수도 있다.
*/

// ○ 실습 문제
//	  사용자로부터 연, 월을 입력받아
//	  달력을 그려주는(출력하는) 프로그램을 구현한다.
//	  단, 만년달력이 아니라 Calender 클래스를 활용하여 작성할 수 있도록 한다.
//	  『getActualMaximum()』 메소드 활용

// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2022
// 월 입력   : -2
// 월 입력   : 16
// 월 입력   : 7
/*
	[ 2022년 7월 ]

	일	월	화	수	목	금	토
================================
						1	2
	3	4	5	6	7	8	9
	10	11	12	13	14	15	16
	17	18	19	20	21	22	23
	24	25	26	27	28	29	30
	31
================================
*/

import java.util.Scanner;
import java.util.Calendar;

public class Test145
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calendar cd = Calendar.getInstance();

		int y, m;
		int realY, realM, realW;
		
		do
		{
			System.out.print("연도 입력 : ");
			y = sc.nextInt();
		}
		while (y < 1);

		do
		{
			System.out.print("월 입력   : ");
			m = sc.nextInt() - 1;
		}
		while (!(m>=1 && m<=12));
		
		cd.set(y, m, 1);
		
		realY = cd.get(Calendar.YEAR);
		realM = cd.get(Calendar.MONTH);	
		realW = cd.get(Calendar.DAY_OF_WEEK);
		int endDay = cd.getActualMaximum(Calendar.DATE);

		System.out.printf("	[ %d년  %d월 ]\n", realY, realM+1);

		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("================================");
		
		for(int i=1; i<realW; i++){
			System.out.print("    ");
		}

		for(int i=1; i<=endDay; i++){
			System.out.printf("%4d", i);
			realW++;

			if(realW%7==1){
				System.out.println();
			}
		}

		System.out.println();
		System.out.println("================================");




	}
}