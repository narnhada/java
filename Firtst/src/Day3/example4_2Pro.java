package Day3;

import java.util.Scanner;

public class example4_2Pro {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		System.out.println("숫자를 입력하세요");		

		int n = s.nextInt();
		int i;
		int startNum;
		int sum = 0;

		if(n%2==1) 
		{
			startNum=1;
		}
		
		else
		{
			startNum=2;
		}
		
		for(i=startNum;i<=n;i=i+2) 
		{
			sum = sum+i;
			
		}
				
		System.out.println("결과값"+ sum);
		s.close();
	}

}
