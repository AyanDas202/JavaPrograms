import java.util.Scanner;

public class DeleteWord {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="This is a java training";
		String temp,result;
		
		temp=str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word:");
		String word= sc.next();
		
		if(temp.contains(word))
		{
			temp=temp.replaceAll(word,"");
		}
		
		System.out.println("Initial String:"+str+"\nGiven Word: "+word+"\nResult: "+temp);
		
	}

}
