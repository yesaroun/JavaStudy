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

class Record{
	String name = null;
	int[] score = new int[3];
	int tot;
	double avg;
	int rank;
}

class Sungjuk{
	int inwon;
	Record[] rec;

	public void set() {
		Scanner sc = new Scanner(System.in);

		do{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 100);

		rec = new Record[inwon];
	}


	public void input(){
		Scanner sc = new Scanner(System.in);

		
		
		for(int i=0; i<inwon; i++){
			rec[i] = new Record();


			System.out.printf("%d��° �л��� �̸� �Է� : ", i+1);
			rec[i].name = sc.next();
			System.out.print("���� ���� : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[2] = sc.nextInt();
		}

		for(int i=0; i<rec.length; i++){
			for(int j=0; j<rec[i].score.length; j++){
				rec[i].tot += rec[i].score[j];
			}
			rec[i].avg = (double) rec[i].tot / rec[i].score.length;
		}		
	}

	

	public void print(){
		for(int i=0; i<inwon; i++){
			System.out.printf("%s %d %d %d %d %.2f", 
				rec[i].name, rec[i].score[0], rec[i].score[1], rec[i].score[2],
				rec[i].tot, rec[i].avg);
			System.out.println();
		}
	}
	
}



public class Test103{
	public static void main(String[] args){
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();

	}
}
