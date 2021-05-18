import java.util.Arrays;  
public class Anagram {  
    public static void main (String [] args) {  
        String str1="Listen";  
        String str2="Silent";  
    
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
   
        if (str1.length()!= str2.length()) 
        {  
            System.out.println("Not anagram");  
        }  
        else 
        {  
            char[] s1 = str1.toCharArray();  
            char[] s2 = str2.toCharArray();  
  
            Arrays.sort(s1);  
            Arrays.sort(s2);    
            if(Arrays.equals(s1, s2)==true) 
            {  
                System.out.println("They are anagram");  
            }  
            else 
            {  
                System.out.println("Not anagram");  
            }  
        }  
    }  
}   