package assignmentweek3;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0; k<arr.length; k++) {
			if(arr[k]!=k+1) {
				System.out.println("Missing Element is "+ (k+1));
				break;
			}
		}

	}

}
