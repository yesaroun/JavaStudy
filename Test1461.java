/*===============================================
    ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===============================================*/

// Calender Ŭ����
// �� 1461

// �� �ǽ� ����
//	  ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//	  Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	  �� ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ� Ȱ��
//	  �� ����ü.add(Calendar.DATE, �� ��);��

// ���� ��)
// ���� ��¥ : 2022-2-3 �����
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// =========[Ȯ�� ���]============
// 200�� �� : xxxx-xx-xx x����
// ================================

import java.util.Calendar;
import java.util.Scanner;

public class Test1461
{
	public static void main(String[] args) 
	{
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;				//-- ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;			//-- ��, ��, ��, ����
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, ��, ���� Ȯ���ϱ�(�������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;			// ��+1�� check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// ������ ��, ��, ���� Ȯ�ΰ�� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " " + week[w-1] + "����");

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		
		// check~!!!
		now.add(Calendar.DATE, nalsu);
		
		// ��� ���
		System.out.println();
		System.out.println("=========[Ȯ�� ���]============");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now);			// check~!!! %t�� ��¥ ���� �� ����
		System.out.println("================================");
	}
}

// ���� ���
/*
���� ��¥ : 2022-2-3 �����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

=========[Ȯ�� ���]============
200�� �� : 2022-08-22 ������
================================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/