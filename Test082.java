/*==============================
      ���� �迭 ����
==============================*/

// �迭�� �⺻�� Ȱ��

// ������ �������� ����ִ� �迭�� ���� �����͵� ��
// ¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ�
// ���α׷��� �����Ѵ�.

// �迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8

// ���� ��)
// �迭 ��� ��ü ���
// 4 7 9 1 3 2 5 6 8
// ¦�� ������ ���
// 4 2 6 8
// 3�� ��� ������ ���
// 9 3 6

public class Test082{
	public static void main(String[] args){
		// �迭 ���� �� �ʱ�ȭ
		// ��� ��
		/*
		int[] a = new int[9];
		a[0] = 4;
		a[1] = 7;
		    :
		a[8] = 8;
		*/

		// ��� ��
		int[] a = {4, 7, 9, 1, 3, 2, 5, 6, 8, 11, 12};
		
		
		//System.out.println(arr);
		
		// �� �Ϲ����� ������ ��� ������ ����ϴ� ����(���)���δ�
		//	  �迭�� ��� �����͵��� ����� �� ����.

		// �� �迭 arr�� ����(���� ����) Ȯ��
		//		: arr.lenght


		System.out.println("�迭 ��� ��ü ���");

		for(int i=0; i<a.length; i++){
			System.out.printf("%d ", a[i]);

		}
		System.out.println();



		System.out.println("¦�� ������ ���");
		
		for(int i=0; i<a.length; i++){
			if(a[i] % 2 == 0){
				System.out.printf("%d ", a[i]);
			}
		}
		System.out.println();


		System.out.println("3�� ��� ������ ���");

		for(int i=0; i<a.length; i++){
			if(a[i] % 3 == 0){
				System.out.printf("%d ", a[i]);
			}
		}
		System.out.println();
		
	}
}

// ��� ���
/*
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8 11 12
¦�� ������ ���
4 2 6 8 12
3�� ��� ������ ���
9 3 6 12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/