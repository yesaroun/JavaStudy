/*====================================
   ■■■메소드의 재귀 호출 ■■■
======================================*/


public class InfRecul{
	public static void main(String[] args){
		showHi(10);
	}

	// 코드 내에서 2군데 위치 바꾸기

	public static void showHi(int cnt){
		System.out.println("Hi~ ");
		if(cnt==1)
			return;
		showHi(--cnt);		

		// 증감 연산자 위치가 바뀌고
		// if문이 먼저 와야한다
	}
}