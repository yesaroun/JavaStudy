/*==============================
      ���� �迭 ����
==============================*/

// �迭�� �迭(2���� �迭)

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
  E   J   O   T   Y 
  D   I   N   S   X 
  C   H   M   R   W 
  B   G   L   Q   V 
  A   F   K   P   U 
*/

public class Test092{
	public static void main(String[] args){
	
		char[][] arr = new char[5][5];
		char charA = 'A';

		for(int i=0; i<arr[0].length; i++){
			for(int j=4; j>=0; j--){
				arr[j][i] = charA++;				
			}
		}

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++)
				System.out.printf("%3s", arr[i][j]);
			System.out.println();
		}
	}
}