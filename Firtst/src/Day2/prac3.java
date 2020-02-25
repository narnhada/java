package Day2;

import java.util.Scanner;

public class prac3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
				
		int t  = sc.nextInt();
		
		
		
		if (t%3 == 0) {
			System.out.println("3의 배수 입니다.");
			
		}
				
		else {
			System.out.println("3의 배수가 아닙니다.");
				
		}
		
	sc.close();
	}


}
