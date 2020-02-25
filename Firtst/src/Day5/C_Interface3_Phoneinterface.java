package Day5;

interface C_Interface3_Phoneinterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone ** ");
	}
}
	


