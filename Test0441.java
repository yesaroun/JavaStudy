
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test0441{
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int nNum;

		System.out.print("임의의 정수 입력(1~3) : ");
		nNum = Integer.parseInt(br.readLine());

		if(nNum >= 0 && nNum <= 3){
			for(int i = 1; i <= nNum; i++){
				System.out.print("★");
			}
			System.out.println();
		} else{
			System.out.println("입력 오류~!!!");
		}
		
	}
}