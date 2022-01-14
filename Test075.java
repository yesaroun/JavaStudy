/*===========================================
      ���� Ŭ������ �ν��Ͻ� ����
=============================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է�(+ - * /) : +
// >> 10 + 5 = 15


/* ----------------------------------�� Ǯ��
import java.util.Scanner;

class Calculate{
	int num1, num2;
	char char1;
	int resultNum;
	int result1;
	double result2; // �������� ��츸

	void input(){
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /) : ");
		char1 = sc.next().charAt(0);
	}
	
	void cal(){
		if(char1 == '+'){
			result1 = num1 + num2;
			resultNum =1;
		} else if(char1 == '-'){
			result1 = num1 - num2;
			resultNum =1;
		} else if(char1 == '*'){
			result1 = num1 * num2;
			resultNum =1;
		} else if(char1 == '/'){
			result2 = num1 / num2;
			resultNum = 2;
		}
	}

	void print(){
		if(resultNum == 1){
			System.out.printf("%d %c %d = %d", num1, char1, num2, result1);
		} else if(resultNum == 2){
			System.out.printf("%d %c %d = %.2f", num1, char1, num2, result2);
		}
	}


}

public class Test075{
	public static void main(String[] args){
		Calculate ob = new Calculate();

		ob.input();

		ob.cal();

		ob.print();
	}
}

*/

import java.util.Scanner;
import java.io.IOException;


class Calculate{

	// �ֿ� ���� ����
	int su1, su2;		//-- ����ڷκ��� �Է¹��� �� ������ ��Ƴ� ����
	char op;			//-- ����ڷκ��� �Է¹��� �����ڸ� ��Ƴ� ����

	// �޼ҵ� ����(��� : �Է�)
	void input() throws IOException{

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		
	}
	
	// �޼ҵ� ����(��� : ����)
	int cal(){
		int result = 0;

		switch(op){
			
			case '+': result = su1 + su2; break;
			case '-': result = su1 - su2; break;
			case '*': result = su1 * su2; break;
			case '/': result = su1 / su2; break;
			//default : result = -99999999;
		}

		return result;
	}

	// �޼ҵ� ����(��� : ���)
	void print(int s){
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
	}


}

public class Test075{
	public static void main(String[] args) throws IOException{

		// Calculate �ν��Ͻ� ����
		Calculate op = new Calculate();

		op.input();                      //-- ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��

		int r = op.cal();					 //-- ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��

		op.print(r);					 //-- ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		
	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 250 30
������ ������ �Է�(+ - * /) : *
>> 250 * 30 = 7500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/