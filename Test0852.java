//배열의 기본적 활용
//과제
//사용자로부터 임의의 정수를 임의의 학생 수를 입력받고
//그만큼의 점수(정수 형태)를 입력받아
//전체 학생 점수의 합, 평균, 편차를 구하여
//결과를 배출하는 프로그램을 구현한다
//단, 배열을 활용하여 처리할 수 있도록 한다.

//실행 예)
//학생 수 입력 : 5
//1번 학생의 점수 입력 : 90
//2번 학생의 점수 입력 : 82
//			:
//>> 합 :
//>> 평균 :
//>> 편차
//90 : -16.0
//82 : -8.0
//64 : 10.0
//   :
//계속 하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test0852
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//변수 입력
		int num=0;
		int ave=0; //누적합
		double dev=0;
		//int score [];

		System.out.print("학생 수 입력 : ");
		
		num = sc.nextInt();
		
		//System.out.print("학생 수 : " + num);

		//받은 점수를 토대로 배열을 만든다.

		//score = new int[num]; //스코어방이라고 이름 짓고, 넘방만큼 커지겠다.

		int score [] = new int[num];
		//이렇게 진행할시 마지막 줄 System.out.printf("%d : %.2f%n",score[i],dev); 에서 런타임 에러가 뜬다.

		for (int i=0;i<score.length;i++) //점수 입력을 반복시킨다.
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1); //0번이 아니라 1번부터 시작하는 방법 찾기 : +1하면 됨
				score[i] = sc.nextInt();
		}

		for (int i=0;i<score.length;i++) //누적합을 구하라
		{
			ave+=score[i];
		}

		System.out.print("\n학생들의 합 : " + ave);

		System.out.print("\n학생들의 평균 : " + ave/num);

		System.out.print("\n학생들의 편차 : \n");  // 수정

		//편차는 평균-원점수

		for (int i=0;i<score.length;i++) 
		{
			dev=(double)ave/num-score[i]; // 수정
			System.out.printf("%d : %.2f%n",score[i],dev); 
		}
	}
}

