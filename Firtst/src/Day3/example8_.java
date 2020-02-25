package Day3;

import java.util.Scanner;

public class example8_ {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int[] num = new int[5];	
		double sum = 0;						//int로 하면 수가 적어 값이 이상함

		for(int i=0;i<5;i++)
		{	
			num[i] = a.nextInt();	
			sum += num[i];				
		}
		System.out.println("총합은"+sum+"입니다.");		
		System.out.println("평균은"+ sum/num.length+ "입니다." );
		
	a.close();	
	}
}
//5개의 수를 입력하여 총합과 평균을 구하시오 (배열 이용)