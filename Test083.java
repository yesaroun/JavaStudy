/*==============================
      ���� �迭 ����
==============================*/

// �迭�� �⺻�� Ȱ��
// �迭�� ����� �ʱ�ȭ

// ��char�� �ڷ����� �迭�� �����
// �� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
// ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�.

// ���� ��)
// A B C D ... W X Y Z

public class Test083{
	public static void main(String[] args){
					
		/*
		int num = (int) 'A';
	
		char[] a = new char['Z' - 'A' + 1];

		for(int i=0; i<(int) ('Z' - 'A') +1 ; i++){
			a[i] = (char)num;
			num++;
		}

		for(int i=0; i<(int) ('Z' - 'A') +1 ; i++){
			System.out.print(a[i] + " ");
			num++;
		}

		System.out.println();

		*/

		char[] arr3 = new char[26];
		for(int i=0, ch=65; i<arr3.length; i++, ch++){  
			arr3[i] = (char)ch;
		}

		for(int i = 0; i<arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}
		
	}
}