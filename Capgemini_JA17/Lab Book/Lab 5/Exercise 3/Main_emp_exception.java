package Lab5;

import java.util.Scanner;

public class Main_emp_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter the Employee ID : ");
			int id=sc.nextInt();
			
      System.out.print("Enter the Employee Name : ");
			sc.nextLine();
      String name=sc.nextLine();
			
      System.out.print("Enter Employee Age : ");
			int age=sc.nextInt();
			
      System.out.print("Enter Employee salary : ");
			double salary=sc.nextDouble();
			
      Employee e = new Employee(id,name,age,salary);
			e.validateSalary(salary);
		
    }catch(EmpException e) {
			System.out.println("Error : "+e);
		}
		sc.close();
	}

	}

}
