package week1.day2;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int input=321;
		int org=input;
		int rem=0;
		int sum1=0;
		int arm;
		while(input>0)
		{
			rem=input%10;
			arm=rem*rem*rem;
			sum1=sum1+arm;
			input=input/10;
		}
		if(sum1==org)
		{
			System.out.println(org+" Number is an ArmstrongNumber");
		}
		else {
			System.out.println(org+" Number is not an ArmstrongNumber");
		}
	}

}
