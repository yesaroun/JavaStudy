/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// 반복문(for) 실습
// 다중 for문(반복문의 중첩) 을 활용한 구구단 출력 실습

// 실행 예)
/*
[2단]
2 * 1 = 2
 :

[3단]
 :
9 * 9 = 81
*/

public class Test061{
	public static void main(String[] args){
		// 웅~ 웅~
		for(int a = 2; a <= 9; a++){			// 단 처리
			System.out.printf("[%d단]\n", a);

			// 쑝쑝쑝~
			for(int b = 1; b <= 9; b++){		// 곱해지는 수 처리
				System.out.printf("%d * %d = %d\n", a, b, (a * b));
			}
			System.out.println();
		}
	}
}