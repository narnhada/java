package Day2;

public class array1 {

	public static void main(String[] args) {
		int[] intArray = new int[3];
				intArray[0]=3;
				intArray[1]=6;
				intArray[2]=9;		
		
		for(int i=0;i<3;i++)
		{
			System.out.println(intArray[i]);
		}
		
		System.out.print('\n');
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}	

	}

}
