import java.util.Scanner;
public class RemoveCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is a java training";
		String temp=str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character to remove: ");
		String ch=sc.next();
		
		temp=temp.replaceAll(ch, "");
		
		System.out.println("Inital String: "+str+"\nAfter Removal: "+temp);
		}
	}


