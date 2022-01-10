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

// ����ڷκ��� ������ ������ �Է¹޾�
// ������ ���� �Ǻ� ����� ����ϴ� ���α׷��� �����Ѵ�.

// 2�� ��� / 3�� ��� / 2�� 3�� ��� / 2�� 3�� ��� �ƴ�

// ���� ��)
// ������ ���� �Է� : 4
// 4 �� 2�� ���

// ������ ���� �Է� : 9
// 9 �� 3�� ���

// ������ ���� �Է� : 6
// 6 �� 2�� 3�� ���

// ������ ���� �Է� : 17
// 17 �� 2�� 3�� ��� �ƴ�

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է� : ");
		int nNum = Integer.parseInt(br.readLine());
		
		String result = "Ȯ�κҰ�";

		if ((nNum % 2 == 0) && (nNum % 3 == 0)){
			result = "2�� 3�� ���\n";
		} else if(nNum % 2 == 0) {
			result = "2�� ���\n";
		} else if(nNum % 3 == 0) {
			result = "3�� ���\n";
		} else {
			result = "2�� 3�� ��� �ƴ�\n";
		}

		System.out.printf("%d �� %s", nNum, result);

	}
}