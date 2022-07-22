package constructor;

class student2{
	int id;
	String name;
	
	    student2(int id,String name){
		this.id=id;
		this.name=name;
	    }
	}
class student3 extends student2{
	String branch;
	student3(int id, String name, String branch){
		super(id,name);
		this.branch=branch;
	}
	void display() {
		System.out.println(id+" "+name+" "+branch);
	}
	}
 class ThisAndSuper {
	public static void main(String[]args) {
		student3 Keerthi= new student3(2, "Srilu", "MECH");
		Keerthi.display();
	}

}