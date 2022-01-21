/*=======================================
 ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
=======================================*/

// ���ǿ��� ���̴� ������ �ƴ�
/*
�� �ֹε�Ϲ�ȣ ���� ����

	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	12356-1234567 (�ֹι�ȣ)
	***** ****** -------------------�� �ڸ����� ���ϱ�
	23567 892345  (�� �ڸ��� ������ ��)

	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * 
		2 3 4 5 6 7   8 9 2 3 4 5
		---------------------------
		�� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15 

			== 217


	�� ������ ������� 11�� ������ ������������ ���Ѵ�.
		  19
		------
	 11| 217
		 11
		 ----
		 107
		  99
		 ----
		   8 �� ������(��)

	�� 11���� ������ 8�� �� ������� ���Ѵ�.
	   11 - 8 �� 3


	   �� ���� ó�� �������� �������� 0�� ��� �� 11 - 0 �� 11
							 �������� 1�� ��� �� 11 - 1 �� 10
				�̸� �ٽ� 10���� ������ �������� ���Ѵ�.		11 �� 1
																10 �� 0
		
	�� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	   ��ġ�ϴ����� ���θ� ���Ѵ�.

	   ��ġ     �� ��ȣ�� �ֹι�ȣ
	   ����ġ   �� �߸��� �ֹι�ȣ
*/

// ���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 12356-12345678 �� �Է� ���� �ʰ�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 12356-123456   �� �Է� ���� �̴�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 12356-123456	  �� ��ȿ�� �ֹ� ��ȣ
// >> ��Ȯ�� �ֹι�ȣ~!!!

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 12356-123456	  �� ��ȿ���� ���� �ֹ� ��ȣ
// >> �߸��� �ֹι�ȣ~!!!


// �� ���� �ذ��� ���� �߰� ��~!!!

//		�迭.length					�� �迭�� ����(�迭���� ����) ��ȯ
//		���ڿ�.length()				�� ���ڿ��� ���� ��ȯ
//		���ڿ�.substring()			�� ���ڿ� ����
//		���ڿ�.substring(m, n)		�� ���ڿ��� n��° ��ġ���� n-1��° ��ġ���� ����(�ε����� 0����)
//		���ڿ�.substring(m)			�� ���ڿ��� m��° ��ġ���� ���ڿ��� ������ ����(�ε����� 0����)
	

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Scanner;

public class Test108
{
	public static void main(String[] args) throws IOException
	{	
		/*
		//�׽�Ʈ
		String strTemp = "������";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		//----------------------------------------------------

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//--==>> NOPQ

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 57));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ
		*/
		
		
		Scanner sc = new Scanner(System.in);

		String sNum1, sNum2;  // ���ڸ� �ѷ� ���� ���ڿ�

		int[] nNum1 = new int[8]; // �ѷ� ���� ���ڿ��� ���� ���� �迭
		int[] nNum2 = new int[4];

		int total = 0;			// ���� ���� ����


		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		String sSsNum = sc.nextLine();

		if(sSsNum.length() < 14 || sSsNum.length() > 14)
		{
			System.out.println(">> �Է� ����~!!!");
			return;
		}

		

		sNum1 = sSsNum.substring(0, 6) + sSsNum.substring(7, 9);
		sNum2 = sSsNum.substring(10, 14);

		// �迭�� ���� �ֱ�
		for(int i=0; i<sNum1.length()-1; i++)
		{
			nNum1[i] = Integer.parseInt(sNum1.substring(i,i+1));
		}
		for(int i=0; i<sNum2.length()-1; i++)
		{
			nNum2[i] = Integer.parseInt(sNum1.substring(i,i+1));
		}


		// ������ �� ���ϱ�
		for(int i=2; i<=9; i++)
		{
			total += nNum1[i-2] * i;
		}
		for(int i=2; i<=5; i++)
		{
			total += nNum2[i-2] * i;
		}

		// ������
		int remain = total % 11;
		
		// 10�̰ų� 11�� ���� ó��
		if(remain==0 || remain==1)
		{
			remain = remain % 10;
		}
		
		// 11���� ����
		int last = 11 - remain;
	
		// ������ �ڸ� ���� ������ ��ȯ
		int nSsNumLast = Integer.parseInt(sSsNum.substring(13));

		// Ȯ��
		if(nSsNumLast == last)
		{
			System.out.println("��Ȯ�� �ֹι�ȣ~!!!");
		} 
		else
		{
			System.out.println("�߸��� �ֹι�ȣ~!!!");
		}






		



		

		
	}
}