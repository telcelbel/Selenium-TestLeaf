package week1.day1;


//AccessSpecifier Keyword ClassName
public class Car {

	//AccessSpecifier returnType methodName
	public void applyBreak() {
		System.out.println("Applied break");//To print in Console

	}
	public static void main(String[] args) {
		//ClassName objectName=new ClassName()
		Car myCar=new Car();
		myCar.applyBreak();
	}

}
