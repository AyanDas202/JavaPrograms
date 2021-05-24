package com.capgemini.collectionexample;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerList{

public static void main(String[] args) {
		
		//adding 
		ArrayList<Customer> cusList = new ArrayList<Customer>();
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter the details of customer");
			System.out.println("==============================");
			System.out.println("Enter the customer id: ");
			int id = sc.nextInt();
			System.out.println("Enter the customer Name: ");
			String name = sc.next();
			System.out.println("Enter the customer age:");
			int age = sc.nextInt();
			System.out.println("Enter the customer dob: ");
			String dob = sc.next();
			System.out.println("Enter the customer email: ");
			String email = sc.next();
			System.out.println("Enter the customer mobile number: ");
			String mob = sc.next();
			cusList.add(new Customer(id, name, age, dob, email, mob));
		}
		
		Iterator<Customer> cusItr = cusList.iterator();
		System.out.println("Customer details using Iterator");
		System.out.println("===============================");
		while(cusItr.hasNext()) {
		Customer c = cusItr.next();
		
		for(int i=0;i<cusList.size();i++)
		{
			System.out.println("Displaying details for customer no. "+i);
			
			//Id validation
			int id1=cusList.get(i).getCid();
			boolean res_id=Pattern.matches("[0-9]", String.valueOf(id1));
			if(cusList.get(i).getCid()==0 || cusList.get(i).getCid()<0)
			{
				System.out.println("Customer Id: "+ c.getCid());
			}
			else{
				System.out.println("Customer Id INVALID");
			}
			
			//Name validation
			String nm=cusList.get(i).getCustname();
			boolean res=Pattern.matches("[a-zA-Z]",nm);
			if(res==true)
			{
				System.out.println("Customer name: "+ nm);
			}
			else
			{
				System.out.println("Customer name INVALID");
			}
			
			//Age validation
			int ag=cusList.get(i).getAge();
			if(ag==0 || ag<0 || ag>100)
			{
				System.out.println("Customer Age: "+ ag);
			}
			else{
				System.out.println("Customer age INVALID");
			}
			
			
			//Mobile no validation
			String m=cusList.get(i).getMobNo();
			if(Pattern.matches("[789]{1}[0-9]{9}", m)==true)
			{
				System.out.println("Customer mobile number: "+ m);
			}
			else
			{
				System.out.println("Customer mobile number INVALID");
			}
			
			//email validation
			String regexEmail1="^[a-zA-Z0-9._$+]{4,10}@(.+)\\.(.+)$";
			Pattern pat1=Pattern.compile(regexEmail1);
			Matcher matcher1= pat1.matcher(cusList.get(i).getEmail());
			boolean result=matcher1.matches();
			if(result==true)
			{
				System.out.println("Customer email: "+ c.getEmail());
			}
			else
			{
				System.out.println("Customer email INVALID");
			}
			
			
			System.out.println();
		}
		}

}
}
		


