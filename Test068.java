/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// continue 실습

//※ continue 키워드가 지니는 의미
//	(뒷부분 무시하고) + 계속해라

// continue 를 활용하여
// 다음과 같이 출력될 수 있도록 프로그램을 구현한다.

// 실행 예)
/*
1 : 1
3 : 4
5 : 9
 :
7 : 16
 :
99 : 2500
*/ // 홀수들만 누적합을 구한거임

public class Test068{
	public static void main(String[] args){

		int sum = 0;
		

		for(int i=1; i<100; i++){
			if(i%2==0)  // n이 짝수라면
				continue;
				//-- (뒷 부분 무시하고... + ) 계속해라
			
			sum += i;									//-- 뒷부분
			System.out.printf("%d : %d\n", i, sum);		//-- 뒷부분

		}
	}
}