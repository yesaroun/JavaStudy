/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  E   J   O   T   Y 
  D   I   N   S   X 
  C   H   M   R   W 
  B   G   L   Q   V 
  A   F   K   P   U 
*/

public class Test092{
	public static void main(String[] args){
	
		char[][] arr = new char[5][5];
		char charA = 'A';

		for(int i=0; i<arr[0].length; i++){
			for(int j=4; j>=0; j--){
				arr[j][i] = charA++;				
			}
		}

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++)
				System.out.printf("%3s", arr[i][j]);
			System.out.println();
		}
	}
}