/*
 ### �ڹ� �⺻ ���α׷��� ###
*/

// ������ �ڷ���


public class Test005{
	public static void main(String[] args){
		//���� ���� �� �޸� ���� Ȯ��/ �Ҵ�
		int a;

		// ���� �� ó�� �� Ȯ���� �޸� ������ ������ ��Ƴ���
		a = 10;

		// ��� ���
		System.out.println("a��" + a + "�Դϴ�.");
		//--==>>a��10�Դϴ�.

		byte b = 20;
		System.out.println(b); //-- ���� b�� ����ִ� ���� ���
		//--==>> 20

		System.out.println("b"); //-- ���ڿ� b���
		//--==>> b

		short c; 
		// c = a;     //-- ���� �߻�(������ ����)
		c = (short)a; //-- ����� �� ��ȯ(���� �� ��ȯ)
		System.out.println(c);
		//--==>> 10


	}
}