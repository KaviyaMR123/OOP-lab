import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
class file
{
   public static void main(String args[])
   {
    try
    {
        System.out.println("Enter the text to insert : ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        FileWriter file = new FileWriter("sample.txt");
        file.write(str);
        file.close();
        System.out.println("\nText writted succesfully");
    }
   catch(Exception e)
   {
       System.out.println("\nError occurred");
   }
   try
   {
      char ch[] = new char[100];
      FileReader rd = new FileReader("sample.txt");
      rd.read(ch);
      System.out.println("\n\nThe contents in the file is \n");
      System.out.println(ch);
      rd.close();
   }
  catch(Exception e)
  {
     System.out.println("\n Error occurred");
  }
}
}

