/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 기본적 활용

// ○ 과제
//	사용자로부터 임의의 학생 수를 입력받고
//	그만큼의 점수(정수 형태)를 입력받아
//	전체 학생 점수의 합, 평균, 편차를 구하여
//	결과를 출력하는 프로그램을 구현한다.
//	단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누루세요...


// 사용자에게 변수를 입력받기 위해 InputStreamReader, BufferedReader import
import java.io.InputStreamReader;
import java.io.BufferedReader;

// 예외처리를 위해 IOException import
import java.io.IOException;

public class Test086{
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		// 총합을 저장할 변수
		int sum = 0;

		// 평균을 저장할 변수
		double avg;

		// 학생 수 입력을 위한 출력 구문
		System.out.print("학생 수 입력 : ");

		// count에 학생수 저장
		int count = Integer.parseInt(br.readLine());

		// 배열 선언
		int[] array = new int[count];


		// for문을 이용해서 학생의 점수 array에 저장
		for(int i=0; i<count; i++){
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);
			array[i] = Integer.parseInt(br.readLine());
		}
		
		// for문을 이용해서 총합 구함
		for(int i=0; i<count; i++){
			sum += array[i];
		}

		// 평균 구함
		avg = (double) sum/count;

		
		// 출력
		System.out.println("\n>> 합 : " + sum);
		System.out.printf(">> 평균 : %.1f\n", avg);
		System.out.println(">> 편차");
		
		// for문을 이용해서 편차 출력
		for(int i=0; i<count; i++){
			System.out.printf("%d : %.1f\n", array[i], avg - (double) array[i]);
		}


	}
}

// 실행결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 87
2번 학생의 점수 입력 : 90
3번 학생의 점수 입력 : 55
4번 학생의 점수 입력 : 75
5번 학생의 점수 입력 : 86

>> 합 : 393
>> 평균 : 78.6
>> 편차
87 : -8.4
90 : -11.4
55 : 23.6
75 : 3.6
86 : -7.4
계속하려면 아무 키나 누르십시오 . . .
*/