package Lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3_Squares {
	
	public void getSquares(int [] arr)
	{
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int val : arr)
		{
			hmap.put(val, val*val);
			
		}
		for(Map.Entry<Integer, Integer> e : hmap.entrySet())
		{
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int [] arr= new int[n] ;
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	
		Exercise3_Squares obj = new Exercise3_Squares();
		obj.getSquares(arr);

	}
}
