/*=======================================
    ■■■ 정렬(Sort) 알고리즘 ■■■
=======================================*/

/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
		→ 보기 좋게... 검색하기 위함

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬 ...
*/

// 선택 정렬(Selection Sort)

// 실행 예)
// Source Data : 52 42 12 62 60
// Sosrted Data : 12 42 52 60 62

// Check Test1091

public class Test109
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};	
		/*
		42 52 12 62 60
		== --

		12 52 42 62 60
		==    --

		12 52 42 62 60
		==		 --

		12 52 42 62 60
		==			--
		----------------------- 1회전

		12 42 52 62 60
		   == --
		12 42 52 62 60
		   ==	 --
		12 42 52 62 60
		   ==		--
		------------------------ 2회전

		12 42 52 62 60
			  == --
		12 42 52 62 60
			  ==	--
		------------------------ 3회전

		12 42 52 60 62
				 == --
		------------------------ 4회전
		*/
		
		System.out.print("Source Data : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
		
		
		int temp;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print("Sosrted Data : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
		


	}
}