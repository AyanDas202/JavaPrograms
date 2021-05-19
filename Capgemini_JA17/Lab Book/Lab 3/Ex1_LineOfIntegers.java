package Lab3;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Ex1_LineOfIntegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		int sum = 0;
		while (st.hasMoreTokens()) {
			int x = 0;
			x = Integer.parseInt(st.nextToken());
			System.out.print(x+" ");
			sum+= x;
			
		}
		System.out.print("\n" + sum);
		sc.close();
	}

}