class Display
{
   public void Print(String msg)
   {
     System.out.print("["+msg);
     try
     {
         Thread.sleep(100);
     }
     catch(InterruptedException e)
     {
         System.out.println(e.getMessage());
     }
         System.out.println("]");
   }
}
class SyncThread extends Thread
{
     Display d = new Display();
     private String msg;
     SyncThread(String msg)
     {
        this.msg = msg;
     }
     public void run()
     {
       d.Print(msg);
     }
}
public class synchronise
{
   public static void main(String[] args)
   {
     SyncThread sc = new SyncThread("Hello");
     SyncThread sd = new SyncThread("world");
     sc.start();
     sd.start();
   }
}
