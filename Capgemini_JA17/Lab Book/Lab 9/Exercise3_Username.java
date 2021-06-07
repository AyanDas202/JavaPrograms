package Lab9;

import java.util.Scanner;

public class Exercise3_Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsernameLambdaExp u = ()->{
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter username: ");
			   String userName = sc.next();
			   System.out.println("Enter password");
			   String passWord = sc.next();
			   if(userName.equals("Ayan") && passWord.equals("Password")) 
			   {
				   return true;
			   }
			   else
			   {
				   return false;
			   }
		   };
		   
		   if(u.checkUserName()) {
			   System.out.println("Valid user name and password");
		   }else {
			   System.out.println("Invalid");
		   }

	}
}