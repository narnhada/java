package Day1;

import java.util.Scanner;

public class console2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요 : ");
//		System.out.println("이름: ");
//		String name = sc.nextLine();
//		
//		System.out.println("나이를 입력하세요 :");
//		System.out.println("나이: ");
//		String age = sc.nextLine();
//		
//		System.out.println("당신의 이름은: "+ name +"\n"+"당신의 나이는: " + age+"입니다.");
//		sc.close();	
//		
//				
//		Scanner sc = new Scanner(System.in);
		String name2;
		int age2;
			
		
		System.out.println("이름을 넣어주세요");			
		System.out.println("이름 : ");
		name2 = sc.next();
		
		System.out.println("나이를 넣어주세요");	
		System.out.println("나이 : ");
		age2 = sc.nextInt();
		
		System.out.println("당신의 이름은: "+ name2 +"\n"+"당신의 나이는: " + age2 +"입니다.");
		sc.close();
	}

}
