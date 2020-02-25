package Day2;

import java.util.Scanner;

public class break_moon_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		for(;;) {
			System.out.println("숫자를 입력하세요");
			System.out.print("숫자: ");
			int t  = sc.nextInt();
			
			if(t==0) {				
				break;   
			}
			if(t%3==0) { 
				System.out.println("3의 배수 입니다.");	
				
			}				
			else {
				System.out.println("3의 배수가 아닙니다.");				
			}
			
//			if(t==0) {				
//				break;   
//			}

		}	
	sc.close();
	}
}
