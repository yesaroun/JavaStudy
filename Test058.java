/*===========================================
  ���� ����  �帧�� ��Ʈ��(�ݺ���) ����
=============================================*/

// �ݺ���(do~while) �ǽ�

// ����ڷκ��� ���� ���� ���� ������ �Է¹ް�,
// �� ���� �Ի��Ͽ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, -1�� �ԷµǴ� ����
// �Է��� �����ϰ� �׵��� �Էµ� ������ ���� ������ִ� ���α׷��� �����Ѵ�.
// ��, -1�� �Է� ���� Ŀ�ǵ�� Ȱ���Ѵ�.
// do~while ���� Ȱ���Ͽ� ������ �ذ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ����1 �Է� : 10
// ����2 �Է� : 5
// ����3 �Է� : 8
// ����4 �Է� : 9
// ����5 �Է� : -1

// >> ������� �Էµ� ������ �� : ������


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test058{
	public static void main(String[] args) throws IOException{
		
		//-----------�� Ǯ��------------
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nCount = 1;
		int nSum = 0;
		int nNum;

		do{
			System.out.printf("����%d �Է� : ", nCount);
			nNum = Integer.parseInt(br.readLine());

			nCount++;
			nSum += nNum;

		}while(nNum != -1);
		
		System.out.println(">> ������� �Էµ� ������ �� : "+ (nSum + 1));
		*/


		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;			//-- ������� �Է°��� ��Ƴ� ����
		int sum = 0;		//-- �������� ��Ƴ� ����
		int n = 1;			//-- ���� ������ Ȱ���ϸ� �� ��° �Է°������� ��Ƴ� ����


		// ���� �� ó��
		do{
			System.out.printf("%d��° ���� �Է�(-1 ����) : ", n);
			num = Integer.parseInt(br.readLine());
			sum += num;			// sum�� num ��ŭ ����~~!!

			n++;

		}while(num != -1);		//-- num�� -1�� �ƴ� ��� (����ؼ� �ݺ�)
		
		// �׽�Ʈ(Ȯ��)
		// System.out.println("-1 �Է� Ȯ��");

		//��� ���
		System.out.printf("\n>> ������� �Էµ� ������ �� : %d\n", (sum+1));
	}
}

// ���� ���
/*
1��° ���� �Է�(-1 ����) : 10
2��° ���� �Է�(-1 ����) : 20
3��° ���� �Է�(-1 ����) : 30
4��° ���� �Է�(-1 ����) : 40
5��° ���� �Է�(-1 ����) : -1

>> ������� �Էµ� ������ �� : 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/