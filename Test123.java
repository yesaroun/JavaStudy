/*=================================
    ���� Ŭ���� ��� ����
=================================*/

// �������̽�(Interface)

// �� �ǽ� ����
//	���� ó�� ���α׷��� �����Ѵ�.
//	��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2280946 ȫ����
// ���� ���� ���� ���� �Է�	  (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2290847 �ֹ���
// ���� ���� ���� ���� �Է�	  (���� ����) : 85 70 65

// 2280946 ȫ����	90 100  85	xxx		xx
//					��  ��  ��
// 2290847 �ֹ���	85  70  65	xxx		xx
//					��	��	��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ���� ����
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}


// �������̽�
interface Sungjuk
{
	public void set() throws IOException;				//-- �ο� ����
	public void input() throws IOException;		//-- ������ �Է�
	public void print();		//-- ��� ���
}

// ���� �ذ� �������� �����ؾ��� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;
	
	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		switch(score/10)
		{
			case 10:
			case 9:	return "��";
			case 8: return "��";
			case 7: return "��";
			case 6: return "��";
			default: return "��";
		}
	}

	@Override
	public void set() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = Integer.parseInt(br.readLine());
														// ������ �ƴ� ��� ���� ó�� �߰��ϱ�*
		}
		while (inwon<1 || inwon>10);
	}

	@Override
	public void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		rec = new Record[inwon];

		for(int i=0; i<inwon; i++)
		{

			rec[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);	
			String temp = br.readLine();

			String[] tempArr = temp.split("\\s");			// �̸� �й� �ӽ������� �迭 ����
		
			rec[i].hak = tempArr[0];
			rec[i].name = tempArr[1];
			

			System.out.print("���� ���� ���� ���� �Է�	  (���� ����) : ");	
			String tempScore = br.readLine();

			String[] tempScoreArr = tempScore.split("\\s");
			rec[i].kor = Integer.parseInt(tempScoreArr[0]);
			rec[i].eng = Integer.parseInt(tempScoreArr[1]);
			rec[i].mat = Integer.parseInt(tempScoreArr[2]);

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3;
			
		}		
	}

	@Override
	public void print()
	{
		for(int i=0; i<inwon; i++)
		{
			System.out.printf("%7s%5s%4d%4d%4d%5d%5d\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%15s%3s%3s\n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}
	}
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk ob;

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
	}
}