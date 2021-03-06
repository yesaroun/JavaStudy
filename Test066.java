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
   ***
  *****
 *******
*********
 *******
  *****
   ***
	*

*/

public class Test066{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			// 5번 반복

			for(int j=i; j<=4; j++){
				System.out.print(" ");
			} // 공백 출력

			for(int k=1; k<=i*2-1; k++){
				System.out.print("*");
			} // * 출력

			System.out.println();
			// 개행
		}


		for(int i=1; i<=4; i++){
			// 4번 반복

			for(int j=1; j<=i; j++){
				System.out.print(" ");
			} // 공백 출력

			for(int k=i*2-1; k<=7; k++){
				System.out.print("*");
			}  // * 출력


			System.out.println();
			// 개행
		}
	}
}