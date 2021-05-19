import java.util.Scanner;
public class Exercise_8
{
  /*     public boolean checkNumber(int num)
       {
              boolean flag=false;
             
              if(num%2==0)
              {
                     int x=2;
                     int p=1;
                     lab:
                     while(true)
                     {
                           for(int i=1;i<=num/2;i++)
                           {
                                  p=p*x;
                                  if(p<num)
                                  {
                                         flag=false;
                                         continue;
                                  }
                                  else if(p==num)
                                  {
                                         flag=true;
                                         break lab;
                                  }
                                  else if(p>num)
                                  {
                                         flag=false;
                                         break lab;
                                  }
                           }
                     }
              }
              return flag;
       }*/
       public static void main(String[] ar)
       {
        
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter a number:");
              int num = sc.nextInt();
              //System.out.println("Power of 2: "+ex1.checkNumber(num));
              int rem=0;
              
              while(num>1)
              {
            	  rem=num%2;
            	  num=num/2;
              }
              if(rem==0)
              {
            	  System.out.println("Power of 2");
              }
              else
              {
            	  System.out.println("Not a power of 2");
              }
       }
}
