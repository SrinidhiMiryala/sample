package constructor;

class student{
	int student_id;
	String student_name;
	String student_branch;
	
	public student(){
		student_id=103;
		student_name="Nidhi";
		student_branch="CSE";
	}
	void display() {
		System.out.println("Student_id="+student_id);
		System.out.println("Student_name="+student_name);
		System.out.println("Student_branch="+student_branch);
		
	}
	}
public class Constructor {
	public static void main(String[]args) {
		student Nidhi= new student();
		Nidhi.display();
		student Keerthi= new student();
		Keerthi.display();
		
	}

}