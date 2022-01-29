package week3.day1;

public class Calculator {

	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	
	public void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public void mul(int num1, double num2) {
		System.out.println(num1*num2);
	}
	
	public void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}
	public void sub(double num1, double num2) {
		System.out.println(num1-num2);
	}
	
	public void div(int num1, int num2) {
		System.out.println(num1/num2);
	}
	public void div(double num1, int num2) {
		System.out.println(num1/num2);
	}
	
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(12, 10);
		calc.add(11, 10, 12);
		calc.mul(2, 4);
		calc.mul(2, 2.5);
		calc.sub(12, 10);
		calc.sub(12.2, 11.2);
		calc.div(20, 10);
		calc.div(12.4, 2);

	}

}
