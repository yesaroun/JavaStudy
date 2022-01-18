/*==============================
      ■■■ 배열 ■■■
==============================*/

// 배열의 복사

// Test098.java 파일과 비교~!!

// ※ 배열 변수의 복사에는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
//	주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법.
//								(배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법)
//	데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
//								원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법.

// 데이터 복사
// - int 형 배열에 대한 깊은 의미의 복사를 처리하는
//	 메소드를 정의하는 형태로 실습

public class Test099{
	public static void main(String[] args){
		int[] nums = {10, 20, 30, 40, 50};			//-- 배열 원본
	}

	// 매개변수로 int 배열 타입을 넘겨 받아
	// 이를 복사한 후
	// 복사한 배열을 반환하는
	// 기능을 가진 메소드 정의

	public static int[] copyArray(int[] os){
		
	}
}

// String도 참조 타입아닌가?
