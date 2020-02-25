package Day4;

class Calc{
	
	public int ab(int a) {return a>0?-a:a;}
	public static int abs(int a) {return a>0?a:-a;}
	public static int max(int a,int b) {return a>b?a:b;}		
	public static int min(int a,int b) {return a>b?b:a;}	
	
//	public double max(double c,double d) {return c>d?c:d;}	// 오버라이딩은 type이나 변수 갯수에 의해 가능하게 된다.
}

public class D_static1_ {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		System.out.println(calc.ab(-5));
		
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));

	}
}
