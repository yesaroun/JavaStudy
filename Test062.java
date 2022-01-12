/*===========================================
  ���� ����  �帧�� ��Ʈ��(�ݺ���) ����
=============================================*/

// �ݺ���(for) �ǽ�
// ���� for��(�ݺ����� ��ø) �� Ȱ���� ������ ��� �ǽ�


// ���� ��)
/*
[2��]
2 * 1 = 2     3 * 1 = 3
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

[6��]
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
*/

//�� 2��ø * 2
//�� 3��ø * 1

public class Test062{
	public static void main(String[] args){
		
		/*
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 5; j++){
				System.out.printf("%d * %d = %d	", j, i, (j * i));
			}
		System.out.println();
		}
		System.out.println();

		for(int i = 1; i <= 9; i++){
			for(int j = 6; j <= 9; j++){
				System.out.printf("%d * %d = %d	", j, i, (j * i));
			}
		System.out.println();
		}

		System.out.println("----------------------------------------------------------");


		
		for(int k = 1; k<=3; k += 2){
			for(int i = 1; i <= 9; i++) {
				for(int j = k * 2; j < k * 2 + 4; j++){
					System.out.printf("%d * %d = %d	", j, i, (j * i));
				}
				System.out.println();
			}
			System.out.println();
		}
		*/

		// ���� Type A ����

		// �� Test061�� ���Ͽ�
		//	  ����� ������ �ٸ��� ������
		//	  �ݺ����� ���� �帧�� �޶����� �Ѵ�.

		//	�� 1�� ����..
		//		�ܰ� �������� ���� ��ġ��
		//		�޶��� ���¿����� �ݺ��� ����
		/*
		for(int i = 1; i<9; i++){			// �� �� �������� ��
			for (int j=2; j<=5 ; j++)		// �� �� ��
			{
				System.out.printf("%4d * %d = %2d", j, i, (j*i));
			}
			System.out.println();   //����
		}
		*/

		// �� 2���� ó���� �����
		//	  �� �������� �ݺ��ϴ� �ݺ��� ����
		//	  (check!!! �ݺ����� (2)�� ����� ����)

/*
		for (int h=0; h<=1 ; h++)		//check!!
		{
			for (int i=1; i<=9; i++ )	// �� �� �������� ��
			{
				for (int j=2; j<=5; j++) // �� �� ��
				{
					System.out.printf("%4d * %d = %2d", (j+h), i, (j*i));
				}
				System.out.println();
			}
			System.out.println();
		}
*/
		
		// �� ���� ������
		//		�� �������� ������ ó���ϴ� ��������
		//		���ܿ� ���� �־��� ȯ��(h�� ��)�� Ȱ���ϴ� �������
		//		���� �ݺ��� 3��÷
		/*
		for (int h=0; h<=1 ; h++)		//���� ���� -> 0 1 -> �� �� �ݺ�
		{
			for(int i = 1; i<=9; i++)	//�������� �� ���� -> 123456789
			{
				for (int j=2; j<=5; j++) // �� ���� -> 23456789
				{
					system.out.printf("%4d * %d = %2d", h*4+j, i, ((h*4+j)*i))
				}
				System.out.println();
			}
			System.out.println();
		}
		*/

		// ���� type B ����

		int a, b, c;
		for (a=2; a<=6; a+=4)
		{
			for (b=1; b<=9; b++)
			{
				for (c=a; c<=(a+3); c++)
				{
					System.out.printf("%4d * %d = %2d", c, b, (c*b));
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}