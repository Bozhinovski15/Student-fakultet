
public class Student {
	int index;
	String ime;
	static String fakultet = "ITS";
	
	Student(int r, String n){
		index = r;
		ime = n;
	}
	void display() {
		System.out.println(index+" "+ime+" "+fakultet);
	}
	public static void main(String []args) {
		Student s1 = new Student(111, "Marko");
		Student s2 = new Student(222, "Petar");
		s1.display();
		s2.display();
	}
}

