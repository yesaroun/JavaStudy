/*========================
 ���� ����޷� ����
========================*/

// �� �ڵ� ���� ����!! 2020��? ������ �̻��ϰ� ����
//1071 ���� �ڵ�
//1072 ������ �ڵ�

// ������ ���� ����� ���α׷��� �����Ѵ�.

// ���� ��)
// ���������� �Է��ϼ��� : 2022
// �������� �Է��ϼ���	 : 6
/*
	[ 2020�� 6�� ]

	��	��	ȭ	��	��	��	��
	===========================
				1	2	3	4
	5	6	7	8	9	10	11
	12	13	14	5	16	17	18
	19	20	21	22	23	24	25
	26	27	28	29	30
	===========================

*/

/*
���� ��, ��
���� ���� ��¥

���� �Է�
�� �Է�

���� �迭 ����

���� ��� �����ϰ� ù�� ° ���� ���ǵ� �װŷ� ����
�ι�° �ٺ��ʹ� for���� �̿��ؼ� ���޾� ����ϱ�?

�� �� ���
���� ���
*/

import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{	
		int year, month;
		int yearDay = 0, monthDay = 0, totalDay = 0;
		int startWeek;
		int firstDay = 1;

		int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] week = {0, 1, 2, 3, 4, 5, 6};   // 0�� �Ͽ����̰� 6�� �������!!


		Scanner sc = new Scanner(System.in);

		System.out.print("���������� �Է��ϼ��� : ");
		year = sc.nextInt();

		System.out.print("�������� �Է��ϼ���	 : ");
		month = sc.nextInt();
			
		for(int i=1; i<year; i++)  // ������ ���� �� �� ����
		{
			if((year%4==0 && year%100!=0) || year%400==0)
			{
				yearDay += 366;
			} 
			else
			{
				yearDay += 365;
			}
		}
		
		if((year%4==0 && year%100!=0) || year%400==0) // ������ ��� 2�� �� �� ����
		{
			monthArr[1] = 29;
		}	
		
		for(int i=1; i<month; i++)		// ���� ���� �� �� ����
		{
			monthDay += monthArr[i-1];
		}
			

		// ���
		System.out.printf("    [ %d�� %d�� ]\n\n", year, month);
		String[] name = {"��", "��", "ȭ", "��", "��", "��", "��"};
		for(int i=0; i<name.length; i++)
		{
			System.out.printf("%2s", name[i]);
		}
		System.out.printf("\n=======================\n");
		
			
		startWeek = (yearDay + monthDay +1) % 7; // ���� ����

		for(int i=0; i<week[startWeek]; i++)
		{
			System.out.print("   ");

		}

		
		for(int i=week[startWeek]; i<week.length; i++)
		{
			System.out.printf("%3d", firstDay);
			firstDay++;
		}
		System.out.println();

		int j=0;
		for(int i=firstDay; i<=monthArr[month-1]; i++)
		{
			System.out.printf("%3d", firstDay);
			firstDay++;
			j++;
			if(j%7==0)
			{
				System.out.println();
			}
		}
		System.out.printf("\n=======================\n");		
	}
}