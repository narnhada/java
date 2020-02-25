package Day2;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		System.out.print("점수: ");
	int	t = sc.nextInt();
		
		if (t>0) {
			System.out.println("양수");
			
        }else if(t<0){
        	System.out.println("음수");
        	        	
        }else {
        	System.out.println("0");        	
        }
		
	sc.close();

	}

}
