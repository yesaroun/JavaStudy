/*==========================================================
    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
============================================================*/

import java.util.Stack;

public class Test157
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	// ������
	public Test157()
	{
		// st��� Stack �ڷᱸ�� ����
		// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� ��<String>��
		Stack<String> st = new Stack<String>();

		// st��� Stack �ڷᱸ�� ������ ���
		//st = colors;	//(X)
		for(String color : colors)
		{
			st.push(color);
		}

		st.push("����");
		
		//st.push(10);
		//st.push(10.0);
		//--==>> ���� �߻�(������ ����)
		//-- ���׸� ǥ������ ���� �����ϰ� �ִ�
		//	 String �� �ƴ� �ٸ� �ڷ���(int �� double)��
		//	 ���� �ڷᱸ�� st�� push() �Ϸ��� �߱� ������...

		// ��¸޼ҵ� ȣ��
		popStack(st);
	}

	// ��� �޼ҵ�
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test157();
	}
}

// ���� ���
/*
pop : ���� ���� �Ķ� �ʷ� ��� ����
*/

/*
pop : ���� ���� ���� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/