import java.util.Scanner;
public class calculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		int n=sc.nextInt();
		int sumAll=0,sumInd=0,squareInd=0,squareAll=0,diff=0;
		
		for(int i=1;i<=n;i++)
		{
			sumAll+=i;
			
			squareInd=i*i;
			sumInd+=squareInd;
		}
		
		squareAll=sumAll*sumAll;
		
		diff=sumInd-squareAll;
		System.out.println("Difference is: "+Math.abs(diff));
		
	}

}
