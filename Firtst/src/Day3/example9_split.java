package Day3;

import java.util.Scanner;

public class example9_split {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("금액: ");
		int num = a.nextInt();
		
		int num1 = (int)(num/50000);
		int num2 = (num%50000)/10000;
		int num3 = (num%10000)/5000;
		int num4 = (num%5000)/1000;		
		int num5 = (num%1000)/500;
		int num6 = (num%500)/100;
		int num7 = (num%100)/50;
		int num8 = (num%50)/10;
		int num9 = (num%10)/5;
		int num10 = (num%5)/1;
		
		System.out.println("50000원"+ num1);
		System.out.println("10000원"+ num2);
		System.out.println("5000원"+ num3);
		System.out.println("1000원"+ num4);
		System.out.println("500원"+ num5);
		System.out.println("100원"+ num6);
		System.out.println("50원"+ num7);
		System.out.println("10원"+ num8);
		System.out.println("5원"+ num9);
		System.out.println("1원"+ num10);
				
				
				
		
		a.close();
	}

}
