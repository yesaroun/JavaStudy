/*===========================================
  ���� ����  �帧�� ��Ʈ��(�ݺ���) ����
=============================================*/

// break �ǽ�

// �� break Ű���尡 ���ϴ� �ǹ�
//    ����� + (�׸��� ����������.)

// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1 ~ 100 ���� �ȿ�����
// �����ϵ��� �ۼ��Ѵ�.

// ���� ��)
// ������ ���� �Է� : -10

// ������ ���� �Է� : 0

// ������ ���� �Է� : 2022

// ������ ���� �Է� : 10
// >> 1 ~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�(Y/N)? :y  --��ҹ��� �������

// ������ ���� �Է� : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ͻðڽ��ϱ�(Y/N)? : N


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
			System.out.print("������ ���� �Է� : ");
			nNum = Integer.parseInt(br.readLine());

			if(nNum >= 1 && nNum <= 100){
				for(int i=1; i<=nNum; i++){
					nSum += i;
				}
				System.out.printf(">> 1 ~ %d ������ �� : %d%n", nNum, nSum);

				System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
				cAns = (char) System.in.read();

				if(cAns == 78 || cAns == 110){
					break;

				} else if(cAns == 121 || cAns == 89){
					
				}
			}
		}
		*/

		int n, s, i;
		// n: ����� �Է°��� ��Ƶ� ����
		// s: ������ ���� ����� ��Ƴ� ����
		// i: 1���� 1�� ������� �Է°����� ������ ����

		char ch;
		//-- ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����
		
		while (true)
		{
			do{
			System.out.print("\n������ ���� �Է� : ");
			n = Integer.parseInt(br.readLine());
			
			} while(n<1 || n>100);

			// �׽�Ʈ(Ȯ��)
			// System.out.println("��ȿ�� ���� �Է¿Ϸ�");

			s = 0;   //-- ������ ������ �ʱ�ȭ ��ġ check~!!

			for(i=1; i<=n; i++){
				s += i;
			}

			System.out.printf(">> 1 ~ %d ������ �� : %d%n", n, s);

			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch = (char) System.in.read();	// y + ����(\r\n) // �Է´�⿭�� ���ҽ��� �����ִ´� ����Ѵٰ� �ϸ� �ֹߵǴ°� �ƴ϶� �տ� ���� �������� ���ư��鼭 \n�������°���


			// �׸��ҷ� �ǻ�ǥ��
			//if(ch == 'N' || ch == 'n') // N �Ǵ� n �Է��Ѱ� ����?
			if(ch != 'Y' && ch!='y'){	 // Y �Ǵ� y �Է��Ѱ� �ƴѰ� Ȯ��? (�̷��� ����°Ŵ�)
				
				// �ݺ����� ����� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//-- ���� ���� �ǻ� ǥ���� �ߴٸ�
				//   �� ���� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break;
				//-- �����. (+ �׸��� ����������.) check~!!


			} // end if
			// �ݺ����� ���߰� �������� �� �ִ� ó��

			//���Ͱ�(\r\n) ó��
			System.in.skip(2);

		}//end while	
	}//end main()
}//end class