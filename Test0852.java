//�迭�� �⺻�� Ȱ��
//����
//����ڷκ��� ������ ������ ������ �л� ���� �Է¹ް�
//�׸�ŭ�� ����(���� ����)�� �Է¹޾�
//��ü �л� ������ ��, ���, ������ ���Ͽ�
//����� �����ϴ� ���α׷��� �����Ѵ�
//��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
//�л� �� �Է� : 5
//1�� �л��� ���� �Է� : 90
//2�� �л��� ���� �Է� : 82
//			:
//>> �� :
//>> ��� :
//>> ����
//90 : -16.0
//82 : -8.0
//64 : 10.0
//   :
//��� �Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test0852
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//���� �Է�
		int num=0;
		int ave=0; //������
		double dev=0;
		//int score [];

		System.out.print("�л� �� �Է� : ");
		
		num = sc.nextInt();
		
		//System.out.print("�л� �� : " + num);

		//���� ������ ���� �迭�� �����.

		//score = new int[num]; //���ھ���̶�� �̸� ����, �ѹ游ŭ Ŀ���ڴ�.

		int score [] = new int[num];
		//�̷��� �����ҽ� ������ �� System.out.printf("%d : %.2f%n",score[i],dev); ���� ��Ÿ�� ������ ���.

		for (int i=0;i<score.length;i++) //���� �Է��� �ݺ���Ų��.
		{
			System.out.printf("%d�� �л��� ���� �Է� : ", i+1); //0���� �ƴ϶� 1������ �����ϴ� ��� ã�� : +1�ϸ� ��
				score[i] = sc.nextInt();
		}

		for (int i=0;i<score.length;i++) //�������� ���϶�
		{
			ave+=score[i];
		}

		System.out.print("\n�л����� �� : " + ave);

		System.out.print("\n�л����� ��� : " + ave/num);

		System.out.print("\n�л����� ���� : \n");  // ����

		//������ ���-������

		for (int i=0;i<score.length;i++) 
		{
			dev=(double)ave/num-score[i]; // ����
			System.out.printf("%d : %.2f%n",score[i],dev); 
		}
	}
}

