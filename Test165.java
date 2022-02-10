/*==========================================================
    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
============================================================*/

// Test165Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 1
    1��° ��� �Է� : ������
    1��° ��� �Է� ����~!!!
    ��� �Է� ���(Y/N)? : y
    2��° ��� �Է� : ���̻�
    2��° ��� �Է� ����~!!!
    ��� �Է� ���(Y/N)? : N
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 2
    [���� ��ü ���]
        ������
        ���̻�
    ���� ��ü ��� �Ϸ�~!!!
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 3
    �˻��� ��� �Է� : ���̻�
    [�˻� ��� ���]
    �׸��� �����մϴ�.
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 3
    �˻��� ��� �Է� : �Ӽҹ�
    [�˻� ��� ���]
    �׸��� �������� �ʽ��ϴ�.
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 4
    ������ ��� �Է� : ȫ����
    [���� ��� ���]
    �׸��� �������� �ʾ� ������ �� �����ϴ�.
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 4
    ������ ��� �Է� : ������
    [���� ��� ���]
    ������ �׸��� �����Ǿ����ϴ�.
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 5
    ������ ��� �Է� : ��μ�
    [���� ��� ���]
    ������ ����� �������� �ʽ��ϴ�.
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 5
    ������ ��� �Է� : ���̻�
    ������ ���� �Է� : ������
    [���� ��� ���]
    ������ �Ϸ�Ǿ����ϴ�.
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 2
    [���� ��ü ���]
        ������
    ���� ��ü ��� �Ϸ�~!!!
    [�޴� ����]
    1. ��� �߰�
    2. ��� ���
    3. ��� �˻�
    4. ��� ����
    5. ��� ����
    6. ����
    >> �޴� ����(1~6) : 6
    ���α׷� ����
    ����Ϸ��� �ƹ� Ű��...
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

class Menus         //-- �ϼ�
{
    public static final int E_ADD = 1;          //-- ��� �߰�
    public static final int E_DISP = 2;         //-- ��� ���
    public static final int E_FIND = 3;         //-- ��� �˻�
    public static final int E_DEL = 4;          //-- ��� ����
    public static final int E_CHA = 5;          //-- ��� ����
    public static final int E_EXIT = 6;         //-- ����
}

public class Test165
{
    // �ֿ� �Ӽ� ���� �� �ϼ�
    private static final Vector<Object> vt;     //-- �ڷᱸ��
    private static BufferedReader br;           //-- �Է½� Ȱ��
    private static Integer sel;                 //-- ���ð�
    private static String con;                  //-- ��� ����

    // static �ʱ�ȭ ��
    static
    {
        // Vector �ڷᱸ�� ����
        vt = new Vector<Object>();

        //BufferedReader Ŭ���� �ν��Ͻ� ����
        br = new BufferedReader(new InputStreamReader(System.in));

        // ����� �Է°� �ʱ�ȭ
        sel = 1;
        con = "Y";
    }

    // �޴� ��� �޼ҵ�
    public static void menuDisp()
    {
        System.out.println("\n\t[�޴� ����]");
        System.out.println("1. ��� �߰�");
        System.out.println("2. ��� ���");
        System.out.println("3. ��� �˻�");
        System.out.println("4. ��� ����");
        System.out.println("5. ��� ����");
        System.out.println("6. ����");
    }

    // �޴� ���� �޼ҵ�
    public static void menuSelect() throws IOException, NumberFormatException
    {
        System.out.print(">> �޴� ����(1~6) : ");
        sel = Integer.parseInt(br.readLine());
    }

    // ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
    public static void menuRun() throws IOException
    {
        switch (sel)
        {
            case Menus.E_ADD: addElement(); break;
            case Menus.E_DISP: dispElement(); break;
            case Menus.E_FIND: findElement(); break;
            case Menus.E_DEL: delElement(); break;
            case Menus.E_CHA: chaElement(); break;
            case Menus.E_EXIT: exit(); break;
        }
    }

    // �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
    public static void addElement() throws IOException
    {
        int num = 0;
        do
        {
            num++;
            System.out.printf("\n%d��° ��� �Է� : ", num);
            vt.add(br.readLine());
            System.out.printf("%d��° ��� �Է� ����~!\n", num);
            System.out.print("��� �Է� ���(Y/N)? : ");
            con = br.readLine();
        }
        while (con.equals("Y") || con.equals("y"));
    }

    // �ڷᱸ�� ��ü ��� ��� �޼ҵ�
    public static void dispElement()
    {
        System.out.println("\t[���� ��ü ���]");
        for (Object str : vt)
            System.out.println(str);
        System.out.println("���� ��ü ��� �Ϸ�~!!!");
    }

    // �ڷᱸ�� �� ��� �˻� �޼ҵ�
    public static void findElement() throws IOException
    {
        System.out.print("\n�˻��� ��� �Է� : ");
        String sSearch = br.readLine();
        int tempCheckNum = vt.indexOf(sSearch);

        if(tempCheckNum < 0)
        {
            System.out.println("\n\t[�˻� ��� ���]");
            System.out.println("�׸��� �������� �ʽ��ϴ�.");
        }
        else
        {
            System.out.println("\t[�˻� ��� ���]");
            System.out.println("�׸��� �����մϴ�.");
        }
    }

    // �ڷᱸ�� �� ��� ���� �޼ҵ�
    public static void delElement() throws IOException
    {
        System.out.print("\n������ ��� �Է� : ");
        String sDel = br.readLine();
        int tempCheckNum = vt.indexOf(sDel);

        if(tempCheckNum<0)
        {
            System.out.println("\t[���� ��� ���]");
            System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
        }
        else
        {
            vt.remove(tempCheckNum);
            System.out.println("\t[���� ��� ���]");
            System.out.printf("%s �׸��� �����Ǿ����ϴ�.\n", sDel);
        }
    }

    // �ڷᱸ�� �� ��� ����(����) �޼ҵ�
    public static void chaElement() throws IOException
    {
        System.out.print("\n������ ��� �Է� : ");
        String sChange = br.readLine();
        int tempCheckNum = vt.indexOf(sChange);
        if(tempCheckNum<0)
        {
            System.out.println("\t[���� ��� ���]");
            System.out.println("������ ����� �������� �ʽ��ϴ�.");
        }
        else
        {
            vt.remove(tempCheckNum);
            System.out.print("������ ��� �Է� : ");
            String sAfter = br.readLine();
            if(vt.size()==0)
            {
                vt.add(tempCheckNum);
                vt.remove(tempCheckNum);
            }
            else
            {
                vt.remove(tempCheckNum);
                vt.add(tempCheckNum, sAfter);
            }
            System.out.println("\t[���� ��� ���]");
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
        }
    }

    // ���α׷� ���� �޼ҵ� ? �ϼ�
    public static void exit()
    {
        System.out.println("\n\t���α׷� ����~!!!");
        System.exit(-1);
    }


    // main() �޼ҵ� �� �ϼ�
    public static void main(String[] args) throws IOException, NumberFormatException, IOException {
        do
        {
            menuDisp();
            menuSelect();
            menuRun();
        }
        while (true);
    }
}
// 160 56��

