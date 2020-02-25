package Day4;

public class C_class3_book {

	String title;
	String author;
	
	public C_class3_book(String t) {
		title = t; author = "작자미상";	
	}
	public C_class3_book(String t,String a) {
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		C_class3_book loveStory = new C_class3_book("춘향전");
		C_class3_book littlePrince = new C_class3_book("어린왕자","생텍쥐페리");
		
		System.out.println("("+loveStory.title + " "+ loveStory.author+")");
		System.out.println("("+littlePrince.title + " "+ littlePrince.author+")");
	}
}
