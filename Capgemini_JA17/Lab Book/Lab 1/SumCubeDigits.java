import java.util.Scanner;
public class SumCubeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int num= sc.nextInt();
	int n=num;
	int digit=0,sum=0,cube=0;
	
	while(n>0)
	{
		digit=n%10;
		cube=digit*digit*digit;
		System.out.println("Cube of "+digit+" is: "+cube);
		sum+=cube;
		n=n/10;
	}
	System.out.println("Sum of cube of digits of "+num+" is: "+sum);
	}

}
