/*============================================
      ���� Ŭ������ �ν��Ͻ� ����
============================================*/

// Ŭ������ �ν��Ͻ� Ȱ��

// 1 ~ 3 ������ ������ �߻����Ѽ�
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// �� ���� ������ �� 1:����, 2:����, 3:��

// ���� ��)
// 1:���� 2:���� 3:�� �� �Է�(1~3) : 4
// 1:���� 2:���� 3:�� �� �Է�(1~3) : -2
// 1:���� 2:���� 3:�� �� �Է�(1~3) : 2

// - ����   : ����
// - ��ǻ�� : ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!

/* ����
rpsgame Ŭ����
���� ���������� ���� ����
��ǻ�� ������ ���� ����	

��ǻ���� ���� ��� �޼ҵ�

������ ��ǻ�� ���� ���� �޼ҵ�

��� �޼ҵ�

*/

// ���� Test097�� ���� �ִ�

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private int usInt;
	private int comInt;
	int win;
	
	// ��ǻ���� ����������
	private void comRandom()
	{
		Random rd = new Random();
		comInt = rd.nextInt(3) + 1;		// 0 1 2 �� (+1) �� 1 2 3 
	}
	
	// ������ ����������
	public void userInput()
	{
		// ������ ���������� �ϱ� ����... ��ǻ��(������) ���� ����������
		comRandom();

		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
			usInt = sc.nextInt();
		}
		while (usInt < 1 || usInt > 3);	
	}
	
	// �߰� ��� ���
	public void anser()
	{
		if(usInt == comInt)
		{
			win = 1;			// ���º�
		} 
		else if(usInt == 2 || comInt == 2) 
		{
			if(usInt > comInt)
			{
				win = 2;		// user �¸�
			}
			else
			{
				win = 3;		// computer �¸�
			}			
		} 
		else 
		{
			if(usInt > comInt)
			{
				win = 3;		// computer �¸�
			} 
			else
			{
				win = 2;		// user �¸�	
			}
		}
		/* �̷� ���ĵ� ����
		String result = "���º� ��Ȳ�Դϴ�~!!!";
		
		//(����==���� && �� == ��) || (����==���� && ��==����) || (����==�� && ��==����)
		if((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
		{
			result = "����� �¸��߽��ϴ�~!!";	
		}
		// (����==���� && ��==����) || (����==���� && ��==��) || (����==�� && ��==����)
		else if((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�~!!!";
		}

		return result;
		*/
	}
	
	// ��� ���
	public void print()
	{	
		String[] rps = {"����", "����", "��"};
		String[] ans = {"���º��Դϴ�", "������ �̰���ϴ�", "��ǻ�Ͱ� �̰���ϴ�"};

		System.out.println();

		System.out.printf("- ����   : %s\n", rps[usInt-1]);
		System.out.printf("- ��ǻ�� : %s\n", rps[comInt-1]);
		
		System.out.println();

		System.out.printf("%s\n", ans[win-1]);
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� 
public class Test104
{
	public static void main(String[] args)
	{
		RpsGame rg = new RpsGame();

		rg.userInput();
		rg.anser();
		rg.print();
	}
}