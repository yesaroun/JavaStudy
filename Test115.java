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

//Test1151.java

import java.util.Scanner;


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
	Bclass()
	{
	}

	boolean input()
	{
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.print("������ �� ���� �Է�(���� ����) : ");
			x = Integer.parseInt(sc.next());
			y = Integer.parseInt(sc.next());
		}
		catch (Exception e1)
		{
			return false;
		}

		System.out.print("������ �Է�(+ - * /) : ");
		op = sc.next().charAt(0);
		if(op == '+' || op == '-' || op == '*' || op == '/')
		{
			return true;
		} 
		else
		{
			return false;
		}
	}

	double calc()
	{
		double result = 0;

		if(op == '+')
		{
			result = x + y;
		}
		else if(op == '-')
		{
			result = x - y;
		}
		else if(op == '*')
		{
			result = x * y;
		}
		else if(op == '/')
		{
			result = (double) x / y;
		}

		return result;
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test115
{
	public static void main(String[] args)
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