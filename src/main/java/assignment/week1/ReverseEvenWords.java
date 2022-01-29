package assignment.week1;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String val,val1="";
		char ch;
		String[] word=test.split(" ");
		System.out.println (Arrays.toString(word));
        for(int i=0;i<word.length;i++) {
        	if (i % 2 == 1) {
        		String var=word[i];
        		word=test.split(" ");
        		System.out.println (Arrays.toString(word));
        		for(int j=0;j<var.length();j++) {
        			ch=var.charAt(j);
        			val1=ch+val1;
        		}
        		System.out.println(val1);
        	}
        	
        }
		
		
	}
}


