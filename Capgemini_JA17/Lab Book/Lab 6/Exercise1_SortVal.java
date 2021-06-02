package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise1_SortVal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		char ch = 'y';
		while (ch == 'y') 
		{
			System.out.println("Enter Key:");
			int key = sc.nextInt();

			System.out.println("Enter value:");
			int val = sc.nextInt();

			map.put(key, val);

			System.out.println("Continue?(y/n)");
			ch = sc.next().trim().charAt(0);
		}
		List<Integer> list = getValues(map);

		System.out.println("Sorted Values:");
		System.out.println("==============");
		int k = 0;
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(k++) + "\t");
		}
		System.out.println();
	}

	static List<Integer> getValues(HashMap<Integer, Integer> map) {
		List<Integer> ls = new ArrayList<Integer>();

		for (HashMap.Entry<Integer, Integer> m : map.entrySet()) {
			ls.add(m.getValue());
		}
		Collections.sort(ls);
		return ls;
	}

}
