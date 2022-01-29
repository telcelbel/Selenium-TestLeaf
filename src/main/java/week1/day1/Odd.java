package week1.day1;

public class Odd {
	
	public static void main(String[] args) {
		System.out.println("Printing only the odd numbers from 1 to 20:");
		System.out.print("[");
		for(int i=1;i<=20;i++){
		if (i % 2 !=0) {
			
			System.out.print(i+ " ");
			
		}
		
	}
		System.out.print("]");
		

}
}
