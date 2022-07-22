package constructor;

class student1{
	int student1_id;
	String student1_name;
	String student1_branch;
	
	    student1(int x,String y, String z){
		student1_id=x;
		student1_name=y;
		student1_branch=z;
	}
	void display() {
		System.out.println("Student_id="+student1_id);
		System.out.println("Student_name="+student1_name);
		System.out.println("Student_branch="+student1_branch);
		
	}
	}
public class ParameterizedConstructor {
	public static void main(String[]args) {
		student1 Keerthi= new student1(103,"Vijay","CSE");
		Keerthi.display();
		student1 Pranavi= new student1(104,"Meghana","ECE");
		Pranavi.display();
	}

}