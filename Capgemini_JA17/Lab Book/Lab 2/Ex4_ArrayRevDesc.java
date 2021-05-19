package Lab2;

import java.util.Scanner;

public class Ex4_ArrayRevDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
    	
		System.out.println("Enter length of array:");
        int n = sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter array elements::");
        
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        System.out.println("Duplicate elements removed...");  
        
        int arrlen=arr.length;
        int arr2[]=new int[arrlen];
        
        for(int i=0; i<arrlen; i++) 
        {  
            for(int j=i+1;j<arrlen;j++) 
            {  
                if(arr[i]==arr[j])
                {
                	arr[j]=0;
                }
            }
            
        }
        System.out.println("Ye lo->");
        for(int i=0; i<arr2.length; i++) 
        {
        System.out.print(+arr2[i]+" ");
        }
        
        System.out.println("Removing zeros...");
        for(int i=0;i<arr2.length;i++)
        {
     	   if(arr2[i]==0)
     	   {
     		   continue;
     	   }
     	   System.out.print(arr2[i]+" ");
        }
        
        /*for(int i=arr.length-1;i>=0;i--) 
        {  
            System.out.print(arr2[i]+" ");  
        }  */
	}

}
