
public class College {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.id=1;
		System.out.println("student1 id= "+student1.id);
		student1.name="Vijay";
		System.out.println("student1 name= "+student1.name);
		student1.branch="cse";
		System.out.println("student1 branch= "+student1.branch);
		student1.sex='M';
		System.out.println("student1 sex= "+student1.sex);
		student1.college="Meghana";
		System.out.println("student1 college= "+student1.college);
		Student student2 = new Student();
		student2.id=2;
		System.out.println("student2 id= "+student2.id);
		student2.name="Nidhi";
		System.out.println("student2 name= "+student2.name);
		student2.branch="cse";
		System.out.println("student2 branch= "+student2.branch);
		student2.sex='F';
		System.out.println("student2 sex= "+student2.sex);
		student2.college="Anurag";
		System.out.println("student2 college= "+student2.college);
	}
}
       class Student{
    	   int id;
    	   String name;
    	   String branch;
    	   char sex;
    	   static String college;
    	   
       }
       



