/*
 ### �ڹ� �⺻ ���α׷��� ###
*/
//������ �ڷ���

public class Test004{
	public static void main(String[] args){
		
		// ���� ����
		int a;
		
		// ���� �ʱ�ȭ(����  a�� 10 ����)
		a = 10;

		// ���� ���� �� �ʱ�ȭ(����� ������ �� ���� ó��)
		int b = 20;


		//���� ����
		int c;


		
		// ���� �� ó��
		c = a + b;
		// c = 10 + b;
		// c = 10 + 20;
		// c = 30;



		//  test
		//lSystem.out.println(a);
		// --==>> 10
		//System.out.println(b);
		// --==>> 20
		//System.out.println(c);
		//--==>> ���� �߻�(������ ����)    cf.��Ÿ�� ����(����������� �� ����)

		System.out.println(c);
		//--==>> 30
		
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.println();
		System.out.println(a + " " + b + " " + c);
		System.out.printf("%d %d %d%n", a, b, c);
		// --==>> 10 20 30
		
		// �� ���� ������(+)
		//    �� ������ �� ��� �ϳ��� ���ڿ� ������ �����Ͱ� �����Ѵٸ�
		//    ��������ڷν��� ����� �����ϴ� ���� �ƴ϶�
		//    ���ڿ� ���� �����ڷν��� ����� �����ϰ� �ȴ�.

		System.out.println("a�� ���� " + a + "�Դϴ�.");
		System.out.printf("b�� ���� %d�Դϴ�.%n", b);
		System.out.println("c�� ���� " + c + "�Դϴ�.");
		// --==>> a�� ���� 10�Դϴ�.
		// b�� ���� 20�Դϴ�.
		// c�� ���� 30�Դϴ�.

		//~~ + �����ڸ� ����ϴ� ��������
		// �� ������ �� ���ڿ��� ���ԵǾ� ���� ���
		// ���ڿ� ���� �����ڷ� Ȱ��Ǹ�
		// ó�� ����� ���ڿ��� ���·� ��ȯ�ȴ�.


		// �߰� Ȯ�� �� ����
		System.out.println(1 + 2);		//  ��� ������ +
		System.out.println("1" + 2);    // ���ڿ� ���տ����� +
		System.out.println(1 + "2");	// ���ڿ����տ����� +
		System.out.println("1" + "2");  // ���ڿ� ���տ�����+
		System.out.println("1 + 2");    // ���ڿ� +
		//--==>> 3
		//  	12
		//		12
		//		12
		//		1 + 2


		

	}
}