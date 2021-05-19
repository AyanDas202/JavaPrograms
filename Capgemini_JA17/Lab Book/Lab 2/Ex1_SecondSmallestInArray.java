package Lab2;

import java.util.*;

public class Ex1_SecondSmallestInArray {
 
	static int getSecondSmallest(int arr[],int n)
 {
	 int i,j,t;
	 n=arr.length;
	 for(i=0;i<n;i++) {
		 for(j=0;j<n;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				 t=arr[i];
				 arr[i]=arr[j];
				 arr[j]=t;
			 }
		 }
	 }
	 return arr[1];
 }
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the no. of elements:");	
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		//Ex1_SecondSmallestInArray  num= new Ex1_SecondSmallestInArray();
		
		 Ex1_SecondSmallestInArray.getSecondSmallest(a,n);
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println(a[1]);
		
		
	}
}
