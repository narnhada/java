package Day4;

public class D_gabage_ {

	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d; 
//		String e;
		
		a = null;
		d = c;
		c = null;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
//		System.out.println(e);
	}

}
