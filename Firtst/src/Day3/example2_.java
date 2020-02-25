package Day3;

import java.util.Scanner;

public class example2_ {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
				
		int max = 0;	
				
		for(int i=0;i<5;i++) {
			System.out.print("숫자: ");
			int n = a.nextInt();						
			
			if(max<n)
			{
				max = n;
				
			}			
		}	
		System.out.println("최대값:"+ max);
		a.close();
	}
}

///////////5개의 수를 입력하고, 5개중 최대값 출력