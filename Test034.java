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

// �� ������ �Է¹޾� Ȧ��/¦�� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
//	  ��, ���� if ������ ����Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("������ �Է��ϼ��� : ");
		int nNum = Integer.parseInt(br.readLine());
		
		String strResult;
		/*
		if (nNum % 2 == 0){ 
			strResult = "¦��";
		} else{
			strResult = "Ȧ��";
		}
		*/
		if (nNum % 2 == 0)
		{ strResult = "¦��";
		}

		if (nNum % 2 == 1)
		{ strResult = "Ȧ��";
		}

		System.out.printf("���� %d�� %s�Դϴ�.\n", nNum, strResult);

	}
}