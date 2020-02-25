package Day2;

import java.util.Scanner;

public class if_Moon {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		System.out.println("점수:");
		int t = sc.nextInt();
	
		if(t>60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		sc.close();

	}
	   

}
