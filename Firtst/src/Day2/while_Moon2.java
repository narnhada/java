package Day2;

import java.util.Scanner;

public class while_Moon2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단:");

//		int dan;
		int i=1;
		
		int t = sc.nextInt();
		while(i<10) {
			
			System.out.println(t +" * "+ i + " = " +(t*i));
			i++;
					
		}
		sc.close();
	}

}
