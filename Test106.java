/*=================================================
 ���� �޼ҵ� �ߺ�����(Method Overloading) ����
=================================================*/

// Method Overloading �� ������ ���¿� �Ұ����� ����

public class Test106
{
	public static void main(String[] args)
	{
		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}
	//public static void print() {}						//--(X)
	public static void print(int i) {}
	//public static void print(int j) {}				//--(X)
	public static void print(char c) {}					//-- �ڵ� �� ��ȯ ��Ģ check~!!! (���� �ȿ� 1 ������ int���� �Ҹ�?)
	public static void print(int i, int j) {}	
	public static void print(double d) {}				//-- �ڵ� �� ��ȯ ��Ģ check~!!! (���� �ȿ� 1 ������ int���� �Ҹ�?)
	//public static void print(double e) {return 10.0}	//-- ���� �Ұ�
	//public static double print(double e) {return 10.0}	//-- (X)
}