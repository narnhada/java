package Day2;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
		int t  = sc.nextInt();
		
		if(t>0) {
		    if(t%2==0) {
			    System.out.println("짝수");
		    }
		    else {
		    	System.out.println("홀수");
		    	
		    }
		}else if(t < 0) {
			System.out.println("음수");
			
		}else {
			System.out.println("0");
			
		}
		
		sc.close();

	}

}
