/*====================================
   ����޼ҵ��� ��� ȣ�� ����
======================================*/


public class InfRecul{
	public static void main(String[] args){
		showHi(10);
	}

	// �ڵ� ������ 2���� ��ġ �ٲٱ�

	public static void showHi(int cnt){
		System.out.println("Hi~ ");
		if(cnt==1)
			return;
		showHi(--cnt);		

		// ���� ������ ��ġ�� �ٲ��
		// if���� ���� �;��Ѵ�
	}
}