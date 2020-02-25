package Day5;

public class E_EX1_Book {
	
	int bookNo;
	String title;
	String author;
	int stateCode = 1;
	
	public E_EX1_Book(int i, String title, String author) {
		this.bookNo = i;
		this.title = title;
		this.author = author;		
	}

	
//	public void print(){
//		if (stateCode==1)
//			System.out.println("재고 있음"); 
//		else
//			System.out.println("대여중"); 
//	}
	

	

}




//1
//멤버변수는 다음과 같으며 모든 멤버 변수는 초기값을 지정하지 않는다
//int bookNo: 번호
//String title: 제목
//String author: 작가
//int stateCode: 상태코드(대여우무를 나타내는 상태코드)

//2
//생성자는 BookShop의 main 메소드를 참고하여 멤버변수를 초기화할 수 있도록작업합니다.

