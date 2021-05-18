import java.util.*;

public class UpperCasesToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.next();
		String temp="";
		
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				temp+=str.charAt(i);
			}
		}
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>=65 && str.charAt(i)<=90)) {
				temp+=str.charAt(i);
			}
		}
		System.out.println("Output String : "+temp);
		
		sc.close();
	}

}