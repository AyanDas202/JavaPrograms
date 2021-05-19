import java.util.Scanner;
public class Exercise_7 

{
       public boolean checkNumber(int num)
       {
              boolean flag=false;
              String str = String.valueOf(num);
              int l = str.length();
              for(int i=0;i<l-1;i++)
              {
                     if(str.charAt(i)<=str.charAt(i+1) )
                           flag=true;
                     else
                           flag=false;
              }
              return flag;
       }
       public static void main(String[] ar)
       {
              Exercise_7 ex1=new Exercise_7();
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter a number:");
              int num = sc.nextInt();
              System.out.println("increasing number: "+ex1.checkNumber(num));
       }
}

  
