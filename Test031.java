/*===================================
  ���� ������(Operator) ����
======================================*/

// ���� ������ == ���� ������

// ����ڷκ��� ������ ���ڸ� �ϳ� �Է¹޾�
// �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
// ���ĺ��� �ƴ� ��Ÿ �����̸� �� ���� �״�� ����ϴ�
// ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// A �� a

// ����� ���� +35��

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test031{
	public static void main(String[] args) throws IOException{
		
		/*
		int temp;
		
		System.out.print("�� ���� �Է� : ");
		temp = System.in.read();

		//System.out.println("�Է� ���� �� Ȯ�� : " + temp);
		
		
		// String result = temp >= 65 && temp <= 90 ? "�빮��" : "�빮�� �ƴ�";
		// System.out.println("��� : " + result);
		

		String result = temp >= 'A' && temp <= 'Z' ? "�빮��" : "�빮�� �ƴ�";
		System.out.println("��� : " + result);
		*/
		
		
		/*
		ch
		�빮�ڴ� ? �ҹ��ڷκ�ȯ : (�ҹ��ڴ� ? �빮�ڷκ�ȯ : �ִ±״��)
		result = �������;
		*/



		String str;
		char ch, result;
		int num;
		

		//InputStreamReader isr = new InputStreamReader(reader);
		//BufferedReader br = new BufferedReader(isr);
	
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

		result = (ch >= 'A' && ch <= 'Z') ? (char)(ch+32) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : (char) ch); 

		System.out.println(ch + " �� " + result);
		
		
	}
}