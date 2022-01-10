/*==========================================
  ���� ����  �帧�� ��Ʈ��(���) ����
==========================================*/

// if ~ else �� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if~else��, ���ǿ�����, ����if��(if�� ��ø),
//    switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���,
//	  Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�: 10
// �� ��° ���� �Է�: 3
// ������ �Է�[+ - * /] : +

// >> 10 + 3 = 13

// + : 43 * : 42 - : 45 / : 47

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test038{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//=======�� Ǯ��=============
		/*
		System.out.print("ù ��° ���� �Է� : ");
		int nNum1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		int nNum2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		char strChar = (char)System.in.read();

		if ((int)strChar == 43){
			int nTotal = nNum1 + nNum2;
			System.out.printf("%d + %d = %d\n", nNum1, nNum2, nTotal);
		} else if((int)strChar == 45){
			int nMinus = nNum1 - nNum2;
			System.out.printf("%d - %d = %d\n", nNum1, nNum2, nMinus);
		} else if((int)strChar == 42){
			int nMulti = nNum1 * nNum2;
			System.out.printf("%d * %d = %d\n", nNum1, nNum2, nMulti);
		} else if((int)strChar == 47){
			double nDiv = (double)nNum1 / nNum2;
			System.out.printf("%d / %d = %.2f\n", nNum1, nNum2, nDiv);
		}else {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		*/

		/*
		//��� ��
		int a, b;  //-- ù ��°, �� ��° ����
		char op;   //-- ������

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		// Integer.parseInt()
		// "1234" �� Integer.parseInt() �� 1234
		// "abc"  �� Integer.parseInt() �� (x)

		System.out.print("������ �Է�[+ - * / ] : "); 
		// op = Integer.parseInt(br.readLine());
		// op = br.readLine(); 
		op = (char)System.in.read();   // ����� �� ��ȯ ����

		// Ȯ��(�׽�Ʈ)
		//System.out.println(op);

		if(op=='+'){
			System.out.printf("%n>>%d + %d = %d%n", a, b, (a+b))
		} else if(op=='-'){
			System.out.printf("%n>>%d - %d = %d%n", a, b, (a-b))
		} else if(op=='*'){
			System.out.printf("%n>>%d * %d = %d%n", a, b, (a*b))
		} else if(op=='/'){
			System.out.printf("%n>>%d / %d = %d%n", a, b, (a/b))
		} else {
			System.out.println("%n>> �Է°����� ������ �����մϴ�.");
		}
		*/

		/*
		// ��� ��
		int a, b, op;     //-- ù ��°, �� ��° ����, ������
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br. readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();
		if(op == 43){
			System.out.printf("%n>> %d + %d = %d%n", a, b, (a+b));
		} else if(op == 45) {
			System.out.printf("%n>> %d - %d = %d%n", a, b, (a-b));
		} else if(op==42) {
			System.out.printf("%n>> %d * %d = %d%n", a, b, (a*b));
		} else if(op==47) {
			System.out.printf("%n>> %d / %d = %d%n", a, b, (a/b));
		} else {
			System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
		} */

		// ��� ��
		int a, b, result = 0;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br. readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char) System.in.read();

		if(op=='+')
			result = a + b;
		else if(op=='-')
			result = a - b;
		else if(op=='*')
			result = a * b;
		else if(op=='/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d%n", a, op, b, result);



	}
}