/*  //����
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;
        import java.util.Vector;
class Menus
{
    public static final int E_ADD = 1;   //-- ��� �߰�
    public static final int E_DISP = 2;  //-- ��� ���
    public static final int E_FIND = 3;  //-- ��� �˻�
    public static final int E_DEL = 4;   //-- ��� ����
    public static final int E_CHA = 5;   //-- ��� ����
    public static final int E_EXIT = 6;  //-- ����
}
public class Test165
{
    // �ֿ� �Ӽ� ���� �� �ϼ�
    private static final Vector<Object> vt;   //-- �ڷᱸ��
    private static BufferedReader br;         //-- �Է� �� Ȱ��
    private static Integer sel;               //-- ���� ��
    private static String con;                //-- ��� ����
    // static �ʱ�ȭ ��
    static
    {
        // Vector �ڷᱸ�� ����
        vt = new Vector<Object>();
        // BufferedReader Ŭ���� �ν��Ͻ� ����
        br = new BufferedReader(new InputStreamReader(System.in));
        // ����� �Է°� �ʱ�ȭ
        sel = 1;
        con = "Y";
    }
    // �޴� ��� �޼ҵ�
    public static void menuDisp()
    {
        System.out.println("\n[�޴� ����]");
        System.out.println("1. ��� �߰�");
        System.out.println("2. ��� ���");
        System.out.println("3. ��� �˻�");
        System.out.println("4. ��� ����");
        System.out.println("5. ��� ����");
        System.out.println("6. ����");
    }
    // �޴� ���� �޼ҵ�
    public static void menuSelect() throws IOException, NumberFormatException
    {
        System.out.print(">> �޴� ���� (1~6) : ");
        sel = Integer.parseInt(br.readLine());
        System.out.println();
    }
    // ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
    public static void menuRun() throws IOException
    {
        switch (sel)
        {
            case Menus.E_ADD: addElement(); break;
            case Menus.E_DISP: dispElement(); break;
            case Menus.E_FIND: findElement(); break;
            case Menus.E_DEL: delElement(); break;
            case Menus.E_CHA: chaElement(); break;
            case Menus.E_EXIT: exit();
            default: System.out.println("1~6 ������ ���ڸ� �Է����ּ���.");
        }
    }
    // �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
    public static void addElement() throws IOException
    {
        do
        {
            System.out.printf("%d��° ��� �Է� : ", (vt.size()+1));
            String ele = br.readLine();
            vt.add(ele);
            System.out.printf("%d��° ��� �Է� ���� ~!!!\n", vt.size());
            System.out.print("��� �Է� ��� (Y/N)? : ");
            con = br.readLine();
        }
        while (con.equals("Y")|| con.equals("y"));   // ���ڿ� �񱳴� equals() ��� !!!
    }
    // �ڷᱸ�� ��ü ��� ��� �޼ҵ�
    public static void dispElement()
    {
        System.out.println("[���� ��ü ���]");
        for(Object obj : vt)
            System.out.println((String)obj);
        System.out.println("���� ��ü ��� �Ϸ� ~!!!");
    }
    // �ڷᱸ�� �� ��� �˻� �޼ҵ�
    public static void findElement() throws IOException
    {
        System.out.print("�˻��� ��� �Է� : ");
        String search = br.readLine();
        System.out.println("\n[�˻� ��� ���]");
        if(vt.contains(search))
            System.out.println("�׸��� �����մϴ�.");
        else
            System.out.println("�׸��� �������� �ʽ��ϴ�.");
    }
    // �ڷᱸ�� �� ��� ���� �޼ҵ�
    public static void delElement() throws IOException
    {
        System.out.print("������ ��� �Է� : ");
        String del = br.readLine();
        System.out.println("\n[���� ��� ���]");
        if(vt.contains(del))
        {
            vt.remove(del);
            System.out.println(del + " �׸��� �����Ǿ����ϴ�.");
        }
        else
            System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
    }
    // �ڷᱸ�� �� ��� ����(����) �޼ҵ�
    public static void chaElement() throws IOException
    {
        System.out.print("������ ��� �Է� : ");
        String cha = br.readLine();
        if(vt.contains(cha))
        {
            System.out.print("������ ���� �Է� : ");
            String newE = br.readLine();
            vt.set(vt.indexOf(cha), newE);
            System.out.println("\n[���� ��� ���]");
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
        }
        else
        {
            System.out.println("\n[���� ��� ���]");
            System.out.println("������ ����� �������� �ʽ��ϴ�.");
        }
    }
    // ���α׷� ���� �޼ҵ�
    public static void exit()
    {
        System.out.println("\n\t���α׷� ����~!!!");
        System.exit(-1);
    }
    // main() �޼ҵ� �� �ϼ�
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        do
        {
            menuDisp();
            menuSelect();
            menuRun();
        }
        while (true);
    }
}
 */