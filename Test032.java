/*===================================
  ���� ������(Operator) ����
======================================*/

// ���� ������ == ���� ������

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �������� ������� �Ǻ��Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader�� readLine()�� Ȱ���ϰ�
// ���� �����ڸ� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����

// �� 2���� 28�ϱ��� �ִ� �� �� ���
//			29�ϱ��� �ִ� �� �� ����

// �� ������ �Ǻ� ����
//	  ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//	  400�� ����̸� ����~!!!
//	  �׷��� ������ ���~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032{
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int year;
		String result;

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());
		
		
		//�� Ǯ��
		/*
		result = (year % 4 == 0) ? ((year % 100 == 0) ? ((year % 400 == 0) ? "����" : "���") : "����") : "���";
		*/

		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "����" : "���";
		
		System.out.printf("%d�� �� %s%n", year, result);
	}
}