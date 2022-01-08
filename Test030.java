/*===================================
  ���� ������(Operator) ����
======================================*/

// ���� ������ == ���� ������

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader �� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
// ����, ���� ������(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test030{
	public static void main(String[] args) throws IOException{
		
		// �ֿ� ���� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int num;
		String strResult;

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		/*
		num �� 0���� ũ�� �� true      �� n�� ���
						  �� false     �� n�� 0���� �۴�  �� true   ��  n�� ����
						  								  �� false  ��  n�� 0

		*/
		/*================�� ���===========
		strResult = (num >= 0) ? ((num == 0) ? "0" : "���") : "����";
		==================================*/

		strResult = (n>0) ? ("���") : ( (n<0) ? ("����") : ("0") );

		// ���� ��� ���
		System.out.printf("%d �� %s%n", num, strResult);
		
	}
}