import java.util.Scanner;
public class calculateSum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range: ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of first "+n+" natural numbers divisible by 3 or 5 is: "+sum);
	}

}
