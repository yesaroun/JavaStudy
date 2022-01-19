/*============================================
      ���� Ŭ������ �ν��Ͻ� ����
============================================*/

// Ŭ���� ����
// �迭 Ȱ��
// �������������ڿ� ��������

// ����ڷκ��� ��, ��, ���� �Է¹޾�
// �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �޷� Ŭ����(Calendar)�� ������� �ʴ´�.
// ����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. (WeekDay Ŭ���� ����)
// �׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������� WeekDayŬ���� ���踦 ����
// Test101 Ŭ���� main()�޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�.
// 4�� ����̸鼭 100�� ����� �ƴϰų� 400�� ����� ���� ã�ƺ���


// �� 1�� 1�� 1�� �� "������"

// ���� ��)
// �� �� �� �Է�(���� ����) : 2022 1 19
// 2022�� 1�� 19�� �� ������

// �� �� �� �Է�(���� ����) : 2000 5 4
// 2000�� 5�� 4�� �� �����

/*
1 �Է¹޴� �޼ҵ� 0

2 ������ ����Ʈ�� ���� 0

3 �⵵�� �ٷ�� �޼ҵ�(���� �߰��ؼ�) �̰ŷ� �� �� ���  Test032

4 ���� ����ؼ� �� �� ��� (���� ����) + ���� ��¥�� �߰�?

5 ���� �߰�
*/

// --------------------------�� Ǯ��--------- �� : Test1011

import java.util.Scanner;

class WeekDay{

	Scanner sc = new Scanner(System.in);

	private int year = 1;
	private int month = 1;
	private int day = 1;
	private int total = 0;
	private int yearTotal = 0; // �⵵�� ���� �� �� ����
	private int monthTotal = 0; // ���� ���� �� �� ����
	private String[] week = {"��", "ȭ", "��", "��", "��", "��", "��"};
	String an;

	
	
	void input(){
		System.out.print("�� �� �� �Է�(���� ����) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}

	void yearCal(){
		for(int i=1; i<year; i++){  // �� �� �⵵�� day ����
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
				yearTotal += 366;
			} else {
				yearTotal += 365;
			}
		}
	}

	void monthCal(){
		int yearInfo;

		int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			yearInfo = 366; // ���� ���� ����
		} else {
			yearInfo = 365; // ��� ���� ����
		}

		if(yearInfo == 366){
			monthArr[2] = 29; // ����
		}

		if(month == 1){
			monthTotal = 0;
		} else {
			for(int i=0; i<month - 1; i++){
				monthTotal += monthArr[i];
			}
		}
	}

	int totalCal(){
		int total = day + monthTotal + yearTotal;
		return total;
	}

	void weekCal(int total){
		int weekDay = total % 7;
		an = week[weekDay - 1];
		
	}

	void output(){
		System.out.printf("%d�� %d�� %d�� �� %s����\n", year, month, day, an);
	}


}

public class Test101{
	public static void main(String[] args){
		WeekDay wd1 = new WeekDay();

		wd1.input();
		wd1.yearCal();
		wd1.monthCal();
		int total = wd1.totalCal();
		wd1.weekCal(total);
		wd1.output();
	}
}