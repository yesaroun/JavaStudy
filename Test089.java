/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
*/

public class Test089{
	public static void main(String[] args){
		

		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		int n;

		for (int i=0; i<arr.length ; i++ )
		{
			n=1+i;

			for (int j=0; j<arr[i].length; j++)
			{
				// 테스트 (확인)
				//System.out.print(" i: " + i + ", j: " + j);

				arr[i][j] = n;
				n++;
			}
			//System.out.println();
		}

		// 배열의 배열 전체 요소 출력
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.printf("%2d", arr[i][j]);
			}

			System.out.println();
		}
		
		// 내 풀이
		/*
		int[][] array = new int[5][5];

		for(int i=0; i<=4; i++){
			for(int j=0; j<=4; j++){
				for(int k=1; k<=i+j+1; k++){
					array[i][j] = k;
				}
			}	
		}

		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.printf("%2d", array[i][j]);
			}

			System.out.println();
		}
		*/
	}
}

// 실행 결과
/*
 1 2 3 4 5
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
계속하려면 아무 키나 누르십시오 . . .
*/