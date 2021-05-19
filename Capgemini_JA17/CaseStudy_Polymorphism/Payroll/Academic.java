package CaseStudy_payroll;

public class Academic extends Payroll {

	private String name;
	private int salary;

	public Academic(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void giveLecture() {
		System.out.println("Executing giveLecture");
	}
}
