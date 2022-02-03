/*===============================================
    ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===============================================*/

// Calender Ŭ����
// ��:1451

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class Test1451
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader Ŭ���� ��� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		// �ֿ� ���� ����
		int y, m;				//-- ��, ��
		int w;					//-- ����
		int i;					//-- ���� ����

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է�   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// ����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����
		cal.set(y, m-1, 1);
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//	 �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ������ �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.

		// ���õ� �޷��� ��¥�κ��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		// Ȯ��
		//System.out.println(w);
		//--==>> ���� �Է� : 2022
		//		 �� �Է�   : 6
		//		 4 �� 2022�� 6�� ���� �� ������ �� 2022�� 6�� 1�� �� ������

		// ��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t[ " + y + "�� " + m + "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("==============================");
		for(i=1; i<w; i++)
		{
			System.out.print("    ");		// ���� 4ĭ �߻�
		}

		//�׽�Ʈ
		//System.out.printf("%4d", 1);

		// Calendar Ŭ���� ��getActualMaximum()�� �޼ҵ� check~!!!
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;							//-- �ݺ����� �����ϸ� ��¥�� ����� ������
											//	 ���ϵ� �Բ� ������ �� �ֵ��� ó��

			if(w%7==1)						//-- ������ ������ �Ͽ����� �� ������ 
				System.out.println();		//   ���� �� ��µ� �� �ֵ��� ó��
		}

		if(w%7!=1)							//-- �Ͽ��� ������ ������� �ʾ��� ��츸
			System.out.println();			//-- ����

		System.out.println("==============================");
	}
}