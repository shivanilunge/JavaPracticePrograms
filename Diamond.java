import java.util.Scanner;

class Diamond
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of diamond : ");
    int height = sc.nextInt();

        int space = height/2;
        int star = 1;
       
    for(int i = 0; i < height; i++)
    {
        for(int j = 1; j <= space; j++)
        {
            System.out.print(" " + " ");
        }
        for(int j = 1; j <= star; j++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();

         if(i < height/2)
        {
            space--;
            star+=2;
        }
        else{
            space++;
            star-=2;
        }
    }
       
    }

}