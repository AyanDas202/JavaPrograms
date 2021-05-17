import java.util.*;
public class CheckEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the email : ");
		String email=sc.next();
		if(email.contains("@") && email.contains("."))
			System.out.println("Email contains both '@' and '.'");
		else if(email.contains("@"))
			System.out.println("Email contains '@' but not '.'");
		else if(email.contains("."))
			System.out.println("Email contains '.' but not '@'");
		else
			System.out.println("Email neither contains '@' nor '.'");
		
		sc.close();
	}

}