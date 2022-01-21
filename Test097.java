/*==============================
      ���� �迭 ����
==============================*/

// �迭�� ���� ó��(�� Random Ŭ���� Ȱ��)

// ����ڷκ��� ������ ������ �Է¹޾�
// �� ������ ������ŭ ����(1~100)�� �߻����� �迭�� ���
// �迭�� ����ִ� �����͵� ��
// ���� ū ���� ���� ���� ���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �߻���ų ������ ���� �Է� : 10
// 50 7 24 81 72 45 61 38 1 99 �� �������� �߻��� ������
// int[] arr = {50, 7, 24, 81, 72, 45, 61, 38, 1, 99} �� �迭�� ��Ƴ���(�迭 ����)
// ���� ū �� : 99, ���� ���� �� : 1

import java.util.Scanner;
import java.util.Random;

public class Test097{
	public static void main(String[] args){
		
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �ȳ� �޼��� ���
		System.out.print("�߻���ų ������ ���� �Է� : ");
		int size = sc.nextInt();

		// size ������ ��Ƴ� �� ��ŭ�� �迭�� �����
		// (�迭 ���� �� �޸� �Ҵ�)
		int[] arr = new int[size];

		// ������ ����(����)�� �߻���Ű�� ���ؼ���
		// ���� �߻� ���� ��ü�� �ʿ��ϴ�.
		// �� ��java.util.Random��
		Random rd = new Random();

		// �� Random Ŭ������ ��nextInt()�� �޼ҵ�
		// 0~ �Ű������� �Ѱܹ��� ���� n-1 ������ �� ��
		// ������ ����(����) 1���� �߻���Ų��.

		//rd.nextInt(10)		// 0 ~ 9
		// �׽�Ʈ
		//System.out.println("�߻��� ���� : " + rd.nextInt(10));
		// 0~9 ������ ���� ������ ������ ���� �� �� �߻�

		// �迭 ����
		//for(int i=0; i<size.length; i++)
		for(int i=0; i<size; i++){

			//rd.nextInt(101);
			//�� 0 ~ 100

			arr[i] = rd.nextInt(100) + 1;
			//�� 0 ~ 99 �� 1 ~ 100
		}
		//-- rd.nextInt(100)          �� 0 ~ 99������ ������ ���� �� �� �߻�
		//   rd.nextInt(100) + 1	  �� 1 ~100������ ������ ���� �� �� �߻�

		// �׽�Ʈ �� ������ �迭�� ��ü ��� ���
		/*
		for(int i=0; i<arr.length; i++){
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		*/
		//--==>>
		/*
		�߻���ų ������ ���� �Է� : 5
		77  90  36  60  89
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		
		//-----------------------------------------�迭 ���� �Ϸ�~!!

		// ���� ���� ��, ���� ū �� ���~!!
		int la, sm;

		la = sm = arr[0];
		

		for(int i=0; i<arr.length; i++){
			if(arr[i] > la){
				la = arr[i];
			}
			
			if(arr[i] < sm){
				sm = arr[i];
			}

			System.out.printf("%3d ", arr[i]);
		}
		
		System.out.printf("�� �������� �߻��� ������\n");
		
		
		System.out.printf("���� ū �� : %d, ���� ���� �� : %d%n", la, sm);

	}
}

// ���� ���
/*
�߻���ų ������ ���� �Է� : 7
 81  52  11  47   8  76  59 �� �������� �߻��� ������
���� ū �� : 81, ���� ���� �� : 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/