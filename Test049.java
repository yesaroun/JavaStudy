/*===========================================
  ���� ����  �帧�� ��Ʈ��(�ݺ���) ����
=============================================*/

// �ݺ���(while) �ǽ�

// ���� ��)
// 1 ���� 100���� ������ �� : 5050
// 1 ���� 100���� ¦���� �� : 2550
// 1 ���� 100���� Ȧ���� �� : 2500

public class Test049{
	public static void main(String[] args){

		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int a = 1, nSum, nEvenSum, nOddSum;
		nSum = nEvenSum = nOddSum = 0; //-- �̰� ���� ��������!!
		/*
		int nSum = 0;
		int nEvenSum = 0;
		int nOddSum = 0;
		*/

		while (a <= 100){
			nSum += a;
			if(a % 2 == 0){
				nEvenSum += a;
			} else if(a % 2 == 1) {
				nOddSum += a;
			} else{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}
			a++;
		}

		// ��� ���
		System.out.println("1���� 100���� ������ �� : " + nSum);
		System.out.println("1���� 100���� ¦���� �� : " + nEvenSum);
		System.out.println("1���� 100���� Ȧ���� �� : " + nOddSum);
		
	}
}
// ���� ���
/*
1���� 100���� ������ �� : 5050
1���� 100���� ¦���� �� : 2550
1���� 100���� Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/