import java.util.Scanner;
public class NumberPyramid 
{
   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < rows - i; j++) 
            {
                System.out.print(" " + " ");
            }
            for (int j = 0; j <= i; j++) 
            {
                int num = calculatePascalValue(i, j);
                System.out.print(" " + num + " ");
            }
            System.out.println();
        }
    }
    static int calculatePascalValue(int rowNum, int colNum) 
    {
        if (colNum == 0 || rowNum == colNum) 
        {
            return 1;
        } else {
            return (calculatePascalValue(rowNum - 1, colNum - 1) + calculatePascalValue(rowNum - 1, colNum));
        }
    }
}
