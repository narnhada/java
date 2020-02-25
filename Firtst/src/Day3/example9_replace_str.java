package Day3;

public class example9_replace_str {

	public static void main(String[] args) {
		
		char c[] = {'t','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(c.length);
		for(int i=0;i<c.length;i++) 
		{
			System.out.print(c[i]);
			
		}
		
		System.out.println();
		
		for(int i=0;i<c.length;i++) 
		{	
			
			if(c[i]==(' ')) 
			{
			System.out.print(',');
			}
			else 
			{
				System.out.print(c[i]);
			}			
		}
	}
}
//char c[] = {'t','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
//16
//this is a pencil
//this,is,a,pencil