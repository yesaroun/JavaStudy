/*===================================
  ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 자바의 기본 입출력 : System.in.read()

public class Test018{
	public static void main(String[] args) {
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");      //-- \n 개행

		System.out.println();           //-- 개행

		// System.out.print;
		//--==>> 에러 발생(컴파일 에러)

		System.out.printf("123456789");
		System.out.printf("123456789\n");//-- \n 개행
		System.out.printf("123456789%n");//-- %n 개행

		// System.out.printf();
		//--==>> 에러 발생(컴파일 에러)

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		//--==>> 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123); // 공백 7칸임 
		System.out.printf("%8d\n", 1234); // 공백 4칸
		System.out.printf("%010d\n", 123);// 공백을 0으로 채운다
		/*
		123
		123
		1234
		0000000123	
		*/

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		// +365
		// +365

		System.out.printf("%d\n", +365);
		//--==>> 365
		
		//System.out.printf("%-d%n", 365);
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		// -365
		// -365

		// System.out.printf("%d\n", 'A');
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%c\n", 'A');
		//--==>> A

		//System.out.printf("%c\n", "ABCD");
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%s\n", "ABCD");
		//--==>> ABCD

		System.out.printf("%h\n", 365); // 16진수 형태
		//--==>> 16d
		System.out.printf("%o\n", 24);  // 8진수
		//--==>> 30

		System.out.printf("%b%n",  true);
		System.out.printf("%b%n", false);
		//--==>> true
		//		 false

		System.out.printf("%f\n", 123.23);
		//--==>> 123.23000000
		System.out.printf("%.2f\n", 123.23);
		//--==>> 123.23

		System.out.printf("%.2f\n", 123.231);
		//--==>> 123.23 (내림)
		System.out.printf("%.2f\n", 123.235);
		//--==>> 123.24 (올림)

		System.out.printf("%8.2f\n", 123.236);
		//--==>>   123.24         (점도 한자리 차지해서 앞에 2칸 빈다)

		System.out.printf("%2.2f\n", 123.236); // 표현하려는 공간보다 작게 잡으면 그냥 무시된다
		//--==>> 123.24
	}
}

// 실행 결과
/*
AAABBBCCC

123456789123456789
123456789
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
A
ABCD
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .
*/