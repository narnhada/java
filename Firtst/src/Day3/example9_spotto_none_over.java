package Day3;

public class example9_spotto_none_over {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		for(int i=0;i<6;i++) 
		{
			arr[i] = (int)(Math.random()*45) + 1;
			 	

			for(int j=0;j<i;j++) 					/// for문이 중복 검사
			{	
				if(arr[i]==arr[j])
				{
					i--;			//반복 가능

					break;				
				}							
			}						
		}		
		
		for(int i=0;i<6;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

//i는 현재 입력된 방번호 <-- 중복인지 검사해야됨
//j비교대상 [0] 부터 순서대로 검사해서 i 이전방까지 검사
// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음