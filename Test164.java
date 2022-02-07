/*==========================================================
    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
============================================================*/

// 벡터 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용
//	→ 자료형


import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData extends Vector<Object>
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;		//-- 이름
	private int age;			//-- 나이

	// getXxx() → getter
	// setXxx() → setter

	// getter / setter 구성
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자(매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// ※ 사용자 정의 생성자가 구성될 경우
	//	  default 생성자가 자동을 삽입되지 않기 때문에
	//	  defualt 생성자 형태의 생성자를 사용자 정의 생성자로
	//	  추가 구성하게 되는 것이 일반적인 클래스 설계 과정
	//	  (단, 반드시 설계해야 할 필요는 없음)

	// 생성자(매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}

}

public class Test164
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>();

		MyData md1 = new MyData();
		MyData md2 = new MyData();
		MyData md3 = new MyData();

		md1.setName("홍은혜");
		md1.setAge(13);

		md2.setName("김정용");
		md2.setAge(7);

		md3.setName("이윤태");
		md3.setAge(78);
		

		// 벡터 자료구조 v 에
		// 홍은혜 13세 / 김정용 7세 / 이윤태 78세
		// 담아내기


		v.addElement(md1);
		v.addElement(md2);
		v.addElement(md3);
		System.out.println(v);

		// record클래스 와 배열 이 힌트이다

	}
}