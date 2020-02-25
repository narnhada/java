package Day4;

public class C_class1_circle {
	
	int radius;												//원의 반지름 필드
	String name;											//원의 이름 필드
	
	public C_class1_circle() {};							//원의 생성자 생성
	
	public double getArea()									//원의 면적 계산 메소드
	{
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) 
	{
		C_class1_circle pizza;								//pizza라고 	C_class1_circle클래스에 접근할꺼다or에서 사용할꺼다.							
		pizza = new C_class1_circle();						//circle객체 생성	
		pizza.radius = 10;									//피자의 반지름을 10으로 설정
		pizza.name = "자바피자";								//피자의 이름 설정
		double area = pizza.getArea();						//피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		
		C_class1_circle donut  = new C_class1_circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);

	}

}
