package Day3;

import java.util.Scanner;

public class example2_max_min2_arr {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int[] arr = new int[5];
				
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자: ");
			int n = a.nextInt();						
			arr[i]=n;			
		}
		
		int max = 0;
		int min = arr[0];
		
		for(int i=0;i<4;i++)
		{
			if(	max < arr[i])
			{
				max = arr[i];
			}

			if( min > arr[i+1])
			{
				min = arr[i+1];
			}	
		}
		
		System.out.println("최대값:"+ max +","+"최소값:"+ min);
		a.close();
	}

}
///////////5개의 수를 입력하고, 배열을 이용하여 5개중 최대값,최소값 출력