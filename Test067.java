/*===========================================
  ■■■ 실행  흐름의 컨트롤(반복문) ■■■
=============================================*/

// break 실습

// ※ break 키워드가 지니는 의미
//    멈춘다 + (그리고 빠져나간다.)

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 100 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력 : -10

// 임의의 정수 입력 : 0

// 임의의 정수 입력 : 2022

// 임의의 정수 입력 : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까(Y/N)? :y  --대소문자 상관없이

// 임의의 정수 입력 : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까(Y/N)? : N


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int nNum;
		int nSum = 0;
		char cAns;
		
		while (true)
		{
			System.out.print("임의의 정수 입력 : ");
			nNum = Integer.parseInt(br.readLine());

			if(nNum >= 1 && nNum <= 100){
				for(int i=1; i<=nNum; i++){
					nSum += i;
				}
				System.out.printf(">> 1 ~ %d 까지의 합 : %d%n", nNum, nSum);

				System.out.print("계속하시겠습니까(Y/N)? : ");
				cAns = (char) System.in.read();

				if(cAns == 78 || cAns == 110){
					break;

				} else if(cAns == 121 || cAns == 89){
					
				}
			}
		}
		*/

		int n, s, i;
		// n: 사용자 입력값을 담아둘 변수
		// s: 누적합 연산 결과를 담아낼 변수
		// i: 1부터 1씩 사용자의 입력값까지 증가할 변수

		char ch;
		//-- 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수
		
		while (true)
		{
			do{
			System.out.print("\n임의이 정수 입력 : ");
			n = Integer.parseInt(br.readLine());
			
			} while(n<1 || n>100);

			// 테스트(확인)
			// System.out.println("유효한 정수 입력완료");

			s = 0;   //-- 누적합 변수의 초기화 위치 check~!!

			for(i=1; i<=n; i++){
				s += i;
			}

			System.out.printf(">> 1 ~ %d 까지의 합 : %d%n", n, s);

			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char) System.in.read();	// y + 엔터(\r\n) // 입력대기열에 리소스가 남아있는다 계속한다고 하면 휘발되는게 아니라 앞에 리드 라인으로 돌아가면서 \n데려가는거임


			// 그만할래 의사표현
			//if(ch == 'N' || ch == 'n') // N 또는 n 입력한거 맞음?
			if(ch != 'Y' && ch!='y'){	 // Y 또는 y 입력한거 아닌게 확실? (이렇게 물어보는거다)
				
				// 반복문을 멈축고 빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사 표현을 했다면
				//   그 동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				//-- 멈춘다. (+ 그리고 빠져나간다.) check~!!


			} // end if
			// 반복문을 멈추고 빠져나갈 수 있는 처리

			//엔터값(\r\n) 처리
			System.in.skip(2);

		}//end while	
	}//end main()
}//end class