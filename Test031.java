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
		char ch;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("�� ���� �Է� : ");
		ch = Integer.readLine();

		System.out.println(ch);
		
	}
}