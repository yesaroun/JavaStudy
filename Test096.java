/*==============================
      ���� �迭 ����
==============================*/

// �迭�� �迭(2���� �迭)

// ����
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
  A   
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O

*/

public class Test096{
	public static void main(String[] args){
		
		// charŸ���� ���� �迭 arr ����
		char[][] arr = new char[5][5];

		// A�� ���� char Ÿ�� ���� ����
		char ch = 'A';

		// for���� �̿��ؼ� arr �迭�� ���� ����
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				if(i%2 != 0){
					arr[i][i-j] = ch;
				} else{
					arr[i][j] = ch;
				}
				ch++;				
			}
		}

		// arr �迭 ���
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%3s", arr[i][j]);
			}
			System.out.println();
		}
	}
}