package Day4;

public class A_for_each {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum = 0;
		for(int k:num)									//반복될때마다 k는 num[0],num[1]... 순차적으로 값이 드감
			sum += k;
		System.out.println("합은:"+sum);
		
		String name[] = {"사과","배","바나나","딸기","포도"};
		for(String s:name)								//반복될때마다 s는 name[0],name[1]... 순차적으로 값이 드감
			System.out.print(s+" ");	
		
	}

}
