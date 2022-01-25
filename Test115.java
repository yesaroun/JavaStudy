/*=================================
    ■■■ 클래스 고급 ■■■
=================================*/

// 상속(Inheritance)

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
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

// Aclass를 상속받는 클래스로 설계
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
			System.out.print("임의의 두 정수 입력(공백 구분) : ");
			x = Integer.parseInt(sc.next());
			y = Integer.parseInt(sc.next());
		}
		catch (Exception e1)
		{
			return false;
		}

		System.out.print("연산자 입력(+ - * /) : ");
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


// main() 메소드를 포함하는 외부의 다른 클래스
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