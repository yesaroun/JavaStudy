public class Test0901
{
   public static void main(String[] args)
   {
      int[][] arr = new int[5][5];
      

      int n=1;
      for(int i=0; i<arr.length; i++)
      {
         for(int j=0; j<arr[i].length; j++)
         {
            arr[i][j] = n;
            if(i>=1 && j==0)
            {
               arr[i][j] = arr[i-1][4];
               n = arr[i-1][4];
            }
            n++;
            if(n==6)
               n=1;
         }
      }

      for(int i=0; i<arr.length; i++)
      {
         for(int j=0; j<arr[i].length; j++)
         {
            System.out.print(arr[i][j] + "  ");
         }
         System.out.println();
      }
   }
}