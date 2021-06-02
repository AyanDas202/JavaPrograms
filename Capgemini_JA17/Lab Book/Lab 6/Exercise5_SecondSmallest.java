package Lab6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise5_SecondSmallest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		ArrayList<Integer> arrList  = new ArrayList<Integer>();
		for(int element: arr)
		{
			arrList.add(element);
			
		}
		Collections.sort(arrList);
		System.out.println("The second smallest element will be "+arrList.get(1));

	}
}
