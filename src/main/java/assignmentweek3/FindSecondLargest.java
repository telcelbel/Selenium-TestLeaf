package assignmentweek3;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		for(int i=0; i<data.length; i++)
		{
			for(int j=i+1; j<data.length; j++) {
				int temp=0;
			if(data[i]>data[j])
			{
				temp=data[i];
				data[i]=data[j];
				data[j]=temp;
			}}
//				System.out.println(data[i]);
			}
		System.out.println("Second Largest Number is :" + data[data.length-2]);
			
			}
		

	}



