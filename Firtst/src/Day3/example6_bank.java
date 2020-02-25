package Day3;

import java.util.Scanner;

public class example6_bank {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) 
		{
			System.out.println("=======================");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("=======================");
			System.out.print("선택 >> ");
								
			int n= a.nextInt();
			
			switch(n) 
				{
				
				case 1:					
					System.out.print("예금액>>");										
					balance += a.nextInt();
					break;
					
				case 2:					
					
						System.out.print("출금액>>");
						
						if(balance < n) 
						{
							System.out.println("-------------");	
							System.out.println("출금할수 없습니다.");
							System.out.println("-------------");
							break;
						}
						else
						{					
							balance -= a.nextInt();
							break;
						}						
				
				case 3:
					System.out.print("잔금>>");
					System.out.println(balance);
					break;
				
				case 4:	
					System.out.print("종료");					
					run = false;
					break;
					
				default:
					System.out.println("다시 입력하세요");	
					
				}			
		}
	a.close();	
	}

}
///

