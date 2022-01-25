/*=================================
    ���� Ŭ���� ��� ����
=================================*/

// ���(Inheritance)

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5.00

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{	
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}

// Aclass�� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{
	/*
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
	*/
	Bclass()
	{
	}

	boolean input()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		String temp = br.readLine();

		// �� ���ڿ�.split("������");
		//    ���ڿ�.split("\\s");		//-- ������ �� ����
		//	  ex) "10 20 30 40 50".split("\\s");
		//		  �� ��ȯ �� {"10", "20", "30", "40", "50"}

		//		ex) "010-1234-1234".split("-");
		//		�� ��ȯ �� {"010", "1234", "1234"}

		String[] strArr = temp.split("\\s");

		if (strArr.length != 2)
			return false;
		//--	false�� ��ȯ�ϸ� input()�޼ҵ� ����
		//		�� ������ ������ ���..
		//		�Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
		//		������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.
		
		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		/*
		if (op != '+' && op!='-' && op!='*' && op!='/')
		{
			return false;
		}
		return true;
		*/

		if(op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		return false;
	}

	double calc()
	{
		double result = 0;
		
		switch (op)
		{
			case '+': result = x + y; break;
			case '-': result = x - y; break;
			case '*': result = x * y; break;
			case '/': result = (double)x / y; break;
		
		}


		return result;
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test1151
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);
	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 20 3
������ �Է�(+ - * /) : /
>> 20 / 3 = 6.67
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/