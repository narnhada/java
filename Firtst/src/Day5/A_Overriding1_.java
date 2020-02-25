package Day5;

class Shape{						//슈퍼 클래스		
	
	public Shape next;				//생성자 역할
	public Shape() {next = null;}
	
	public void draw() 
	{		
		System.out.println("Shape");
	}	
}

class Line extends Shape{
	public void draw()				//메소드 오버라이딩 덕분에  자식클래스 먼저 호출
	{
		System.out.println("Line");		
	}
}

class Rect extends Shape{
	public void draw()				//메소드 오버라이딩 덕분에  자식클래스 먼저 호출
	{
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw()				//메소드 오버라이딩 덕분에  자식클래스 먼저 호출
	{
		System.out.println("Circle");
	}
}

