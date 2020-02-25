package Day4;

public class C_class4_copy {
	
	
	int radius;
	
	public C_class4_copy(int radius)
	{
		this.radius = radius;								//this>> 필드에 있는 radius를 참조 한다
	}
	public void  set(int radius)
	{
		this.radius = radius;
	}

	public static void main(String[] args) {
		
		C_class4_copy ob1 = new C_class4_copy(1);
		C_class4_copy ob2 = new C_class4_copy(2);
//		C_class4_copy s;
//		
//		s = ob2;
		ob1 = ob2;											//객체 치환을 위해 
		System.out.println("ob1.radius = " + ob1.radius);
		System.out.println("ob2.radius = " + ob2.radius);
	}
}
