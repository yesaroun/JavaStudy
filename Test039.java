/*==========================================
  ���� ����  �帧�� ��Ʈ��(���) ����
==========================================*/

// if ��
// if ~ else �� �ǽ�

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 7
// �� ��° ���� �Է� : 70
// �� ��° ���� �Է� : 42

// >> ���� ��� : 7 42 70

// ��Ʈ
// 1 ù ��° ���� vs �� ��° ���� ũ�� �� �� �ڸ� �ٲ�
// ù ��° ������ �� ��° �������� Ŭ ��� �ڸ� �ٲ�

// 2 ù ��° ���� vs �� ��° ���� ũ�� �� �� �ڸ� �ٲ�
// ù ��° ������ ����° �������� Ŭ ��� �ڸ� �ٲ�

// 3 �� ��° ���� vs �� ��° ���� ũ�� �� �� �ڸ� �ٲ�
// �� ��° ������ ����° �������� Ŭ ��� �ڸ� �ٲ�


// test26 ���� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test039{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//-- ����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����
		System.out.print("ù ��° ���� �Է� : ");
		int nNum1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		int nNum2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		int nNum3 = Integer.parseInt(br.readLine());
		

		if(nNum1 >= nNum2) {    // ù ��° ����(nNum1)�� �� ��° ����(nNum2)���� ũ�ٸ� 
			nNum1 = nNum1^nNum2;
			nNum2 = nNum2^nNum1;
			nNum1 = nNum1^nNum2;
		}						// �ڸ� �ٲ�
		
		
		if(nNum1 >= nNum3) {    // ù ��° ����(nNum1)�� ����° ����(nNum3)���� ũ�ٸ� 
			nNum1 = nNum1^nNum3;
			nNum3 = nNum3^nNum1;
			nNum1 = nNum1^nNum3;
		}						// �ڸ� �ٲ�


		if(nNum2 >= nNum3) {    // �� ��° ����(nNum2)�� ����° ����(nNum3)���� ũ�ٸ�
			nNum2 = nNum2^nNum3;
			nNum3 = nNum3^nNum2;
			nNum2 = nNum2^nNum3;
		}						// �ڸ� �ٲ�

		System.out.printf("\n>> ���� ��� : %d %d %d\n", nNum1, nNum2, nNum3);


		/*
		int nSmall1, nSmall2, nSmall3;


		if(nNum1 >= nNum2 && nNum1 >= nNum3){
			nSmall3 = nNum1;
			if(nNum2 >= nNum3){
				nSmall2 = nNum2;
				nSmall1 = nNum3;
			} 
		} else {
			if(nNum2 >= nNum3){
				nSmall3 = nNum2;
				if(nNum1 >= nNum3){
					nSmall2 = nNum1;
					nSmall1 = nNum3;
				}
			}else{
				nSmall3 = nNum3;
				if(nNum2 >= nNum1){
					nSmall2 = nNum2;
					nSmall1 = nNum1;
				}else{
					nSmall2 = nNum1;
					nSmall1 = nNum2;
				}
			} 
		}
		
		System.out.printf("%d - %d - %d\n", nSmall1, nSmall2, nSmall3);
		*/
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 17
�� ��° ���� �Է� : 23
�� ��° ���� �Է� : 10

>> ���� ��� : 10 17 23
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/