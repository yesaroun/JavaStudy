/*===================================
  ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// �ڹ��� �⺻ ����� : System.in.read()

public class Test018{
	public static void main(String[] args) {
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");      //-- \n ����

		System.out.println();           //-- ����

		// System.out.print;
		//--==>> ���� �߻�(������ ����)

		System.out.printf("123456789");
		System.out.printf("123456789\n");//-- \n ����
		System.out.printf("123456789%n");//-- %n ����

		// System.out.printf();
		//--==>> ���� �߻�(������ ����)

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		//--==>> 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123); // ���� 7ĭ�� 
		System.out.printf("%8d\n", 1234); // ���� 4ĭ
		System.out.printf("%010d\n", 123);// ������ 0���� ä���
		/*
		123
		123
		1234
		0000000123	
		*/

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		// +365
		// +365

		System.out.printf("%d\n", +365);
		//--==>> 365
		
		//System.out.printf("%-d%n", 365);
		//--==>> ���� �߻�(��Ÿ�� ����)
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		// -365
		// -365

		// System.out.printf("%d\n", 'A');
		//--==>> ���� �߻�(��Ÿ�� ����)
		System.out.printf("%c\n", 'A');
		//--==>> A

		//System.out.printf("%c\n", "ABCD");
		//--==>> ���� �߻�(��Ÿ�� ����)
		System.out.printf("%s\n", "ABCD");
		//--==>> ABCD

		System.out.printf("%h\n", 365); // 16���� ����
		//--==>> 16d
		System.out.printf("%o\n", 24);  // 8����
		//--==>> 30

		System.out.printf("%b%n",  true);
		System.out.printf("%b%n", false);
		//--==>> true
		//		 false

		System.out.printf("%f\n", 123.23);
		//--==>> 123.23000000
		System.out.printf("%.2f\n", 123.23);
		//--==>> 123.23

		System.out.printf("%.2f\n", 123.231);
		//--==>> 123.23 (����)
		System.out.printf("%.2f\n", 123.235);
		//--==>> 123.24 (�ø�)

		System.out.printf("%8.2f\n", 123.236);
		//--==>>   123.24         (���� ���ڸ� �����ؼ� �տ� 2ĭ ���)

		System.out.printf("%2.2f\n", 123.236); // ǥ���Ϸ��� �������� �۰� ������ �׳� ���õȴ�
		//--==>> 123.24
	}
}

// ���� ���
/*
AAABBBCCC

123456789123456789
123456789
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
A
ABCD
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/