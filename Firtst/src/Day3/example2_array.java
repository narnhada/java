package Day3;

import java.util.Scanner;

public class example2_array {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int[] array = new int[5];	

		int max = 0;	
				
		for(int i=0;i<5;i++) {
			System.out.print("숫자: ");
			int n = a.nextInt();						
			array[i]=n;
			
		}
		
		for(int i=0;i<4;i++)
		{
			if( max <array[i])
			{
				max = array[i];
			}
		}
		
		System.out.println("최대값:"+ max);
		a.close();
	}
}

///////////5개의 수를 입력하고, 배열을 이용하여 5개중 최대값 출력 