/*===============================================
    ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===============================================*/

// Calender Ŭ����

/*
�� Calender Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
	(�߻� Ŭ���� : �̿ϼ��� Ŭ����)

	Calender ob = new Calender();
	�� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�

�� Calender Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���
	
	1. Calendar ob1 = Calender.getInstance();

	2. Calendar ob2 = new GregorianCalendar();

	3. GregorianCalendar ob3 = GregorianCalendar();
	(�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)
*/

// ��, ��, ��, ������ Calendar ��ü�κ��� �����ͼ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144{
	public static void main(String[] args)
	{
		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		//Calendar ob = new Calendar();
		Calendar rigthNow = Calendar.getInstance();
		
		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� ��get()��

		int y = rigthNow.get(Calendar.YEAR);
		System.out.println(y);
		//--==>> 2022

		int m = rigthNow.get(Calendar.MONTH) + 1;
		System.out.println(m);
		//--==>> 2

		int d = rigthNow.get(Calendar.DATE);
		System.out.println(d);
		//--==>> 3
		
		int w = rigthNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--==>> 5
		
		// �׽�Ʈ
		/*
		System.out.println(Calendar.SUNDAY);		//--==>> 1  �� �Ͽ���
		System.out.println(Calendar.MONDAY);		//--==>> 2
		System.out.println(Calendar.TUESDAY);		//--==>> 3
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4
		System.out.println(Calendar.THURSDAY);		//--==>> 5
		System.out.println(Calendar.FRIDAY);		//--==>> 6
		System.out.println(Calendar.SATURDAY);		//--==>> 7	�� �����
		*/

		System.out.println(y + "-" + m + "-" + d + " " + w );
		//--==>> 2022-2-3 5

		String week = " ";
		switch(w){
			case 1: week = "��"; break;
			case 2: week = "��"; break;
			case 3: week = "ȭ"; break;
			case 4: week = "��"; break;
			case 5: week = "��"; break;
			case 6: week = "��"; break;
			case 7: week = "��"; break;
		}
		
		System.out.println(y + "-" + m + "-" + d + " " + week );
		//--==>> 2022-2-3 ��

		System.out.println("/////////////////////////////////////////////////////////////////");

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// �޷��� ��¥ ���� �� ��set()�� �޼ҵ� Ȱ��
		rightNow2.set(2022, 5, 20);			// 6��		-- ��-1�� check~!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
	}
}