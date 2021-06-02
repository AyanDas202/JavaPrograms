package Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.util.List;

public class Exercise6_Vote {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		HashMap<Integer, Integer> hmap=new HashMap<Integer,Integer>();
		
		char ch='y';
		while(ch=='y') 
		{	
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			System.out.println("Enter age:");
			int age=sc.nextInt();
			
			hmap.put(id, age);
			
			System.out.println("Continue?(y/n)");
			ch=sc.next().trim().charAt(0);
		}
		List<Integer> list=votersList(hmap);
		
		System.out.println("The valid Id's which is eligible for voting is");
		int j=0;
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(j++));
		}
	}
	static List<Integer> votersList(HashMap<Integer, Integer> hm) 
	{
		List<Integer> ls=new ArrayList<Integer>();
		
		for(HashMap.Entry<Integer,Integer> m: hm.entrySet()) {
			if(m.getValue()>=18) {
				ls.add(m.getKey());
			}
		}
		return ls;
		
	}
	}
