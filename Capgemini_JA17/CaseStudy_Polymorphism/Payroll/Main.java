package CaseStudy_payroll;

import java.util.Scanner;
import CaseStudy_payroll.Admin;
import CaseStudy_payroll.Academic;

public class Main {

	public static void adminDetails() {
		
		Admin ad = new Admin(null, 0);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter salary: ");
		int sal = sc.nextInt();

		ad.adjustSalary(sal);
		ad.doAdminStuff();
	}

	public static void academicDetails() {
		
		Scanner sc = new Scanner(System.in);
		Academic acd = new Academic(null, 0);

		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter salary: ");
		int sal = sc.nextInt();

		acd.adjustSalary(sal);
		acd.giveLecture();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter 1 for Admin Details\nEnter 2 for Academic Details");
		System.out.println();
		int ch = sc.nextInt();
		switch(ch)
		{
		case(1):
			adminDetails();
			break;
		case(2):
			academicDetails();
			break;
		default:
			System.out.println("Wrong choice!!");
			break;
		}
		}
}
