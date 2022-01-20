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
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O

*/

public class Test096{
	public static void main(String[] args){
		
		// char타입을 담을 배열 arr 선언
		char[][] arr = new char[5][5];

		// A를 담은 char 타입 변수 선언
		char ch = 'A';

		// for문을 이용해서 arr 배열에 문자 저장
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				if(i%2 != 0){
					arr[i][i-j] = ch;
				} else{
					arr[i][j] = ch;
				}
				ch++;				
			}
		}

		// arr 배열 출력
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%3s", arr[i][j]);
			}
			System.out.println();
		}
	}
}