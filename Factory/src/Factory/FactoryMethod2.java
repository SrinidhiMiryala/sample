package Factory;
abstract class University{
    abstract void HOD();
    abstract void subjects();

    abstract void semesters();
    abstract void labs();
}
class CseDepartment extends University{
    void HOD(){
        System.out.println("HOD for CseDepartment is Ram");
    }
    void subjects(){
        System.out.println("subjects in CseDepartment are 10");
    }
    void semesters(){
        System.out.println("4 semesters");
    }
    void labs(){
        System.out.println("8 labs");
    }
}
class MechanicalDepartment extends University{
    void HOD(){
        System.out.println("HOD for MechanicalDepartment is Vineet");
    }
    void subjects(){
        System.out.println("8 subjects");
    }
    void semesters(){
        System.out.println("2 semesters");
    }
    void labs(){
        System.out.println("4 labs");
}}

class Universityfactory{
    University getUniversity(String UniversityName){
        if (UniversityName.equals("CseDepartment"))
            return new CseDepartment();
        else if (UniversityName.equals("MechanicalDepartment"))
            return new MechanicalDepartment();
        else
            return null;
    }
    }


public class FactoryMethod2 {
    public static void main(String[] args){
    	Universityfactory y = new Universityfactory();
    	University s = y.getUniversity("CseDepartment");
        s.HOD();
        s.subjects();
        s.semesters();
        s.labs();
    }
}

