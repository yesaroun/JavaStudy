/*=======================================
    ���� ����(Sort) �˰��� ����
=======================================*/

// ���� ���� ����(Bubble Sort)

// �� �տ��� �� Selection Sort(Test109) �� Bubble Sort(Test110) �� ������ ����
//		(�� �ݺ��� Ƚ���� ����)
//		������, ���� Bubble Sort�� ��� �������� ������ ����
//		�Ϲ� Bubble Sort�� Selection Sort���� ������ ���� �� �ִ�.

// ���� ������ : 61 15 20 22 30
//				 15 20 22 30 61  - 1ȸ�� (����(�ڸ� �ٲ�) �߻� �� true) �� ���� ȸ�� ���� ��
//				 15 20 22 30 61	 - 2ȸ�� (���� �߻� �� false) �� ���� ȸ�� ���� X

//==> 1ȸ�� ����... 2ȸ�� ����... �� �غ��Ҵ���...
//	  2ȸ������ ����(�ڸ��ٲ�)�� ���� �Ͼ�� �ʾұ� ������
//	  ���ʿ��� �߰� ����(�� �̻��� ȸ��)�� ���ǹ��� ������ �Ǵ��Ͽ�
//	  �������� �ʴ´�.

// ���� ��)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50


public class Test1111
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};

		System.out.print("Source Data : ");
		for(int n : a)
		{
			System.out.printf("%d ", n);
		}
		System.out.println();
		

		int pass =0;
		boolean flag;

		// ���� Bubble Sort ����
		do
		{
			flag = false;						// �̹� ȸ�������� �ڸ� �ٲ��� �Ͼ�� ���� ���̴�...
			pass++;

			for(int i=0; i<a.length-pass; i++)
			{	
				//�׽�Ʈ
				//System.out.println("��");

				if(a[i] > a[i+1])
				{
					// �ڸ��ٲ�
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];

					flag = true;
					//-- �� �� ���̶� ����(�ڸ��ٲ�)�� �߻��ϰ� �Ǹ�
					//	 flag ������ true�� ����~!!!
				}
			}
		}
		while (flag);
		//--	flag ������ false��� ����
		//		ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� �ʴ� ����
		//		�� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ� ����~!!!

		

		System.out.print("Sorted Data : ");
		for(int n : a)
		{
			System.out.printf("%d ", n);
		}
		System.out.println();

	}
}