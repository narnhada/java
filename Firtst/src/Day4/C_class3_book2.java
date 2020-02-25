package Day4;

public class C_class3_book2 {

	String title;
	String author;
	void show()
	{System.out.println(title + " " + author);}
	
	public C_class3_book2() {
		this("","");
		System.out.print("생성자 호출됨");		
	}
		
	public C_class3_book2(String title) {
		this(title,"작자미상");	
	}
	
	public C_class3_book2(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		
		C_class3_book2 emptyBook = new C_class3_book2();
		C_class3_book2 loveStory = new C_class3_book2("춘향전");
		C_class3_book2 littlePrince = new C_class3_book2("어린왕자","생텍쥐페리");
		
		emptyBook.show();		//내가 만든거
		loveStory.show();
		littlePrince.show();	//내가 만든거
		

	}

}
