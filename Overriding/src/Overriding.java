 import java.util.Scanner;
 class Car{
    Scanner sc = new Scanner(System.in);
    void getvehicleinfo(){
        String vehiclecolor = getvehiclecolor();
        System.out.println(" vehicle color is " +vehiclecolor);
        int vehicleprice = getvehicleprice();
        System.out.println(" vehicle price is " +vehicleprice);
    }
    private int getvehicleprice(){
        System.out.println("Enter vehicle price");
        int price = sc.nextInt();
        return price;
    }
    private String getvehiclecolor(){
        String a;
        System.out.println(" enter vehicle color");
        a = sc.next();
        return a;
    }
}
class Hyundai extends Car{
    void getvehicleinfo(){
        System.out.println("Hyundai vehicle price is " + 5000000);
        System.out.println("Hyundai color is  Blue");
    }
}
public class Overriding {
    public static void main(String[] args){
        Car Toyoto = new Car();
        Toyoto.getvehicleinfo();
        Hyundai car = new Hyundai();
        car.getvehicleinfo();
    }
}