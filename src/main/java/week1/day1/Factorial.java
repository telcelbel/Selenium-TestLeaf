package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int i=5;
		int fact=1;
		System.out.print("Factorial of 5");
		
		for(i=5;i>=1;i--) {
			
			fact*=i;
			
			
		}
		
		
		System.out.println("=" +fact);
	}

}
