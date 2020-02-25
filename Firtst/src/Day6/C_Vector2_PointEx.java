package Day6;

import java.util.Vector;

class Point2 {

	private int x,y;
	public Point2(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return("("+ x + "," + y + ")");
	}
}


public class C_Vector2_PointEx {

	public static void main(String[] args) {
		
		Vector<Point2> v = new Vector<Point2>();
		
		v.add(new Point2(2,3));
		v.add(new Point2(-5,20));
		v.add(new Point2(30,-8));
		
		v.remove(1);
		
		for(int i=0;i<v.size();i++) {
			Point2 p = v.get(i);
			System.out.println(p);
			
		}


	}

}
