/*===========================================
  ���� ����  �帧�� ��Ʈ��(���) ����
=============================================*/

// switch �� �ǽ�

// ����ڷκ��� 1���� 3������ ���� �� �ϳ��� �Է� �޾�
// �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// �� switch ���� �Ϲ� ���� ����Ѵ�.
// �� switch ���� �⺻ ���� ����ϵ�,
//    ��break���� �� �� ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�

// ������ ���� �Է�(1~3) : 7
// �Է� ����~!!!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test044{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է�(1~3) : ");
		int num = Integer.parseInt(br.readLine());
		
		/* �� switch ���� �Ϲ� ���� ����Ѵ�.
		switch(num){
			case 3:
				System.out.println("�ڡڡ�");
				break;
			case 2:
				System.out.println("�ڡ�");
				break;
			case 1:
				System.out.println("��");
				break;
			default:
				System.out.println("�Է� ����~!!!");
				break;
		}
		*/

		// �� switch ���� �⺻ ���� ����ϵ�,
		//    ��break���� �� �� ���� ����� �� �ֵ��� �����Ѵ�.
		switch(num){
			case 3:
				System.out.print("��");
			case 2:
				System.out.print("��");
			case 1:
				System.out.print("��\n");
				break;
			default:
				System.out.println("�Է� ����~!!!");
				break;
		}
		
	}
}