/*==========================================
  ���� ����  �帧�� ��Ʈ��(���) ����
==========================================*/

// switch �� �ǽ�

/*
�� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
   switch(����)
   {
	   case ���1 : ����1; [break;]
	   case ���2 : ����2; [break;]

	   [default : ����n+1; [break;]]
	}

	switch���� ���İ� case�� ����� 
	byte, short, int, long ���̾�� �Ѵ�.(���� ���¸� ����)

	case �� �ڿ� break; �� ���� ������ ���
	���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (�� �⺻ ��)
	break;�� ������ ���
	�ش� �������� ������ ���� �� switch���� ����������. (�� �Ϲ� ��)
*/

// ����ڷκ��� �̸�, ��������, ���� ����, ���������� �Է� �޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� ~ 100�� : A        80~89�� : B
// 70~79�� : C			   60~69�� : D
// 60�� �̸� : F

// ���� ��)
// �̸� �Է� : ȫ����
// ���� ���� : 90��
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ȫ�����Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, mat, tot;
		double avg;
		// int avg;
		char grade;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3;

		switch((int) avg / 10){
			case 10: case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F';
		}

		System.out.printf("����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf("����� ������ %d �̰�, ����� %.2f �Դϴ�.%n", tot, avg);
		System.out.printf("����� ����� %c �Դϴ�.\n", grade);
		
	}
}

// ���� ���
/*
�̸� �Է� : dd
�������� �Է� : 88
�������� �Է� : 85
�������� �Է� : 70
����� �̸��� dd�Դϴ�.
����� ������ 243 �̰�, ����� 81.00 �Դϴ�.
����� ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/