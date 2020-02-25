package Day4;

public class A_dowhile_ {

	public static void main(String[] args) {
		
		char c = 'a';
		
//		do 
//		{
//			System.out.print(c + " ");
//			c = (char)(c+1);
//			
//		}while (c <= 'z');
		
		int code = 0;
		do 
		{	
			code = (int) c;
	
			System.out.println("Ascii "+ code+ "=>"+ c);
			c = (char)(c+1);
			
		}while (c <= 127);
	}
}

// a~z까지 출력