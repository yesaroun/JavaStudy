/*===========================================
      ���� Ŭ������ �ν��Ͻ� ����
=============================================*/

// �� CircleTest.java ���ϰ� ��Ʈ!!

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java
// BufferedReader �� readLine()

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3 * 3.141592

// ���� ��)
// ������ �Է� : ����

// >> �������� ������ ����
// >> ���� : ����
// >> �ѷ� : ����

import java.io.IOException;

public class Test073{
	public static void main(String[] args) throws IOException{

		// CircleTest Ŭ���� ��� �ν��Ͻ� ����
		// CircleTest �ν��Ͻ� ����
		// CircleTest ��ü ����
		CircleTest ct = new CircleTest();

		ct.input();
		
		double area = ct.calArea();
		double length = ct.calLength();

		ct.print(area, length);
	}
}

//���� ���
/*
������ �Է� : 20

>> �������� 20�� ����
>> ���� : 1256.636800
>> �ѷ� : 125.66368
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/