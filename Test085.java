/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 기본적 활용

// ○ 과제
//	사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//	입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
//	단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수 : 12
// 데이터 입력(공백 구분) : 74 65 13 91 5 67 33 41 2 50 11 38
// >> 가장 큰 수 → 91
// 계속하려면 아무 키나 누루세요...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Scanner;

public class Test085{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("입력할 데이터의 갯수 : ");
		int count = Integer.parseInt(br.readLine());

		int array = new int[count];
		

		System.out.print("데이터 입력(공백 구분) : ");
		for(int i=0; i<count; i++){
			num = sc.nextInt();
			array[i] = num;
		}

		System.out.println(array[0]);
	}
}