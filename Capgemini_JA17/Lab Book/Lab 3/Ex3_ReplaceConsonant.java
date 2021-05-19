package Lab3;
import java.util.Scanner;

public class Ex3_ReplaceConsonant {
	
	
	static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		return false;
	}
	
	static String alterString(String st) {
		char s[]= st.toCharArray();
		for (int i = 0; i < s.length; i++) 
			if (!isVowel(s[i])) 
				s[i] = (char)(s[i] + 1);
		return String.valueOf(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.println(alterString(st));
		sc.close();
	
	}

}
