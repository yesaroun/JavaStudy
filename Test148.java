/*===============================================
    ■■■ 자바의 주요(중요) 클래스 ■■■
===============================================*/

// Random 클래스

/*
○ java.util.Random 클래스는
	
	여러 형태의 난수를 발생시켜 제공하는 클래스이다.
	Math 클래스의 정적 메소드인 random() 메소드로
	난수를 제공하는 메소드이지만
	0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
	필요한 여러 형태의 난수를 만들어내기 위해서는
	추가적인 연산을 수행해야 한다.
	그래서 자바는 여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
//  3  5 12 24 31 41
//  1  2  8 36 41 41
//  4  9 11 13 22 30
//  5 10 13 15 27 40
// 22 31 32 33 40 41

import java.util.Random;

class Lotto
{	
	int numArr = num int[5];

	public int randomNum(){
		Random rd = new Random();
		
		return int a = rd.nextInt(45)+1;
	}	
}


public class Test148{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();


		// 기본 5게임
		for(int i=1; i<=5; i++)
		{
			// 로또 게임 수행

			
			// 결과 출력
		}
	}
}