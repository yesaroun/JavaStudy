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

// ����ڿ��� ������ �Է¹ޱ� ���� InputStreamReader, BufferedReader import
import java.io.InputStreamReader;
import java.io.BufferedReader;

// ����ó���� ���� IOException import
import java.io.IOException;

// ���� �������� �����͸� �Է¹ޱ� ���� Scanner import
import java.util.Scanner;


public class Test085{
	public static void main(String[] args) throws IOException{


		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Scanner sc = new Scanner(System.in);

		// �Է¹��� �����͸� ������ ����
		int num;

		// �ִ밪�� ���ϱ� ���� ���� ����
		int max;

		// �Է¹��� �������� ������ �ޱ� ���� ��¹�
		System.out.print("�Է��� �������� ���� : ");

		// �Է��� �������� ������ count�� ����
		int count = Integer.parseInt(br.readLine());

		// array ����
		int[] array = new int[count];
		
		
		// ������ �Է��� ���� ��¹�
		System.out.print("������ �Է�(���� ����) : ");

		// for���� �̿��ؼ� �Է� ���� �����͸� array�� ����
		for(int i=0; i<count; i++){
			num = sc.nextInt();
			array[i] = num;
		}
		
		// �ִ밪 �ʱ�ȭ
		max = array[0];

		// �Է� ���� ������ �߿� �ִ밪�� max�� ����
		for(int i=0; i<count; i++){
			if(max < array[i]){
				max = array[i];
			}
		}

		// ���� ū �� ���
		System.out.printf(">> ���� ū �� �� %d\n", max);

		

	}
}

// ���� ���
/*
�Է��� �������� ���� : 3
������ �Է�(���� ����) : 100 2 10
>> ���� ū�� �� 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/