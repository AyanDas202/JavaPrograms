import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter range:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Prime numbers till "+n+" are: ");
		for(int i=2;i<n;i++)
		{
			int c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c+=1;
				}
			}
			if(c==0)
			{
				System.out.print(i+" ");
			}
		}
		
		
	}

}
