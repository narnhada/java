package Day4;

public class A_g_Array_return {
	
	static int[]makeArray(){
		int temp[] = new int[4];		//temp 배열생성 
		for(int i=0;i<temp.length;i++) 
			temp[i]=i;					//temp[0]=0,temp[1]=1...
		return temp;					//temp값 리턴
	}
	
	
	public static void main(String[] args) {
		int intArray[];							//intArray[]선언
		intArray = makeArray();					//intArray>>makeArray호출
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" "); //intArray[]에 makeArray값 드감
	}
}
