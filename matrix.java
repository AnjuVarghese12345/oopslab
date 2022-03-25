import java.util.Scanner;
class matrix
{ 
  public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Number Of Rows");
      int r=sc.nextInt();
      System.out.println("Enter The Number Of Columns");
      int c=sc.nextInt();
      int[][] m1 = new int[r][c];
      int[][] m2 = new int[r][c];
      int[][] sum = new int[r][c];
      System.out.println("Enter The Data For First Matrix :");
      for (int i=0; i<r; i++)
      {
        for (int j=0;j<c;j++)
          {
             m1[i][j]=sc.nextInt();
          }
      }
      System.out.println("Enter The Data For Second Matrix :");
      for (int i=0;i<r;i++)
      {
        for (int j=0;j<c;j++)
          {
             m2[i][j]=sc.nextInt();
           }
       }
      System.out.println("First Matrix:");
      for (int i = 0; i < r; i++)
      {
       for (int j = 0; j <c; j++)
         {
            System.out.print(m1[i][j]+"\t");
          }
             
      System.out.println();
      }
      System.out.println("Second Matrix:");
      for (int i = 0; i < r; i++)
      {
        for (int j = 0; j < c; j++)
          {
            System.out.print(m2[i][j]+"\t");
          }
             
       System.out.println();
       }
       System.out.println("After matrix addition: ");
       for (int i = 0; i < r; i++)
       {
         for (int j = 0; j < c; j++)
           {
             sum[i][j] = m1[i][j] + m2[i][j];
              System.out.print(sum[i][j]+"\t");
           }
             
        System.out.println();
       }
      }
  }


