package Day2;

import java.util.Scanner;

public class switch_Prac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
				
		int t  = sc.nextInt();
		
		switch(t%3) {
		
		case (0): 
			System.out.println("3의 배수 입니다.");
			break;   
  	
	
			
		default:
			System.out.println("3의 배수가 아닙니다.");
			break;   	
		}
		
	sc.close();
	}

}
