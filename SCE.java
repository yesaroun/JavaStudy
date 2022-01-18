// 블로그 SCE 관련 코드

public class SCE{
	public static void main(String[] args){
		
		int a = 100;
		int b = 1;
		
		System.out.println("변수 a, b 출력");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println("\n논리 연산자 &&");
		System.out.printf("(++a)==0 and (++b)==0 : %b\n", ((++a) == 0) && ((++b) == 0));

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println("\n논리 연산자 ||");
		System.out.printf("(++a)!=0 or (++b)!=0 : %b\n", ((++a) != 0) || ((++b) != 0));

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
}