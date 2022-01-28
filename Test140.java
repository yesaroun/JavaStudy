/*===============================================
    ■■■ 자바의 주요(중요) 클래스 ■■■
===============================================*/

// StringBuffer 클래스

/*
○  StringBuffer 클래스는
	문자열을 처리하는 클래스로 String 클래스와의 차이점은
	String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
	StringBuffer 클래스는 문자열을 사용할 때
	내부 문자열을 실행 단계에서 변경할 수 있다.

	즉, StringBuffer 객체는 가번젹인 길이를 가지므로
	객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
	실행 시점에서 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

	또한, JDK 1.5 이후부터는
	문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
	StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
	가장 큰 차이점은 multi-thread unsafe 라는 점이다.
	즉, Syncronization 이 없기 때문에
	StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면
	StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.

	StringBuffer : 기능이 많은거
	StringBuilder : 성능이 좋은거임(buffer보다 기능은 적지만)
*/
public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));		// 이퀄스는 구성하는 문자열의 값의 비교
		//--==>> false			// 주소값이 서로 다르기 때문에
		//		 false			// sb1이 스트링클래스이고 sb2가 스트링클래스라면 true인데 여기서는 문자열임에도 불구하ㅏ고 false가 나왔다는건 오바리이딩 안했다
		
		System.out.println(sb1);
		//--==>> korea

		System.out.println(sb1.toString());
		//--==>> korea		
		// toString은 클래스명at 해쉬코드가 나온다 그런데 여기서는 korea나옴 그렇다면 string 버퍼도 이걸 오버라이딩 했다는거임
		// 얘가 항상 반환하는건 문자열이다/ 생성자에게 건내질 문자열이 나오는건 오버라이딩한거이다

		//이퀄스 메소드는 오브젝트로 상속받은 이퀄스 메소드이겠지만
		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true

		//어떻게 재정의 되었는지에 따라서 같은 문자도 처리가 될 수 있고 안될 수 있어서 기억을 잘 해야한다

		System.out.println("----------------------------------");		// 개행

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer 기본 생성자 호출(인스턴스 생성 과정)
		//	 기본적으로 생성되는 버퍼의 크기는 『16』

		
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 16

		/////////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> 無

		/*
		String name = "홍길동";
		name += "이순신";
		name += "강감찬";
		System.out.println(name);
		*/

		sb3.append("seoul");			//sb3 += "seoul"; 이거와 같은거임
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");

		System.out.println(sb3);					
		//--==>> seoulkorea우리나라대한민국

		System.out.println(sb3.toString());
		//--==>> seoulkorea우리나라대한민국


		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34

		////////////////////////////////////////////////////////////////


		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>>java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());

		//temp2 는 스트링 버퍼인데 toString 붙이면 문자열임
		
		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());		// 이건 원본은 그대로 있는거임 대문자로 반환하게끔 한거지 실제 sb3는 소문자로 구성되어있음
		//--==>> SEOULKOREA우리나라대한민국

		System.out.println(sb3.toString().toUpperCase());
		//--==>> SEOULKOREA우리나라대한민국

		// seoulkorea우리나라대한민국

		// ○ 대상 문자열(sb3) 중 seoul 앞에
		//	  "한국" 이라는 문자열 추가
		//		→ 한국seoulkorea우리나라대한민국

		sb3.insert(0, "한국");
		System.out.println("seoul 앞에 『한국』 추가 : " + sb3.toString());
		//--==>> seoul 앞에 『한국』 추가 : 한국seoulkorea우리나라대한민국



		// ○ 대상 문자열(sb3) 중 korea 문자열 뒤에
		//	  "사랑"이라는 문자열 추가
		//	  단, 대상 문자열의 인덱스를 눈으로 직접 확인하지 않고....
		
		/* 내 풀이
		//int a = sb3.toString().indexOf("korea");
		sb3.insert(sb3.toString().indexOf("korea")+5, "사랑");
		System.out.println(sb3.toString());
		*/

		// 테스트 ①
		//sb3.insert(12, "사랑");
		//System.out.println("korea 뒤에 추가" + sb3.toString());
		//--==>> korea 뒤에 추가한국seoulkorea사랑우리나라대한민국
		// 이건 sb3를 바꿈

		// 테스트 ②
		sb3.indexOf("korea");
		System.out.println(sb3.indexOf("korea"));
		//--==>> 7

		// 테스트 ③
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "사랑"));
		//--==>> 한국seoul사랑korea우리나라대한민국
		
		// 테스트 ④
		//System.out.println(sb3.insert(sb3.indexOf("korea")+5, "사랑"));
		//--==>> 한국seoulkorea사랑우리나라대한민국
		
		System.out.println(sb3.insert(sb3.indexOf("korea")+"korea".length(), "사랑"));
		//--==>> 한국seoulkorea사랑우리나라대한민국
		

		// ○ 대상 문자열(sb3) 에서
		//		『우리나라』 문자열 삭제
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국

		// 내 풀이
		//System.out.println(sb3.delete(sb3.indexOf("우리"), sb3.indexOf("나라")+"나라".length()));

		sb3.delete(sb3.indexOf("우리나라"), sb3.indexOf("우리나라")+"우리나라".length());
		System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국

		
		// ○ 대상 문자열(sb3)에서
		//		『korea』 이후 문자열 삭제(korea 포함)
		//sb3.delete(7, 18);
		//System.out.println(sb3);
		//--==>> 한국seoul

		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==>> 한국seoul

		//////////////////////////////////////////////////////////////////

		// 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34
		// 버퍼가 늘어나고 나서 글자가 줄어들어도 버퍼 크기는 그대로

		
		// 문자열(sb3)의 길이 확인
		System.out.println("문자열의 길이 : " + sb3.length());
		//--==>> 문자열의 길이 : 7

		
		// 버퍼 크기 조절
		// → 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		sb3.trimToSize();

		//버퍼 크기 조절 이후 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>>버퍼 크기 : 7


	}
}