/*
  ### �ڹ��� ���� �� Ư¡ ###
*/

// ������ �ڷ���
// Ű���� �� �ĺ���
// printf()


public class Test007{
	public static void main(String[] args){
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int a = 10, b = 5;
		int c, d;

		// ���� �� ó��
		c = a + b;
		d = a - b;

		// ��� ���
		System.out.println(c);
		System.out.println(d);
		//--==>> 15
		//--==>> 5

		// ������ �� ��10 + 5 = 5��
		System.out.println(a + " + " + b + " = " + d);

		//-- �ڹٿ����� ���� �ٸ� �ڷ����� �����͵鳢����
		//   ��+�� ������ �����ϸ�,
		//   �ٸ� � ���ڷ����� ���ڿ� �������ǡ�+�� ���� ����� ���ڿ�.
		//   ��, ���ڿ� ���� �����ڷν� ��+��

		// print() / println() / printf() / format()

		// printf() / format()
		//-- JDK 1.5 ���� �����Ǵ� �޼ҵ� (���� ��¿� �޼ҵ�)
		System.out.printf("%d + %d = %d\n", a, b, d);
		System.out.printf("%d + %d = %d%n", a, b, d);
		
		// System.out.printf("%d �� %d%n", 10, 3.14);
		//--==>> ��Ÿ�� ���� �߻�
		System.out.printf("%d �� %f%n", 10, 3.14);

		System.out.printf("%.2f%n", 3.141592);
		//-- �Ҽ��� ���� �� ��° �ڸ����� ǥ��
		System.out.printf("%.3f%n", 3.141592);
		//-- �Ҽ��� ���� �� ��° �ڸ����� ǥ��(�ݿø� �߻�)
		System.out.printf("%.4f%n", 3.141592);
		//-- �Ҽ��� ���� �� ��° �ڸ����� ǥ��(�ݿø� �߻�)
		//--==>> 3.14
		//		 3.142
		//		 3.1416



	}
}