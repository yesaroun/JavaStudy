/*===============================================
    ■■■ 자바의 주요(중요) 클래스 ■■■
===============================================*/

// Calender 클래스
// 답 1461

// ○ 실습 문제
//	  오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//	  확인하여 결과를 출력하는 프로그램을 구현한다.
//	  ※ 현자 날짜를 기준으로 날 수 더하는 연산 메소드 활용
//	  → 

// 실행 예)
// 오늘 날짜 : 2022-2-3 목요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// =========[확인 결과]============
// 200일 후 : xxxx-xx-xx x요일
// ================================

import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test146
{
	public static void main(String[] args) throws IOException
	{
		Calendar calendar = Calendar.getInstance();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int y, m, d, w;
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		int after;

		y = calendar.get(Calendar.YEAR);
		m = calendar.get(Calendar.MONTH)+1;
		d = calendar.get(Calendar.DATE);
		w = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.printf("오늘 날짜 : %d-%d-%d %s요일\n", y, m, d, week[w+1]);

		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		after = Integer.parseInt(br.readLine());

		calendar.add(Calendar.DATE, after);

		y = calendar.get(Calendar.YEAR);
		m = calendar.get(Calendar.MONTH)+1;
		d = calendar.get(Calendar.DATE);
		w = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("=========[확인 결과]============");
		System.out.printf("%d일 후 :  %d-%d-%d %s요일\n",after, y, m, d, week[w+1]);
		System.out.println("================================");

	}
}