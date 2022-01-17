/*==============================
      ���� �迭 ����
==============================*/

// �迭�� �⺻�� Ȱ��
// �迭�� ����� �ʱ�ȭ

// ����ڷκ��� �ο����� �Է¹ް�
// �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
// ����� ����� �� �ִ� ���α׷��� �����Ѵ�.

// ���� ��)
// �Է� ó���� �л��� �� �Է�(��, 1~10) : 27
// �Է� ó���� �л��� �� �Է�(��, 1~10) : -5
// �Է� ó���� �л��� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : �Ž��� 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ���̻� 010-3333-3333

// ----------------------
// ��ü �л� �� : 3��
// ----------------------
// �̸�      ��ȭ��ȣ
// ������    010-1111-1111
// �Ž���    010-2222-2222
// ���̻�    010-3333-3333

import java.util.Scanner;

public class Test084{
	public static void main(String[] args){
		
		// �� Ǯ��
		/*
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int studentNum = 0;
		String name, phoneNum;
		String[] nameArray;
		String[] phoneNumArray;

		while (check)
		{
			System.out.print("�Է� ó���� �л��� �� �Է�(��, 1~10) : ");
			studentNum = sc.nextInt();
			if(studentNum >= 1 && studentNum <= 10){
				check = false;
			}
		}

		nameArray = new String[studentNum];
		phoneNumArray = new String[studentNum];


		for(int i = 0; i<studentNum; i++){
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i+1);
			name = sc.next();
			phoneNum = sc.next();

			nameArray[i] = name;
			phoneNumArray[i] = phoneNum;
		}
		
		System.out.println();
		System.out.println("----------------------");
		System.out.printf("��ü �л� �� : %d��%n", studentNum);
		System.out.println("----------------------");
		System.out.println("�̸�      ��ȭ��ȣ");
		for(int i=0; i<studentNum; i++){
			System.out.printf("%s%5s\n", nameArray[i], phoneNumArray[i]);
		}
		
		*/

		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����
		int memberCount = 0;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memberCount = sc.nextInt();
		}
		while (memberCount<1 || memberCount>10);

		// �׽�Ʈ
		//System.out.println("����ڰ� �Է��� �ο��� : "+ memberCount);

		// �ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[memberCount];

		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		//String[] tels = new String[memberCount];
		String[] tels = new String[names.length];

		// �ο� �� ��ŭ�� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		//for(int i=0; i<names.length; i++)
		//for(int i=0; i<tels.length; i++)
		for(int i=0; i<memberCount; i++){
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
			
			names[i] = sc.next();
			tels[i] = sc.next();
		}
		

		// ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("----------------------");
		System.out.printf("��ü �л� �� : %d��%n", memberCount);
		System.out.println("----------------------");
		System.out.println("�̸�      ��ȭ��ȣ");

		// �л� ����Ʈ �ݺ� ���
		for(int i=0; i<memberCount; i++){
			System.out.printf("%3s %14s%n", names[i], tels[i]);
		}
		System.out.println("----------------------");
		
	}
}

// ���� ���
/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �Ž��� 010-222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ���̻� 010-333-3333

----------------------
��ü �л� �� : 3��
----------------------
�̸�      ��ȭ��ȣ
������    010111-1111
�Ž���   010-222-2222
���̻�   010-333-3333
----------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/