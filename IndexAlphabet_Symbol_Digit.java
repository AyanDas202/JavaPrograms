import java.util.Scanner;
public class IndexAlphabet_Symbol_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="There are 8 apples in 2 trees";
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		
		
		boolean flag= Character.isDigit(str.charAt(index));
			
		if(flag!=true)
		{
			System.out.println(str.charAt(index)+" is alphabet");	
		}
		else
		{
			System.out.println(str.charAt(index)+" is digit");	
		}
	}

}
