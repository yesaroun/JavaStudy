/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 기본적 활용
// 배열의 선언과 초기화

// 『char』 자료형의 배열을 만들어
// 그 배열의 각 방에 알파벳 대문자를 채우고
// 채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
// 단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리한다.

// 실행 예)
// A B C D ... W X Y Z

public class Test083{
	public static void main(String[] args){
					
		/*
		int num = (int) 'A';
	
		char[] a = new char['Z' - 'A' + 1];

		for(int i=0; i<(int) ('Z' - 'A') +1 ; i++){
			a[i] = (char)num;
			num++;
		}

		for(int i=0; i<(int) ('Z' - 'A') +1 ; i++){
			System.out.print(a[i] + " ");
			num++;
		}

		System.out.println();

		*/

		char[] arr3 = new char[26];
		for(int i=0, ch=65; i<arr3.length; i++, ch++){  
			arr3[i] = (char)ch;
		}

		for(int i = 0; i<arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}
		
	}
}