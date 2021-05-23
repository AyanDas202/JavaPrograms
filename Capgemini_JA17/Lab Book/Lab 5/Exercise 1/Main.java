package Lab5;

import java.util.Scanner;

public class Main{

	public static void ageValidation(int age) throws AgeException
	{
		if(age<16)
			throw new AgeException("Age should be above 15 years.");
		else
			System.out.println("Age is valid!!");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter Age : ");
			int age=sc.nextInt();
			ageValidation(age);
		}catch(AgeException e)
		{
			System.out.println("Exception : "+e);
		}
		sc.close();

	}

}