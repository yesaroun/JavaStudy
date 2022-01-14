/*===========================================
      ���� Ŭ������ �ν��Ͻ� ����
=============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �������� ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.            ��
// ����, �Է� ó�� �������� BufferedReader�� readLine()�� ����ϸ�,
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1050
// ������ ���� �Է�(1~1000) : -45
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050

// =========================== �� Ǯ��===================================
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{	
	int num = 0, sum = 0, count = 1;
	boolean a = true;

	int input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(a){
			System.out.print("������ ���� �Է�(1~1000) : ");
			num = Integer.parseInt(br.readLine());
			if(num <= 1000 && num >= 1){
				a = false;
			} else {
				a = true;
			}
		}
		return num;
	}

	int hap(){
		while(count <= num){
			sum += count;
			count++;
		}
		return sum;
	}

	void print(int num, int sum){
		System.out.printf(">> 1 ~ %d������ �� : %d\n", num, sum);
	}
}

public class Test074{
	public static void main(String[] args) throws IOException{

		Hap Hap = new Hap();
		
		int num = Hap.input();
		int sum = Hap.hap();

		Hap.print(num, sum);
		
		
	}
}

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	// �ֿ� ���� ����(������� �Է°��� ��Ƴ� ����)
	int su;

	// �Է� �޼ҵ� ����
	void input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su < 1 || su > 1000);
	}

	// ���� ó�� �޼ҵ� ����
	int calculate(){
		int result = 0;

		for(int i=1; i<=su; i++)
			result += i;

		return result;
	}

	// ��� ��� �޼ҵ� ����
	void print(int sum){
		System.out.printf(">> 1 ~ %d ������ �� : %d%n", su, sum);
	}
}	


public class Test074{
	public static void main(String[] args) throws IOException{
		
		// Hap �ν��Ͻ� ����
		Hap ob = new Hap();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		// ------------------
		// �������� Ȱ��

		ob.input();

		// ������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� �� calculate()
		int s = ob.calculate();

		// ������ �ν��Ͻ�(ob)�� ���� ��� �޼ҵ� ȣ�� �� print()
		// ob.print(ob.calculate());
		ob.print(s);
		
		
	}
}

// ���� ���
/*
������ ���� �Է�(1~1000) : 2000
������ ���� �Է�(1~1000) : 0
������ ���� �Է�(1~1000) : 200
>> 1 ~ 200 ������ �� : 20100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/