/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// 반복문(for) 실습
// 다중 for문(반복문의 중첩) 을 활용한 구구단 출력 실습

// ○ 과제
//		다음과 같은 내용이 출력될 수 있도록
//		반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

// 실행 예)
/*
	*
   **
  ***
 ****
*****
*/

public class Test063{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=i+4; j>=0; j--){
				System.out.print(" ");
			
			}for(int k=i; k<=5; k++){
				System.out.print("*");
			}

			System.out.println();
		}
		
	}
}