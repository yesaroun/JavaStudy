/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 기본적 활용

// 임의의 정수들이 들어있는 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
// 프로그램을 구현한다.

// 배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8
// 짝수 선택적 출력
// 4 2 6 8
// 3의 배수 선택적 출력
// 9 3 6

public class Test082{
	public static void main(String[] args){
		// 배열 선언 및 초기화
		// 방법 ①
		/*
		int[] a = new int[9];
		a[0] = 4;
		a[1] = 7;
		    :
		a[8] = 8;
		*/

		// 방법 ②
		int[] a = {4, 7, 9, 1, 3, 2, 5, 6, 8, 11, 12};
		
		
		//System.out.println(arr);
		
		// ※ 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
		//	  배열에 담긴 데이터들을 출력할 수 없다.

		// ※ 배열 arr의 길이(방의 갯수) 확인
		//		: arr.lenght


		System.out.println("배열 요소 전체 출력");

		for(int i=0; i<a.length; i++){
			System.out.printf("%d ", a[i]);

		}
		System.out.println();



		System.out.println("짝수 선택적 출력");
		
		for(int i=0; i<a.length; i++){
			if(a[i] % 2 == 0){
				System.out.printf("%d ", a[i]);
			}
		}
		System.out.println();


		System.out.println("3의 배수 선택적 출력");

		for(int i=0; i<a.length; i++){
			if(a[i] % 3 == 0){
				System.out.printf("%d ", a[i]);
			}
		}
		System.out.println();
		
	}
}

// 결과 출력
/*
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8 11 12
짝수 선택적 출력
4 2 6 8 12
3의 배수 선택적 출력
9 3 6 12
계속하려면 아무 키나 누르십시오 . . .
*/