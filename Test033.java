/*==========================================
  ���� ����  �帧�� ��Ʈ��(���) ����
==========================================*/

// if ~ else �� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if~else��, ���ǿ�����, ����if��(if�� ��ø),
//    switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���,
//	  Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� �̸�, ��������, ���� ����, ���������� �Է� �޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� ~ 100�� : A        80~89�� : B
// 70~79�� : C			   60~69�� : D
// 60�� �̸� : F

// ��, BufferedReader �� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�,
// printf()�޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

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



public class Test033{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strName;
		String strGrade;
		int nKor, nEng, nMath;
		int nTotal; 
		double fAve;


		System.out.print("�̸� �Է� : ");
		strName = br.readLine();

		System.out.print("���� ���� : ");
		nKor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		nEng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		nMath = Integer.parseInt(br.readLine());

		nTotal = nKor + nEng + nMath;
		fAve = nTotal / 3.0;

		// ������ Ǯ�̹�
		/*
		if(fAve >= 90) {
			strGrade = "A";
		} else if(fAve >= 80) {
			strGrade = "B";
		} esle if(fAvae >= 70) {
			strGrade = "C";
		} else if(fAvg >= 60){
			strGrade = "D";
		} else {
			strGrade = "F";
		}

		*/

		switch((int)nAve / 10) {
			case 10:
			case 9:
				strGrade = "A";
				break;
			case 8:
				strGrade = "B";
				break;
			case 7:
				strGrade = "C";
				break;
			case 6:
				strGrade = "D";
				break;
			default:
				strGrade = "F";
				break;		
		}
		
		System.out.println();
		System.out.printf("����� �̸��� %s�Դϴ�.\n", strName);
		System.out.printf("���� ������ %s\n", nKor);
		System.out.println("���� ������ " + nEng);
		System.out.println("���� ������ "+nMath);

		System.out.printf("������ %d�̰�, ����� %.2f�Դϴ�.", nTotal, nAve);
		System.out.printf("����� %s�Դϴ�.\n", strGrade);



		
	}
}