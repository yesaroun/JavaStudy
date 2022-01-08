/*
  ### �ڹ� �⺻ ���α׷��� ###
*/

//������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ���� (Ű���� ���� ��ġ)

// ���� ������ �Է� : 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014{
	public static void main(String[] args) throws IOException{
		//Ű���� ����(����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//-------------------------------------
		// ���� �Է��� �о���̴� ��ġ
		//                                     ---------------------
		//                                     ����Ʈ �� ���� ������
		//                                                           ----------
		//                                                           ����Ʈ �Է°�

		
		// �ֿ� ���� ����
		int r;                                   //-- ������
		double PI = 3.141592;                    //-- ������ (������ ���ȭ)
		double a, b;							 //-- ����, �ѷ�


		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");
		
		//�� ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���
		// r = br.readLine();       //-- BufferedReader �� readLine() �� ���ڿ� ��ȯ
		// r = "80";

		// r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("80");
		// r = 80;

		// Integer.parseInt("80") �� 80
		//-- �Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
		//   ��, �� �� �Ѱܹ޴� ���ڿ� �����ʹ� ���ڸ��(NumberFormat)�̾�� �Ѵ�.

		r = Integer.parseInt(br.readLine());
		//-- ����ڰ� �Է��� ���� BufferedReader(br)�� readLine()
		//   �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		//   �� ���� Integer.pparseInt() �� ���� ������(������)���� ��ȯ�� ��
		//   ���� ������ ������ ���� r�� ��Ƴ���

		// �� ���� �� �ѷ� �Ի�(����)
		a = r * r * PI;
		b = r * 2 * PI;


		// ��� ���
		System.out.printf("�������� %d�� ���� ���� : %.2f �ѷ� : %.2f%n", r, a, b);


	}
}

// ��� ���
/*
���� ������ �Է� : 45
�������� 45�� ���� ���� : 6361.72 �ѷ� : 282.74
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/