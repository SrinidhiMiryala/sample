package nestedClass;
class Hospital{
	String name;
	void doctor() {
		System.out.println("teacher name="+"Reney");
	
	class Patient{
		void PatientDetails() {
			System.out.println("student name ="+"Leela");
		}
		
	}
	Patient ram = new Patient();
		ram.PatientDetails();
		
	}
	}
	

public class LocalInnerClass {

	public static void main(String[] args) {
		Hospital Yashoda = new Hospital();
        Yashoda.doctor();
        

	}

}
