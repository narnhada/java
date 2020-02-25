package Day5;

import java.util.Scanner;

public class D_EX9_AccountApp {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		boolean run = true;
		int money;
		
		D_EX9_Account account = new D_EX9_Account("312-89562-123456");
		
		while(run) 
		{	
			System.out.println("");
			System.out.println("=======================");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("=======================");
			System.out.print("선택 >> ");
								
			int n= a.nextInt();
			
			switch(n) 
				{
				
				case 1:					
					System.out.print("예금액>>");										
					money = a.nextInt();
					account.deposit(money);
					break;
					
				case 2:					
					
					System.out.print("출금액>>");										
					money = a.nextInt();
					account.withdraw(money);
					break;
					
				case 3:
					System.out.print("잔고액>>");
					account.showbalance();
					break;					
				
				case 4:	
					System.out.print("프로그램 종료");					
					run = false;
					break;
					
				default:
					System.out.println("다시 입력하세요");	
					break;
					
				}			
		}
	a.close();	
	}

}
