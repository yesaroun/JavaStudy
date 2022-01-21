/*============================================
      ■■■ 클래스와 인스턴스 ■■■
============================================*/

// 클래스와 인스턴스 활용

// 1 ~ 3 사이의 난수를 발생시켜서
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위 2:바위 3:보 중 입력(1~3) : 4
// 1:가위 2:바위 3:보 중 입력(1~3) : -2
// 1:가위 2:바위 3:보 중 입력(1~3) : 2

// - 유저   : 바위
// - 컴퓨터 : 보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!

/* 구성
rpsgame 클래스
유저 가위바위보 저장 변수
컴퓨터 저장할 변수 선언	

컴퓨터의 난수 출력 메소드

유저와 컴퓨터 간에 비교할 메소드

출력 메소드

*/

// 참고 Test097에 난수 있다

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private int usInt;
	private int comInt;
	int win;
	
	// 컴퓨터의 가위바위보
	private void comRandom()
	{
		Random rd = new Random();
		comInt = rd.nextInt(3) + 1;		// 0 1 2 → (+1) → 1 2 3 
	}
	
	// 유저가 가위바위보
	public void userInput()
	{
		// 유저가 가위바위보 하기 전에... 컴퓨터(주최측) 먼저 가위바위보
		comRandom();

		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:가위 2:바위 3:보 중 입력(1~3) : ");
			usInt = sc.nextInt();
		}
		while (usInt < 1 || usInt > 3);	
	}
	
	// 중간 결과 출력
	public void anser()
	{
		if(usInt == comInt)
		{
			win = 1;			// 무승부
		} 
		else if(usInt == 2 || comInt == 2) 
		{
			if(usInt > comInt)
			{
				win = 2;		// user 승리
			}
			else
			{
				win = 3;		// computer 승리
			}			
		} 
		else 
		{
			if(usInt > comInt)
			{
				win = 3;		// computer 승리
			} 
			else
			{
				win = 2;		// user 승리	
			}
		}
		/* 이런 형식도 가능
		String result = "무승부 상황입니다~!!!";
		
		//(유저==가위 && 컴 == 보) || (유저==바위 && 컴==가위) || (유저==보 && 컴==바위)
		if((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
		{
			result = "당신이 승리했습니다~!!";	
		}
		// (유저==가위 && 컴==바위) || (유저==바위 && 컴==보) || (유저==보 && 컴==가위)
		else if((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
		{
			result = "컴퓨터가 승리했습니다~!!!";
		}

		return result;
		*/
	}
	
	// 결과 출력
	public void print()
	{	
		String[] rps = {"가위", "바위", "보"};
		String[] ans = {"무승부입니다", "유저가 이겼습니다", "컴퓨터가 이겼습니다"};

		System.out.println();

		System.out.printf("- 유저   : %s\n", rps[usInt-1]);
		System.out.printf("- 컴퓨터 : %s\n", rps[comInt-1]);
		
		System.out.println();

		System.out.printf("%s\n", ans[win-1]);
	}
}

// main() 메소드를 포함하고 있는 
public class Test104
{
	public static void main(String[] args)
	{
		RpsGame rg = new RpsGame();

		rg.userInput();
		rg.anser();
		rg.print();
	}
}