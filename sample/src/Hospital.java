
public class Hospital {

	public static void main(String[] args) {
		Doctor doctor1 = new Doctor();
		doctor1.id=100;
		System.out.println("Doctor1 id= "+doctor1.id);
		doctor1.name="Vijay";
		System.out.println("Doctor1 name= "+doctor1.name);
		doctor1.salary="50000";
		System.out.println("Doctor1 salary= "+doctor1.salary);
		doctor1.experience="2";
		System.out.println("Doctor1 experience= "+doctor1.experience);
		doctor1.hospital="srikara";
		System.out.println("Doctor1 hospital= "+doctor1.hospital);
		doctor1.hospital_Address="Dilsukhnagar";
		System.out.println("Doctor1 hospital_Address= "+doctor1.hospital_Address);
		Doctor doctor2 = new Doctor();
		doctor2.id=200;
		System.out.println("Doctor2 id= "+doctor2.id);
		doctor2.name="Nidhi";
		System.out.println("Doctor2 name= "+doctor2.name);
		doctor2.salary="40000";
		System.out.println("Doctor2 salary= "+doctor2.salary);
		doctor2.experience="1";
		System.out.println("Doctor2 experience= "+doctor2.experience);
		doctor2.hospital="pallavi";
		System.out.println("Doctor2 hospital= "+doctor2.hospital);
	    doctor2.hospital_Address="Dilsukhnagar";
		System.out.println("Doctor2 hospital_Address= "+doctor2.hospital_Address);	
	}
}
       class Doctor{
    	   int id;
    	   String name;
    	   String salary;
    	   String experience;
    	   static String hospital;
    	   static String hospital_Address;
       }
       
