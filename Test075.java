/*===========================================
      ■■■ 클래스와 인스턴스 ■■■
=============================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력(+ - * /) : +
// >> 10 + 5 = 15


/* ----------------------------------내 풀이
import java.util.Scanner;

class Calculate{
	int num1, num2;
	char char1;
	int resultNum;
	int result1;
	double result2; // 나눗셈의 경우만

	void input(){
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /) : ");
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

	// 주요 변수 선언
	int su1, su2;		//-- 사용자로부터 입력받은 두 정수를 담아낼 변수
	char op;			//-- 사용자로부터 입력받은 연산자를 담아낼 변수

	// 메소드 정의(기능 : 입력)
	void input() throws IOException{

		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		
	}
	
	// 메소드 정의(기능 : 연산)
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

	// 메소드 정의(기능 : 출력)
	void print(int s){
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
	}


}

public class Test075{
	public static void main(String[] args) throws IOException{

		// Calculate 인스턴스 생성
		Calculate op = new Calculate();

		op.input();                      //-- 생성한 인스턴스를 통한 입력 메소드 호출

		int r = op.cal();					 //-- 생성한 인스턴스를 통한 연산 메소드 호출

		op.print(r);					 //-- 생성한 인스턴스를 통한 출력 메소드 호출
		
	}
}

// 실행 결과
/*
임의의 두 정수 입력(공백 구분) : 250 30
임의의 연산자 입력(+ - * /) : *
>> 250 * 30 = 7500
계속하려면 아무 키나 누르십시오 . . .
*/