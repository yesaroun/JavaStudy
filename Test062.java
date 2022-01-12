/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// 반복문(for) 실습
// 다중 for문(반복문의 중첩) 을 활용한 구구단 출력 실습


// 실행 예)
/*
[2단]
2 * 1 = 2     3 * 1 = 3
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

[6단]
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
*/

//① 2중첩 * 2
//② 3중첩 * 1

public class Test062{
	public static void main(String[] args){
		
		/*
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 5; j++){
				System.out.printf("%d * %d = %d	", j, i, (j * i));
			}
		System.out.println();
		}
		System.out.println();

		for(int i = 1; i <= 9; i++){
			for(int j = 6; j <= 9; j++){
				System.out.printf("%d * %d = %d	", j, i, (j * i));
			}
		System.out.println();
		}

		System.out.println("----------------------------------------------------------");


		
		for(int k = 1; k<=3; k += 2){
			for(int i = 1; i <= 9; i++) {
				for(int j = k * 2; j < k * 2 + 4; j++){
					System.out.printf("%d * %d = %d	", j, i, (j * i));
				}
				System.out.println();
			}
			System.out.println();
		}
		*/

		// ■■■ Type A ■■■

		// ① Test061과 비교하여
		//	  출력의 방향이 다르기 때문에
		//	  반복문의 제어 흐름도 달라져야 한다.

		//	② 1에 따라..
		//		단과 곱해지는 수의 위치가
		//		달라진 상태에서의 반복문 구성
		/*
		for(int i = 1; i<9; i++){			// 웅 → 곱해지는 수
			for (int j=2; j<=5 ; j++)		// 쑝 → 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (j*i));
			}
			System.out.println();   //개행
		}
		*/

		// ③ 2에서 처리한 결과를
		//	  두 문단으로 반복하는 반복문 구성
		//	  (check!!! 반복문에 (2)의 결과를 삽입)

/*
		for (int h=0; h<=1 ; h++)		//check!!
		{
			for (int i=1; i<=9; i++ )	// 웅 → 곱해지는 수
			{
				for (int j=2; j<=5; j++) // 쑝 → 단
				{
					System.out.printf("%4d * %d = %2d", (j+h), i, (j*i));
				}
				System.out.println();
			}
			System.out.println();
		}
*/
		
		// ④ 같은 구문을
		//		두 문단으로 나누어 처리하는 과정에서
		//		문단에 따라 주어진 환경(h의 값)을 활용하는 방법으로
		//		최종 반복문 3중첨
		/*
		for (int h=0; h<=1 ; h++)		//문단 구성 -> 0 1 -> 두 번 반복
		{
			for(int i = 1; i<=9; i++)	//곱해지는 수 구성 -> 123456789
			{
				for (int j=2; j<=5; j++) // 단 구성 -> 23456789
				{
					system.out.printf("%4d * %d = %2d", h*4+j, i, ((h*4+j)*i))
				}
				System.out.println();
			}
			System.out.println();
		}
		*/

		// ■■■ type B ■■■

		int a, b, c;
		for (a=2; a<=6; a+=4)
		{
			for (b=1; b<=9; b++)
			{
				for (c=a; c<=(a+3); c++)
				{
					System.out.printf("%4d * %d = %2d", c, b, (c*b));
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}