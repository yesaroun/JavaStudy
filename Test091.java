/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 배열(2차원 배열)    *************

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1   8   9   16  17
  2   7   10  15  18
  3   6   11  14  19
  4   5   12  13  20
*/

//

/*
00 01 02 03 04 
10 11 12 13 14 
20 21 22 23 24 
30 31 32 33 34 

00 10 20 30  31 21 11 01  02 12 22 32  33 23 13 03  04 14 24 34
*/

public class Test091{
	public static void main(String[] args){
		
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];

		int n=0;

		for(int i=0; i<5; i++){        // outer 웅 i → 0 1 2 3 4

			for(int j=0 ; j<4; j++){   // inner 쑝 j → 0 1 2 3
				n++;
				
				if(i%2==0){            // i → 0 2 4
					arr[j][i] = n;

				} else{				   // i → 1 3
					arr[3-j][i] = n;	
				}
			}
		}


/* 실패
		int n = 1;
		int k=0;

		for(int i=0; i<=4; i++){

			if(k==3){
				for(int j=k; j>=0; j--){
					arr[j][i] = n;
					n++;
					k--;
				}
			} else{
				for(int j=k; j<=3; j++){
				arr[j][i] = n;
				n++;
				k++;

				}
			}
			
		}
*/


		// 전체 요소 출력
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}