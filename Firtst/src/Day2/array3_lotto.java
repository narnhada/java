package Day2;

public class array3_lotto {

	public static void main(String[] args) {
		int maxNum = 45;
		int minNum = 1;
		double random;
		int[] iLottoArray = new int[6];
		
		for(int i=0;i<6;i++) 
		{
			random = Math.random()*maxNum + minNum;
			int lotto  = (int) random;
			iLottoArray[i] = lotto;
						
		}
		for(int i=0;i<6;i++)
		{
			System.out.println(iLottoArray[i]);
		}

	}

}
