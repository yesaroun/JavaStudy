/*======================
 ���� ����޷� ����
=======================*/

// ������ ���� ����� ���α׷��� �����Ѵ�.

/* ���� ��)
   ���������� �Է��ϼ��� : 2022
   �������� �Է��ϼ���   : 6
   
        [ 2022�� 6�� ]

   0   1   2   3   4   5   6
   0   1   2   3   4   5   6
  ��  ��  ȭ  ��  ��  ��  ��
 ============================
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28  29  30  

 =============================
 ����Ϸ��� �ƹ�Ű�� ��������... */
  
import java.util.Scanner;

public class Test1071
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      int y, m;
      int sumDay = 0;
      int[] leapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // ������ ���, ���� �ϼ�
      int[] normalYear = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // ����� ���, ���� �ϼ�
      String str;

      System.out.print("���������� �Է��ϼ��� : ");
      y = sc.nextInt();

      System.out.print("�������� �Է��ϼ���   : ");
      m = sc.nextInt();

      for (int i=1; i<y; i++)
      {
         if((i%4==0) && (i%100!=0) || i%400==0)
            sumDay+=366;
         else
            sumDay+=365;
      }
      for (int i=1; i<m; i++)
      {
         if((y%4==0) && (y%100!=0) || y%400==0)
            sumDay+=leapYear[i];
         else
            sumDay+=normalYear[i];
      }
      
      // ��¥ ���� �迭 ���� �� �ʱ�ȭ
      int[] arr;
      if((y%4==0) && (y%100!=0) || y%400==0)
         arr = new int[leapYear[m]];
      else
         arr = new int[normalYear[m]];

      int n = 1;
      for(int i=0; i<arr.length; i++)
      {
         arr[i] = n;
         n++;         
      }


      // ��� ����
      System.out.println();
      System.out.printf("       [ %d�� %d�� ]\n", y, m);
      System.out.println();
      System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");
      System.out.println("============================");
      // ���� ���� ���� ����
      int blank = (sumDay+1)%7;
      int a = 0;
      for(int i=0; i<((arr.length+blank)/7)+1; i++)
      {
         if(i==0)
         {
            System.out.print(" ");
            for(int j=0; j<blank; j++)
            {
               System.out.print("��" +"  ");
            }
            for(int j=blank; j<7; j++)
            {
               System.out.printf("%2d  ",arr[a]);
               a++;
            }
            System.out.println();
         }
         else if(i==((arr.length+blank)/7))
         {
            System.out.print(" ");
            for(int j=0; j<((arr.length+blank)%7); j++)
            {
               System.out.printf("%2d  ",arr[a]);
               a++;
            }
            System.out.println();
         }
         else
         {
            System.out.print(" ");
            for(int j=0; j<7; j++)
            {
               System.out.printf("%2d  ",arr[a]);
               a++;
            }
            System.out.println();
         }
      }
      System.out.println("============================");
      
   }
}