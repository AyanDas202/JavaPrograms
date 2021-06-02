package Lab6;

import java.util.HashMap;
import java.util.Set;

public class Exercise4_StudentMedal {
	
	public HashMap<String, String> getStudent(HashMap<String, Integer> stu) {
		HashMap<String, String> medal = new HashMap<>();
		Set<String> set = stu.keySet();
		for (String s : set) 
		{
			int marks = stu.get(s);
			if (marks >= 90) 
			{
				medal.put(s, "Gold");
			} 
			else if (marks >= 80) 
			{
				medal.put(s, "Silver");
			} 
			else if (marks >= 70) 
			{
				medal.put(s, "Bronze");
			}
		}
		return medal;
	}

	public static void main(String[] ar) {
		HashMap<String, Integer> st = new HashMap<>();
		Exercise4_StudentMedal obj = new Exercise4_StudentMedal();
		
		st.put("101", 65);
		st.put("102", 76);
		st.put("103", 89);
		st.put("104", 90);
		st.put("105", 93);
		System.out.println(obj.getStudent(st));
	}
}