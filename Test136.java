/*===============================================
    ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===============================================*/

// Wrapper Ŭ����

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);

		print(b2);
		print(i2);

		// Byte Ŭ������ byteValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue();		//-- ��ڽ�
		
		// Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue();			//-- ��ڽ�

		// check~!!!
		int i4 = b2.byteValue();			// �ڵ�����ȯ��
		//byte b4 = i2.intValue();			//-- ���� �߻�(������ ����)
		byte b4 = i2.byteValue();

		System.out.println(b3);
		System.out.println(i3);
		//--==>> 3
		//		 256

		//check~!!!
		System.out.println(b4);				// byte���� ������ �� ���� ���� �ֱ⶧���� byte�� ��ȯ�� ������ 0���� ��µȴ�.
		System.out.println(i4);
		//--==>> 0
		//		 3





	}

	/*
	static void print(Byte b)
	{}

	static void print(Integer i)
	{}
	�̷��� �϶� �ƴ϶� ����Ʈ �޼ҵ� �ϳ������� �����ϰ� �ϴ°���
	��ӿ� ���� ������ ����, ��ĳ����, �ٿ�ĳ����, �ڽ�, ��ڽ� �� �����ؾ��Ѵ�
	*/

	// �� Ǯ��
	/*
	static void print(Object obj)
	{
		System.out.println(obj);
	}
	*/
	// �� �𸣰����� �̷��Զ� �ϸ� �ȴ� �׷��� 50���� ��������
	// �׷��� ���� �� object�� ������ ���� �ʳ�? ��� ������ ��µ� �������� ������������
	

	// java.lang.Number Ŭ����(�߻� Ŭ����)��
	// ��� ������ Wrapper Ŭ�������� �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number �� �Ѿ���鼭 
	// �� ĳ������ �Ͼ�� �ȴ�.
	// Auto-Boxing �� �Ͼ�� �ȴ�.
	static void print(Number n)	// �� 3
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}




	

}