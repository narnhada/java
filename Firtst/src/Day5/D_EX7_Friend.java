package Day5;

public class D_EX7_Friend {

	private String name;
	private String hp;
	private String school;
	
	//메소드 작성
public D_EX7_Friend(String[] s) {		//생성자 만들어줌
	this.name 	= s[0];
	this.hp 	= s[1];
	this.school = s[2];
	
}


	public void showInfo() {
		System.out.println("이름:"+name+"핸드폰:"+hp+" 학교:"+school);
		
	}
}
