package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		String str1="PayPal India";
		List<Character> s1=new ArrayList<Character>();
//		char[] s1=new char[17];
		for(int i=0; i<str1.length(); i++) {

			s1.add(str1.charAt(i));

		}

		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();

		for(int j=0; j<s1.size(); j++) {
			
			charSet.add(s1.get(j));
			if(charSet.equals(s1)) {
				
				dupCharSet.add(s1.get(j));
			
			}
			
			
		}
		System.out.println(charSet);
		
		for(char eachchar : charSet ) {
			if(eachchar!=' ') {
				System.out.println(eachchar);
			
	}

}
	}
}
