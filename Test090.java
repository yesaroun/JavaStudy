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
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
*/

/*
  1  2  3  4  5     �� i=0      0���� ���
  5  1  2  3  4     �� i=1      1���� ���
  4  5  1  2  3     �� i=2      2���� ���
  3  4  5  1  2     �� i=3      3���� ���
  2  3  4  5  1     �� i=4      4���� ���
*/

public class Test090{
	public static void main(String[] args){
		
		//------------�� Ǯ��-----------
		/*
		int[][] arr = new int[5][5];

		int n = 0;
		int temp = 0;

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				
				temp = n;
				n++;
				if(n>5){
					n=1;
				}

				arr[i][j] = n;
				
			}
			n=temp;

		}

		// �迭�� �迭 ��ü ��� ���
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				System.out.printf("%2d", arr[i][j]);
			}

			System.out.println();
		}
		*/

		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		for(int i=0; i<arr.length; i++){
			for(int j=i, n=1; n<=5; n++){
				//System.out.printf(i+"-"+j+"    ");   
				
				arr[i][j] = n;

				j++;

				if(j==5)
					j=0;
			}
		}


		// ��ü ��� ���
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}