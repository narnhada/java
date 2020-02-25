package Day5;

public class D_EX6_StringUtilApp {

	public static void main(String[] args) {
		
		String[] strArray  = {"SuperMan","BatMan","SpiderMan"};		
		String resultStr = D_EX5_StringUtil_.concatString(strArray);		
		System.out.println("결과 문자열: " + resultStr);
		

	}

}

////결과 문자열:  SuperManBatManSpiderMan 

//1.String 배열 타입의 파라미터를 받습니다.
//2.인자로 받은 문자열 배열 요소를 하나의 문자열로 결합하고,결과 문자열을 리턴합니다.
//3.주어진 클래스명과 메소드는 변경하지 않습니다.
