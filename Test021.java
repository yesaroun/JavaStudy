/*===================================
  ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// �ڹ��� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test021{
	public static void main(String[] args){
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// ���� �� ó��
		System.out.print("�̸�, ����, ����, ���� �Է�(��,������) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//              -----------
		//            �̿���,90,80,70

		// sc = new Scanner("�̿���,90,80,70").useDelimiter("\\s*,\\s*");
		//                                                    \s*,\s*
		//                                                    \s* : ��� ���ڿ�
		// �ٵ� \ �ϳ����� �ڹٰ� �ٸ��ŷ� �ν��� �� �־ \\�̷��� �ΰ� ���� ("\\" �� "\")


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor + eng + mat;


		// ��� ���
		System.out.println("\n>> �̸� : " + name);
		System.out.println(">> ���� : " + tot);
		
	}	
}

// ������
/*
�̸�, ����, ����, ���� �Է�(��,������) : dd,80,70,60

>> �̸� : dd
>> ���� : 210
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/