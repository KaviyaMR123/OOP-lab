import java.util.Scanner;
public class MatrixMultiplier
{
 private int[][] matrix1;
 private int[][] matrix2;
 private int[][] result;
 public MatrixMultiplier(int rows1, int cols1, int rows2, int cols2)
 {
  matrix1 = new int[rows1][cols1];
  matrix2 = new int[rows2][cols2];
  result = new int[rows1][cols2];
 }
 public void inputMatrices()
{
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter elements for Matrix 1:");
  inputMatrix(matrix1, scanner);
  System.out.println("Enter elements for Matrix 2:");
  inputMatrix(matrix2, scanner);
  scanner.close();
}
private void inputMatrix(int[][] matrix, Scanner scanner)
{
 for (int i = 0; i < matrix.length; i++) 
 {
   for (int j = 0; j < matrix[0].length; j++) 
   {
     System.out.print("Enter element at position (" + (i + 1) + "," + (j+ 1) + "): ");
     matrix[i][j] = scanner.nextInt();
   }
 }
}
public void multiplyMatrices()
{
 int rows1 = matrix1.length;
 int cols1 = matrix1[0].length;
 int rows2 = matrix2.length;
 int cols2 = matrix2[0].length;
 if (cols1 != rows2)
{
System.out.println("Matrix multiplication not possible.");
return;
}
for (int i = 0; i < rows1; i++)
{
  for (int j = 0; j < cols2; j++)
  {
    for (int k = 0; k < cols1; k++)
    {
      result[i][j] += matrix1[i][k] * matrix2[k][j];
    }
  }
}
}
public void displayResult()
{
  System.out.println("Resultant Matrix:");
  for (int i = 0; i < result.length; i++)
  {
   for (int j = 0; j < result[0].length; j++)
   {
     System.out.print(result[i][j] + " ");
   }
   System.out.println();
  }
}
public static void main(String[] args)
{
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of rows for Matrix 1: ");
  int rows1 = scanner.nextInt();
  System.out.print("Enter the number of columns for Matrix 1: ");
  int cols1 = scanner.nextInt();
  System.out.print("Enter the number of rows for Matrix 2: ");
  int rows2 = scanner.nextInt();
  System.out.print("Enter the number of columns for Matrix 2: ");
  int cols2 = scanner.nextInt();
  MatrixMultiplier matrixMultiplier = new MatrixMultiplier(rows1,cols1, rows2, cols2);
  matrixMultiplier.inputMatrices();
  matrixMultiplier.multiplyMatrices();
  matrixMultiplier.displayResult();
  scanner.close();
}
}
