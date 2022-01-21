/*=======================================
 ■■■ 주민등록번호 유효성 검사 ■■■
=======================================*/

// 현실에서 쓰이는 로직은 아님
/*
○ 주민등록번호 검증 공식

	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	12356-1234567 (주민번호)
	***** ****** -------------------각 자릿수에 곱하기
	23567 892345  (각 자리에 곱해질 수)

	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * 
		2 3 4 5 6 7   8 9 2 3 4 5
		---------------------------
		→ 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15 

			== 217


	③ 더해진 결과값을 11로 나누어 『나머지』를 취한다.
		  19
		------
	 11| 217
		 11
		 ----
		 107
		  99
		 ----
		   8 → 나머지(○)

	④ 11에서 나머지 8을 뺀 결과값을 구한다.
	   11 - 8 → 3


	   ※ ③의 처리 과정에서 나머지가 0인 경우 → 11 - 0 → 11
							 나머지가 1인 경우 → 11 - 1 → 10
				이를 다시 10으로 나누어 나머지를 취한다.		11 → 1
																10 → 0
		
	⑤ ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와
	   일치하는지의 여부를 비교한다.

	   일치     → 유호한 주민번호
	   불일치   → 잘못된 주민번호
*/

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 12356-12345678 → 입력 갯수 초과
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 12356-123456   → 입력 갯수 미달
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 12356-123456	  → 유효한 주민 번호
// >> 정확한 주민번호~!!!

// 주민번호 입력(xxxxxx-xxxxxxx) : 12356-123456	  → 유효하지 않은 주민 번호
// >> 잘못된 주민번호~!!!


// ※ 문제 해결을 위한 추가 팁~!!!

//		배열.length					→ 배열의 길이(배열방의 갯수) 반환
//		문자열.length()				→ 문자열의 길이 반환
//		문자열.substring()			→ 문자열 추출
//		문자열.substring(m, n)		→ 문자열의 n번째 위치에서 n-1번째 위치까지 추출(인덱스는 0부터)
//		문자열.substring(m)			→ 문자열의 m번째 위치에서 문자열의 끝까지 추출(인덱스는 0부터)
	

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Scanner;

public class Test108
{
	public static void main(String[] args) throws IOException
	{	
		/*
		//테스트
		String strTemp = "한충희";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		//----------------------------------------------------

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//--==>> NOPQ

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 57));
		//--==>> 에러 발생(런타임 에러)
		//		StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ
		*/
		
		
		Scanner sc = new Scanner(System.in);

		String sNum1, sNum2;  // 숫자를 둘로 나눌 문자열

		int[] nNum1 = new int[8]; // 둘로 나눈 문자열을 담을 숫자 배열
		int[] nNum2 = new int[4];

		int total = 0;			// 곱한 값의 총합


		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		String sSsNum = sc.nextLine();

		if(sSsNum.length() < 14 || sSsNum.length() > 14)
		{
			System.out.println(">> 입력 오류~!!!");
			return;
		}

		

		sNum1 = sSsNum.substring(0, 6) + sSsNum.substring(7, 9);
		sNum2 = sSsNum.substring(10, 14);

		// 배열에 숫자 넣기
		for(int i=0; i<sNum1.length()-1; i++)
		{
			nNum1[i] = Integer.parseInt(sNum1.substring(i,i+1));
		}
		for(int i=0; i<sNum2.length()-1; i++)
		{
			nNum2[i] = Integer.parseInt(sNum1.substring(i,i+1));
		}


		// 정해진 값 곱하기
		for(int i=2; i<=9; i++)
		{
			total += nNum1[i-2] * i;
		}
		for(int i=2; i<=5; i++)
		{
			total += nNum2[i-2] * i;
		}

		// 나누기
		int remain = total % 11;
		
		// 10이거나 11인 예외 처리
		if(remain==0 || remain==1)
		{
			remain = remain % 10;
		}
		
		// 11에서 빼기
		int last = 11 - remain;
	
		// 마지막 자리 숫자 정수로 전환
		int nSsNumLast = Integer.parseInt(sSsNum.substring(13));

		// 확인
		if(nSsNumLast == last)
		{
			System.out.println("정확한 주민번호~!!!");
		} 
		else
		{
			System.out.println("잘못된 주민번호~!!!");
		}






		



		

		
	}
}