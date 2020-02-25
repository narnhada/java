package Day2;

import java.util.Scanner;

public class prac4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
				
		int t  = sc.nextInt();
				
		if (t >= 90) {
			System.out.println("'A등급 입니다.'");			
		}
		
		else if((t<=89)&&(t>=80)) {
			System.out.println("'B등급 입니다.'");
				
		}
		else if((t<=79)&&(t>=70)) {
			System.out.println("'C등급 입니다.'");
				
		}
		else if((t<=69&&t>=60)) {
			System.out.println("'D등급 입니다.'");
				
		}
		else {
			System.out.println("'F등급 입니다.'");
				
		}
		
	sc.close();
	}


}
