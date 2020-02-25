package Day6;

public class B_Math {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.ceil(0.5));		//올림
		System.out.println(Math.floor(0.3));	//내림
		System.out.println(Math.sqrt(9));		//제곱근
		System.out.println(Math.exp(2));		//e의 2승
		System.out.println(Math.round(3.14));	//반올림
		
		System.out.println("이번주 행운의 번호는 ");
		
		for(int i=0;i<5;i++) {
		System.out.print((int)(Math.random()*45+1) + " ");
		}



	}

}
