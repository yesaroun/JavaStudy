
import java.util.Scanner;


public class Test0401{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		int even = 0;
		int odd = 0;

		System.out.print("������ ���� �� �Է� : ");
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

		System.out.printf("%n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.\n", even, odd);
	}
}