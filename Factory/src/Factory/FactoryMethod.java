package Factory;
abstract class Laptop{
    abstract void RAM();
    abstract void memory();
    abstract void battery();
    abstract void cost();
    abstract void size();
    abstract void model();
}
class MacBook extends Laptop{
    void model(){
        System.out.println("MacBook model MacBook Air");
    }
    void RAM(){
        System.out.println("MacBook RAM is 16GB");
    }
    void memory(){
        System.out.println("memory of MacBook is 512GB, 1TB, or 2TB");
    }
    void battery(){
        System.out.println("battery capacity is 4379mAh");
    }
    void cost(){
        System.out.println("price of MacBook is $850");
    }
    void size(){
        System.out.println("size is 13.6-inch");
    }
}
class Hp extends Laptop{
    void model(){
        System.out.println("Hp model is Hp Envy 13");
    }
    void RAM(){
        System.out.println("Hp RAM is 16GB");
    }
    void memory(){
        System.out.println("memory of Hp is 512gb");
    }
    void battery(){
        System.out.println("battery capacity is 4400mAh");
    }
    void cost(){
        System.out.println("price of Hp Envy 13 is $650");
    }
    void size(){
        System.out.println("size is 13-inch");
    }
}

class Laptopfactory{
     static Laptop getLaptop(String LaptopName){
        if (LaptopName.equals("MacBook"))
            return new MacBook();
        else if (LaptopName.equals("Hp"))
            return new Hp();
        else
            return null;
    }
}


public class FactoryMethod{
    public static void main(String[] args) {
         Laptop a = Laptopfactory.getLaptop("MacBook");
        a.model();
        a.RAM();
        a.memory();
        a.cost();
        a.size();
        a.battery();
    }
    }