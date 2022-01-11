/*===========================================
  ���� ����  �帧�� ��Ʈ��(���) ����
=============================================*/

// switch �� �ǽ�

// ����ڷκ��� ������ �� ������ �����ڸ� �Է� �޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 3
// �� ��° ���� �Է� : 17
// ������ �Է�[+ - * /] : -

// >> 3 - 17 = 14


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test045{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �� Ǯ��
		/*
		System.out.print("ù ��° ���� �Է� : ");
		int nNum1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		int nNum2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");  //38 Ȯ���ϱ�
		char cChar1 = (char) System.in.read();

		switch(cChar1){
			case '+':
				System.out.printf("%d %c %d = %d\n", nNum1, cChar1, nNum2, nNum1 + nNum2);
				break;

			case '-':
				System.out.printf("%d %c %d = %d\n", nNum1, cChar1, nNum2, nNum1 - nNum2);
				break;

			case '*':
				System.out.printf("%d %c %d = %d\n", nNum1, cChar1, nNum2, nNum1 * nNum2);
				break;
			
			case '/':
				System.out.printf("%d %c %d = %.2f\n", nNum1, cChar1, nNum2, (double)nNum1 / nNum2);
				break;

			default:
				System.out.println("�ùٸ� �����ڸ� �Է��ϼ���.");
			}
		*/

		// ��
		/*
		int a, b, result;
		int op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [+ - * /] : ");
		op = System.in.read();

		// + 43, - 45, * 42, / 47

		switch(op)
		{
			case 43: result = a + b; break;
			case 45: result = a - b; break;
			case 42: result = a * b; break;
			case 47: result = a / b; break;
			default: return;      // 1. ���� ��ȯ
								  // 2. �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}
		
		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		*/


		// ��
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch(op){
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
			default : return;
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d%n", a, op, b, result);

	}
}

// ���� ���
/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 8
������ �Է� [+ - * /] : *

>> 5 * 8 = 40

ù ��° ���� �Է� : 6
�� ��° ���� �Է� : 7
������ �Է� [+ - * /] : 8  (return�� ����)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/