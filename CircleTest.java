/*===========================================
      ���� Ŭ������ �ν��Ͻ� ����
=============================================*/

// �� Test073.java ���ϰ� ��Ʈ!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest {
	// ��� ���� �� �ֿ� �Ӽ�(������)
	int radius;						// ������
	final double PI = 3.141592;		// ������ (������ ���ȭ)


	// ��� �޼ҵ� �� �ֿ� ���(����, ����)
	// ������ �Է� ��� �� �޼ҵ� ����
	void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է� : ");
		radius = Integer.parseInt(br.readLine());
	}

	// ���� ��� ��� �� �޼ҵ� ����
	double calArea(){
		double area = radius * radius * PI;

		return area;
	}

	// �ѷ� ��� ��� �� �޼ҵ� ����
	double calLength(){
		double length = radius * 2 * PI;

		return length;
	}

	// ��� ��� �� �޼ҵ� ����
	void print(double a, double b){
		System.out.printf("\n>> �������� %d�� ����\n", radius);
		System.out.printf(">> ���� : %f%n", a);
		System.out.println(">> �ѷ� : " + b);
	}
	
}