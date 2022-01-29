package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SetToList {

	public static void main(String[] args) {

		Set<String> S1=new LinkedHashSet<String>();
		S1.add("New");
		S1.add("old");
		List<String> L1=new ArrayList<String>();
		List<String> L3=new ArrayList<String>(S1);
		List<String> L4=new ArrayList<String>();
		L4.addAll(S1);
		for(String L2 : S1 ) {
			L1.add(L2);
		}
		System.out.println(L1);
		System.out.println(L3);
		System.out.println(L4);

	}
}