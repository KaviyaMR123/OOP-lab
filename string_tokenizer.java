import java.util.Scanner;
import java.util.StringTokenizer;
class tokenizer
{
  public static void main(String args[])
  {
     int num, sum = 0;
     Scanner sc = new Scanner(System.in);
     Scanner pd = new Scanner(System.in);
     System.out.print("Enter the limit : ");
     num = sc.nextInt();
     System.out.print("\nEnter "+num+" numbers seperated by space : ");
     String list=pd.nextLine();
     StringTokenizer str = new StringTokenizer(list," ");
     while(str.hasMoreTokens())
     {
        sum = sum + Integer.parseInt(str.nextToken());
     }
      System.out.print("Sum of the numbers enterd : "+sum);
  }
}
