package week1.day2;

public class SumOfDigit {

	public static void main(String[] args) {
		int num1=123;
		int sum=0;
		int a=0;
		System.out.println("Sum of Digits "+ num1 );
		while(num1>=1)
		{
			a=num1%10;
			sum=sum+a;
			num1=num1/10;
			
		}
		
		System.out.println(sum);
		

	}

}
