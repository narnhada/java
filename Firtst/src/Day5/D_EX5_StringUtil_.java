package Day5;

public class D_EX5_StringUtil_ {
	
	public static String concatString(String[] str) 
	{		
			//메소드 내용 작성
		String result=" ";

		for(int i=0;i<3;i++) {
			result = result.concat(str[i]);					
		}
		return result;
		
//		String result = new String();	//String도 클래스다
//		
//		for(int i=0;i<str.length;i++) 
//		{
//			result += str[i];
//		}		
//		return result;		
	}	
}

