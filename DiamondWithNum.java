public class DiamondWithNum 
{
    public static void main(String[] args) {

		int n = 7;
		int space = n / 2;
		int star = 1;
	
		for (int i = 0; i < n; i++) 
		{
			int num = 1;
			
			for (int j = 1; j <= space; j++)
			{
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= star; j++) 
			{
				if(j % 2 == 0)
				{
					System.out.print("*" + " ");
					num++;
				}
				else
				{
					System.out.print(num + " ");
				}
				
			}
				if (i < n/2) 
				{
					space--;
					star += 2;
				} 
				else 
				{
					space++;
					star -= 2;
				}
				System.out.println();
			}
        }
    }