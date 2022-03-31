package OOPS;

public class Value {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.Name = "Saundarya";
		
		s1.age = 22;
		System.out.println(s1.Name + " " + s1.age);
		
		s2.Name = "Shubham";
		s2.age = 21;
		System.out.println(s2.Name + " " + s2.age);

	}

}
