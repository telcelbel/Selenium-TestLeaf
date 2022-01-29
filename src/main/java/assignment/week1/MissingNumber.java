package assignment.week1;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7,6,8,11,9};
		Arrays.sort(arr);
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
		for(int i=0; i<arr.length; i++)
		{
			int j=arr[i];
//			System.out.println(j);
			int k=i+1;
//			System.out.println(k);
			if(k!=j) {
				System.out.println("Missing Element is "+ k);
				break;
			}
			
		}
		

	}

}
