package Lab3;

import java.util.*;
public class Ex2_MirrorImageOfString{

	static String getImage(String str) {
		StringBuffer str1 = new StringBuffer(str);
		return str1.reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String revStr = getImage(st);
		System.out.println(st + "|" + revStr);
		sc.close();
	}

}