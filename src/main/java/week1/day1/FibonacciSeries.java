package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1, sum ;
		System.out.println("FibonacciSeries of 8");
		
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=6;i++)
		{
			
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}
		
		
	}

}
