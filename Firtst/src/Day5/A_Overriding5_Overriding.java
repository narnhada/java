package Day5;

public class A_Overriding5_Overriding {

	public static void main(String[] args) {
		A_Overriding3_Weapon weapon;
		weapon = new A_Overriding3_Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
				
		weapon = new A_Overriding4_Cannon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());

	}

}
