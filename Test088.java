/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  2  3  4  5
  6  7  8  9  10
  11 12 13 14 15
  16 17 18 19 20
  21 22 23 24 25
*/

public class Test088{
	public static void main(String[] args){
		
		//배열의 배열 선언 + 메모리 할당
		int[][] array = new int[5][5];

		// 변수 선언 및 초기화
		int a = 1;
		
		// 배열의 배열을 반복문의 중첩 구문을 활용하여 구조화
		for(int i=0; i<array.length; i++){				// 웅 → outher → 0     1     2     3     4
			for(int j=0; j<array[i].length; j++){       // 쑝 → inner  → 01234/01234/01234/01234/01234 
				
				// 00  01  02  03  04  
				// 10  11  ~~  44
				array[i][j] = a;
				a++;
			}
		}

		//--- 여기까지 배열의 각 방에 값 담아내기 완료~!!!


		// 전체 요소 출력
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array.length; j++)
				System.out.printf("%3d", array[i][j]);
			System.out.println();
		}
	}
}