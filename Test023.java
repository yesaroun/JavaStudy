/*===================================
  ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// ��� ������
// BufferedReader
// printf()

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ BufferedReader�� Ȱ���� �� �ֵ��� �ϰ�
// ����ϴ� ������ printf()�޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2

// ====[���]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 =
// 10 / 2 =
// 10 % 2 =
// =============


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test023
{
	public static void main(String[] args) throws IOException {
		
		/*==============================�� Ǯ��=================================================
		int firNum, secNum;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		firNum = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		secNum = Integer.parseInt(br.readLine());

		System.out.println("===[���]===");
		System.out.printf("%d + %d = %d\n", firNum, secNum, (firNum + secNum));
		System.out.printf("%d - %d = %d\n", firNum, secNum, (firNum - secNum));
		System.out.printf("%d * %d = %d\n", firNum, secNum, (firNum * secNum));
		System.out.printf("%d / %d = %d\n", firNum, secNum, (firNum / secNum));
		System.out.printf("%d %% %d = %d\n============\n", firNum, secNum, (firNum % secNum));

		=======================================================================================*/
		
		//================================Ǯ��=======================================

		// �ֿ� ���� ����
		int num1, num2;					  //-- ����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5; //-- ���� ����� ���� ����
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// ���� ��� ���
		System.out.printf("\n====[���]====\n");
		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d + %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5);

		System.out.printf("=============");

	}
}

// ���� ���
/*
ù ��° ���� �Է� : 15
�� ��° ���� �Է� : 2

====[���]====
15 + 2 = 17
15 + 2 = 13
15 * 2 = 30
15 / 2 = 7
15 % 2 = 1
=============����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/