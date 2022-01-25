/*=======================================
    ■■■ 정렬(Sort) 알고리즘 ■■■
=======================================*/

// ○ 과제
//		사용자로부터 여러 학생의 성적 데이터를 입력받아
//		점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//		결과를 출력하는 프로그램을 구현한다.
//		단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 이아린 90
// 이름 점수 입력(2, 공백 구분) : 박현수 80
// 이름 점수 입력(3, 공백 구분) : 이지연 85
// 이름 점수 입력(4, 공백 구분) : 서민지 75
// 이름 점수 입력(5, 공백 구분) : 김민성 95
/*
----------------------
1등 김민성 95
2등 이아린 90
3등 이지연 85
4등 박현수 80
5등 서민지 75
----------------------
*/

// Scanner import
import java.util.Scanner;

// Student 클래스 생성
class Student
{
	String name;
	// 문자열 name에 이름 저장
	int score;
	// 점수 저장 변수
}

public class Test112
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		Student[] studentArr;

		int count = 0;
		// int count에 인원수 저장
		
		System.out.print("인원 수 입력 : ");	
		count = sc.nextInt();

		studentArr = new Student[count+1];
		// 임시로 저장할 변수를 생성하기 위해 인원수보다 하나 더 많이 생성
		
		for (int i=0; i<count; i++)
		{
			studentArr[i] = new Student();
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ", i+1);

			studentArr[i].name = sc.next();
			studentArr[i].score = sc.nextInt();
		}

		studentArr[count] = new Student();
		// 임시로 내용을 저장할 변수 선언

		for(int i=0; i<count-1; i++)
		{
			for(int j=i; j<count; j++)
			{
				if(studentArr[i].score<studentArr[j].score)
				{
					studentArr[count].name = studentArr[i].name;
					studentArr[count].score = studentArr[i].score;
					
					studentArr[i].name = studentArr[j].name;
					studentArr[i].score = studentArr[j].score;

					studentArr[j].name = studentArr[count].name;
					studentArr[j].score = studentArr[count].score;
				}
			}
		}
		// 정렬

		for (int i=0; i<count; i++)
		{
			System.out.printf("%d등 %s %d\n", i+1, studentArr[i].name, studentArr[i].score);
		}		
	}
}