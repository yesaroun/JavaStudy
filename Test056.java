/*===========================================
  ���� ����  �帧�� ��Ʈ��(�ݺ���) ����
=============================================*/

// �ݺ���(while) �ǽ�

// ����ڷκ��� ���ϴ� ��(������)�� �Է� �޾�
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�.

// ���� ��)
// ���ϴ� ��(������) �Է� : 7
// 7 * 1 = 7
//  :
// 7 * 9 =63

// ���ϴ� ��(������) �Է� : 11
// 1���� 9������ ������ �Է��� �����մϴ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*---------------�� Ǯ��--------------------------
		int num;
		int su = 1;

		System.out.print("���ϴ� ��(������) �Է� : ");
		num = Integer.parseInt(br.readLine());

		if(num > 9 && num < 1){
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
		
		} else{
			while(su < 10){
				System.out.printf("%d * %d = %d%n", num, su, (num * su));
				su++;
			}
		}
		*/

		// �ֿ� ���� ���� �� �ʱ�ȭ
		
		int dan;		//-- ������� �Է°��� ���� ���·� ��Ƴ� ����

		// ���� �� ó��
		System.out.print("���ϴ� ��(������) �Է� : ");
		dan = Integer.parseInt(br.readLine());

		if(dan < 1 || dan > 9){
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			return;
		}

		int n = 0;


		// ��� ���(�ݺ� ���)
		while (n<9)
		{
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, (dan * n));
		}
	}
}

// ���� ���
/*
���ϴ� ��(������) �Է� : 7
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/