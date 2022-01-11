
import java.util.Scanner;


public class Test0401{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		int even = 0;
		int odd = 0;

		System.out.print("임의의 정수 개 입력 : ");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		
		for(int i = 0; i < a.length; i++){
			if(a[i] % 2 == 0){
				even += a[i];
			} else{
				odd += a[i];
			}
		}

		System.out.printf("%n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n", even, odd);
	}
}