/*
  ### �ڹ� �⺻ ���α׷��� ###
*/

// �ڹ��� �⺻ ����� : System.in.read()

/*
 ��System.in.read()�� �޼ҵ�� �� ���ڸ� �����´�.
  ��, �Է¹���  �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
  ASCII Code ������ ��ȯ�Ѵ�.
*/

//���� ��)
// �� ���� �Է� : A
// �� �ڸ� ���� �Է� : 8

// �Է��� ���� : A
// �Է��� ���� : 8


import java.io.IOException;

public class Test017{
	public static void main(String[] args) throws IOException{
		
		// �ֿ� ���� ����
		char ch;
		int num;

		// �߰� ���� ����
		char temp;
		
		// ���� �� ó��
		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �ϳ� �Է��ϼ��� : ");     // A
		ch = (char) System.in.read();                    // 65
		
		// �Է� ��⿭�� �����ִ� ��\r���� ��\n���� ��ŵ(�ǳʶٱ�)
		System.in.skip(2); // �� 2���� ��ŵ�ϳĸ� ���Ϳ��� ����� �������� ���°�(ã�ƺ���)�ΰ��� �ֱ� ����
		//-- �Ű�����(2)�� ���� �� ���ڸ� ���� �ʰ� �ǳʶڴ�.(������.)

		System.out.print("�� �ڸ� ���� �Է� : ");
		// num = System.in.read();
		temp = (char) System.in.read();

		// �Է¹��� n�� 48��ŭ ���ҽ��Ѷ�
		// num -= 48;


		// ��� ���
		System.out.println();
		System.out.println("�Է��� ���� : " + ch);
		// System.out.println("�Է��� ���� : " + num);
		System.out.println("�Է��� ���� : " + temp);

	}
}

//���� ���
/*
���� �ϳ� �Է��ϼ��� : a
�� �ڸ� ���� �Է� : 7

�Է��� ���� : a
�Է��� ���� : 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/