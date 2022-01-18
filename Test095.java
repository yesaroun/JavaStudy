/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 배열(2차원 배열)

// 과제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  A   
  B  C
  D  E  F
  G  H  I  J
  K  L  M  O  P

*/

public class Test095{
	public static void main(String[] args){
		
		char[][] arr;
		char ch = 'A';

		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				arr = new char[i][j];
				arr[i][j] = ch;
			}
		}

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%3s", arr[i][j]);
			}
		}
	}
}