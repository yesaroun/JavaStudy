/*==============================
      ���� �迭 ����
==============================*/

// �迭�� �迭(2���� �迭)

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
*/

public class Test089{
	public static void main(String[] args){
		

		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		int n;

		for (int i=0; i<arr.length ; i++ )
		{
			n=1+i;

			for (int j=0; j<arr[i].length; j++)
			{
				// �׽�Ʈ (Ȯ��)
				//System.out.print(" i: " + i + ", j: " + j);

				arr[i][j] = n;
				n++;
			}
			//System.out.println();
		}

		// �迭�� �迭 ��ü ��� ���
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.printf("%2d", arr[i][j]);
			}

			System.out.println();
		}
		
		// �� Ǯ��
		/*
		int[][] array = new int[5][5];

		for(int i=0; i<=4; i++){
			for(int j=0; j<=4; j++){
				for(int k=1; k<=i+j+1; k++){
					array[i][j] = k;
				}
			}	
		}

		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.printf("%2d", array[i][j]);
			}

			System.out.println();
		}
		*/
	}
}

// ���� ���
/*
 1 2 3 4 5
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/