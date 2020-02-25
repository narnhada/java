package Day1;

public class Cal {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 1;
		int c = 3;
		int d = 2;
		int result = a-b-c*a;
		
		System.out.println("result => "+ 
		a + "-" 
		+ b + "-" 
		+ c + "*" 
		+ d +"=" 
		+result );
		
		int q = 48;
		int w = 2;
		int e = 9;
		int r = 3;
		int result2 = q/w*(e+r);
		
		System.out.println("result => "+ 
		q + "/" +
		w + " * " +"("+ 
		e + "+" + 
		r +")"  + "=" 
		+result2 );

		int n1 = 5;
		int n2 = 3;
		
		System.out.println(n1<n2);
		System.out.println(n1>n2);
		System.out.println(n1<=n2);
		System.out.println(n1>=n2);
		System.out.println(n1==n2);
		System.out.println(n1!=n2);

		System.out.print("하이");
		System.out.println("호이하이");
		System.out.println("안녕하세요");
		System.out.println("안녕\n하\t세 \\요\"");
	}

}
