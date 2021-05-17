import java.util.*;
public class FindRepeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		String words[]=str.split(" ");
		
		System.out.println("Repeated words are : ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))
				{
					System.out.print(words[j]+" ");
					break;
				}
			}
		
		}
		sc.close();
	}

}