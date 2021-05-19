import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i=0;
		while(i<1)
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter RED for stop\nEnter YELLOW for ready\nEnter GREEN for go");
		System.out.println("-----------------");
		String choice=sc.next();
		
		switch(choice)
		{
			case "RED":
				System.out.println("STOP");
				break;
			case "YELLOW":
				System.out.println("READY");
				break;
			case "GREEN":
				System.out.println("GO");
				break;
			default:
				System.out.println("Error!!");
				break;
		}
		System.out.println("");
		}
	}

}
