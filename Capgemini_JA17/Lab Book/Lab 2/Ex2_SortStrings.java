package Lab2;

import java.util.Scanner;
public class Ex2_SortStrings
{
    public static void main(String[] args) 
    {
        int count;
        String st;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of strings you would like to enter:");
        count = sc.nextInt();
 
        String str[] = new String[count];
        
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Strings:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        sc.close();
        scan2.close();
        
        //Sorting the strings
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    st = str[i];
                    str[i] = str[j];
                    str[j] = st;
                }
            }
        }
        
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
    }
}
	    
