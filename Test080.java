/*===========================================
      ���� Ŭ������ �ν��Ͻ� ����
=============================================*/

// ������(Constructor)�� �ʱ�ȭ ��(Initialized Block)

public class Test080{

	/*
	int n;
	int m;

	n=100;
	m=200;
	*/
	
	/* �̰� �ȴ�
	int n = 100;
	int m = 200;
	*/
	
	int n;
	int m;
	
	
	// ������(Constructor)  �� �ʱ�ȭ ���� �ڵ带 ���� �����ߴ� �ϴ���
	//						   ���������� �ش� ������� �ʱ�ȭ ���������ϰ� �Ǵ� ����~~!!!
	Test080(){
		n=100;
		m=200;
		System.out.println("������ ����...");
	}


	// �ʱ�ȭ ��(Initialized Block)
	{
		n=20;
		m=40;
		System.out.println("�ʱ�ȭ �� ����...");
	}

	Test080(int n, int m){
		this.n = n;
		this.m = m;
		System.out.println("�Ű����� �ִ� ������ ����...");
	}

	// ��� ��� �޼ҵ� ����
	void write(){
		System.out.println("n:" + n + ", m:" + m);
	}


	public static void main(String[] args){
		
		Test080 ob1 = new Test080();
		ob1.write();
		
		Test080 ob2 = new Test080(1234, 5678);
		ob2.write();

	}
}

// ������
/*
�ʱ�ȭ �� ����...
������ ����...
n:100, m:200
�ʱ�ȭ �� ����...
�Ű����� �ִ� ������ ����...
n:1234, m:5678
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/