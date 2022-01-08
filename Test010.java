/*
 ### 자바의 개요 및 특징 ###
*/

// 변수와 자료형
// 변수와 자료형 실습 및 테스트 : char


public class Test010{
	public static void main(String[] args){
		// 주요 변수 선언
		char ch1, ch2, ch3;
		int a;
	

		// 연산 및 처리
		ch1 = 'A';
		ch2 = '\n';
		ch3 = '대';
		//a = ch1;
		a = (int) ch1;       

		// 결과 출력
		System.out.println("ch1 : " + ch1); 
		//--==>> ch1 : A
		System.out.println("ch2 : " + ch2);
		//--==>>  ch2 :
		System.out.println("ch3 : " + ch3);
		//--==>> ch3 : 대
		

		System.out.println("a : " + a);
		//--==>>a : 65

	}
}

//실행 결과
/*
ch1 : A
ch2 :

ch3 : 대
a : 65
계속하려면 아무 키나 누르십시오 . . .
*/