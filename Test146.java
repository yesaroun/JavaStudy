/*===============================================
    ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===============================================*/

// Calender Ŭ����
// �� 1461

// �� �ǽ� ����
//	  ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//	  Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	  �� ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ� Ȱ��
//	  �� 

// ���� ��)
// ���� ��¥ : 2022-2-3 �����
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// =========[Ȯ�� ���]============
// 200�� �� : xxxx-xx-xx x����
// ================================

import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test146
{
	public static void main(String[] args) throws IOException
	{
		Calendar calendar = Calendar.getInstance();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int y, m, d, w;
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		int after;

		y = calendar.get(Calendar.YEAR);
		m = calendar.get(Calendar.MONTH)+1;
		d = calendar.get(Calendar.DATE);
		w = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.printf("���� ��¥ : %d-%d-%d %s����\n", y, m, d, week[w+1]);

		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		after = Integer.parseInt(br.readLine());

		calendar.add(Calendar.DATE, after);

		y = calendar.get(Calendar.YEAR);
		m = calendar.get(Calendar.MONTH)+1;
		d = calendar.get(Calendar.DATE);
		w = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("=========[Ȯ�� ���]============");
		System.out.printf("%d�� �� :  %d-%d-%d %s����\n",after, y, m, d, week[w+1]);
		System.out.println("================================");

	}
}