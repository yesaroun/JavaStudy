/*============================================
      ���� Ŭ������ �ν��Ͻ� ����
============================================*/

// Ŭ������ �ν��Ͻ� Ȱ��

// �л��� ��������, ��������, ���������� �Է¹޾�
// ����, ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
// Ŭ���� ����� ������ ���̵���ο� ���� ������ �� �ֵ��� �Ѵ�.

// ���α׷��� �����ϴ� Ŭ����
// 1. Record Ŭ����
//		- �Ӽ��� �����ϴ� Ŭ������ ������ ��~!!

// 2. Sungjuk Ŭ����
//		- �ο� ���� �Է¹޾�, �Է¹��� �ο��� ��ŭ
//		  �̸�, ��������, ��������, ���������� �Է¹ް�
//		  ������ ����� �����ϴ� Ŭ������ ������ ��!!
//		  0 �Ӽ� : �ο���, Record ������ �迭
//		  0 ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���
//
// 3. Test103 Ŭ����
//		- main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ������ ��

// ���� ��)
// �ο� �� �Է�(1~100) : 102
// �ο� �� �Է�(1~100) : 3

// 1��° �л��� �̸� �Է� :  ����
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// 2��° �л��� �̸� �Է� : �Ӽҹ�
// ���� ���� : 92
// ���� ���� : 82	
// ���� ���� : 72

// 3��° �л��� �̸� �Է� : �̿���
// ���� ���� : 82
// ���� ���� : 72
// ���� ���� : 62

// ���� 90 80 70 240 xx.xx 2
// �Ӽҹ� 92 82 72 xxx xx.xx 1
// �̿��� 82 72 62 xxx xx.xx 3

import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// �л� 1��
class Record{
	
	// �л� 1���� ǥ���� �� �ִ� �Ӽ���� ����~!!!!		check~!!!
	String name;						//-- �̸�
	int[] score = new int[3];			// int kor, eng, mat	//-- �� ������ ����
	int tot;							//-- ����
	double avg;							//-- ���
	int rank;							//-- ����(���)
}

class Sungjuk{
	
	// �ֿ� �Ӽ� ����
	int inwon;				//-- �ο� ��
	Record[] rec;			//-- Record �迭(�л� �� �� �� Record �迭 �� �� �� Ȱ��)
							//   Record �� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭
	
	//Scanner sc = new Scanner();
	//Record rec = new Record();
	// �̷��� �ϸ� SungjukŬ������ �����Ҷ����� �޸� �Ҵ� �׷��� �ǵ��� ���� �� ��    ����!!

	// �ֿ� �޼ҵ� ����(��� ����)
	// �� �ο� �� �Է�
	public void set(){
		Scanner sc = new Scanner(System.in);

		do{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		} 
		while (inwon<1 || inwon>100);{
			//check~!!!
			// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
			// �迭���� inwon ��ŭ ������ ������
			// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
			rec = new Record[inwon];
		}
	}

	// �� �� ������ �Է�(���� �� ��� ���� ��� ����)
	public void input(){
		Scanner sc = new Scanner(System.in);

		String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
		
		// �ο� �� ��ŭ �ݺ� �� �ο� ���� ����Ͽ� ������� �迭�� ���̸�ŭ �ݺ�
		for(int i=0; i<inwon; i++){			// for(int i=0; i<rec.length; i++)

			// check~!!!
			// Record Ŭ���� ����� �ν��Ͻ� ����
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			rec[i].name = sc.next();
			
			/*
			System.out.print("���� ���� : ");
			rec[i].kor = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].eng = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].mat = sc.nextInt();
			*/

			/*
			System.out.print("���� ���� : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[2] = sc.nextInt();
			*/

			for(int j=0; j<title.length; j++){
				//�ȳ� �޼��� ���
				System.out.print(title[j]);

				// ����ڰ� �Է��� �����͸� ���ھ�(score)�迭�� ��Ƴ���
				rec[i].score[j] = sc.nextInt();

				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// ������ ���� ���� ����
				rec[i].tot += rec[i].score[j];
			}

			// ��� �����ϱ�
			rec[i].avg = rec[i].tot / 3.0;
		
		}// end outer for
	}
	
	// �� ��� ��� 
	public void print(){

		// ���� ���� �޼ҵ� ȣ��
		ranking();

		// ����
		System.out.println();

		// �л� �� �� �� �ݺ� ��� ���� ����
		for(int i=0; i<inwon; i++){
			// �̸� ���
			System.out.printf("%5s", rec[i].name);
			
			// ����(����, ����, ���� �ݺ� ���)
			for(int j=0; j<3; j++)
				System.out.printf("%4d", rec[i].score[j]);

			// ����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			//check~!!!
			//���� ��� ���� �߰�~!!!
			System.out.printf("%5d", rec[i].rank);

			// ����
			System.out.println();
		}
	}

	// �� ���� ���� �޼ҵ� �߰�
	//		- ���� �������� ���꿡 �ʿ��� �����Ͱ� �̹� �����ϴ� ��Ȳ �� �Ű����� ����
	//		- Record �迭�� rank �Ӽ� �ʱ�ȭ ��� ���� �� ��ȯ �ڷ��� void
	//		- Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� �� �������� ������ private
	private void ranking(){
		
		// ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		for(int i=0; i<inwon; i++)
			rec[i].rank = 1;


		// ��� ����
		for(int i=0; i<inwon-1; i++){        //-- �� �� �񱳱��� 
			for(int j=i+1; j<inwon; j++){    //-- �� �� �񱳴��
				
				if(rec[i].avg > rec[j].avg){	     // �񱳱����� ����� �񱳴���� ��պ��� ũ�ٸ�
					rec[j].rank++;					 // �񱳴���� rank�� 1��ŭ ����

				} else if(rec[j].avg > rec[i].avg){  // �񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ�
					rec[i].rank++;			         // �񱳱����� rank�� 1��ŭ ����
				}
			}									
		}
	}
}


public class Test1031{
	public static void main(String[] args){
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();

	}
}

// ��� ���
/*
�ο� �� �Է�(1~100) : 3
1��° �л��� �̸� �Է� : aa
���� ���� : 45
���� ���� : 80
���� ���� : 75
2��° �л��� �̸� �Է� : bb
���� ���� : 55
���� ���� : 88
���� ���� : 77
3��° �л��� �̸� �Է� : cc
���� ���� : 99
���� ���� : 66
���� ���� : 11

   aa  45  80  75  200   66.67    2
   bb  55  88  77  220   73.33    1
   cc  99  66  11  176   58.67    3
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/