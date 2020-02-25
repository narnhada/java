package Day4;

public class E_extends3_ {

	public static void main(String[] args) {
		
		E_extends1_ p = new E_extends1_();
		p.set(1,2);
		p.showPoint();
//		p.showColorPoint();					//'2'번꺼를 상속하지 않았기 때문에 사용할수 없다 
		
		E_extends2_ cp = new E_extends2_();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();

	}

}
