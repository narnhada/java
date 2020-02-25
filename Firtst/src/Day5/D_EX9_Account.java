package Day5;

public class D_EX9_Account {
	
	private String accountNo;
	private int balance;
	public D_EX9_Account(String accountNo ) {
			this.accountNo = accountNo;
			System.out.println(this.accountNo + "계좌가 개설되었습니다.");
		}
		
		public void deposit(int money) {
			this.balance += money;
		}
		
		public void withdraw(int money) {
			this.balance -= money;
		}
		
		public void showbalance() {
			System.out.println(balance);
		}
}
	

