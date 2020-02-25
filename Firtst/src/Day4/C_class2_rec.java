package Day4;

import java.util.Scanner;
	
	public class C_class2_rec{
		
		int width;
		int height;
		
		public int getArea()
		{
			return width * height;			
		}		

	public static void main(String[] args) {
		C_class2_rec rect = new C_class2_rec();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">> ");		
		rect.width = scanner.nextInt();
		System.out.print(">> ");
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scanner.close();
	}
}
