/*===========================================
  ���� ����  �帧�� ��Ʈ��(�ݺ���) ����
=============================================*/

// �ݺ���(while) �ǽ�

// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� �� ���� ū �������� ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2
// >> 2 ~ 10 ������ �� : ����

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test054{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
			// �� Ǯ��!
		/*
		int n1, n2;
		int n3;
		int total = 0;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		if(n2 < n1) {
			n1 = n1^n2;
			n2 = n2^n1;
			n1 = n1^n2;
		}

		n3 = n1;

		while(n3 <= n2){
			total += n3;
			n3++;
		}

		System.out.printf(">> %d ~ %d ������ �� : %d %n", n1, n2, total);
		*/

		int n;			//-- ���� ������ Ȱ���� ����
		int su1, su2;   //-- ù ��°, �� ��° ����� �Է°��� ��Ƴ� ����
		int result = 0; //-- �������� ��Ƴ� ����

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());


		// �Է� ���� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1�� su2 ���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if(su1 > su2) {
			// �ڸ� �ٲ�
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;
		}

		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ���� 
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�...)
		// �� ���� �ݺ��������� ����ϰ� �Ǹ�... ������ ���� Ȯ���� �� ���� ����...
		n = su1;

		while(n<=su2){
			result += n;
			n++;
		}

		// ��� ���
		System.out.printf(">> %d ~ %d������ �� : %d%n", su1, su2, result);
		
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 10
>> 10 ~ 20������ �� : 165
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/