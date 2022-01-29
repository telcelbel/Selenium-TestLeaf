package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str1="PayPal India";
		Set<Character> s1=new LinkedHashSet<Character>();
		for(int i=0; i<str1.length(); i++) {
			
			s1.add(str1.charAt(i));
			
		}
			System.out.println(s1);
			
			for(char eachchar : s1 ) {
				if(eachchar!=' ') {
					System.out.println(eachchar);
				}
			} 
		
		
	}
}