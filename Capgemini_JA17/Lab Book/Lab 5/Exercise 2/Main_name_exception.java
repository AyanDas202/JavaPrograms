package Lab5;

import java.util.Scanner;

public class Main_name_exception {

	public static void nameValidation(String name) throws NameException {
		String n[]=name.split(" ");
		if(n[0].length()==0)
			throw new NameException("First Name blank.");
		else if(n.length<2)
			throw new NameException("Last Name blank.");
		else
			System.out.println("Name is Valid");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter name : ");
			String name=sc.nextLine();
			nameValidation(name);
		}
		catch(NameException e) {
			System.out.println("Error: "+e);
		}
		
		sc.close();

	}

}
