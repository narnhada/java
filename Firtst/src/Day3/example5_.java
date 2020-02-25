package Day3;

import java.util.Scanner;

public class example5_ {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	while(true) {	
			System.out.println("================");
			System.out.println("[숫자맞추기게임 시작]");
			System.out.println("================");		
			
			int nuum;
			String retry;
			
			int num = (int)(Math.random()*10+1);
			while(true) 
			{
				System.out.print(">>");
	
				System.out.println(num);
				nuum = a.nextInt();			
			
				if(nuum<num)
					{
					System.out.println("더 높게");
					}
				else if(nuum>num)
					{
					System.out.println("더 낮게");
					}
				else
				{					
					System.out.println("정답입니다.");		
					break;
				}
			}				
				
					a.nextLine();		
					System.out.println("y종료 , n다시시작");	
					retry = a.next();
	
					if("y".equals(retry))
					{
						System.out.println("================");
						System.out.println("[숫자맞추기게임 종료]");
						System.out.println("================");	
						break;
					}
					if("n".equals(retry))
					{	
						
					}
			}	
			a.close();
	}
}
/// 1~100까지 숫자 랜덤 ,숫자가 높으면 '낮게',숫자가 낮으면 '높게'출력, 맞으면 '맞았습니다', 게임 반복 y,종료  

