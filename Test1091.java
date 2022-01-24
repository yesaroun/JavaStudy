/*=======================================
    ���� ����(Sort) �˰��� ����
=======================================*/

/*
�� ����
	: �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
	: ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
		�� ���� ����... �˻��ϱ� ����

�� ������ ����
	: ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ���� ...
*/

// ���� ����(Selection Sort)

// ���� ��)
// Source Data : 52 42 12 62 60
// Sosrted Data : 12 42 52 60 62

public class Test1091
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};	

		int i, j;

		System.out.print("Source Data : ");
		
		/*
		for(i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		// ���� for��(foreach ����)
		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();


		// Selection Sort
		for (i=0; i<a.length-1; i++)				// ��~~~		�� �񱳱��ص�����(0    1   2  3)
		{
			for (j=i+1; j<a.length; j++)			// ������~~~    �� �񱳴������(1234 234 34 4)
			{
				if (a[i] > a[j])					// �������� ����		a[i] > a[j] : �������� ����
				{
					// �ڸ��ٲٱ�
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}



		System.out.print("Sourted Data : ");
		/*
		for(i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		for(int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();


	}
}