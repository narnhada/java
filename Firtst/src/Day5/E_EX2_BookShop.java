package Day5;

import java.util.Scanner;

public class E_EX2_BookShop {


	public static void main(String[] args) {
		
		E_EX1_Book[] books = new E_EX1_Book[10];
		books[0] = new E_EX1_Book(1,"트와일라잇","스테파니메이어");
		books[1] = new E_EX1_Book(2,"뉴문","스테파니메이어");
		books[2] = new E_EX1_Book(3,"이클립스","스테파니메이어");
		books[3] = new E_EX1_Book(4,"브레이킹던","스테파니메이어");
		books[4] = new E_EX1_Book(5,"아리랑","조정래");
		books[5] = new E_EX1_Book(6,"젊은그대","김동인");
		books[6] = new E_EX1_Book(7,"아프니깐 청춘이다","김난도");
		books[7] = new E_EX1_Book(8,"귀천","천상병");
		books[8] = new E_EX1_Book(9,"태백산맥","조정래");
		books[9] = new E_EX1_Book(10,"풀하우스","원수연");
		
		System.out.println("*****도서 정보 출력하기*****");
		displayBookInfo(books);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대여하고 싶은 책의 번호를 입력하세요");
		int num = sc.nextInt();
		//
		books[num-1].stateCode = 0;
//		String state;

		//
//		if (books[num].stateCode==1)
//			state = "대여유무 :재고 있음";
//		else
//			state = "대여유무: 대여중";
		
		System.out.println("*****도서 정보 출력하기*****");
		displayBookInfo(books);
		
		sc.close();
	}
	//
	private static void displayBookInfo(E_EX1_Book[] books) {
		for(int i=0;i<books.length;i++)
		{
			System.out.print(books[i].bookNo+" 책 제목: "+books[i].title+"\t"+" 작가: "+"\t"+
			books[i].author+"\t" );	
			
			if (books[i].stateCode==1)
				System.out.println("대여 유무: 재고 있음"); 
			else if(books[i].stateCode==0)
				System.out.println("대여유무 : 대여중"); 			
		}		
		
	}//

}

