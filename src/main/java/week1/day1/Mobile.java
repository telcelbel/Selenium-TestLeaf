package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Call Connected");
	}
	public void sendMsg() {
		System.out.println("Message Sent");

	}

	public static void main(String[] args) {
		Mobile myMobile=new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();

	}

}
