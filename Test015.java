/*
   ### �ڹ� �⺻ ���α׷��� ###
*/

// ����
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� : 3 
// - �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� :

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;

public class Test015{
	public static void main(String[] args) throws IOException{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ����
		int base, height;        //-- �غ��� ����
		double area;			 //-- ����          check~!!!
		
		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ���� underLength �� ��Ƴ���
		base = Integer.parseInt(br.readLine());
		
		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է� : ");

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());
		

		// �� �ﰢ������ ���� ���ϴ� ���� ó��
		//area = base * height / 2;
		//      ������  ������ / ������ �� ���� ��� ����(��, ����  ���ϰ� �������� ����)
		
		//area = (double) (base * height / 2);    //--(x)
		//area = (double) base * height / 2;
		//area = base * (double)height / 2;
		//area = base * height / 2.0;
		area = base * height / 2.0;
		//     ������  ������/ �Ǽ��� �� �Ǽ� ��� ����
		
		// �� �Ǽ� �ڷ����� ��������� ������ ��������
		//	  �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//	  ������ ��2���� �ƴ�, �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		//    �� ������ �Ǽ� ������� ó���ȴ�.

		
		// ��� ���
		System.out.printf("�غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f%n"
			, base, height, area);
		
		
	}
}

//��°�
/*
�� �ﰢ���� ���� ���ϱ� ��
- �ﰢ���� �غ� �Է� : 3
- �ﰢ���� ���� �Է� : 5
�غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/