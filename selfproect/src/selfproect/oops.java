package selfproect;

	class Student{
		String name;
		int age;
	    public void printinfo(String name) {
	    	System.out.println(name);
	    }
	    public void printinfo(int age) {
	    	System.out.println(age);
	    }
	    public void printinfo(String name,int age) {
	    	System.out.println("My name is "+name+" "+age);
	    }
		
		
		
	}

public class oops {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="dipesh";
		s1.age=21;
		
		s1.printinfo(s1.name, s1.age);;
		
		
	}
	
}
