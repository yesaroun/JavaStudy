/*===================================
  ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// �ڹ��� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test019{
	public static void main(String[] args) // thorows IOException �ʿ� ����
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		

		// �ֿ� ���� ����
		String name;
		int kor, eng, mat;

		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();

		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();



		// ��� ���
		System.out.println();
		System.out.printf("�̸� : %s%n���� : %d%n", name, kor + eng+ mat);
	}
}