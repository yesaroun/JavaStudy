
// Ȧ��, ¦��, ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		/*
		if(n%2==0) {
			System.out.println(n + " �� ¦��");
		} else if(n%2!=0){
			System.out.println(n + " �� Ȧ��");
		} else {
			System.out.println(n + " ��  ��");
		}*/

		if(n%2!=0) {
			System.out.println(n + " �� Ȧ��");
		} else if (n == 0)
		{ System.out.println(n + " ��  ��");
		} else {
			System.out.println(n + " �� ¦��");
		}

		String result;
		if(n==0) {
			result = "��";
		} else if(n%2==0) {
			result = "¦��";
		} else if(n%2!=0) {
			result = "Ȧ��";
		} else {
			result = "���� �Ұ�";
		}
		System.out.println(result);
	}
}

// �� ���ǹ��� ������ ������ �׻� ������ ���� ������ �����ؾ��Ѵ�.

// �� if~else ������ ��÷ ������
//	  �ݵ�� else�� ������ �ϴ� ���� �ƴϴ�.
//	  �ٸ�, ����ؾ� �� ������ ó���ϴ� ��������
//	  ������ �߻����� �ʴ� �������� �ۼ��ؾ��Ѵ�.

// �� ���ǹ� ���� �������� �̿��� ����(else)��
//	  ������ ���Ե� �������� ó���ϴ� ���� �ٶ������� ���� ��찡 �ִ�.
//	  �Ұ����� ���� ��¿ �� ������
//	  �������̸� ������ ���Ե��� �ʴ� ������
//	  �̿��� ����(else)���� ó���� �� �ֵ��� �ϴ�.

/* 011 016 019 017 + 010
if(�޴��� ���ڸ� 011)
else if(016)
else if(019)
else //017 
: �̷����ϸ� �ȵȴ� 010�� ��Ÿ���� ����

if(�޴��� ���ڸ� 011)
else if(016)
else if(019)
else if(017)
else "Ȯ�� �ʿ�" // �̷��� �ؾ��Ѵ�
*/
