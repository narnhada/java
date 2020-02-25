package Day2;

public class array4 {

	public static void main(String[] args) {
		int[] leftArray = {10,20,30};
		int[] rightArray = {10,2,30};	
//		boolean sameVal = false;
		
		for(int i=0;i<leftArray.length; i++) 
		{
			if (leftArray[i] == rightArray[i])
			{
//				sameVal = true;
				System.out.println("모든 배열이 같습니다.");
			}
			else 
			{
//				sameVal = false;
				System.out.println((i+1)+"번째 배열원소가 다릅니다.");
			}
		
		}

	}

}
