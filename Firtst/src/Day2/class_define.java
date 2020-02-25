package Day2;

public class class_define {
	private String name;
	private int price;
	
	
	
	  public void setName(String name) 			//private을 통해 값을 읽기 위해 
	  { 
		  this.name = name; 
	  }
	  public void setPrice(int price) 			//private을 통해 값을 읽기 위해 
	  { 
		  this.price = price;
	  }
	 
	 

//	public class_define(String name)			// 생성자에 값을 정해줌 // 나중에 이런게 있다보여줌
//	{
//		this.name = name;		
//	}
	public class_define() {}					//기본 생성자 표현 원래 자동으로 생성됨
	public class_define(String name, int price)	// 생성자에 값을 정해줌 
	{
		this.name = name;
		this.price = price;
	}
	public String getName()						//private을 통해 값을 읽기 위해
	{
		return name;
	}
	public int getPrice()						//private을 통해 값을 읽기 위해
	{
		return price;
	}

}
