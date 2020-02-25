package Day3;

import java.util.Scanner;

public class example4_ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");		

		int n = s.nextInt();
		int a = 0;

		if(n%2==0) 
		{
			for(int i=2;i<=n;i = i+2)
			{					
					a +=i;		
			}
		}
		else
		{
			for(int i=1;i<=n;i= i+2)
			{					
					a +=i;		
			}
		}
				
		System.out.println("결과값"+ a);
		s.close();
	}
}
//1일력 1출력 , 3입력 4출력(1+3=4), 10입력(2+4+6+8+10=30)