package Lab9;

import java.util.Scanner;

public class Exercise2_AddSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in); 
		StringAddSpace se = (string)->{
			char charArr[]=string.toCharArray();
			String result="";
			for(int i=0;i<charArr.length-1;i++) {
				result+=charArr[i]+" ";
			}
			return result+charArr[charArr.length-1];
		};
		System.out.print("Enter string : ");
		String string=sc.next();
		System.out.println("Result= "+se.returnExpression(string));
		
		sc.close();

	}
}
