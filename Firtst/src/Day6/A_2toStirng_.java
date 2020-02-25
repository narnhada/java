package Day6;

class Pointt{
	
	int x,y;
	public Pointt(int x,int y) {
		this.x = x;
		this.y = y;		
	}	
	public String toString() {		
		return "Point(" + x +"," + y + ")";
	}	
}

public class A_2toStirng_ {
	public static void main(String[] args) {
		Pointt p = new Pointt(2,3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "입니다.");

	}
}
