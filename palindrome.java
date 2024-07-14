import java.util.Scanner;
public class PalindromeChecker
{
   private String inputString;
   public PalindromeChecker(String inputString)
{
   this.inputString = inputString;
}
public boolean isPalindrome()
{
   String reversedString = reverseString(inputString);
   return inputString.equalsIgnoreCase(reversedString);
}
private String reverseString(String str) 
{
   StringBuilder reversed = new StringBuilder();
   for (int i = str.length() - 1; i >= 0; i--) 
   {
     reversed.append(str.charAt(i));
   }
return reversed.toString();
}
public static void main(String[] args) 
{
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a string: ");
  String userInput = scanner.nextLine();
  PalindromeChecker palindromeChecker = new
  PalindromeChecker(userInput);
if (palindromeChecker.isPalindrome()) 
{
   System.out.println("The entered string is a palindrome.");
} 
else 
{
   System.out.println("The entered string is not a palindrome.");
}
scanner.close();
}
}
