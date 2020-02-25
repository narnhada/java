package Day3;

public class example7_ {

	public static void main(String[] args) {
	
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int sum = 0;
		int num = 0;
		int i;
		
		for(i=0;i<data.length;i++) 
			{
				if(data[i]%3==0) 
				{	
					System.out.println(data[i]);
					sum += data[i];	
					num +=1 ;									/// 갯수 셀때 유용함
				}

				
				
			}
		System.out.println("주어진 배열에서 3의 배수의 개수  =>"+ num);
		System.out.println("주어진 배열에서 3의 배수의 합  =>"+ sum);
	}
}
//주어진 배열에서 3의 배수의 개수  =>6
//주어진 배열에서 3의 배수의 합  =>108