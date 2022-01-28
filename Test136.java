/*===============================================
    ■■■ 자바의 주요(중요) 클래스 ■■■
===============================================*/

// Wrapper 클래스

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);

		print(b2);
		print(i2);

		// Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue();		//-- 언박싱
		
		// Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue();			//-- 언박싱

		// check~!!!
		int i4 = b2.byteValue();			// 자동형변환임
		//byte b4 = i2.intValue();			//-- 에러 발생(컴파일 에러)
		byte b4 = i2.byteValue();

		System.out.println(b3);
		System.out.println(i3);
		//--==>> 3
		//		 256

		//check~!!!
		System.out.println(b4);				// byte에서 저장할 수 없는 값을 넣기때문에 byte로 변환은 되지만 0으로 출력된다.
		System.out.println(i4);
		//--==>> 0
		//		 3





	}

	/*
	static void print(Byte b)
	{}

	static void print(Integer i)
	{}
	이렇게 하라가 아니라 프린트 메소드 하나만으로 가능하게 하는거임
	상속에 대한 문법적 이해, 업캐스팅, 다운캐스팅, 박싱, 언박싱 다 이해해야한다
	*/

	// 내 풀이
	/*
	static void print(Object obj)
	{
		System.out.println(obj);
	}
	*/
	// 정 모르겠으면 이렇게라도 하면 된다 그러면 50점은 받은거임
	// 그러면 모든걸 다 object를 넣으면 되지 않나? 라는 생각이 드는데 데이터의 안정성때문임
	

	// java.lang.Number 클래스(추상 클래스)는
	// 모든 숫자형 Wrapper 클래스들의 부모 클래스
	// (슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number 에 넘어오면서 
	// 업 캐스팅이 일어나게 된다.
	// Auto-Boxing 이 일어나게 된다.
	static void print(Number n)	// ← 3
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}




	

}