package Day3;

import java.util.Scanner;

public class example2_max_min {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int n;
		int max = 0;
		int min = 0;
				
		for(int i=0;i<5;i++) {
			System.out.print("숫자: ");
			n = a.nextInt();						
			
			if(max<n)
			{
				max = n;				
			}
			
			if(min>n)
			{
				min = n;				
			}
			
			if(min==0) 
			{
				min = n;
			}
			
		}		
		System.out.println("최대값:"+ max +","+"최소값:"+ min);
		a.close();
	}
}

///////////5개의 수를 입력하고, 5개중 최대값,최소값 출력