package CaseStudy_payroll;

public class Admin extends Payroll {

	private String name;
	private int salary;

	public Admin(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void doAdminStuff() {
		System.out.println("Executing doAdminStuff");
	}
}
