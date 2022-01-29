package assignmentweek3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int count=0;
		String text = "We learn java basics as part of java sessions in java week1";
		
		String textarr[]=text.split(" ");
		
//		for(String s1 : textarr) {
//			System.out.println(s1);
		Set<String> s2=new LinkedHashSet<String>();
		for(String s1 : textarr) {
			s2.add(s1);
			
		}
		System.out.println(s2);
		
		for(String s3 : s2)
		{
			System.out.print(s3+ " ");
		}

	}

}
