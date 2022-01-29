package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Sort {

	public static void main(String[] args) {

		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};

		List<String> company=new ArrayList<String>();
		List<String> reversecompany=new ArrayList<String>();
		for(int i=0; i<input.length; i++) {

			company.add(input[i]);

		}
		Collections.sort(company);
		for(int j=input.length-1; j>=0; j--) {

			reversecompany.add(company.get(j));

		}
		System.out.println(reversecompany);

	}
}