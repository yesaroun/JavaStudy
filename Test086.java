/*==============================
      ���� �迭 ����
==============================*/

// �迭�� �⺻�� Ȱ��

// �� ����
//	����ڷκ��� ������ �л� ���� �Է¹ް�
//	�׸�ŭ�� ����(���� ����)�� �Է¹޾�
//	��ü �л� ������ ��, ���, ������ ���Ͽ�
//	����� ����ϴ� ���α׷��� �����Ѵ�.
//	��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �л� �� �Է� : 5
// 1�� �л��� ���� �Է� : 90
// 2�� �л��� ���� �Է� : 82
// 3�� �л��� ���� �Է� : 64
// 4�� �л��� ���� �Է� : 36
// 5�� �л��� ���� �Է� : 98

// >> �� : 370
// >> ��� : 74.0
// >> ����
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// ����Ϸ��� �ƹ� Ű�� ���缼��...


// ����ڿ��� ������ �Է¹ޱ� ���� InputStreamReader, BufferedReader import
import java.io.InputStreamReader;
import java.io.BufferedReader;

// ����ó���� ���� IOException import
import java.io.IOException;

public class Test086{
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		// ������ ������ ����
		int sum = 0;

		// ����� ������ ����
		double avg;

		// �л� �� �Է��� ���� ��� ����
		System.out.print("�л� �� �Է� : ");

		// count�� �л��� ����
		int count = Integer.parseInt(br.readLine());

		// �迭 ����
		int[] array = new int[count];


		// for���� �̿��ؼ� �л��� ���� array�� ����
		for(int i=0; i<count; i++){
			System.out.printf("%d�� �л��� ���� �Է� : ", i+1);
			array[i] = Integer.parseInt(br.readLine());
		}
		
		// for���� �̿��ؼ� ���� ����
		for(int i=0; i<count; i++){
			sum += array[i];
		}

		// ��� ����
		avg = (double) sum/count;

		
		// ���
		System.out.println("\n>> �� : " + sum);
		System.out.printf(">> ��� : %.1f\n", avg);
		System.out.println(">> ����");
		
		// for���� �̿��ؼ� ���� ���
		for(int i=0; i<count; i++){
			System.out.printf("%d : %.1f\n", array[i], avg - (double) array[i]);
		}


	}
}

// ������
/*
�л� �� �Է� : 5
1�� �л��� ���� �Է� : 87
2�� �л��� ���� �Է� : 90
3�� �л��� ���� �Է� : 55
4�� �л��� ���� �Է� : 75
5�� �л��� ���� �Է� : 86

>> �� : 393
>> ��� : 78.6
>> ����
87 : -8.4
90 : -11.4
55 : 23.6
75 : 3.6
86 : -7.4
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/