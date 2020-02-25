package Day2;

public class mathRandom2 {

	public static void main(String[] args) {
		int maxNum = 45;
		int minNum = 1;
		double random;
		
		for(int i=1;i<7;i++) 
		{
			random = Math.random()*maxNum + minNum;
			int lotto  = (int) random;
			System.out.print(random + "-->>");
			System.out.println(lotto);
			
		}

	}

}
