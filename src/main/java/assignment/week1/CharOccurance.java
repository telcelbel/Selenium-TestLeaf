package assignment.week1;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char find='e';
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			int find1=str.charAt(i);
			if(find1==find) {
				count=count+1;
			}
		}
		System.out.println("Occurance of "+ find + " = " + count);
	}

}
