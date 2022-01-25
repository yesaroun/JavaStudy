/*=======================================
    ���� ����(Sort) �˰��� ����
=======================================*/

// �� ����
//		����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
//		������ ���� �л����� ���� ������ ����� �ο��Ͽ�
//		����� ����ϴ� ���α׷��� �����Ѵ�.
//		��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1, ���� ����) : �̾Ƹ� 90
// �̸� ���� �Է�(2, ���� ����) : ������ 80
// �̸� ���� �Է�(3, ���� ����) : ������ 85
// �̸� ���� �Է�(4, ���� ����) : ������ 75
// �̸� ���� �Է�(5, ���� ����) : ��μ� 95
/*
----------------------
1�� ��μ� 95
2�� �̾Ƹ� 90
3�� ������ 85
4�� ������ 80
5�� ������ 75
----------------------
*/

// Scanner import
import java.util.Scanner;

// Student Ŭ���� ����
class Student
{
	String name;
	// ���ڿ� name�� �̸� ����
	int score;
	// ���� ���� ����
}

public class Test112
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		Student[] studentArr;

		int count = 0;
		// int count�� �ο��� ����
		
		System.out.print("�ο� �� �Է� : ");	
		count = sc.nextInt();

		studentArr = new Student[count+1];
		// �ӽ÷� ������ ������ �����ϱ� ���� �ο������� �ϳ� �� ���� ����
		
		for (int i=0; i<count; i++)
		{
			studentArr[i] = new Student();
			System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ", i+1);

			studentArr[i].name = sc.next();
			studentArr[i].score = sc.nextInt();
		}

		studentArr[count] = new Student();
		// �ӽ÷� ������ ������ ���� ����

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
		// ����

		for (int i=0; i<count; i++)
		{
			System.out.printf("%d�� %s %d\n", i+1, studentArr[i].name, studentArr[i].score);
		}		
	}
}