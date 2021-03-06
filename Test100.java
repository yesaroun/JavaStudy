/*============================================
      ■■■ 클래스와 인스턴스 ■■■
============================================*/

// 정보 은닉과 접근 제어 지시자(접근지정자, 접근제한자, ...)

import java.util.Scanner;

class CircleTest2
{
	// 정보 은닉(Information Hiding)
	//int num;

	//  ↓

	// 멤버 변수, 인스턴스 변수, 전역 변수
	// 『private』 이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int 형 전역 변수 → 자동 0으로 초기화 지원
	private int num;

	// getter / setter 구성
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

		System.out.print("반지름 입력 : ");
		num = sc.nextInt();

	}
	
	double calArea(){
		return num * num* 3.141592;
	}

	void write(double area){
		System.out.println("반지름 : " + num);
		System.out.println("넓이 : " + area);
	}



}

public class Test100{
	public static void main(String[] args){
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		//	↓
		//ob1.setNum(10);

		//System.out.println("원의 반지름 : " + ob1.num);
		//System.out.println("원의 반지름 : " + ob1.getNum());

		ob1.input();
		//-- ob1.num 에 값이 담김

		double result = ob1.calArea();
		ob1.write(result);
	}
}

//실행 결과
/*
반지름 입력 : 5
반지름 : 5
넓이 : 78.5398
계속하려면 아무 키나 누르십시오 . . .
*/