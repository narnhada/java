package Day5;

 class B_Abstract2_Goodcal extends B_Abstract1_Calculator{
	 @Override
	 public int add(int a, int b) {
		 return a + b;		 
	 }
	 @Override
	 public int subtract(int a, int b) {
		 return a - b;		 
	 }
	 @Override
	 public double average(int[] a)
	 {
		 double sum = 0;
		 for (int i = 0; i < a.length; i++) 
		 {
			 	sum += a[i];							 
		 }
		 return sum/a.length;	
	 }
	 
	public static void main(String[] args) {
		B_Abstract2_Goodcal cal = new B_Abstract2_Goodcal();

		System.out.println(cal.add(2,3));
		System.out.println(cal.subtract(2,3));
		System.out.println(cal.average(new int[] {2,3,4}));
		
	}
}
