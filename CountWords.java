import java.util.StringTokenizer;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is a java training";
		System.out.println(str);
		
		StringTokenizer s=new StringTokenizer(str);
		int count=s.countTokens();
		
		System.out.println("No. of words in string: "+count);
	}

}
