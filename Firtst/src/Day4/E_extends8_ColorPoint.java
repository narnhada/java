package Day4;

 class E_extends8_ColorPoint extends E_extends7_Point{
		
	private String color;
	public E_extends8_ColorPoint(int x,int y,String color)
	{
		super(x,y);						//super를 사용하지 않으면 부모클래스 기본생성자를 실행한다
		this.color = color;				//super가 있으면 부모 생성자의 기본생성자가 아닌 지정값과 맞은 
	}									//E_extends7_Point의 6번째줄을 실행
	
	public void showColorPoint()
	{
		
		System.out.println(color);
		showPoint();		

	}
}
