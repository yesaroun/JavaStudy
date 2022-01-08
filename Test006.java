/*
   ### 자바의 개요 및 특징 ###
*/

// 변수와 자료형
// 키워드 및 식별자


public class Test006{
	public static void main(String[] args){

		double height = 172.8;
		int age = 27;
		char degree = 'A';


		System.out.println(height);
		System.out.println(age);
		System.out.println(degree);
		//--==>> 172.8
		//       27
		//       A

		String name = "김상기";
		//String name = "홍은혜"; 이건 안된다 중괄호 안의 영역이 이 변수의 스코프임 근데 동일한 스코프 다시 선언하는건 안되고 동일한 이름으로 다른 변수도 안된다
		//-- 스코프 영역 안에서 변수명은 식별자~!!!

		//String #name = "김태형";
		//-- $ 와 _ 를 제외한 다른 특수문자는 
		//   변수의 이름으로 활용할 수 없다.
		//   하지만, 그나마 사용 가능한 이들 특수문자도
		//   함부로 사용하는 것은 고려해야 한다.
		
		//int tel = 010123123;
		//  0으로 시작된 데이터는 절대로 정수로 선언하면 안된다
		String tel = "010123123"; // 0으로 시작할 수 있는 변수는 문자열 형태로 다뤄줘야한다

		String 주소 = "경기도 고양시";
		//-- 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		// 실무적인 측면에서 접근한다면
		// 절대로 한글 단어를 변수명으로 사용해서는 안된다. 디렉토리도 영어로만 한다


		// 결과 출력
		System.out.println("name : " + name);
		//--==>> name : 김상기
		System.out.println("tel : " + tel);
		//--==>> tel : 2139731
		//  0으로 시작된 수를 입력하면 진법이 달라진다
		System.out.println("주소 : " + 주소); 


	}
}

//실행 결과
/*
172.8
27
A
name : 김상기
tel : 010123123
주소 : 경기도 고양시
계속하려면 아무 키나 누르십시오 . . .
*/