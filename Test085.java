/*==============================
      ���� �迭 ����
==============================*/

// �迭�� �⺻�� Ȱ��

// �� ����
//	����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
//	�Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//	��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է��� �������� ���� : 12
// ������ �Է�(���� ����) : 74 65 13 91 5 67 33 41 2 50 11 38
// >> ���� ū �� �� 91
// ����Ϸ��� �ƹ� Ű�� ���缼��...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Scanner;

public class Test085{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("�Է��� �������� ���� : ");
		int count = Integer.parseInt(br.readLine());

		int array = new int[count];
		

		System.out.print("������ �Է�(���� ����) : ");
		for(int i=0; i<count; i++){
			num = sc.nextInt();
			array[i] = num;
		}

		System.out.println(array[0]);
	}
}