import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range: ");
		int n=sc.nextInt();
		int n1=0,n2=1,n3;    
  
		System.out.println("Fibonacci series of "+n+" digits is: ");
        for(int i=0;i<n;i++) 
        {
        	System.out.print(n1+" ");
            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
        }
	}
}
        

