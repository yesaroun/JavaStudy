/*=================================================
 ���� �޼ҵ� �ߺ�����(Method Overloading) ����
=================================================*/

/*
�� �޼ҵ� �����ε��� ����
	�޼ҵ� �����ε�(Overloading)�̶�
	�޼ҵ尡 ó���ϴ� ����� ����
	�޼ҵ� ��ȣ �ӿ� ���� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
	�ڷ���(Data Type)�� �ٸ� ���
	�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
	���������� ����ϰ� �Ǵµ� 
	�̸� �޼ҵ� �����ε�(Method Overloading)�̶�� �Ѵ�.
*/


public class Test105
{
	public static void main(String[] args)
	{	
		/*
		Test105 ob = new Test105();   �̷��� �ϵ��� �ƴϸ� static �߰��ϱ�

		ob.drawLine();
		*/

		drawLine();

		drawLine('*');
		drawLine('<');

		drawLine('/', 30);
		drawLine('+', 10);


	}
	
	// ���� �׸��� �޼ҵ� ����
	//public void drawLine()     
	public static void drawLine()
	{
		System.out.println("====================");
	}
	
	// ���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c)
	{
		for(int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	// ���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}