import java.util.Random;
class Randomizer extends Thread
{
    public void run()
    {
       Random r = new Random();
       for(int i=0;i<10;i++)
       {
         int n = r.nextInt(100);
         if (n%2==0)
         {
           new Even(n).start();
         }
        else
        {
          new Odd(n).start();
        }
     }
  }
}
class Even extends Thread
{
   private int num;
   Even(int n)
   {
     this.num = n;
   }
   public void run()
   {
      System.out.println("Square : "+(num*num));
   }
}
class Odd extends Thread
{
    private int num;
   Odd(int n)
   {
     this.num = n;
   }
   public void run()
   {
     System.out.println("Cube : "+(num*num*num));
   }
}
public class multithread
{
  public static void main(String[] args)
  { 
    Randomizer rz = new Randomizer();
    rz.start();
  }
}
