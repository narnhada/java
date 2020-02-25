package Day5;

class C_Interface5_SmartPhone_ extends PDA implements
C_Interface4_Mobile,MP3Interface{
	
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");		
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요");		
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");		
	}
	@Override
	public void receiceSMS() {
		System.out.println("문자왔어요.");		
	}
	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");		
	}
	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");		
	}
	
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}	

}
