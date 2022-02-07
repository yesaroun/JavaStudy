/*==========================================================
    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
============================================================*/

// ���� �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
//	�� �ڷ���


import java.util.Vector;

// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData extends Vector<Object>
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;		//-- �̸�
	private int age;			//-- ����

	// getXxx() �� getter
	// setXxx() �� setter

	// getter / setter ����
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// ������(�Ű����� 2���� ������) �� ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// �� ����� ���� �����ڰ� ������ ���
	//	  default �����ڰ� �ڵ��� ���Ե��� �ʱ� ������
	//	  defualt ������ ������ �����ڸ� ����� ���� �����ڷ�
	//	  �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//	  (��, �ݵ�� �����ؾ� �� �ʿ�� ����)

	// ������(�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		name = "";
		age = 0;
	}

}

public class Test164
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();

		MyData md1 = new MyData();
		MyData md2 = new MyData();
		MyData md3 = new MyData();

		md1.setName("ȫ����");
		md1.setAge(13);

		md2.setName("������");
		md2.setAge(7);

		md3.setName("������");
		md3.setAge(78);
		

		// ���� �ڷᱸ�� v ��
		// ȫ���� 13�� / ������ 7�� / ������ 78��
		// ��Ƴ���


		v.addElement(md1);
		v.addElement(md2);
		v.addElement(md3);
		System.out.println(v);

		// recordŬ���� �� �迭 �� ��Ʈ�̴�

	}
}