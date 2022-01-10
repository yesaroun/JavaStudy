/*==========================================
  ■■■ 실행  흐름의 컨트롤(제어문) ■■■
==========================================*/

// if ~ else 문 실습

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if문(if문 중첩),
//    switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우,
//	  특정 문장을 수행하고자 할 때 사용되는 구문이다.

// ○ 과제
//	  →카페에 게시글 올리기

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가... 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader의 readLine()을 활용하고
// if 조건문을 활용하여 연산을 수행할 수 있돌고 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년

// ※ 2월이 28일까지 있는 해 → 평년
//			29일까지 있는 해 → 윤년

// ※ 윤년의 판별 조건
//	  연도가 4의 배수이면서 100의 배수가 아니거나
//	  400의 배수이면 윤년~!!!
//	  그렇지 않으면 평년~!!!

// 복사 붙어넣기하고 / 해당 파일도 같이 올리기

// 입력 받기 위해 InputStreamReader, BufferedReader 클래스 import
import java.io.InputStreamReader;
import java.io.BufferedReader;

//입력 받은 String을 Integer 자료형으로 변환하는 과정에 생기는 오류를 
// 해결하기 위해 IOException import
import java.io.IOException;


public class Test037{
	public static void main(String[] args) throws IOException //-- 입력 받은 String을 Integer 자료형으로 변환하는 과정에 생기는 오류를 해결하기 위해
	{
		
	}
}