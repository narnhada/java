package Day2;

public class class_define2 {
	public static void main(String[] args) {
		
//		class_define obj = new class_define("nickon",400000);
		class_define obj = new class_define();
		
		obj.setName("nickon");
		obj.setPrice(400000);
		
		System.out.println(obj.getName());
		System.out.println(obj.getPrice());
		
		class_define3 man1 = new class_define3();
		man1.name = "batman";
		man1.age = 9999;
		
		class_define3 man2 = new class_define3();
		man2.name = "superman";
		man2.age = 99999;
		man2.skill = "Flying";
				
		System.out.println("----man1---");
		System.out.println(man1.name);
		System.out.println(man1.age);
		System.out.println(man1.skill);
		
		System.out.println("----man2---");
		System.out.println(man2.name);
		System.out.println(man2.age);
		System.out.println(man2.skill);
		
		


	}
	

}
