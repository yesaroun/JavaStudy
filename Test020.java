/*===================================
  ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// �ڹ��� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.



public class Test020{
	public static void main(String[] args) {
		// �ֿ� ���� ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸� ���� ���� ���� �Է�(���� ����) : ");

		// - ����ڰ� �Է��� �����͸� �� ������ �� ���� ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// - ���� ����
		tot = kor + eng + mat;


		// ��� ���
		System.out.println();
		System.out.printf(">> �̸� : %s%n>> ���� : %d%n", name, tot);
	}
}

//���� ���
/*
�̸� ���� ���� ���� �Է�(���� ����) : dd 1 2 3

>> �̸� : dd
>> ���� : 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/