package Lab6;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise7_Rev_Sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		ArrayList<Integer> input_array = new ArrayList<Integer>();
		ArrayList<Integer> result_array = new ArrayList<Integer>();
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{ 
			int val=sc.nextInt();
			input_array.add(val);
		}
		for(int element:input_array)
		{
			StringBuffer s = new StringBuffer(String.valueOf(element));
			s.reverse();
			element= Integer.parseInt(String.valueOf(s));
			result_array.add(element);
		}
		Collections.sort(result_array);
		System.out.println("Resultant array");
		System.out.println("================");
		
        for(int i: result_array)
        {
        	System.out.println(i);
        }
	}