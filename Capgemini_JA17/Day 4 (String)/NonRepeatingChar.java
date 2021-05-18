
public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is a java training";
		String temp=str;
		for(int i=0;i<temp.length();i++)
		{
			char ch=temp.charAt(i);
			temp=temp.substr(i+1,temp.length)
			if(temp.contains(Character.toString(ch)))
			{
				
			}
		}
	}

	
	}


