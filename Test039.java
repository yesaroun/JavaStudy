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

// 2 ù ��° ���� vs �� ��° ���� ũ�� �� �� �ڸ� �ٲ�

// 3 �� ��° ���� vs �� ��° ���� ũ�� �� �� �ڸ� �ٲ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test039{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("ù ��° ���� �Է� : ");
		int nNum1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		int nNum2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		int nNum3 = Integer.parseInt(br.readLine());
		
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
		
	}
}