/*=================================================
 ■■■ 메소드 중복정의(Method Overloading) ■■■
=================================================*/

// Method Overloading 이 가능한 형태와 불가능한 형태

public class Test106
{
	public static void main(String[] args)
	{
		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}
	//public static void print() {}						//--(X)
	public static void print(int i) {}
	//public static void print(int j) {}				//--(X)
	public static void print(char c) {}					//-- 자동 형 변환 규칙 check~!!! (저기 안에 1 넣으면 int형을 불림?)
	public static void print(int i, int j) {}	
	public static void print(double d) {}				//-- 자동 형 변환 규칙 check~!!! (저기 안에 1 넣으면 int형을 불림?)
	//public static void print(double e) {return 10.0}	//-- 정의 불가
	//public static double print(double e) {return 10.0}	//-- (X)
}