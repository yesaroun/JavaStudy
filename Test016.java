/*
   ### �ڹ� �⺻ ���α׷��� ###
*/

// ������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է� �޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ������
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ===[���]===
// �̸� : ������
// ���� : 240

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016{
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�ٸ� ������ BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		
		// �ֿ� ���� ����
		String srtName;
		int nKoreanScore, nEnglishScore, nMathScore, nTotalScore;
		

		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		srtName = br.readLine();
		
		// - ����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nKoreanScore = Integer.parseInt(br.readLine());
		
		// - ����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nEnglishScore = Integer.parseInt(br.readLine());
		
		// - ����ڿ��� �Ƴ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nMathScore = Integer.parseInt(br.readLine());
		

		// - �� ���� ������ ����ִ� ������(����ڰ� �Է��� ������)���� 
		//   �����Ͽ� ������ �����ϰ�
		//	 �� ����� ���� ������ ��Ƴ���
		nTotalScore = nKoreanScore + nEnglishScore + nMathScore;

		System.out.println("\n===[���]===");
		System.out.printf("�̸� : %s%n���� : %d%n", srtName, nTotalScore);
	}
}