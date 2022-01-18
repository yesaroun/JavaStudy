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

// 사용자에게 변수를 입력받기 위해 InputStreamReader, BufferedReader import
import java.io.InputStreamReader;
import java.io.BufferedReader;

// 예외처리를 위해 IOException import
import java.io.IOException;

// 공백 구분으로 데이터를 입력받기 위해 Scanner import
import java.util.Scanner;


public class Test085{
	public static void main(String[] args) throws IOException{


		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Scanner sc = new Scanner(System.in);

		// 입력받은 데이터를 저장할 변수
		int num;

		// 최대값을 구하기 위한 변수 선언
		int max;

		// 입력받을 데이터의 갯수를 받기 위한 출력문
		System.out.print("입력할 데이터의 갯수 : ");

		// 입력할 데이터의 갯수를 count에 저장
		int count = Integer.parseInt(br.readLine());

		// array 선언
		int[] array = new int[count];
		
		
		// 데이터 입력을 위한 출력문
		System.out.print("데이터 입력(공백 구분) : ");

		// for문을 이용해서 입력 받은 데이터를 array에 저장
		for(int i=0; i<count; i++){
			num = sc.nextInt();
			array[i] = num;
		}
		
		// 최대값 초기화
		max = array[0];

		// 입력 받은 데이터 중에 최대값을 max에 저장
		for(int i=0; i<count; i++){
			if(max < array[i]){
				max = array[i];
			}
		}

		// 가장 큰 수 출력
		System.out.printf(">> 가장 큰 수 → %d\n", max);

		

	}
}

// 실행 결과
/*
입력할 데이터의 갯수 : 3
데이터 입력(공백 구분) : 100 2 10
>> 가장 큰수 → 100
계속하려면 아무 키나 누르십시오 . . .
*/