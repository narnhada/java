package Day2;

public class array2 {

	public static void main(String[] args) {
		
		int[] intArray = new int[6];
		
		for(int i=0;i<6;i++)
		{	
			int num = (int)(Math.random()*45) + 1;	
			intArray[i] = num;
			
		}
		for(int i=0;i<6;i++)
		{
			System.out.println(intArray[i]);
		}
	
	}

}
