package introbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.remove(1);
		//System.out.println(a.get(1));
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
			
		}
		System.out.println("************");
		for(Integer S:a)
		{
			System.out.println(S);
		}
		System.out.println("************");
		System.out.println(a.contains(20));
		
		// converting normal array to array list
		String name[]= {"Sri","devi","shan"};
		List<String> s1 =Arrays.asList(name);
		System.out.println(s1);
	}

}
