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
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
*/

/*
  1  2  3  4  5     → i=0      0부터 출발
  5  1  2  3  4     → i=1      1부터 출발
  4  5  1  2  3     → i=2      2부터 출발
  3  4  5  1  2     → i=3      3부터 출발
  2  3  4  5  1     → i=4      4부터 출발
*/

public class Test090{
	public static void main(String[] args){
		
		//------------내 풀이-----------
		/*
		int[][] arr = new int[5][5];

		int n = 0;
		int temp = 0;

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				
				temp = n;
				n++;
				if(n>5){
					n=1;
				}

				arr[i][j] = n;
				
			}
			n=temp;

		}

		// 배열의 배열 전체 요소 출력
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				System.out.printf("%2d", arr[i][j]);
			}

			System.out.println();
		}
		*/

		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		for(int i=0; i<arr.length; i++){
			for(int j=i, n=1; n<=5; n++){
				//System.out.printf(i+"-"+j+"    ");   
				
				arr[i][j] = n;

				j++;

				if(j==5)
					j=0;
			}
		}


		// 전체 요소 출력
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}