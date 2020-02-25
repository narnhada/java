package Day5;

public class C_Interface_InterfaceEX_ {

	public static void main(String[] args) {
		
		C_Interface5_SmartPhone_ phone = new C_Interface5_SmartPhone_();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + 
		phone.calculate(3,5));
		phone.schedule();
	}
}
