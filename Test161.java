/*==========================================================
    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
============================================================*/

// Vector v= new Vector()
//-- ��� �ִ� Vector �ڷᱸ�� v ����

// Vector v = new Vector(8);
//-- 8�� �ʱ� elements�� ���� Vector �ڷᱸ�� v ����
//	 8���� ��� ü������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� Ȯ���Ѵ�.

// vector v = new Vector(3, 5);
//-- 3�� �ʱ� elements�� ���� Vector �ڷᱸ�� v ����
//   3�� ��� ä�����ԵǸ�(���ڶ�� �Ǹ�) �ڵ����� 5�� ����(Ȯ��)�ȴ�

// * ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ�... ����
//   ��Ƴ��� ���� �����ϴ�.(�� ����������.)
//	 �� ������ ������ Ȯ�� check~!!!


import java.util.Vector;
import java.util.Iterator;

// MyVector Ŭ���� ���� �� Vector Ŭ���� ���
class MyVector extends Vector<Object>
{
	// ������
	MyVector()
	{
		// Vector(���� Ŭ����) ������ ȣ��
		//Vector();
		super(1, 1);
		//-- ù ��° ���� : �־��� �뷮
		//	 �� ��° ���� : ������
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void addObject(Record rec)
	{
		addElement(rec);
	}

	void write()
	{
		/*
		Iterator<Object> it = this.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		//--==>> 
		/*
		5
		3.14
		�ȳ��ϼ���
		[C@15db9742
		*/	

		/*
		Object o;
		int length = size();

		System.out.println("���� ��� ���� : " + length);

		for(int i=0; i<length; i++)
		{
			o = elementAt(i);
			System.out.println(o);
		}
		*/
		//--==>>
		/*
		���� ��� ���� : 4
		5
		3.14
		�ȳ��ϼ���
		[C@15db9742
		*/

		Object o;
		int length = size();

		System.out.println("���� ��� ���� : " + length);

		for(int i=0; i<length; i++)
		{
			o = elementAt(i);
			
			// ��instanceof�� ������		check~!!
			//-- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��
			
			if (o instanceof char[])
			{
				//System.out.println("���ڹ迭 : " + o);
				//System.out.println("���ڹ迭 : " + o.toString());
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));
			}
			else if(o instanceof String)
			{
				System.out.println("���ڿ� : " + o.toString());
			}
			else if (o instanceof Integer)
			{
				System.out.println("������ : " + o);
			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : " + o);
			}
			else 
			{
				System.out.println("Ÿ�� Ȯ�� �Ұ�~!!!");
			}
		}
		//--==>>
		/*
		���� ��� ���� : 4
		������ : 5
		�Ǽ��� : 3.14
		���ڿ� : �ȳ��ϼ���
		���ڹ迭 : study
		*/
		
	}
}


public class Test161
{
	public static void main(String[] args)
	{
		//MyVector Ŭ���� ��� �ν��Ͻ� ����
		MyVector v = new MyVector();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);		//-- ���� �ڷᱸ���� ���� ����
		v.addFloat(real);		//-- ���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);			//-- ���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);//-- ���� �ڷᱸ���� ���� �迭 ����

		v.write();
	}
}
//--==>>
/*
���� ��� ���� : 4
������ : 5
�Ǽ��� : 3.14
���ڿ� : �ȳ��ϼ���
���ڹ迭 : study
*/