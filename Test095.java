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
  B  C
  D  E  F
  G  H  I  J
  K  L  M  O  P

*/

public class Test095{
	public static void main(String[] args){
		
		char[][] arr;
		char ch = 'A';

		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				arr = new char[i][j];
				arr[i][j] = ch;
			}
		}

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%3s", arr[i][j]);
			}
		}
	}
}