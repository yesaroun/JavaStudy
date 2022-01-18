/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1   2   3   4  10
  5   6   7   8  26
  9  10  11  12  42
 13  14  15  16  58
 28  32  36  40 136

*/

public class Test093{
	public static void main(String[] args){
		

		/*
		int[][] array = new int[5][5];
		int n = 1;
		

		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				if(j == array[i].length - 1){
					for(int k=0; k<array.length-1; k++){
						array[i][j] += array[i][k];
					}
				} else if(i == array.length - 1){
					for(int k=0; k<array.length-1; k++){
						array[i][j] += array[k][j];
					}
				} else{
					array[i][j] = n++;
				}		
			}
		}
		


		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++)
				System.out.printf("%4d", array[i][j]);
			System.out.println();
		}
		*/

		int[][] arr = new int[5][5];
		int n = 0;
		


		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr[i].length-1; j++){
				n++;
				arr[i][j] = n;

				arr[arr.length-1][j] += arr[i][j];
				arr[i][arr[i].length-1] += arr[i][j];
				arr[arr.length-1][arr[i].length-1] += arr[i][j];
			}
		}


		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++)
				System.out.printf("%4d", arr[i][j]);
			System.out.println();
		}
	}
}