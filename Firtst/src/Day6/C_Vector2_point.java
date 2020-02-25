package Day6;

import java.util.Vector;

class Point3 {

	private int x,y;
	public Point3(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return("("+ x + "," + y + ")");
	}
}

 public class C_Vector2_point {
		public static void main(String[] args) {
			
			Vector<Point3> v = new Vector<Point3>();
			
			v.add(new Point3(2,3));
			v.add(new Point3(-5,20));
			v.add(new Point3(30,-8));
			
			v.remove(1);
			
//			for(int i=0;i<v.size();i++) {
//				Point3 p = v.get(i);
//				System.out.println(p);
//				
//			}

			printVector(v); 
		}
		public static void printVector(Vector<Point3> v) 
		{ 
			for(int i=0; i<v.size(); i++) 
			{ 
				Point3 p = v.get(i);
				System.out.println(p); 
			} 
		}
}
