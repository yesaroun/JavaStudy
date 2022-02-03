/*===============================================
    ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===============================================*/

// Calender Ŭ����
// ��:1451

/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, �� ����, ��, ��, �� ������
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻� Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GregorianCalender Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calender Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� ���� �ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.
   
   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
   ���� ���� �ִ�.
*/

// �� �ǽ� ����
//	  ����ڷκ��� ��, ���� �Է¹޾�
//	  �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//	  ��, ����޷��� �ƴ϶� Calender Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
//	  ��getActualMaximum()�� �޼ҵ� Ȱ��

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2022
// �� �Է�   : -2
// �� �Է�   : 16
// �� �Է�   : 7
/*
	[ 2022�� 7�� ]

	��	��	ȭ	��	��	��	��
================================
						1	2
	3	4	5	6	7	8	9
	10	11	12	13	14	15	16
	17	18	19	20	21	22	23
	24	25	26	27	28	29	30
	31
================================
*/

import java.util.Scanner;
import java.util.Calendar;

public class Test145
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calendar cd = Calendar.getInstance();

		int y, m;
		int realY, realM, realW;
		
		do
		{
			System.out.print("���� �Է� : ");
			y = sc.nextInt();
		}
		while (y < 1);

		do
		{
			System.out.print("�� �Է�   : ");
			m = sc.nextInt() - 1;
		}
		while (!(m>=1 && m<=12));
		
		cd.set(y, m, 1);
		
		realY = cd.get(Calendar.YEAR);
		realM = cd.get(Calendar.MONTH);	
		realW = cd.get(Calendar.DAY_OF_WEEK);
		int endDay = cd.getActualMaximum(Calendar.DATE);

		System.out.printf("	[ %d��  %d�� ]\n", realY, realM+1);

		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("================================");
		
		for(int i=1; i<realW; i++){
			System.out.print("    ");
		}

		for(int i=1; i<=endDay; i++){
			System.out.printf("%4d", i);
			realW++;

			if(realW%7==1){
				System.out.println();
			}
		}

		System.out.println();
		System.out.println("================================");




	}
}