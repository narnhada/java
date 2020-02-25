package Day5;

public class A_Overriding2_ {
									//paint를 호출하면 기본생서자
	static void paint(Shape p) { 	//또는 shape 클래스 생성자 호출
		p.draw();					//p가 가리키는 객체내의 오버라이딩된 draw()호출 
	}								//동적 바인딩
	

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);		
		paint(new Shape());			
		paint(new Line());
		paint(new Rect());
		paint(new Circle());		

	}

}
