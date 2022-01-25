/*=================================
    ���� Ŭ���� ��� ����
=================================*/

// �߻� Ŭ����(Abstract)

/*
�� �߻� Ŭ����(abstract)��

	���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
	���� Ŭ�������� �������̵�(Overrideing)�� ������ ����Ǵ� �޼ҵ忡 ����
	�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

�� ���� �� ����
	
	[��������������] abstract class Ŭ������
	{
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
	}

�� Ư¡

	Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 �����Ҷ�
	�� Ŭ������ Ŭ���� �տ� ��abstract�� Ű���带 �ٿ�
	�߻� Ŭ������ ����ؾ��ϸ�,
	�߻� Ŭ������ ������ ��쿡��
	�ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
	�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
	��ü�� ������ �� ���� ���̴�.

	��, �߻� Ŭ������ ���������� ������ �� ���� ������
	����� ���ؼ��� �����ϸ�
	�߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
	�ݵ�� �߻� �޼ҵ带 �������̵�(Overriding) �ؾ� �Ѵ�.

�� ��abstract�� Ű�����
	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ��� �Ұ����ϴ�.
*/


// �߻� Ŭ����
abstract class SortInt117
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	// �߻� �޼ҵ�
	protected abstract void sorting();

	protected int dataLegth()
	{
		return value.length;
	}

	// ��final�� Ű����� ����
	// �� Ŭ����(SortInt117)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������(Method Overriding) �� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if(x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	
	//��final�� Ű����� ����
	// �� Ŭ����(SortInt117)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������(Method Overriding)�� �� ����.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}


// SortInt117(�߻� Ŭ����)�� ��ӹ��� Ŭ���� �� �ϴ��� �߻� Ŭ����
// �� �߻� �޼ҵ�(sorting())
public class Test117 extends SortInt117
{
	/*
		private int[] value;

		protected void sort(int[] value)
		{
			this.value = value;
			sorting();
		}
	
		// �߻� �޼ҵ�
		protected abstract void sorting();

		protected int dataLegth()
		{
			return value.lenght;
		}

		protected final int compare(int i, int j)
		{
			int x = value[i];
			int y = value[j];
			if(x==y)
				return 0;
			else if(x>y)
				return 1;
			else
				return -1;
		}

	protected final void swap(int i, int j)
	{
		int temp = valeue[i];
		value[i] = value[j];
		value[j] = temp;
	}
		*/

	int i, j;

	static int[] data = {7, 10, 3, 8, 7};

	@Override
	protected void sorting()
	{
		for(int i=0; i<data.length-1; i++)
		{
			for(int j=i+1; j<data.length; j++)
			{
				if(data[i]>data[j])
				{
					data[i] = data[i]^data[j];
					data[j] = data[j]^data[i];
					data[i] = data[i]^data[j];
				}
			}
		}
	}
	

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for(int n : data)
			System.out.print(n + " ");
		System.out.println();
		
		Test117 ob = new Test117();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for(int n : data)
			System.out.print(n + " ");
		System.out.println();
	}
}