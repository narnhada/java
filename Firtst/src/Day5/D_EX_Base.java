package Day5;

public class D_EX_Base {
	public void service(String state) {
		//코드 작성	
//		if(state.equals("낮"))
//		{
//			day();
//		}
//
//		else if(state.equals("밤")) {
//			night();			
//		}		
//		
//		else if(state.equals("오후"))
//		{
//			afternoon();
//		}
		switch(state) {
		
		case "낮":
			day();
			break;
			
		case "밤":
			night();	
			break;
			
		case "오후":
			afternoon();
			break;	
		
		}
		
		
		
		
	}
	public void day() {
		System.out.println("낮에는 열심히 일하자.");
	}	
	public void night() {
		//코드 작성	
		System.out.println("night");
	}
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}	

}

//낮에는 열심히 일하자
//night
//오후도 낮과 마찬가지로 일해야 합니다.
