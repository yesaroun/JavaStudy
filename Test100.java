/*============================================
      ���� Ŭ������ �ν��Ͻ� ����
============================================*/

// ���� ���а� ���� ���� ������(����������, ����������, ...)

import java.util.Scanner;

class CircleTest2
{
	// ���� ����(Information Hiding)
	//int num;

	//  ��

	// ��� ����, �ν��Ͻ� ����, ���� ����
	// ��private�� �̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	// int �� ���� ���� �� �ڵ� 0���� �ʱ�ȭ ����
	private int num;

	// getter / setter ����
	/*
	int getNum(){
		return num;
	}

	void setNum(int num){
		this.num = num;
	}
	*/
	
	void input(){
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		num = sc.nextInt();

	}
	
	double calArea(){
		return num * num* 3.141592;
	}

	void write(double area){
		System.out.println("������ : " + num);
		System.out.println("���� : " + area);
	}



}

public class Test100{
	public static void main(String[] args){
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		//	��
		//ob1.setNum(10);

		//System.out.println("���� ������ : " + ob1.num);
		//System.out.println("���� ������ : " + ob1.getNum());

		ob1.input();
		//-- ob1.num �� ���� ���

		double result = ob1.calArea();
		ob1.write(result);
	}
}

//���� ���
/*
������ �Է� : 5
������ : 5
���� : 78.5398
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/