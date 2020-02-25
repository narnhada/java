package Day2;

public class continue_1 {

	public static void main(String[] args) {
		int i=1;
				
		for(;;)
		{	
			
			i++;
			if(i==21) 
			{
				break;
			}
		
			if(i%3==0||i%2==0) 
			{
				continue;				
			}
			else 
			{
			System.out.println(i);	
			}
						
		}
		
	}

}
