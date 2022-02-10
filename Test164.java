/*==========================================================
    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
============================================================*/

// ���� �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
//	�� �ڷ���


import java.util.Vector;
import java.util.Enumeration;

// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData
{
    // �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
    private String name;		//-- �̸�
    private int age;			//-- ����

    // getXxx() �� getter
    // setXxx() �� setter

    // getter / setter ����
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

    // ������(�Ű����� 2���� ������) �� ����� ���� ������
    public MyData(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // �� ����� ���� �����ڰ� ������ ���
    //	  default �����ڰ� �ڵ��� ���Ե��� �ʱ� ������
    //	  defualt ������ ������ �����ڸ� ����� ���� �����ڷ�
    //	  �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
    //	  (��, �ݵ�� �����ؾ� �� �ʿ�� ����)

    // ������(�Ű����� ���� ������) �� ����� ���� ������
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
        // ���� �ڷᱸ�� ����
        Vector<MyData> v = new Vector<MyData>();

        // ���� �ڷᱸ�� v ��
        // ȫ���� 13�� / ������ 7�� / ������ 78��
        // ��Ƴ���
        // recordŬ���� �� �迭 �� ��Ʈ�̴�

        // 1
        /*
        MyData st1 = new MyData();
        st1.setAge(13);
        st1.setName("ȫ����");
        v.add(st1);

        MyData st2 = new MyData();
        st1.setName("������");
        st2.setAge(7);
        v.add(st2);

        MyData st3 = new MyData();
        st3.setName("������");
        st3.setAge(78);
        v.add(st3);
        */

        // 2
        /*
        MyData st1 = new MyData("ȫ����", 13);
        v.add(st1);

        MyData st2 = new MyData("������", 7);
        v.add(st2);

        MyData st3 = new MyData("������", 78);
        v.add(st3);
        */

        // 3
        v.add(new MyData("ȫ����", 13));
        v.add(new MyData("������", 7));
        v.add(new MyData("������", 78));

        // ���� �ڷᱸ�� v�� ��� ����(���) ��ü ����ϱ�
        // ���� ��)
        // �̸�:ȫ����, ����:13
        // �̸�:������, ����:7
        // �̸�:������, ����:78

        // ��Ǯ��
        /*
        MyData st1 = v.get(0);
        MyData st2 = v.get(1);
        MyData st3 = v.get(2);

        System.out.printf("�̸� : %s, ���� : %d", st1.getName(), st1.getAge());
        System.out.printf("�̸� : %s, ���� : %d", st2.getName(), st2.getAge());
        System.out.printf("�̸� : %s, ���� : %d", st3.getName(), st3.getAge());
         */

        // 1
        for(MyData obj : v)
            System.out.printf("�̸�:%s, ����:%d��\n", obj.getName(), obj.getAge());
        System.out.println();
        //--==>> �̸�:ȫ����, ����:13��
        //�̸�:������, ����:7��
        //�̸�:������, ����:78��

        // 2
        for (int i=0; i<v.size(); i++)
        {
            System.out.printf("�̸�:%s, ����:%d��\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
        }
        System.out.println();
        //--==>> �̸�:ȫ����, ����:13��
        //�̸�:������, ����:7��
        //�̸�:������, ����:78��

        // 3
        for (Object temp : v)
            System.out.printf("�̸�:%s, ����:%d��\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
        System.out.println();
        //--==>>�̸�:ȫ����, ����:13��
        //�̸�:������, ����:7��
        //�̸�:������, ����:78��

    }
}
