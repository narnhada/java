package Day5;

import java.util.Scanner;

public class D_EX8_FriendApp {

	public static void main(String[] args) {
		
		D_EX7_Friend[] friendArray = new D_EX7_Friend[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
				
		
		for(int i=0;i<friendArray.length;i++)		
		{	
			String line = sc.nextLine();			//친구정보 입력	
			String[] word = line.split(" ");		//공백으로 분리// 해서 공백전까지 문자열 a,b,c로 만듬
			friendArray[i]= new D_EX7_Friend(word);	//배열에 데이터 넣기			
		}											// 공백전까지 만들어진 문자열을 생성자에 보낸다
		
		for(int i=0;i<friendArray.length;i++) {
	
			friendArray[i].showInfo();				//친구 정보 출력	
		}		
		sc.close();
	}

}
